"""A Python Pulumi program"""

import pulumi
import pulumi_rke as rke

cluster = rke.Cluster("actions",
                      cluster_name="python-test-cluster",
                      ignore_docker_version=True,
                      dind=True,
                      dind_dns_server=True,
                      nodes=[{
                          "user": "docker",
                          "roles": [ "controlplane", "worker", "etcd" ],
                          "address": "pulumi-gha-node1"
                      }])


