// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides RKE cluster resource. This can be used to create RKE clusters and retrieve their information.
 * 
 * RKE clusters can be defined in the provider:
 * - Using cluster_yaml: The full RKE cluster is defined in an RKE cluster.yml file.
 * - Using the TF provider arguments to define the entire cluster.
 * - Using a combination of both the clusterYaml and TF provider arguments. The TF arguments will override the clusterYaml options if collisions occur.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rke from "@pulumi/rke";
 * import * from "fs";
 * 
 * // Create a new RKE cluster using config yaml
 * const foo = new rke.Cluster("foo", {clusterYaml: fs.readFileSync("cluster.yaml")});
 * // Create a new RKE cluster using arguments
 * const foo2Cluster = new rke.Cluster("foo2Cluster", {
 *     nodes: [{
 *         address: "1.2.3.4",
 *         user: "ubuntu",
 *         roles: [
 *             "controlplane",
 *             "worker",
 *             "etcd",
 *         ],
 *         sshKey: fs.readFileSync("~/.ssh/id_rsa"),
 *     }],
 *     upgrade_strategy: {
 *         drain: true,
 *         maxUnavailableWorker: `20%`,
 *     },
 * });
 * // Create a new RKE cluster using both. In case of conflict, arguments override clusterYaml arguments
 * const foo2Index/clusterCluster = new rke.Cluster("foo2Index/clusterCluster", {
 *     clusterYaml: fs.readFileSync("cluster.yaml"),
 *     sshAgentAuth: true,
 *     ignoreDockerVersion: true,
 *     kubernetesVersion: "<K8s_VERSION>",
 *     upgrade_strategy: {
 *         drain: true,
 *         maxUnavailableWorker: `20%`,
 *     },
 * });
 * // Create a new RKE cluster using both. In case of conflict, arguments override clusterYaml arguments
 * const foo2RkeIndex/clusterCluster = new rke.Cluster("foo2RkeIndex/clusterCluster", {
 *     clusterYaml: fs.readFileSync("cluster.yaml"),
 *     sshAgentAuth: true,
 *     ignoreDockerVersion: true,
 *     kubernetesVersion: "<K8s_VERSION>",
 * });
 * ```
 *
 * > This content is derived from https://github.com/rancher/terraform-provider-rke/blob/master/website/docs/r/cluster.html.markdown.
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rke:index/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * RKE k8s cluster addon deployment timeout in seconds for status check (int)
     */
    public readonly addonJobTimeout!: pulumi.Output<number>;
    /**
     * RKE k8s cluster user addons YAML manifest to be deployed (string)
     */
    public readonly addons!: pulumi.Output<string | undefined>;
    /**
     * RKE k8s cluster user addons YAML manifest urls or paths to be deployed (list)
     */
    public readonly addonsIncludes!: pulumi.Output<string[] | undefined>;
    /**
     * (Computed) RKE k8s cluster api server url (string)
     */
    public /*out*/ readonly apiServerUrl!: pulumi.Output<string>;
    /**
     * RKE k8s cluster authentication configuration (list maxitems:1)
     */
    public readonly authentication!: pulumi.Output<outputs.ClusterAuthentication>;
    /**
     * RKE k8s cluster authorization mode configuration (list maxitems:1)
     */
    public readonly authorization!: pulumi.Output<outputs.ClusterAuthorization>;
    /**
     * RKE k8s cluster bastion Host configuration (list maxitems:1)
     */
    public readonly bastionHost!: pulumi.Output<outputs.ClusterBastionHost | undefined>;
    /**
     * (Computed/Sensitive) RKE k8s cluster CA certificate (string)
     */
    public /*out*/ readonly caCrt!: pulumi.Output<string>;
    /**
     * Specify a certificate dir path (string)
     */
    public readonly certDir!: pulumi.Output<string | undefined>;
    /**
     * (Computed/Sensitive) RKE k8s cluster certificates (string)
     */
    public /*out*/ readonly certificates!: pulumi.Output<outputs.ClusterCertificate[]>;
    /**
     * (Computed/Sensitive) RKE k8s cluster client certificate (string)
     */
    public /*out*/ readonly clientCert!: pulumi.Output<string>;
    /**
     * (Computed/Sensitive) RKE k8s cluster client key (string)
     */
    public /*out*/ readonly clientKey!: pulumi.Output<string>;
    /**
     * Calico cloud provider (string)
     */
    public readonly cloudProvider!: pulumi.Output<outputs.ClusterCloudProvider | undefined>;
    /**
     * Cluster CIDR option for kube controller service (string)
     */
    public /*out*/ readonly clusterCidr!: pulumi.Output<string>;
    /**
     * Cluster DNS Server option for kubelet service (string)
     */
    public /*out*/ readonly clusterDnsServer!: pulumi.Output<string>;
    /**
     * Cluster Domain option for kubelet service. Default `cluster.local` (string)
     */
    public /*out*/ readonly clusterDomain!: pulumi.Output<string>;
    /**
     * RKE k8s cluster name used in the kube config (string)
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * RKE k8s cluster config yaml encoded. Provider arguments take precedence over this one (string)
     */
    public readonly clusterYaml!: pulumi.Output<string | undefined>;
    /**
     * (Computed) RKE k8s cluster control plane nodes (list)
     */
    public /*out*/ readonly controlPlaneHosts!: pulumi.Output<outputs.ClusterControlPlaneHost[]>;
    /**
     * Use custom certificates from a cert dir (string)
     */
    public readonly customCerts!: pulumi.Output<boolean | undefined>;
    /**
     * RKE k8s cluster delay on creation (int)
     */
    public readonly delayOnCreation!: pulumi.Output<number | undefined>;
    /**
     * Deploy RKE cluster on a dind environment. Default: `false` (bool)
     */
    public readonly dind!: pulumi.Output<boolean | undefined>;
    /**
     * DinD RKE cluster dns (string)
     */
    public readonly dindDnsServer!: pulumi.Output<string | undefined>;
    /**
     * DinD RKE cluster storage driver (string)
     */
    public readonly dindStorageDriver!: pulumi.Output<string | undefined>;
    /**
     * Enable/Disable RKE k8s cluster port checking. Default `false` (bool)
     */
    public readonly disablePortCheck!: pulumi.Output<boolean | undefined>;
    /**
     * RKE k8s cluster DNS Config (list maxitems:1)
     */
    public readonly dns!: pulumi.Output<outputs.ClusterDns>;
    /**
     * (Computed) RKE k8s cluster etcd nodes (list)
     */
    public /*out*/ readonly etcdHosts!: pulumi.Output<outputs.ClusterEtcdHost[]>;
    /**
     * Enable/Disable RKE k8s cluster strict docker version checking. Default `false` (bool)
     */
    public readonly ignoreDockerVersion!: pulumi.Output<boolean>;
    /**
     * (Computed) RKE k8s cluster inactive nodes (list)
     */
    public /*out*/ readonly inactiveHosts!: pulumi.Output<outputs.ClusterInactiveHost[]>;
    /**
     * Docker image for ingress (string)
     */
    public readonly ingress!: pulumi.Output<outputs.ClusterIngress>;
    /**
     * (Computed/Sensitive) RKE k8s cluster internal kube config yaml (string)
     */
    public /*out*/ readonly internalKubeConfigYaml!: pulumi.Output<string>;
    /**
     * (Computed) RKE k8s cluster admin user (string)
     */
    public /*out*/ readonly kubeAdminUser!: pulumi.Output<string>;
    /**
     * (Computed/Sensitive) RKE k8s cluster kube config yaml (string)
     */
    public /*out*/ readonly kubeConfigYaml!: pulumi.Output<string>;
    /**
     * K8s version to deploy. If kubernetes image is specified, image version takes precedence. Default: `rke default` (string)
     */
    public readonly kubernetesVersion!: pulumi.Output<string | undefined>;
    /**
     * RKE k8s cluster monitoring Config (list maxitems:1)
     */
    public readonly monitoring!: pulumi.Output<outputs.ClusterMonitoring>;
    /**
     * (list maxitems:1)
     */
    public readonly network!: pulumi.Output<outputs.ClusterNetwork>;
    /**
     * RKE k8s cluster nodes (list)
     */
    public readonly nodes!: pulumi.Output<outputs.ClusterNode[] | undefined>;
    public readonly nodesConfs!: pulumi.Output<string[] | undefined>;
    /**
     * RKE k8s directory path (string)
     */
    public readonly prefixPath!: pulumi.Output<string>;
    /**
     * RKE k8s cluster private docker registries (list)
     */
    public readonly privateRegistries!: pulumi.Output<outputs.ClusterPrivateRegistry[] | undefined>;
    /**
     * Restore cluster. Default `false` (bool)
     */
    public readonly restore!: pulumi.Output<outputs.ClusterRestore>;
    /**
     * (Computed/Sensitive) RKE k8s cluster config yaml (string)
     */
    public /*out*/ readonly rkeClusterYaml!: pulumi.Output<string>;
    /**
     * (Computed/Sensitive) RKE k8s cluster state (string)
     */
    public /*out*/ readonly rkeState!: pulumi.Output<string>;
    /**
     * RKE k8s cluster rotate certificates configuration (list maxitems:1)
     */
    public readonly rotateCertificates!: pulumi.Output<outputs.ClusterRotateCertificates | undefined>;
    /**
     * (Computed) RKE k8s cluster running system images list (list)
     */
    public /*out*/ readonly runningSystemImages!: pulumi.Output<outputs.ClusterRunningSystemImages>;
    /**
     * Services to rotate their certs. `etcd`, `kubelet`, `kube-apiserver`, `kube-proxy`, `kube-scheduler` and `kube-controller-manager` are supported (list)
     */
    public readonly services!: pulumi.Output<outputs.ClusterServices>;
    /**
     * Use services.etcd instead (list maxitems:1)
     */
    public readonly servicesEtcdDeprecated!: pulumi.Output<outputs.ClusterServicesEtcdDeprecated | undefined>;
    /**
     * Use services.kube_api instead (list maxitems:1)
     */
    public readonly servicesKubeApiDeprecated!: pulumi.Output<outputs.ClusterServicesKubeApiDeprecated | undefined>;
    /**
     * Use services.kube_controller instead (list maxitems:1)
     */
    public readonly servicesKubeControllerDeprecated!: pulumi.Output<outputs.ClusterServicesKubeControllerDeprecated | undefined>;
    /**
     * Use services.kubelet instead (list maxitems:1)
     */
    public readonly servicesKubeletDeprecated!: pulumi.Output<outputs.ClusterServicesKubeletDeprecated | undefined>;
    /**
     * Use services.kubeproxy instead (list maxitems:1)
     */
    public readonly servicesKubeProxyDeprecated!: pulumi.Output<outputs.ClusterServicesKubeProxyDeprecated | undefined>;
    /**
     * Use services.scheduler instead (list maxitems:1)
     */
    public readonly servicesKubeSchedulerDeprecated!: pulumi.Output<outputs.ClusterServicesKubeSchedulerDeprecated | undefined>;
    /**
     * SSH Agent Auth enable (bool)
     */
    public readonly sshAgentAuth!: pulumi.Output<boolean>;
    /**
     * SSH Certificate path (string)
     */
    public readonly sshCertPath!: pulumi.Output<string>;
    /**
     * SSH Private Key path (string)
     */
    public readonly sshKeyPath!: pulumi.Output<string>;
    /**
     * RKE k8s cluster system images list (list maxitems:1)
     */
    public readonly systemImages!: pulumi.Output<outputs.ClusterSystemImages | undefined>;
    /**
     * Skip idempotent deployment of control and etcd plane. Default `false` (bool)
     */
    public readonly updateOnly!: pulumi.Output<boolean | undefined>;
    /**
     * RKE k8s cluster upgrade strategy (list maxitems:1)
     */
    public readonly upgradeStrategy!: pulumi.Output<outputs.ClusterUpgradeStrategy | undefined>;
    /**
     * (Computed) RKE k8s cluster worker nodes (list)
     */
    public /*out*/ readonly workerHosts!: pulumi.Output<outputs.ClusterWorkerHost[]>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ClusterState | undefined;
            inputs["addonJobTimeout"] = state ? state.addonJobTimeout : undefined;
            inputs["addons"] = state ? state.addons : undefined;
            inputs["addonsIncludes"] = state ? state.addonsIncludes : undefined;
            inputs["apiServerUrl"] = state ? state.apiServerUrl : undefined;
            inputs["authentication"] = state ? state.authentication : undefined;
            inputs["authorization"] = state ? state.authorization : undefined;
            inputs["bastionHost"] = state ? state.bastionHost : undefined;
            inputs["caCrt"] = state ? state.caCrt : undefined;
            inputs["certDir"] = state ? state.certDir : undefined;
            inputs["certificates"] = state ? state.certificates : undefined;
            inputs["clientCert"] = state ? state.clientCert : undefined;
            inputs["clientKey"] = state ? state.clientKey : undefined;
            inputs["cloudProvider"] = state ? state.cloudProvider : undefined;
            inputs["clusterCidr"] = state ? state.clusterCidr : undefined;
            inputs["clusterDnsServer"] = state ? state.clusterDnsServer : undefined;
            inputs["clusterDomain"] = state ? state.clusterDomain : undefined;
            inputs["clusterName"] = state ? state.clusterName : undefined;
            inputs["clusterYaml"] = state ? state.clusterYaml : undefined;
            inputs["controlPlaneHosts"] = state ? state.controlPlaneHosts : undefined;
            inputs["customCerts"] = state ? state.customCerts : undefined;
            inputs["delayOnCreation"] = state ? state.delayOnCreation : undefined;
            inputs["dind"] = state ? state.dind : undefined;
            inputs["dindDnsServer"] = state ? state.dindDnsServer : undefined;
            inputs["dindStorageDriver"] = state ? state.dindStorageDriver : undefined;
            inputs["disablePortCheck"] = state ? state.disablePortCheck : undefined;
            inputs["dns"] = state ? state.dns : undefined;
            inputs["etcdHosts"] = state ? state.etcdHosts : undefined;
            inputs["ignoreDockerVersion"] = state ? state.ignoreDockerVersion : undefined;
            inputs["inactiveHosts"] = state ? state.inactiveHosts : undefined;
            inputs["ingress"] = state ? state.ingress : undefined;
            inputs["internalKubeConfigYaml"] = state ? state.internalKubeConfigYaml : undefined;
            inputs["kubeAdminUser"] = state ? state.kubeAdminUser : undefined;
            inputs["kubeConfigYaml"] = state ? state.kubeConfigYaml : undefined;
            inputs["kubernetesVersion"] = state ? state.kubernetesVersion : undefined;
            inputs["monitoring"] = state ? state.monitoring : undefined;
            inputs["network"] = state ? state.network : undefined;
            inputs["nodes"] = state ? state.nodes : undefined;
            inputs["nodesConfs"] = state ? state.nodesConfs : undefined;
            inputs["prefixPath"] = state ? state.prefixPath : undefined;
            inputs["privateRegistries"] = state ? state.privateRegistries : undefined;
            inputs["restore"] = state ? state.restore : undefined;
            inputs["rkeClusterYaml"] = state ? state.rkeClusterYaml : undefined;
            inputs["rkeState"] = state ? state.rkeState : undefined;
            inputs["rotateCertificates"] = state ? state.rotateCertificates : undefined;
            inputs["runningSystemImages"] = state ? state.runningSystemImages : undefined;
            inputs["services"] = state ? state.services : undefined;
            inputs["servicesEtcdDeprecated"] = state ? state.servicesEtcdDeprecated : undefined;
            inputs["servicesKubeApiDeprecated"] = state ? state.servicesKubeApiDeprecated : undefined;
            inputs["servicesKubeControllerDeprecated"] = state ? state.servicesKubeControllerDeprecated : undefined;
            inputs["servicesKubeletDeprecated"] = state ? state.servicesKubeletDeprecated : undefined;
            inputs["servicesKubeProxyDeprecated"] = state ? state.servicesKubeProxyDeprecated : undefined;
            inputs["servicesKubeSchedulerDeprecated"] = state ? state.servicesKubeSchedulerDeprecated : undefined;
            inputs["sshAgentAuth"] = state ? state.sshAgentAuth : undefined;
            inputs["sshCertPath"] = state ? state.sshCertPath : undefined;
            inputs["sshKeyPath"] = state ? state.sshKeyPath : undefined;
            inputs["systemImages"] = state ? state.systemImages : undefined;
            inputs["updateOnly"] = state ? state.updateOnly : undefined;
            inputs["upgradeStrategy"] = state ? state.upgradeStrategy : undefined;
            inputs["workerHosts"] = state ? state.workerHosts : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            inputs["addonJobTimeout"] = args ? args.addonJobTimeout : undefined;
            inputs["addons"] = args ? args.addons : undefined;
            inputs["addonsIncludes"] = args ? args.addonsIncludes : undefined;
            inputs["authentication"] = args ? args.authentication : undefined;
            inputs["authorization"] = args ? args.authorization : undefined;
            inputs["bastionHost"] = args ? args.bastionHost : undefined;
            inputs["certDir"] = args ? args.certDir : undefined;
            inputs["cloudProvider"] = args ? args.cloudProvider : undefined;
            inputs["clusterName"] = args ? args.clusterName : undefined;
            inputs["clusterYaml"] = args ? args.clusterYaml : undefined;
            inputs["customCerts"] = args ? args.customCerts : undefined;
            inputs["delayOnCreation"] = args ? args.delayOnCreation : undefined;
            inputs["dind"] = args ? args.dind : undefined;
            inputs["dindDnsServer"] = args ? args.dindDnsServer : undefined;
            inputs["dindStorageDriver"] = args ? args.dindStorageDriver : undefined;
            inputs["disablePortCheck"] = args ? args.disablePortCheck : undefined;
            inputs["dns"] = args ? args.dns : undefined;
            inputs["ignoreDockerVersion"] = args ? args.ignoreDockerVersion : undefined;
            inputs["ingress"] = args ? args.ingress : undefined;
            inputs["kubernetesVersion"] = args ? args.kubernetesVersion : undefined;
            inputs["monitoring"] = args ? args.monitoring : undefined;
            inputs["network"] = args ? args.network : undefined;
            inputs["nodes"] = args ? args.nodes : undefined;
            inputs["nodesConfs"] = args ? args.nodesConfs : undefined;
            inputs["prefixPath"] = args ? args.prefixPath : undefined;
            inputs["privateRegistries"] = args ? args.privateRegistries : undefined;
            inputs["restore"] = args ? args.restore : undefined;
            inputs["rotateCertificates"] = args ? args.rotateCertificates : undefined;
            inputs["services"] = args ? args.services : undefined;
            inputs["servicesEtcdDeprecated"] = args ? args.servicesEtcdDeprecated : undefined;
            inputs["servicesKubeApiDeprecated"] = args ? args.servicesKubeApiDeprecated : undefined;
            inputs["servicesKubeControllerDeprecated"] = args ? args.servicesKubeControllerDeprecated : undefined;
            inputs["servicesKubeletDeprecated"] = args ? args.servicesKubeletDeprecated : undefined;
            inputs["servicesKubeProxyDeprecated"] = args ? args.servicesKubeProxyDeprecated : undefined;
            inputs["servicesKubeSchedulerDeprecated"] = args ? args.servicesKubeSchedulerDeprecated : undefined;
            inputs["sshAgentAuth"] = args ? args.sshAgentAuth : undefined;
            inputs["sshCertPath"] = args ? args.sshCertPath : undefined;
            inputs["sshKeyPath"] = args ? args.sshKeyPath : undefined;
            inputs["systemImages"] = args ? args.systemImages : undefined;
            inputs["updateOnly"] = args ? args.updateOnly : undefined;
            inputs["upgradeStrategy"] = args ? args.upgradeStrategy : undefined;
            inputs["apiServerUrl"] = undefined /*out*/;
            inputs["caCrt"] = undefined /*out*/;
            inputs["certificates"] = undefined /*out*/;
            inputs["clientCert"] = undefined /*out*/;
            inputs["clientKey"] = undefined /*out*/;
            inputs["clusterCidr"] = undefined /*out*/;
            inputs["clusterDnsServer"] = undefined /*out*/;
            inputs["clusterDomain"] = undefined /*out*/;
            inputs["controlPlaneHosts"] = undefined /*out*/;
            inputs["etcdHosts"] = undefined /*out*/;
            inputs["inactiveHosts"] = undefined /*out*/;
            inputs["internalKubeConfigYaml"] = undefined /*out*/;
            inputs["kubeAdminUser"] = undefined /*out*/;
            inputs["kubeConfigYaml"] = undefined /*out*/;
            inputs["rkeClusterYaml"] = undefined /*out*/;
            inputs["rkeState"] = undefined /*out*/;
            inputs["runningSystemImages"] = undefined /*out*/;
            inputs["workerHosts"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Cluster.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * RKE k8s cluster addon deployment timeout in seconds for status check (int)
     */
    readonly addonJobTimeout?: pulumi.Input<number>;
    /**
     * RKE k8s cluster user addons YAML manifest to be deployed (string)
     */
    readonly addons?: pulumi.Input<string>;
    /**
     * RKE k8s cluster user addons YAML manifest urls or paths to be deployed (list)
     */
    readonly addonsIncludes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (Computed) RKE k8s cluster api server url (string)
     */
    readonly apiServerUrl?: pulumi.Input<string>;
    /**
     * RKE k8s cluster authentication configuration (list maxitems:1)
     */
    readonly authentication?: pulumi.Input<inputs.ClusterAuthentication>;
    /**
     * RKE k8s cluster authorization mode configuration (list maxitems:1)
     */
    readonly authorization?: pulumi.Input<inputs.ClusterAuthorization>;
    /**
     * RKE k8s cluster bastion Host configuration (list maxitems:1)
     */
    readonly bastionHost?: pulumi.Input<inputs.ClusterBastionHost>;
    /**
     * (Computed/Sensitive) RKE k8s cluster CA certificate (string)
     */
    readonly caCrt?: pulumi.Input<string>;
    /**
     * Specify a certificate dir path (string)
     */
    readonly certDir?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) RKE k8s cluster certificates (string)
     */
    readonly certificates?: pulumi.Input<pulumi.Input<inputs.ClusterCertificate>[]>;
    /**
     * (Computed/Sensitive) RKE k8s cluster client certificate (string)
     */
    readonly clientCert?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) RKE k8s cluster client key (string)
     */
    readonly clientKey?: pulumi.Input<string>;
    /**
     * Calico cloud provider (string)
     */
    readonly cloudProvider?: pulumi.Input<inputs.ClusterCloudProvider>;
    /**
     * Cluster CIDR option for kube controller service (string)
     */
    readonly clusterCidr?: pulumi.Input<string>;
    /**
     * Cluster DNS Server option for kubelet service (string)
     */
    readonly clusterDnsServer?: pulumi.Input<string>;
    /**
     * Cluster Domain option for kubelet service. Default `cluster.local` (string)
     */
    readonly clusterDomain?: pulumi.Input<string>;
    /**
     * RKE k8s cluster name used in the kube config (string)
     */
    readonly clusterName?: pulumi.Input<string>;
    /**
     * RKE k8s cluster config yaml encoded. Provider arguments take precedence over this one (string)
     */
    readonly clusterYaml?: pulumi.Input<string>;
    /**
     * (Computed) RKE k8s cluster control plane nodes (list)
     */
    readonly controlPlaneHosts?: pulumi.Input<pulumi.Input<inputs.ClusterControlPlaneHost>[]>;
    /**
     * Use custom certificates from a cert dir (string)
     */
    readonly customCerts?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster delay on creation (int)
     */
    readonly delayOnCreation?: pulumi.Input<number>;
    /**
     * Deploy RKE cluster on a dind environment. Default: `false` (bool)
     */
    readonly dind?: pulumi.Input<boolean>;
    /**
     * DinD RKE cluster dns (string)
     */
    readonly dindDnsServer?: pulumi.Input<string>;
    /**
     * DinD RKE cluster storage driver (string)
     */
    readonly dindStorageDriver?: pulumi.Input<string>;
    /**
     * Enable/Disable RKE k8s cluster port checking. Default `false` (bool)
     */
    readonly disablePortCheck?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster DNS Config (list maxitems:1)
     */
    readonly dns?: pulumi.Input<inputs.ClusterDns>;
    /**
     * (Computed) RKE k8s cluster etcd nodes (list)
     */
    readonly etcdHosts?: pulumi.Input<pulumi.Input<inputs.ClusterEtcdHost>[]>;
    /**
     * Enable/Disable RKE k8s cluster strict docker version checking. Default `false` (bool)
     */
    readonly ignoreDockerVersion?: pulumi.Input<boolean>;
    /**
     * (Computed) RKE k8s cluster inactive nodes (list)
     */
    readonly inactiveHosts?: pulumi.Input<pulumi.Input<inputs.ClusterInactiveHost>[]>;
    /**
     * Docker image for ingress (string)
     */
    readonly ingress?: pulumi.Input<inputs.ClusterIngress>;
    /**
     * (Computed/Sensitive) RKE k8s cluster internal kube config yaml (string)
     * 
     * @deprecated Use kube_config_yaml instead
     */
    readonly internalKubeConfigYaml?: pulumi.Input<string>;
    /**
     * (Computed) RKE k8s cluster admin user (string)
     */
    readonly kubeAdminUser?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) RKE k8s cluster kube config yaml (string)
     */
    readonly kubeConfigYaml?: pulumi.Input<string>;
    /**
     * K8s version to deploy. If kubernetes image is specified, image version takes precedence. Default: `rke default` (string)
     */
    readonly kubernetesVersion?: pulumi.Input<string>;
    /**
     * RKE k8s cluster monitoring Config (list maxitems:1)
     */
    readonly monitoring?: pulumi.Input<inputs.ClusterMonitoring>;
    /**
     * (list maxitems:1)
     */
    readonly network?: pulumi.Input<inputs.ClusterNetwork>;
    /**
     * RKE k8s cluster nodes (list)
     */
    readonly nodes?: pulumi.Input<pulumi.Input<inputs.ClusterNode>[]>;
    readonly nodesConfs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * RKE k8s directory path (string)
     */
    readonly prefixPath?: pulumi.Input<string>;
    /**
     * RKE k8s cluster private docker registries (list)
     */
    readonly privateRegistries?: pulumi.Input<pulumi.Input<inputs.ClusterPrivateRegistry>[]>;
    /**
     * Restore cluster. Default `false` (bool)
     */
    readonly restore?: pulumi.Input<inputs.ClusterRestore>;
    /**
     * (Computed/Sensitive) RKE k8s cluster config yaml (string)
     */
    readonly rkeClusterYaml?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) RKE k8s cluster state (string)
     */
    readonly rkeState?: pulumi.Input<string>;
    /**
     * RKE k8s cluster rotate certificates configuration (list maxitems:1)
     */
    readonly rotateCertificates?: pulumi.Input<inputs.ClusterRotateCertificates>;
    /**
     * (Computed) RKE k8s cluster running system images list (list)
     */
    readonly runningSystemImages?: pulumi.Input<inputs.ClusterRunningSystemImages>;
    /**
     * Services to rotate their certs. `etcd`, `kubelet`, `kube-apiserver`, `kube-proxy`, `kube-scheduler` and `kube-controller-manager` are supported (list)
     */
    readonly services?: pulumi.Input<inputs.ClusterServices>;
    /**
     * Use services.etcd instead (list maxitems:1)
     * 
     * @deprecated Use services.etcd instead
     */
    readonly servicesEtcdDeprecated?: pulumi.Input<inputs.ClusterServicesEtcdDeprecated>;
    /**
     * Use services.kube_api instead (list maxitems:1)
     * 
     * @deprecated Use services.kube_api instead
     */
    readonly servicesKubeApiDeprecated?: pulumi.Input<inputs.ClusterServicesKubeApiDeprecated>;
    /**
     * Use services.kube_controller instead (list maxitems:1)
     * 
     * @deprecated Use services.kube_controller instead
     */
    readonly servicesKubeControllerDeprecated?: pulumi.Input<inputs.ClusterServicesKubeControllerDeprecated>;
    /**
     * Use services.kubelet instead (list maxitems:1)
     * 
     * @deprecated Use services.kubelet instead
     */
    readonly servicesKubeletDeprecated?: pulumi.Input<inputs.ClusterServicesKubeletDeprecated>;
    /**
     * Use services.kubeproxy instead (list maxitems:1)
     * 
     * @deprecated Use services.kubeproxy instead
     */
    readonly servicesKubeProxyDeprecated?: pulumi.Input<inputs.ClusterServicesKubeProxyDeprecated>;
    /**
     * Use services.scheduler instead (list maxitems:1)
     * 
     * @deprecated Use services.scheduler instead
     */
    readonly servicesKubeSchedulerDeprecated?: pulumi.Input<inputs.ClusterServicesKubeSchedulerDeprecated>;
    /**
     * SSH Agent Auth enable (bool)
     */
    readonly sshAgentAuth?: pulumi.Input<boolean>;
    /**
     * SSH Certificate path (string)
     */
    readonly sshCertPath?: pulumi.Input<string>;
    /**
     * SSH Private Key path (string)
     */
    readonly sshKeyPath?: pulumi.Input<string>;
    /**
     * RKE k8s cluster system images list (list maxitems:1)
     */
    readonly systemImages?: pulumi.Input<inputs.ClusterSystemImages>;
    /**
     * Skip idempotent deployment of control and etcd plane. Default `false` (bool)
     */
    readonly updateOnly?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster upgrade strategy (list maxitems:1)
     */
    readonly upgradeStrategy?: pulumi.Input<inputs.ClusterUpgradeStrategy>;
    /**
     * (Computed) RKE k8s cluster worker nodes (list)
     */
    readonly workerHosts?: pulumi.Input<pulumi.Input<inputs.ClusterWorkerHost>[]>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * RKE k8s cluster addon deployment timeout in seconds for status check (int)
     */
    readonly addonJobTimeout?: pulumi.Input<number>;
    /**
     * RKE k8s cluster user addons YAML manifest to be deployed (string)
     */
    readonly addons?: pulumi.Input<string>;
    /**
     * RKE k8s cluster user addons YAML manifest urls or paths to be deployed (list)
     */
    readonly addonsIncludes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * RKE k8s cluster authentication configuration (list maxitems:1)
     */
    readonly authentication?: pulumi.Input<inputs.ClusterAuthentication>;
    /**
     * RKE k8s cluster authorization mode configuration (list maxitems:1)
     */
    readonly authorization?: pulumi.Input<inputs.ClusterAuthorization>;
    /**
     * RKE k8s cluster bastion Host configuration (list maxitems:1)
     */
    readonly bastionHost?: pulumi.Input<inputs.ClusterBastionHost>;
    /**
     * Specify a certificate dir path (string)
     */
    readonly certDir?: pulumi.Input<string>;
    /**
     * Calico cloud provider (string)
     */
    readonly cloudProvider?: pulumi.Input<inputs.ClusterCloudProvider>;
    /**
     * RKE k8s cluster name used in the kube config (string)
     */
    readonly clusterName?: pulumi.Input<string>;
    /**
     * RKE k8s cluster config yaml encoded. Provider arguments take precedence over this one (string)
     */
    readonly clusterYaml?: pulumi.Input<string>;
    /**
     * Use custom certificates from a cert dir (string)
     */
    readonly customCerts?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster delay on creation (int)
     */
    readonly delayOnCreation?: pulumi.Input<number>;
    /**
     * Deploy RKE cluster on a dind environment. Default: `false` (bool)
     */
    readonly dind?: pulumi.Input<boolean>;
    /**
     * DinD RKE cluster dns (string)
     */
    readonly dindDnsServer?: pulumi.Input<string>;
    /**
     * DinD RKE cluster storage driver (string)
     */
    readonly dindStorageDriver?: pulumi.Input<string>;
    /**
     * Enable/Disable RKE k8s cluster port checking. Default `false` (bool)
     */
    readonly disablePortCheck?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster DNS Config (list maxitems:1)
     */
    readonly dns?: pulumi.Input<inputs.ClusterDns>;
    /**
     * Enable/Disable RKE k8s cluster strict docker version checking. Default `false` (bool)
     */
    readonly ignoreDockerVersion?: pulumi.Input<boolean>;
    /**
     * Docker image for ingress (string)
     */
    readonly ingress?: pulumi.Input<inputs.ClusterIngress>;
    /**
     * K8s version to deploy. If kubernetes image is specified, image version takes precedence. Default: `rke default` (string)
     */
    readonly kubernetesVersion?: pulumi.Input<string>;
    /**
     * RKE k8s cluster monitoring Config (list maxitems:1)
     */
    readonly monitoring?: pulumi.Input<inputs.ClusterMonitoring>;
    /**
     * (list maxitems:1)
     */
    readonly network?: pulumi.Input<inputs.ClusterNetwork>;
    /**
     * RKE k8s cluster nodes (list)
     */
    readonly nodes?: pulumi.Input<pulumi.Input<inputs.ClusterNode>[]>;
    readonly nodesConfs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * RKE k8s directory path (string)
     */
    readonly prefixPath?: pulumi.Input<string>;
    /**
     * RKE k8s cluster private docker registries (list)
     */
    readonly privateRegistries?: pulumi.Input<pulumi.Input<inputs.ClusterPrivateRegistry>[]>;
    /**
     * Restore cluster. Default `false` (bool)
     */
    readonly restore?: pulumi.Input<inputs.ClusterRestore>;
    /**
     * RKE k8s cluster rotate certificates configuration (list maxitems:1)
     */
    readonly rotateCertificates?: pulumi.Input<inputs.ClusterRotateCertificates>;
    /**
     * Services to rotate their certs. `etcd`, `kubelet`, `kube-apiserver`, `kube-proxy`, `kube-scheduler` and `kube-controller-manager` are supported (list)
     */
    readonly services?: pulumi.Input<inputs.ClusterServices>;
    /**
     * Use services.etcd instead (list maxitems:1)
     * 
     * @deprecated Use services.etcd instead
     */
    readonly servicesEtcdDeprecated?: pulumi.Input<inputs.ClusterServicesEtcdDeprecated>;
    /**
     * Use services.kube_api instead (list maxitems:1)
     * 
     * @deprecated Use services.kube_api instead
     */
    readonly servicesKubeApiDeprecated?: pulumi.Input<inputs.ClusterServicesKubeApiDeprecated>;
    /**
     * Use services.kube_controller instead (list maxitems:1)
     * 
     * @deprecated Use services.kube_controller instead
     */
    readonly servicesKubeControllerDeprecated?: pulumi.Input<inputs.ClusterServicesKubeControllerDeprecated>;
    /**
     * Use services.kubelet instead (list maxitems:1)
     * 
     * @deprecated Use services.kubelet instead
     */
    readonly servicesKubeletDeprecated?: pulumi.Input<inputs.ClusterServicesKubeletDeprecated>;
    /**
     * Use services.kubeproxy instead (list maxitems:1)
     * 
     * @deprecated Use services.kubeproxy instead
     */
    readonly servicesKubeProxyDeprecated?: pulumi.Input<inputs.ClusterServicesKubeProxyDeprecated>;
    /**
     * Use services.scheduler instead (list maxitems:1)
     * 
     * @deprecated Use services.scheduler instead
     */
    readonly servicesKubeSchedulerDeprecated?: pulumi.Input<inputs.ClusterServicesKubeSchedulerDeprecated>;
    /**
     * SSH Agent Auth enable (bool)
     */
    readonly sshAgentAuth?: pulumi.Input<boolean>;
    /**
     * SSH Certificate path (string)
     */
    readonly sshCertPath?: pulumi.Input<string>;
    /**
     * SSH Private Key path (string)
     */
    readonly sshKeyPath?: pulumi.Input<string>;
    /**
     * RKE k8s cluster system images list (list maxitems:1)
     */
    readonly systemImages?: pulumi.Input<inputs.ClusterSystemImages>;
    /**
     * Skip idempotent deployment of control and etcd plane. Default `false` (bool)
     */
    readonly updateOnly?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster upgrade strategy (list maxitems:1)
     */
    readonly upgradeStrategy?: pulumi.Input<inputs.ClusterUpgradeStrategy>;
}
