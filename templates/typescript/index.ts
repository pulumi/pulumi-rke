import * as pulumi from "@pulumi/pulumi";
import * as rke from "@jaxxstorm/pulumi-rke";

const cluster = new rke.Cluster(clusterName, {
    clusterName: clusterName,
    ignoreDockerVersion: false,
    sshAgentAuth: true,
    nodes: [
        {
            address: host1.example.com,
            roles: [ "etcd", "worker", "controlplane" ]
        },
    ]
});

export const kubeConfig = cluster.kubeConfigYaml
