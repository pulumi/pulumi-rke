// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * rke_cluster can be imported using the RKE cluster config and state files as ID in the format `<cluster_config_file>:<rke_state_file>`
 *
 * ```sh
 *  $ pulumi import rke:index/cluster:Cluster foo &lt;cluster_config_file&gt;:&lt;rke_state_file&gt;
 * ```
 *  As experimental feature, dind rke_cluster can be also imported adding `dind` as 3rd import parameter `<cluster_config_file>:<rke_state_file>:dind`
 *
 * ```sh
 *  $ pulumi import rke:index/cluster:Cluster foo &lt;cluster_config_file&gt;:&lt;rke_state_file&gt;:dind
 * ```
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
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
    public readonly addonJobTimeout!: pulumi.Output<number | undefined>;
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
    public readonly authentication!: pulumi.Output<outputs.ClusterAuthentication | undefined>;
    /**
     * RKE k8s cluster authorization mode configuration (list maxitems:1)
     */
    public readonly authorization!: pulumi.Output<outputs.ClusterAuthorization | undefined>;
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
     * RKE k8s cluster cloud provider configuration [rke-cloud-providers](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/) (list maxitems:1)
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
    public readonly clusterName!: pulumi.Output<string | undefined>;
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
    public readonly dns!: pulumi.Output<outputs.ClusterDns | undefined>;
    /**
     * Enable/Disable CRI dockerd for kubelet. Default `false` (bool)
     */
    public readonly enableCriDockerd!: pulumi.Output<boolean | undefined>;
    /**
     * (Computed) RKE k8s cluster etcd nodes (list)
     */
    public /*out*/ readonly etcdHosts!: pulumi.Output<outputs.ClusterEtcdHost[]>;
    /**
     * Enable/Disable RKE k8s cluster strict docker version checking. Default `false` (bool)
     */
    public readonly ignoreDockerVersion!: pulumi.Output<boolean | undefined>;
    /**
     * (Computed) RKE k8s cluster inactive nodes (list)
     */
    public /*out*/ readonly inactiveHosts!: pulumi.Output<outputs.ClusterInactiveHost[]>;
    /**
     * RKE k8s cluster ingress controller configuration (list maxitems:1)
     */
    public readonly ingress!: pulumi.Output<outputs.ClusterIngress | undefined>;
    /**
     * (Computed/Sensitive) RKE k8s cluster internal kube config yaml (string)
     *
     * @deprecated Use kube_config_yaml instead
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
    public readonly monitoring!: pulumi.Output<outputs.ClusterMonitoring | undefined>;
    /**
     * RKE k8s cluster network configuration (list maxitems:1)
     */
    public readonly network!: pulumi.Output<outputs.ClusterNetwork | undefined>;
    /**
     * RKE k8s cluster nodes (list)
     */
    public readonly nodes!: pulumi.Output<outputs.ClusterNode[] | undefined>;
    /**
     * @deprecated Use cluster_yaml instead
     */
    public readonly nodesConfs!: pulumi.Output<string[] | undefined>;
    /**
     * RKE k8s directory path (string)
     */
    public readonly prefixPath!: pulumi.Output<string | undefined>;
    /**
     * RKE k8s cluster private docker registries (list)
     */
    public readonly privateRegistries!: pulumi.Output<outputs.ClusterPrivateRegistry[] | undefined>;
    /**
     * RKE k8s cluster restore configuration (list maxitems:1)
     */
    public readonly restore!: pulumi.Output<outputs.ClusterRestore | undefined>;
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
    public /*out*/ readonly runningSystemImages!: pulumi.Output<outputs.ClusterRunningSystemImage[]>;
    /**
     * RKE k8s cluster services (list maxitems:1)
     */
    public readonly services!: pulumi.Output<outputs.ClusterServices | undefined>;
    /**
     * (DEPRECATED) Use services.etcd instead (list maxitems:1)
     *
     * @deprecated Use services.etcd instead
     */
    public readonly servicesEtcdDeprecated!: pulumi.Output<outputs.ClusterServicesEtcdDeprecated | undefined>;
    /**
     * (DEPRECATED) Use services.kube_api instead (list maxitems:1)
     *
     * @deprecated Use services.kube_api instead
     */
    public readonly servicesKubeApiDeprecated!: pulumi.Output<outputs.ClusterServicesKubeApiDeprecated | undefined>;
    /**
     * (DEPRECATED) Use services.kube_controller instead (list maxitems:1)
     *
     * @deprecated Use services.kube_controller instead
     */
    public readonly servicesKubeControllerDeprecated!: pulumi.Output<outputs.ClusterServicesKubeControllerDeprecated | undefined>;
    /**
     * (DEPRECATED) Use services.kubeproxy instead (list maxitems:1)
     *
     * @deprecated Use services.kubeproxy instead
     */
    public readonly servicesKubeProxyDeprecated!: pulumi.Output<outputs.ClusterServicesKubeProxyDeprecated | undefined>;
    /**
     * (DEPRECATED) Use services.scheduler instead (list maxitems:1)
     *
     * @deprecated Use services.scheduler instead
     */
    public readonly servicesKubeSchedulerDeprecated!: pulumi.Output<outputs.ClusterServicesKubeSchedulerDeprecated | undefined>;
    /**
     * (DEPRECATED) Use services.kubelet instead (list maxitems:1)
     *
     * @deprecated Use services.kubelet instead
     */
    public readonly servicesKubeletDeprecated!: pulumi.Output<outputs.ClusterServicesKubeletDeprecated | undefined>;
    /**
     * SSH Agent Auth enable (bool)
     */
    public readonly sshAgentAuth!: pulumi.Output<boolean>;
    /**
     * SSH Certificate Path (string)
     */
    public readonly sshCertPath!: pulumi.Output<string | undefined>;
    /**
     * SSH Private Key Path (string)
     */
    public readonly sshKeyPath!: pulumi.Output<string | undefined>;
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["addonJobTimeout"] = state ? state.addonJobTimeout : undefined;
            resourceInputs["addons"] = state ? state.addons : undefined;
            resourceInputs["addonsIncludes"] = state ? state.addonsIncludes : undefined;
            resourceInputs["apiServerUrl"] = state ? state.apiServerUrl : undefined;
            resourceInputs["authentication"] = state ? state.authentication : undefined;
            resourceInputs["authorization"] = state ? state.authorization : undefined;
            resourceInputs["bastionHost"] = state ? state.bastionHost : undefined;
            resourceInputs["caCrt"] = state ? state.caCrt : undefined;
            resourceInputs["certDir"] = state ? state.certDir : undefined;
            resourceInputs["certificates"] = state ? state.certificates : undefined;
            resourceInputs["clientCert"] = state ? state.clientCert : undefined;
            resourceInputs["clientKey"] = state ? state.clientKey : undefined;
            resourceInputs["cloudProvider"] = state ? state.cloudProvider : undefined;
            resourceInputs["clusterCidr"] = state ? state.clusterCidr : undefined;
            resourceInputs["clusterDnsServer"] = state ? state.clusterDnsServer : undefined;
            resourceInputs["clusterDomain"] = state ? state.clusterDomain : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["clusterYaml"] = state ? state.clusterYaml : undefined;
            resourceInputs["controlPlaneHosts"] = state ? state.controlPlaneHosts : undefined;
            resourceInputs["customCerts"] = state ? state.customCerts : undefined;
            resourceInputs["delayOnCreation"] = state ? state.delayOnCreation : undefined;
            resourceInputs["dind"] = state ? state.dind : undefined;
            resourceInputs["dindDnsServer"] = state ? state.dindDnsServer : undefined;
            resourceInputs["dindStorageDriver"] = state ? state.dindStorageDriver : undefined;
            resourceInputs["disablePortCheck"] = state ? state.disablePortCheck : undefined;
            resourceInputs["dns"] = state ? state.dns : undefined;
            resourceInputs["enableCriDockerd"] = state ? state.enableCriDockerd : undefined;
            resourceInputs["etcdHosts"] = state ? state.etcdHosts : undefined;
            resourceInputs["ignoreDockerVersion"] = state ? state.ignoreDockerVersion : undefined;
            resourceInputs["inactiveHosts"] = state ? state.inactiveHosts : undefined;
            resourceInputs["ingress"] = state ? state.ingress : undefined;
            resourceInputs["internalKubeConfigYaml"] = state ? state.internalKubeConfigYaml : undefined;
            resourceInputs["kubeAdminUser"] = state ? state.kubeAdminUser : undefined;
            resourceInputs["kubeConfigYaml"] = state ? state.kubeConfigYaml : undefined;
            resourceInputs["kubernetesVersion"] = state ? state.kubernetesVersion : undefined;
            resourceInputs["monitoring"] = state ? state.monitoring : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["nodes"] = state ? state.nodes : undefined;
            resourceInputs["nodesConfs"] = state ? state.nodesConfs : undefined;
            resourceInputs["prefixPath"] = state ? state.prefixPath : undefined;
            resourceInputs["privateRegistries"] = state ? state.privateRegistries : undefined;
            resourceInputs["restore"] = state ? state.restore : undefined;
            resourceInputs["rkeClusterYaml"] = state ? state.rkeClusterYaml : undefined;
            resourceInputs["rkeState"] = state ? state.rkeState : undefined;
            resourceInputs["rotateCertificates"] = state ? state.rotateCertificates : undefined;
            resourceInputs["runningSystemImages"] = state ? state.runningSystemImages : undefined;
            resourceInputs["services"] = state ? state.services : undefined;
            resourceInputs["servicesEtcdDeprecated"] = state ? state.servicesEtcdDeprecated : undefined;
            resourceInputs["servicesKubeApiDeprecated"] = state ? state.servicesKubeApiDeprecated : undefined;
            resourceInputs["servicesKubeControllerDeprecated"] = state ? state.servicesKubeControllerDeprecated : undefined;
            resourceInputs["servicesKubeProxyDeprecated"] = state ? state.servicesKubeProxyDeprecated : undefined;
            resourceInputs["servicesKubeSchedulerDeprecated"] = state ? state.servicesKubeSchedulerDeprecated : undefined;
            resourceInputs["servicesKubeletDeprecated"] = state ? state.servicesKubeletDeprecated : undefined;
            resourceInputs["sshAgentAuth"] = state ? state.sshAgentAuth : undefined;
            resourceInputs["sshCertPath"] = state ? state.sshCertPath : undefined;
            resourceInputs["sshKeyPath"] = state ? state.sshKeyPath : undefined;
            resourceInputs["systemImages"] = state ? state.systemImages : undefined;
            resourceInputs["updateOnly"] = state ? state.updateOnly : undefined;
            resourceInputs["upgradeStrategy"] = state ? state.upgradeStrategy : undefined;
            resourceInputs["workerHosts"] = state ? state.workerHosts : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            resourceInputs["addonJobTimeout"] = args ? args.addonJobTimeout : undefined;
            resourceInputs["addons"] = args ? args.addons : undefined;
            resourceInputs["addonsIncludes"] = args ? args.addonsIncludes : undefined;
            resourceInputs["authentication"] = args ? args.authentication : undefined;
            resourceInputs["authorization"] = args ? args.authorization : undefined;
            resourceInputs["bastionHost"] = args ? args.bastionHost : undefined;
            resourceInputs["certDir"] = args ? args.certDir : undefined;
            resourceInputs["cloudProvider"] = args ? args.cloudProvider : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["clusterYaml"] = args?.clusterYaml ? pulumi.secret(args.clusterYaml) : undefined;
            resourceInputs["customCerts"] = args ? args.customCerts : undefined;
            resourceInputs["delayOnCreation"] = args ? args.delayOnCreation : undefined;
            resourceInputs["dind"] = args ? args.dind : undefined;
            resourceInputs["dindDnsServer"] = args ? args.dindDnsServer : undefined;
            resourceInputs["dindStorageDriver"] = args ? args.dindStorageDriver : undefined;
            resourceInputs["disablePortCheck"] = args ? args.disablePortCheck : undefined;
            resourceInputs["dns"] = args ? args.dns : undefined;
            resourceInputs["enableCriDockerd"] = args ? args.enableCriDockerd : undefined;
            resourceInputs["ignoreDockerVersion"] = args ? args.ignoreDockerVersion : undefined;
            resourceInputs["ingress"] = args ? args.ingress : undefined;
            resourceInputs["kubernetesVersion"] = args ? args.kubernetesVersion : undefined;
            resourceInputs["monitoring"] = args ? args.monitoring : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["nodes"] = args ? args.nodes : undefined;
            resourceInputs["nodesConfs"] = args ? args.nodesConfs : undefined;
            resourceInputs["prefixPath"] = args ? args.prefixPath : undefined;
            resourceInputs["privateRegistries"] = args ? args.privateRegistries : undefined;
            resourceInputs["restore"] = args ? args.restore : undefined;
            resourceInputs["rotateCertificates"] = args ? args.rotateCertificates : undefined;
            resourceInputs["services"] = args ? args.services : undefined;
            resourceInputs["servicesEtcdDeprecated"] = args ? args.servicesEtcdDeprecated : undefined;
            resourceInputs["servicesKubeApiDeprecated"] = args ? args.servicesKubeApiDeprecated : undefined;
            resourceInputs["servicesKubeControllerDeprecated"] = args ? args.servicesKubeControllerDeprecated : undefined;
            resourceInputs["servicesKubeProxyDeprecated"] = args ? args.servicesKubeProxyDeprecated : undefined;
            resourceInputs["servicesKubeSchedulerDeprecated"] = args ? args.servicesKubeSchedulerDeprecated : undefined;
            resourceInputs["servicesKubeletDeprecated"] = args ? args.servicesKubeletDeprecated : undefined;
            resourceInputs["sshAgentAuth"] = args ? args.sshAgentAuth : undefined;
            resourceInputs["sshCertPath"] = args ? args.sshCertPath : undefined;
            resourceInputs["sshKeyPath"] = args ? args.sshKeyPath : undefined;
            resourceInputs["systemImages"] = args ? args.systemImages : undefined;
            resourceInputs["updateOnly"] = args ? args.updateOnly : undefined;
            resourceInputs["upgradeStrategy"] = args ? args.upgradeStrategy : undefined;
            resourceInputs["apiServerUrl"] = undefined /*out*/;
            resourceInputs["caCrt"] = undefined /*out*/;
            resourceInputs["certificates"] = undefined /*out*/;
            resourceInputs["clientCert"] = undefined /*out*/;
            resourceInputs["clientKey"] = undefined /*out*/;
            resourceInputs["clusterCidr"] = undefined /*out*/;
            resourceInputs["clusterDnsServer"] = undefined /*out*/;
            resourceInputs["clusterDomain"] = undefined /*out*/;
            resourceInputs["controlPlaneHosts"] = undefined /*out*/;
            resourceInputs["etcdHosts"] = undefined /*out*/;
            resourceInputs["inactiveHosts"] = undefined /*out*/;
            resourceInputs["internalKubeConfigYaml"] = undefined /*out*/;
            resourceInputs["kubeAdminUser"] = undefined /*out*/;
            resourceInputs["kubeConfigYaml"] = undefined /*out*/;
            resourceInputs["rkeClusterYaml"] = undefined /*out*/;
            resourceInputs["rkeState"] = undefined /*out*/;
            resourceInputs["runningSystemImages"] = undefined /*out*/;
            resourceInputs["workerHosts"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["caCrt", "certificates", "clientCert", "clientKey", "clusterYaml", "internalKubeConfigYaml", "kubeConfigYaml", "rkeClusterYaml", "rkeState"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * RKE k8s cluster addon deployment timeout in seconds for status check (int)
     */
    addonJobTimeout?: pulumi.Input<number>;
    /**
     * RKE k8s cluster user addons YAML manifest to be deployed (string)
     */
    addons?: pulumi.Input<string>;
    /**
     * RKE k8s cluster user addons YAML manifest urls or paths to be deployed (list)
     */
    addonsIncludes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (Computed) RKE k8s cluster api server url (string)
     */
    apiServerUrl?: pulumi.Input<string>;
    /**
     * RKE k8s cluster authentication configuration (list maxitems:1)
     */
    authentication?: pulumi.Input<inputs.ClusterAuthentication>;
    /**
     * RKE k8s cluster authorization mode configuration (list maxitems:1)
     */
    authorization?: pulumi.Input<inputs.ClusterAuthorization>;
    /**
     * RKE k8s cluster bastion Host configuration (list maxitems:1)
     */
    bastionHost?: pulumi.Input<inputs.ClusterBastionHost>;
    /**
     * (Computed/Sensitive) RKE k8s cluster CA certificate (string)
     */
    caCrt?: pulumi.Input<string>;
    /**
     * Specify a certificate dir path (string)
     */
    certDir?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) RKE k8s cluster certificates (string)
     */
    certificates?: pulumi.Input<pulumi.Input<inputs.ClusterCertificate>[]>;
    /**
     * (Computed/Sensitive) RKE k8s cluster client certificate (string)
     */
    clientCert?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) RKE k8s cluster client key (string)
     */
    clientKey?: pulumi.Input<string>;
    /**
     * RKE k8s cluster cloud provider configuration [rke-cloud-providers](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/) (list maxitems:1)
     */
    cloudProvider?: pulumi.Input<inputs.ClusterCloudProvider>;
    /**
     * Cluster CIDR option for kube controller service (string)
     */
    clusterCidr?: pulumi.Input<string>;
    /**
     * Cluster DNS Server option for kubelet service (string)
     */
    clusterDnsServer?: pulumi.Input<string>;
    /**
     * Cluster Domain option for kubelet service. Default `cluster.local` (string)
     */
    clusterDomain?: pulumi.Input<string>;
    /**
     * RKE k8s cluster name used in the kube config (string)
     */
    clusterName?: pulumi.Input<string>;
    /**
     * RKE k8s cluster config yaml encoded. Provider arguments take precedence over this one (string)
     */
    clusterYaml?: pulumi.Input<string>;
    /**
     * (Computed) RKE k8s cluster control plane nodes (list)
     */
    controlPlaneHosts?: pulumi.Input<pulumi.Input<inputs.ClusterControlPlaneHost>[]>;
    /**
     * Use custom certificates from a cert dir (string)
     */
    customCerts?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster delay on creation (int)
     */
    delayOnCreation?: pulumi.Input<number>;
    /**
     * Deploy RKE cluster on a dind environment. Default: `false` (bool)
     */
    dind?: pulumi.Input<boolean>;
    /**
     * DinD RKE cluster dns (string)
     */
    dindDnsServer?: pulumi.Input<string>;
    /**
     * DinD RKE cluster storage driver (string)
     */
    dindStorageDriver?: pulumi.Input<string>;
    /**
     * Enable/Disable RKE k8s cluster port checking. Default `false` (bool)
     */
    disablePortCheck?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster DNS Config (list maxitems:1)
     */
    dns?: pulumi.Input<inputs.ClusterDns>;
    /**
     * Enable/Disable CRI dockerd for kubelet. Default `false` (bool)
     */
    enableCriDockerd?: pulumi.Input<boolean>;
    /**
     * (Computed) RKE k8s cluster etcd nodes (list)
     */
    etcdHosts?: pulumi.Input<pulumi.Input<inputs.ClusterEtcdHost>[]>;
    /**
     * Enable/Disable RKE k8s cluster strict docker version checking. Default `false` (bool)
     */
    ignoreDockerVersion?: pulumi.Input<boolean>;
    /**
     * (Computed) RKE k8s cluster inactive nodes (list)
     */
    inactiveHosts?: pulumi.Input<pulumi.Input<inputs.ClusterInactiveHost>[]>;
    /**
     * RKE k8s cluster ingress controller configuration (list maxitems:1)
     */
    ingress?: pulumi.Input<inputs.ClusterIngress>;
    /**
     * (Computed/Sensitive) RKE k8s cluster internal kube config yaml (string)
     *
     * @deprecated Use kube_config_yaml instead
     */
    internalKubeConfigYaml?: pulumi.Input<string>;
    /**
     * (Computed) RKE k8s cluster admin user (string)
     */
    kubeAdminUser?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) RKE k8s cluster kube config yaml (string)
     */
    kubeConfigYaml?: pulumi.Input<string>;
    /**
     * K8s version to deploy. If kubernetes image is specified, image version takes precedence. Default: `rke default` (string)
     */
    kubernetesVersion?: pulumi.Input<string>;
    /**
     * RKE k8s cluster monitoring Config (list maxitems:1)
     */
    monitoring?: pulumi.Input<inputs.ClusterMonitoring>;
    /**
     * RKE k8s cluster network configuration (list maxitems:1)
     */
    network?: pulumi.Input<inputs.ClusterNetwork>;
    /**
     * RKE k8s cluster nodes (list)
     */
    nodes?: pulumi.Input<pulumi.Input<inputs.ClusterNode>[]>;
    /**
     * @deprecated Use cluster_yaml instead
     */
    nodesConfs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * RKE k8s directory path (string)
     */
    prefixPath?: pulumi.Input<string>;
    /**
     * RKE k8s cluster private docker registries (list)
     */
    privateRegistries?: pulumi.Input<pulumi.Input<inputs.ClusterPrivateRegistry>[]>;
    /**
     * RKE k8s cluster restore configuration (list maxitems:1)
     */
    restore?: pulumi.Input<inputs.ClusterRestore>;
    /**
     * (Computed/Sensitive) RKE k8s cluster config yaml (string)
     */
    rkeClusterYaml?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) RKE k8s cluster state (string)
     */
    rkeState?: pulumi.Input<string>;
    /**
     * RKE k8s cluster rotate certificates configuration (list maxitems:1)
     */
    rotateCertificates?: pulumi.Input<inputs.ClusterRotateCertificates>;
    /**
     * (Computed) RKE k8s cluster running system images list (list)
     */
    runningSystemImages?: pulumi.Input<pulumi.Input<inputs.ClusterRunningSystemImage>[]>;
    /**
     * RKE k8s cluster services (list maxitems:1)
     */
    services?: pulumi.Input<inputs.ClusterServices>;
    /**
     * (DEPRECATED) Use services.etcd instead (list maxitems:1)
     *
     * @deprecated Use services.etcd instead
     */
    servicesEtcdDeprecated?: pulumi.Input<inputs.ClusterServicesEtcdDeprecated>;
    /**
     * (DEPRECATED) Use services.kube_api instead (list maxitems:1)
     *
     * @deprecated Use services.kube_api instead
     */
    servicesKubeApiDeprecated?: pulumi.Input<inputs.ClusterServicesKubeApiDeprecated>;
    /**
     * (DEPRECATED) Use services.kube_controller instead (list maxitems:1)
     *
     * @deprecated Use services.kube_controller instead
     */
    servicesKubeControllerDeprecated?: pulumi.Input<inputs.ClusterServicesKubeControllerDeprecated>;
    /**
     * (DEPRECATED) Use services.kubeproxy instead (list maxitems:1)
     *
     * @deprecated Use services.kubeproxy instead
     */
    servicesKubeProxyDeprecated?: pulumi.Input<inputs.ClusterServicesKubeProxyDeprecated>;
    /**
     * (DEPRECATED) Use services.scheduler instead (list maxitems:1)
     *
     * @deprecated Use services.scheduler instead
     */
    servicesKubeSchedulerDeprecated?: pulumi.Input<inputs.ClusterServicesKubeSchedulerDeprecated>;
    /**
     * (DEPRECATED) Use services.kubelet instead (list maxitems:1)
     *
     * @deprecated Use services.kubelet instead
     */
    servicesKubeletDeprecated?: pulumi.Input<inputs.ClusterServicesKubeletDeprecated>;
    /**
     * SSH Agent Auth enable (bool)
     */
    sshAgentAuth?: pulumi.Input<boolean>;
    /**
     * SSH Certificate Path (string)
     */
    sshCertPath?: pulumi.Input<string>;
    /**
     * SSH Private Key Path (string)
     */
    sshKeyPath?: pulumi.Input<string>;
    /**
     * RKE k8s cluster system images list (list maxitems:1)
     */
    systemImages?: pulumi.Input<inputs.ClusterSystemImages>;
    /**
     * Skip idempotent deployment of control and etcd plane. Default `false` (bool)
     */
    updateOnly?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster upgrade strategy (list maxitems:1)
     */
    upgradeStrategy?: pulumi.Input<inputs.ClusterUpgradeStrategy>;
    /**
     * (Computed) RKE k8s cluster worker nodes (list)
     */
    workerHosts?: pulumi.Input<pulumi.Input<inputs.ClusterWorkerHost>[]>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * RKE k8s cluster addon deployment timeout in seconds for status check (int)
     */
    addonJobTimeout?: pulumi.Input<number>;
    /**
     * RKE k8s cluster user addons YAML manifest to be deployed (string)
     */
    addons?: pulumi.Input<string>;
    /**
     * RKE k8s cluster user addons YAML manifest urls or paths to be deployed (list)
     */
    addonsIncludes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * RKE k8s cluster authentication configuration (list maxitems:1)
     */
    authentication?: pulumi.Input<inputs.ClusterAuthentication>;
    /**
     * RKE k8s cluster authorization mode configuration (list maxitems:1)
     */
    authorization?: pulumi.Input<inputs.ClusterAuthorization>;
    /**
     * RKE k8s cluster bastion Host configuration (list maxitems:1)
     */
    bastionHost?: pulumi.Input<inputs.ClusterBastionHost>;
    /**
     * Specify a certificate dir path (string)
     */
    certDir?: pulumi.Input<string>;
    /**
     * RKE k8s cluster cloud provider configuration [rke-cloud-providers](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/) (list maxitems:1)
     */
    cloudProvider?: pulumi.Input<inputs.ClusterCloudProvider>;
    /**
     * RKE k8s cluster name used in the kube config (string)
     */
    clusterName?: pulumi.Input<string>;
    /**
     * RKE k8s cluster config yaml encoded. Provider arguments take precedence over this one (string)
     */
    clusterYaml?: pulumi.Input<string>;
    /**
     * Use custom certificates from a cert dir (string)
     */
    customCerts?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster delay on creation (int)
     */
    delayOnCreation?: pulumi.Input<number>;
    /**
     * Deploy RKE cluster on a dind environment. Default: `false` (bool)
     */
    dind?: pulumi.Input<boolean>;
    /**
     * DinD RKE cluster dns (string)
     */
    dindDnsServer?: pulumi.Input<string>;
    /**
     * DinD RKE cluster storage driver (string)
     */
    dindStorageDriver?: pulumi.Input<string>;
    /**
     * Enable/Disable RKE k8s cluster port checking. Default `false` (bool)
     */
    disablePortCheck?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster DNS Config (list maxitems:1)
     */
    dns?: pulumi.Input<inputs.ClusterDns>;
    /**
     * Enable/Disable CRI dockerd for kubelet. Default `false` (bool)
     */
    enableCriDockerd?: pulumi.Input<boolean>;
    /**
     * Enable/Disable RKE k8s cluster strict docker version checking. Default `false` (bool)
     */
    ignoreDockerVersion?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster ingress controller configuration (list maxitems:1)
     */
    ingress?: pulumi.Input<inputs.ClusterIngress>;
    /**
     * K8s version to deploy. If kubernetes image is specified, image version takes precedence. Default: `rke default` (string)
     */
    kubernetesVersion?: pulumi.Input<string>;
    /**
     * RKE k8s cluster monitoring Config (list maxitems:1)
     */
    monitoring?: pulumi.Input<inputs.ClusterMonitoring>;
    /**
     * RKE k8s cluster network configuration (list maxitems:1)
     */
    network?: pulumi.Input<inputs.ClusterNetwork>;
    /**
     * RKE k8s cluster nodes (list)
     */
    nodes?: pulumi.Input<pulumi.Input<inputs.ClusterNode>[]>;
    /**
     * @deprecated Use cluster_yaml instead
     */
    nodesConfs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * RKE k8s directory path (string)
     */
    prefixPath?: pulumi.Input<string>;
    /**
     * RKE k8s cluster private docker registries (list)
     */
    privateRegistries?: pulumi.Input<pulumi.Input<inputs.ClusterPrivateRegistry>[]>;
    /**
     * RKE k8s cluster restore configuration (list maxitems:1)
     */
    restore?: pulumi.Input<inputs.ClusterRestore>;
    /**
     * RKE k8s cluster rotate certificates configuration (list maxitems:1)
     */
    rotateCertificates?: pulumi.Input<inputs.ClusterRotateCertificates>;
    /**
     * RKE k8s cluster services (list maxitems:1)
     */
    services?: pulumi.Input<inputs.ClusterServices>;
    /**
     * (DEPRECATED) Use services.etcd instead (list maxitems:1)
     *
     * @deprecated Use services.etcd instead
     */
    servicesEtcdDeprecated?: pulumi.Input<inputs.ClusterServicesEtcdDeprecated>;
    /**
     * (DEPRECATED) Use services.kube_api instead (list maxitems:1)
     *
     * @deprecated Use services.kube_api instead
     */
    servicesKubeApiDeprecated?: pulumi.Input<inputs.ClusterServicesKubeApiDeprecated>;
    /**
     * (DEPRECATED) Use services.kube_controller instead (list maxitems:1)
     *
     * @deprecated Use services.kube_controller instead
     */
    servicesKubeControllerDeprecated?: pulumi.Input<inputs.ClusterServicesKubeControllerDeprecated>;
    /**
     * (DEPRECATED) Use services.kubeproxy instead (list maxitems:1)
     *
     * @deprecated Use services.kubeproxy instead
     */
    servicesKubeProxyDeprecated?: pulumi.Input<inputs.ClusterServicesKubeProxyDeprecated>;
    /**
     * (DEPRECATED) Use services.scheduler instead (list maxitems:1)
     *
     * @deprecated Use services.scheduler instead
     */
    servicesKubeSchedulerDeprecated?: pulumi.Input<inputs.ClusterServicesKubeSchedulerDeprecated>;
    /**
     * (DEPRECATED) Use services.kubelet instead (list maxitems:1)
     *
     * @deprecated Use services.kubelet instead
     */
    servicesKubeletDeprecated?: pulumi.Input<inputs.ClusterServicesKubeletDeprecated>;
    /**
     * SSH Agent Auth enable (bool)
     */
    sshAgentAuth?: pulumi.Input<boolean>;
    /**
     * SSH Certificate Path (string)
     */
    sshCertPath?: pulumi.Input<string>;
    /**
     * SSH Private Key Path (string)
     */
    sshKeyPath?: pulumi.Input<string>;
    /**
     * RKE k8s cluster system images list (list maxitems:1)
     */
    systemImages?: pulumi.Input<inputs.ClusterSystemImages>;
    /**
     * Skip idempotent deployment of control and etcd plane. Default `false` (bool)
     */
    updateOnly?: pulumi.Input<boolean>;
    /**
     * RKE k8s cluster upgrade strategy (list maxitems:1)
     */
    upgradeStrategy?: pulumi.Input<inputs.ClusterUpgradeStrategy>;
}
