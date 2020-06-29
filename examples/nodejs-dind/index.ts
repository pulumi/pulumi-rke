import * as pulumi from "@pulumi/pulumi";
import * as rke from "@jaxxstorm/pulumi-rke";

const cluster = new rke.Cluster(`actions`, {
    clusterName: "nodejs-test-cluster",
    ignoreDockerVersion: true,
    dind: true, // run locally
    dindDnsServer: "8.8.8.8",
    nodes: [{
        user: "docker",
        roles: [ "controlplane", "worker", "etcd" ],
        address: "pulumi-gha-node1"
    }, {
        user: "docker",
        roles: [ "controlplane", "worker", "etcd" ],
        address: "pulumi-gha-node2"
    }, {
        user: "docker",
        roles: [ "controlplane", "worker", "etcd" ],
        address: "pulumi-gha-node3"
    }]
})

export const kubeconfig = cluster.kubeConfigYaml
