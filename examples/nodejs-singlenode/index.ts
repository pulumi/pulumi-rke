import * as pulumi from "@pulumi/pulumi";
import * as rke from "@jaxxstorm/pulumi-rke";


const cluster = new rke.Cluster(`actions`, {
    clusterName: "nodejs-test-cluster",
    ignoreDockerVersion: true,
    dind: true, // run locally
    dind_dns_server: "8.8.8.8",
    nodes: {
        user: "docker",
        role: [ "controlplane", "worker", "etcd" ],
        node: "node1"
    }
})

export const kubeconfig = cluster.kubeConfigYaml
