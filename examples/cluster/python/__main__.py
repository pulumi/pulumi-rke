"""A Python Pulumi program"""

import time
import pulumi
import pulumi_rke as rke
import pulumi_aws as aws
import pulumi_tls as tls

# Get the AMI
ami = aws.ec2.get_ami(
    owners=['099720109477'],
    most_recent=True,
    filters=[aws.ec2.GetAmiFilterArgs(
        name='name',
        values=['ubuntu/images/hvm-ssd/ubuntu-bionic-18.04-amd64-server-*'],
    ), aws.ec2.GetAmiFilterArgs(
        name='virtualization-type',
        values=['hvm'],
    )],
)

private_key = tls.PrivateKey("node-key",
                             algorithm="RSA")

rke_key_pair = aws.ec2.KeyPair("rke-node-keypair",
                               public_key=private_key.public_key_openssh)

rke_role = aws.iam.Role('rke-role',
                       assume_role_policy="""{
        "Version": "2012-10-17",
        "Statement": [
            {
                "Action": "sts:AssumeRole",
                "Principal": {
                    "Service": "ec2.amazonaws.com"
                },
                "Effect": "Allow",
                "Sid": ""
            }
        ]
    }"""
                       )

rke_role_policy = aws.iam.RolePolicy('lambdaRolePolicy',
                                    role=rke_role.id,
                                    policy="""{
        "Version": "2012-10-17",
        "Statement": [{
            "Effect": "Allow",
            "Action": [
                "ec2:*",
                "elasticloadbalancing:*"
            ],
            "Resource": "*"
        }]
    }"""
                                    )

instance_profile = aws.iam.InstanceProfile("rke-instance-profile",
                                           role=rke_role.name,
                                           opts=pulumi.ResourceOptions(depends_on=[rke_role_policy]))

secgrp = aws.ec2.SecurityGroup('rke-secgrp',
                               ingress=[
                                   aws.ec2.SecurityGroupIngressArgs(protocol='-1',
                                                                    from_port=0,
                                                                    to_port=0,
                                                                    cidr_blocks=['0.0.0.0/0']),
                               ],
                               egress=[
                                   aws.ec2.SecurityGroupEgressArgs(protocol='-1',
                                                                   from_port=0,
                                                                   to_port=0,
                                                                   cidr_blocks=['0.0.0.0/0']),
                               ],
                               )

user_data = """#!/bin/bash
curl https://releases.rancher.com/install-docker/19.03.sh | sh
sudo usermod -a -G docker ubuntu
"""

rke_instance = aws.ec2.Instance("rke-node", ami=ami.id,
                                instance_type="t2.large",
                                key_name=rke_key_pair.id,
                                vpc_security_group_ids=[secgrp.id],
                                iam_instance_profile=instance_profile.name,
                                user_data=user_data,
                                tags={
                                    "kubernetes.io/cluster/rke-py": "owned",
                                })

def wait_for_ready(private_ip):
    # We need to give the docker containers a little
    # time to spin up and be ready
    # if we had a custom image with docker installed then it would
    # be a faster start up time
    time.sleep(60)
    return private_ip

rke_cluster = rke.Cluster("actions", cloud_provider=rke.ClusterCloudProviderArgs(name="aws"),
                          nodes=[
                              rke.ClusterNodeArgs(address=rke_instance.public_ip,
                                                  internal_address=rke_instance.private_ip.apply(lambda ip: wait_for_ready(ip)),
                                                  user="ubuntu",
                                                  ssh_key=private_key.private_key_pem,
                                                  roles=["controlplane", "etcd", "worker"])
                          ],
                          cluster_name="python-test-cluster")

pulumi.export("kubeconfig", rke_cluster.kube_config_yaml)
pulumi.export("public_dns", rke_instance.public_dns)
pulumi.export("private_key", private_key.private_key_pem)

