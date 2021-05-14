import * as pulumi from "@pulumi/pulumi";
import * as rke from "@pulumi/rke";
import * as aws from "@pulumi/aws";
import * as tls from "@pulumi/tls";

function sleep(ms: number) : Promise<void> {
    return new Promise(resolve => setTimeout(resolve, ms));
}

const amiId = aws.ec2.getAmi({
    filters: [
        { name: "name", values: ["ubuntu/images/hvm-ssd/ubuntu-bionic-18.04-amd64-server-*"] },
        { name: "virtualization-type", values: ["hvm"]}
    ],
    owners: ["099720109477"], // Canonical
    mostRecent: true,
}).then(result => result.id);

const privateKey = new tls.PrivateKey("node-key", {
    algorithm: "RSA"
})

const rkeKeyPair = new aws.ec2.KeyPair("rke-node-keypair", {
    publicKey: privateKey.publicKeyOpenssh
})

const role = new aws.iam.Role("rke-role", {
    assumeRolePolicy: aws.iam.assumeRolePolicyForPrincipal({
        Service: "ec2.amazonaws.com"
    })
})

const rolePolicy = new aws.iam.RolePolicy("rke-role-policy", {
    role: role,
    policy: {
        Version: "2012-10-17",
        Statement: [{
            Effect: "Allow",
            Resource: "*",
            Action: [
                "ec2:*",
                "elasticloadbalancing:*",
            ],
        }],
    }
})

const instanceProfile = new aws.iam.InstanceProfile("rke-instance-profile", {
    role: role.name,
}, {
    dependsOn: [rolePolicy]
})

const group = new aws.ec2.SecurityGroup("rke-secgrp", {
    ingress: [
        { protocol: "-1", fromPort: 0, toPort: 0, cidrBlocks: ["0.0.0.0/0"] },
    ],
    egress: [
        { protocol: "-1", fromPort: 0, toPort: 0, cidrBlocks: ["0.0.0.0/0"] },
    ],
});

export const privateKeyPair = privateKey.privateKeyPem;

const userData = `#!/bin/bash
curl https://releases.rancher.com/install-docker/19.03.sh | sh
sudo usermod -a -G docker ubuntu`;
const rkeInstance = new aws.ec2.Instance("rke-node", {
    ami: amiId,
    instanceType: aws.ec2.InstanceType.T2_Large,
    keyName: rkeKeyPair.id,
    vpcSecurityGroupIds: [group.id],
    iamInstanceProfile: instanceProfile.name,
    userData: userData,
    tags: {
        "kubernetes.io/cluster/rke-ts": "owned"
    }
})

const cluster = new rke.Cluster(`actions`, {
    cloudProvider: {
        name: "aws"
    },
    nodes: [{
        address: rkeInstance.publicIp,
        internalAddress: rkeInstance.privateIp.apply(async (ip) => {
            console.log("waiting for rke instance to be ready")
            await new Promise(resolve => setTimeout(resolve, 120000));
            return ip;
        }),
        user: "ubuntu",
        sshKey: privateKey.privateKeyPem,
        roles: [ "controlplane", "etcd", "worker" ],
    }],
    clusterName: "nodejs-test-cluster",
})

export const publicDns = rkeInstance.publicDns;
export const kubeconfig = cluster.kubeConfigYaml;



