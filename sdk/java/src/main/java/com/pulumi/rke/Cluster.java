// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rke.ClusterArgs;
import com.pulumi.rke.Utilities;
import com.pulumi.rke.inputs.ClusterState;
import com.pulumi.rke.outputs.ClusterAuthentication;
import com.pulumi.rke.outputs.ClusterAuthorization;
import com.pulumi.rke.outputs.ClusterBastionHost;
import com.pulumi.rke.outputs.ClusterCertificate;
import com.pulumi.rke.outputs.ClusterCloudProvider;
import com.pulumi.rke.outputs.ClusterControlPlaneHost;
import com.pulumi.rke.outputs.ClusterDns;
import com.pulumi.rke.outputs.ClusterEtcdHost;
import com.pulumi.rke.outputs.ClusterInactiveHost;
import com.pulumi.rke.outputs.ClusterIngress;
import com.pulumi.rke.outputs.ClusterMonitoring;
import com.pulumi.rke.outputs.ClusterNetwork;
import com.pulumi.rke.outputs.ClusterNode;
import com.pulumi.rke.outputs.ClusterPrivateRegistry;
import com.pulumi.rke.outputs.ClusterRestore;
import com.pulumi.rke.outputs.ClusterRotateCertificates;
import com.pulumi.rke.outputs.ClusterRunningSystemImage;
import com.pulumi.rke.outputs.ClusterServices;
import com.pulumi.rke.outputs.ClusterServicesEtcdDeprecated;
import com.pulumi.rke.outputs.ClusterServicesKubeApiDeprecated;
import com.pulumi.rke.outputs.ClusterServicesKubeControllerDeprecated;
import com.pulumi.rke.outputs.ClusterServicesKubeProxyDeprecated;
import com.pulumi.rke.outputs.ClusterServicesKubeSchedulerDeprecated;
import com.pulumi.rke.outputs.ClusterServicesKubeletDeprecated;
import com.pulumi.rke.outputs.ClusterSystemImages;
import com.pulumi.rke.outputs.ClusterUpgradeStrategy;
import com.pulumi.rke.outputs.ClusterWorkerHost;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * rke_cluster can be imported using the RKE cluster config and state files as ID in the format `&lt;cluster_config_file&gt;:&lt;rke_state_file&gt;`
 * 
 * ```sh
 * $ pulumi import rke:index/cluster:Cluster foo &amp;lt;cluster_config_file&amp;gt;:&amp;lt;rke_state_file&amp;gt;
 * ```
 * As experimental feature, dind rke_cluster can be also imported adding `dind` as 3rd import parameter `&lt;cluster_config_file&gt;:&lt;rke_state_file&gt;:dind`
 * 
 * ```sh
 * $ pulumi import rke:index/cluster:Cluster foo &amp;lt;cluster_config_file&amp;gt;:&amp;lt;rke_state_file&amp;gt;:dind
 * ```
 * 
 */
@ResourceType(type="rke:index/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * RKE k8s cluster addon deployment timeout in seconds for status check (int)
     * 
     */
    @Export(name="addonJobTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> addonJobTimeout;

    /**
     * @return RKE k8s cluster addon deployment timeout in seconds for status check (int)
     * 
     */
    public Output<Optional<Integer>> addonJobTimeout() {
        return Codegen.optional(this.addonJobTimeout);
    }
    /**
     * RKE k8s cluster user addons YAML manifest to be deployed (string)
     * 
     */
    @Export(name="addons", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> addons;

    /**
     * @return RKE k8s cluster user addons YAML manifest to be deployed (string)
     * 
     */
    public Output<Optional<String>> addons() {
        return Codegen.optional(this.addons);
    }
    /**
     * RKE k8s cluster user addons YAML manifest urls or paths to be deployed (list)
     * 
     */
    @Export(name="addonsIncludes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> addonsIncludes;

    /**
     * @return RKE k8s cluster user addons YAML manifest urls or paths to be deployed (list)
     * 
     */
    public Output<Optional<List<String>>> addonsIncludes() {
        return Codegen.optional(this.addonsIncludes);
    }
    /**
     * (Computed) RKE k8s cluster api server url (string)
     * 
     */
    @Export(name="apiServerUrl", refs={String.class}, tree="[0]")
    private Output<String> apiServerUrl;

    /**
     * @return (Computed) RKE k8s cluster api server url (string)
     * 
     */
    public Output<String> apiServerUrl() {
        return this.apiServerUrl;
    }
    /**
     * RKE k8s cluster authentication configuration (list maxitems:1)
     * 
     */
    @Export(name="authentication", refs={ClusterAuthentication.class}, tree="[0]")
    private Output</* @Nullable */ ClusterAuthentication> authentication;

    /**
     * @return RKE k8s cluster authentication configuration (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterAuthentication>> authentication() {
        return Codegen.optional(this.authentication);
    }
    /**
     * RKE k8s cluster authorization mode configuration (list maxitems:1)
     * 
     */
    @Export(name="authorization", refs={ClusterAuthorization.class}, tree="[0]")
    private Output</* @Nullable */ ClusterAuthorization> authorization;

    /**
     * @return RKE k8s cluster authorization mode configuration (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterAuthorization>> authorization() {
        return Codegen.optional(this.authorization);
    }
    /**
     * RKE k8s cluster bastion Host configuration (list maxitems:1)
     * 
     */
    @Export(name="bastionHost", refs={ClusterBastionHost.class}, tree="[0]")
    private Output</* @Nullable */ ClusterBastionHost> bastionHost;

    /**
     * @return RKE k8s cluster bastion Host configuration (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterBastionHost>> bastionHost() {
        return Codegen.optional(this.bastionHost);
    }
    /**
     * (Computed/Sensitive) RKE k8s cluster CA certificate (string)
     * 
     */
    @Export(name="caCrt", refs={String.class}, tree="[0]")
    private Output<String> caCrt;

    /**
     * @return (Computed/Sensitive) RKE k8s cluster CA certificate (string)
     * 
     */
    public Output<String> caCrt() {
        return this.caCrt;
    }
    /**
     * Specify a certificate dir path (string)
     * 
     */
    @Export(name="certDir", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certDir;

    /**
     * @return Specify a certificate dir path (string)
     * 
     */
    public Output<Optional<String>> certDir() {
        return Codegen.optional(this.certDir);
    }
    /**
     * (Computed/Sensitive) RKE k8s cluster certificates (string)
     * 
     */
    @Export(name="certificates", refs={List.class,ClusterCertificate.class}, tree="[0,1]")
    private Output<List<ClusterCertificate>> certificates;

    /**
     * @return (Computed/Sensitive) RKE k8s cluster certificates (string)
     * 
     */
    public Output<List<ClusterCertificate>> certificates() {
        return this.certificates;
    }
    /**
     * (Computed/Sensitive) RKE k8s cluster client certificate (string)
     * 
     */
    @Export(name="clientCert", refs={String.class}, tree="[0]")
    private Output<String> clientCert;

    /**
     * @return (Computed/Sensitive) RKE k8s cluster client certificate (string)
     * 
     */
    public Output<String> clientCert() {
        return this.clientCert;
    }
    /**
     * (Computed/Sensitive) RKE k8s cluster client key (string)
     * 
     */
    @Export(name="clientKey", refs={String.class}, tree="[0]")
    private Output<String> clientKey;

    /**
     * @return (Computed/Sensitive) RKE k8s cluster client key (string)
     * 
     */
    public Output<String> clientKey() {
        return this.clientKey;
    }
    /**
     * RKE k8s cluster cloud provider configuration [rke-cloud-providers](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/) (list maxitems:1)
     * 
     */
    @Export(name="cloudProvider", refs={ClusterCloudProvider.class}, tree="[0]")
    private Output</* @Nullable */ ClusterCloudProvider> cloudProvider;

    /**
     * @return RKE k8s cluster cloud provider configuration [rke-cloud-providers](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/) (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterCloudProvider>> cloudProvider() {
        return Codegen.optional(this.cloudProvider);
    }
    /**
     * (Computed) RKE k8s cluster cidr (string)
     * 
     */
    @Export(name="clusterCidr", refs={String.class}, tree="[0]")
    private Output<String> clusterCidr;

    /**
     * @return (Computed) RKE k8s cluster cidr (string)
     * 
     */
    public Output<String> clusterCidr() {
        return this.clusterCidr;
    }
    /**
     * (Computed) RKE k8s cluster dns server (string)
     * 
     */
    @Export(name="clusterDnsServer", refs={String.class}, tree="[0]")
    private Output<String> clusterDnsServer;

    /**
     * @return (Computed) RKE k8s cluster dns server (string)
     * 
     */
    public Output<String> clusterDnsServer() {
        return this.clusterDnsServer;
    }
    /**
     * (Computed) RKE k8s cluster domain (string)
     * 
     */
    @Export(name="clusterDomain", refs={String.class}, tree="[0]")
    private Output<String> clusterDomain;

    /**
     * @return (Computed) RKE k8s cluster domain (string)
     * 
     */
    public Output<String> clusterDomain() {
        return this.clusterDomain;
    }
    /**
     * RKE k8s cluster name used in the kube config (string)
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clusterName;

    /**
     * @return RKE k8s cluster name used in the kube config (string)
     * 
     */
    public Output<Optional<String>> clusterName() {
        return Codegen.optional(this.clusterName);
    }
    /**
     * RKE k8s cluster config yaml encoded. Provider arguments take precedence over this one (string)
     * 
     */
    @Export(name="clusterYaml", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clusterYaml;

    /**
     * @return RKE k8s cluster config yaml encoded. Provider arguments take precedence over this one (string)
     * 
     */
    public Output<Optional<String>> clusterYaml() {
        return Codegen.optional(this.clusterYaml);
    }
    /**
     * (Computed) RKE k8s cluster control plane nodes (list)
     * 
     */
    @Export(name="controlPlaneHosts", refs={List.class,ClusterControlPlaneHost.class}, tree="[0,1]")
    private Output<List<ClusterControlPlaneHost>> controlPlaneHosts;

    /**
     * @return (Computed) RKE k8s cluster control plane nodes (list)
     * 
     */
    public Output<List<ClusterControlPlaneHost>> controlPlaneHosts() {
        return this.controlPlaneHosts;
    }
    /**
     * Use custom certificates from a cert dir (string)
     * 
     */
    @Export(name="customCerts", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> customCerts;

    /**
     * @return Use custom certificates from a cert dir (string)
     * 
     */
    public Output<Optional<Boolean>> customCerts() {
        return Codegen.optional(this.customCerts);
    }
    /**
     * RKE k8s cluster delay on creation (int)
     * 
     */
    @Export(name="delayOnCreation", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> delayOnCreation;

    /**
     * @return RKE k8s cluster delay on creation (int)
     * 
     */
    public Output<Optional<Integer>> delayOnCreation() {
        return Codegen.optional(this.delayOnCreation);
    }
    /**
     * Deploy RKE cluster on a dind environment. Default: `false` (bool)
     * 
     */
    @Export(name="dind", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dind;

    /**
     * @return Deploy RKE cluster on a dind environment. Default: `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> dind() {
        return Codegen.optional(this.dind);
    }
    /**
     * DinD RKE cluster dns (string)
     * 
     */
    @Export(name="dindDnsServer", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dindDnsServer;

    /**
     * @return DinD RKE cluster dns (string)
     * 
     */
    public Output<Optional<String>> dindDnsServer() {
        return Codegen.optional(this.dindDnsServer);
    }
    /**
     * DinD RKE cluster storage driver (string)
     * 
     */
    @Export(name="dindStorageDriver", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dindStorageDriver;

    /**
     * @return DinD RKE cluster storage driver (string)
     * 
     */
    public Output<Optional<String>> dindStorageDriver() {
        return Codegen.optional(this.dindStorageDriver);
    }
    /**
     * Enable/Disable RKE k8s cluster port checking. Default `false` (bool)
     * 
     */
    @Export(name="disablePortCheck", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disablePortCheck;

    /**
     * @return Enable/Disable RKE k8s cluster port checking. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> disablePortCheck() {
        return Codegen.optional(this.disablePortCheck);
    }
    /**
     * RKE k8s cluster DNS Config (list maxitems:1)
     * 
     */
    @Export(name="dns", refs={ClusterDns.class}, tree="[0]")
    private Output</* @Nullable */ ClusterDns> dns;

    /**
     * @return RKE k8s cluster DNS Config (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterDns>> dns() {
        return Codegen.optional(this.dns);
    }
    /**
     * Enable/Disable CRI dockerd for kubelet; set it to true starting from Kubernetes version 1.24 or later. Default `false` (bool)
     * 
     */
    @Export(name="enableCriDockerd", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableCriDockerd;

    /**
     * @return Enable/Disable CRI dockerd for kubelet; set it to true starting from Kubernetes version 1.24 or later. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> enableCriDockerd() {
        return Codegen.optional(this.enableCriDockerd);
    }
    /**
     * (Computed) RKE k8s cluster etcd nodes (list)
     * 
     */
    @Export(name="etcdHosts", refs={List.class,ClusterEtcdHost.class}, tree="[0,1]")
    private Output<List<ClusterEtcdHost>> etcdHosts;

    /**
     * @return (Computed) RKE k8s cluster etcd nodes (list)
     * 
     */
    public Output<List<ClusterEtcdHost>> etcdHosts() {
        return this.etcdHosts;
    }
    /**
     * Enable/Disable RKE k8s cluster strict docker version checking. Default `false` (bool)
     * 
     */
    @Export(name="ignoreDockerVersion", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ignoreDockerVersion;

    /**
     * @return Enable/Disable RKE k8s cluster strict docker version checking. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> ignoreDockerVersion() {
        return Codegen.optional(this.ignoreDockerVersion);
    }
    /**
     * (Computed) RKE k8s cluster inactive nodes (list)
     * 
     */
    @Export(name="inactiveHosts", refs={List.class,ClusterInactiveHost.class}, tree="[0,1]")
    private Output<List<ClusterInactiveHost>> inactiveHosts;

    /**
     * @return (Computed) RKE k8s cluster inactive nodes (list)
     * 
     */
    public Output<List<ClusterInactiveHost>> inactiveHosts() {
        return this.inactiveHosts;
    }
    /**
     * RKE k8s cluster ingress controller configuration (list maxitems:1)
     * 
     */
    @Export(name="ingress", refs={ClusterIngress.class}, tree="[0]")
    private Output</* @Nullable */ ClusterIngress> ingress;

    /**
     * @return RKE k8s cluster ingress controller configuration (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterIngress>> ingress() {
        return Codegen.optional(this.ingress);
    }
    /**
     * (Computed/Sensitive) RKE k8s cluster internal kube config yaml (string)
     * 
     * @deprecated
     * Use kube_config_yaml instead
     * 
     */
    @Deprecated /* Use kube_config_yaml instead */
    @Export(name="internalKubeConfigYaml", refs={String.class}, tree="[0]")
    private Output<String> internalKubeConfigYaml;

    /**
     * @return (Computed/Sensitive) RKE k8s cluster internal kube config yaml (string)
     * 
     */
    public Output<String> internalKubeConfigYaml() {
        return this.internalKubeConfigYaml;
    }
    /**
     * (Computed) RKE k8s cluster admin user (string)
     * 
     */
    @Export(name="kubeAdminUser", refs={String.class}, tree="[0]")
    private Output<String> kubeAdminUser;

    /**
     * @return (Computed) RKE k8s cluster admin user (string)
     * 
     */
    public Output<String> kubeAdminUser() {
        return this.kubeAdminUser;
    }
    /**
     * (Computed/Sensitive) RKE k8s cluster kube config yaml (string)
     * 
     */
    @Export(name="kubeConfigYaml", refs={String.class}, tree="[0]")
    private Output<String> kubeConfigYaml;

    /**
     * @return (Computed/Sensitive) RKE k8s cluster kube config yaml (string)
     * 
     */
    public Output<String> kubeConfigYaml() {
        return this.kubeConfigYaml;
    }
    /**
     * K8s version to deploy. If kubernetes image is specified, image version takes precedence. Default: `rke default` (string)
     * 
     */
    @Export(name="kubernetesVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kubernetesVersion;

    /**
     * @return K8s version to deploy. If kubernetes image is specified, image version takes precedence. Default: `rke default` (string)
     * 
     */
    public Output<Optional<String>> kubernetesVersion() {
        return Codegen.optional(this.kubernetesVersion);
    }
    /**
     * RKE k8s cluster monitoring Config (list maxitems:1)
     * 
     */
    @Export(name="monitoring", refs={ClusterMonitoring.class}, tree="[0]")
    private Output</* @Nullable */ ClusterMonitoring> monitoring;

    /**
     * @return RKE k8s cluster monitoring Config (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterMonitoring>> monitoring() {
        return Codegen.optional(this.monitoring);
    }
    /**
     * RKE k8s cluster network configuration (list maxitems:1)
     * 
     */
    @Export(name="network", refs={ClusterNetwork.class}, tree="[0]")
    private Output</* @Nullable */ ClusterNetwork> network;

    /**
     * @return RKE k8s cluster network configuration (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterNetwork>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * RKE k8s cluster nodes (list)
     * 
     */
    @Export(name="nodes", refs={List.class,ClusterNode.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ClusterNode>> nodes;

    /**
     * @return RKE k8s cluster nodes (list)
     * 
     */
    public Output<Optional<List<ClusterNode>>> nodes() {
        return Codegen.optional(this.nodes);
    }
    /**
     * @deprecated
     * Use cluster_yaml instead
     * 
     */
    @Deprecated /* Use cluster_yaml instead */
    @Export(name="nodesConfs", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> nodesConfs;

    public Output<Optional<List<String>>> nodesConfs() {
        return Codegen.optional(this.nodesConfs);
    }
    /**
     * RKE k8s directory path (string)
     * 
     */
    @Export(name="prefixPath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> prefixPath;

    /**
     * @return RKE k8s directory path (string)
     * 
     */
    public Output<Optional<String>> prefixPath() {
        return Codegen.optional(this.prefixPath);
    }
    /**
     * RKE k8s cluster private docker registries (list)
     * 
     */
    @Export(name="privateRegistries", refs={List.class,ClusterPrivateRegistry.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ClusterPrivateRegistry>> privateRegistries;

    /**
     * @return RKE k8s cluster private docker registries (list)
     * 
     */
    public Output<Optional<List<ClusterPrivateRegistry>>> privateRegistries() {
        return Codegen.optional(this.privateRegistries);
    }
    /**
     * RKE k8s cluster restore configuration (list maxitems:1)
     * 
     */
    @Export(name="restore", refs={ClusterRestore.class}, tree="[0]")
    private Output</* @Nullable */ ClusterRestore> restore;

    /**
     * @return RKE k8s cluster restore configuration (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterRestore>> restore() {
        return Codegen.optional(this.restore);
    }
    /**
     * (Computed/Sensitive) RKE k8s cluster config yaml (string)
     * 
     */
    @Export(name="rkeClusterYaml", refs={String.class}, tree="[0]")
    private Output<String> rkeClusterYaml;

    /**
     * @return (Computed/Sensitive) RKE k8s cluster config yaml (string)
     * 
     */
    public Output<String> rkeClusterYaml() {
        return this.rkeClusterYaml;
    }
    /**
     * (Computed/Sensitive) RKE k8s cluster state (string)
     * 
     */
    @Export(name="rkeState", refs={String.class}, tree="[0]")
    private Output<String> rkeState;

    /**
     * @return (Computed/Sensitive) RKE k8s cluster state (string)
     * 
     */
    public Output<String> rkeState() {
        return this.rkeState;
    }
    /**
     * RKE k8s cluster rotate certificates configuration (list maxitems:1)
     * 
     */
    @Export(name="rotateCertificates", refs={ClusterRotateCertificates.class}, tree="[0]")
    private Output</* @Nullable */ ClusterRotateCertificates> rotateCertificates;

    /**
     * @return RKE k8s cluster rotate certificates configuration (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterRotateCertificates>> rotateCertificates() {
        return Codegen.optional(this.rotateCertificates);
    }
    /**
     * (Computed) RKE k8s cluster running system images list (list)
     * 
     */
    @Export(name="runningSystemImages", refs={List.class,ClusterRunningSystemImage.class}, tree="[0,1]")
    private Output<List<ClusterRunningSystemImage>> runningSystemImages;

    /**
     * @return (Computed) RKE k8s cluster running system images list (list)
     * 
     */
    public Output<List<ClusterRunningSystemImage>> runningSystemImages() {
        return this.runningSystemImages;
    }
    /**
     * RKE k8s cluster services (list maxitems:1)
     * 
     */
    @Export(name="services", refs={ClusterServices.class}, tree="[0]")
    private Output</* @Nullable */ ClusterServices> services;

    /**
     * @return RKE k8s cluster services (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterServices>> services() {
        return Codegen.optional(this.services);
    }
    /**
     * Use services.etcd instead (list maxitems:1)
     * 
     * @deprecated
     * Use services.etcd instead
     * 
     */
    @Deprecated /* Use services.etcd instead */
    @Export(name="servicesEtcdDeprecated", refs={ClusterServicesEtcdDeprecated.class}, tree="[0]")
    private Output</* @Nullable */ ClusterServicesEtcdDeprecated> servicesEtcdDeprecated;

    /**
     * @return Use services.etcd instead (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterServicesEtcdDeprecated>> servicesEtcdDeprecated() {
        return Codegen.optional(this.servicesEtcdDeprecated);
    }
    /**
     * Use services.kube_api instead (list maxitems:1)
     * 
     * @deprecated
     * Use services.kube_api instead
     * 
     */
    @Deprecated /* Use services.kube_api instead */
    @Export(name="servicesKubeApiDeprecated", refs={ClusterServicesKubeApiDeprecated.class}, tree="[0]")
    private Output</* @Nullable */ ClusterServicesKubeApiDeprecated> servicesKubeApiDeprecated;

    /**
     * @return Use services.kube_api instead (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterServicesKubeApiDeprecated>> servicesKubeApiDeprecated() {
        return Codegen.optional(this.servicesKubeApiDeprecated);
    }
    /**
     * Use services.kube_controller instead (list maxitems:1)
     * 
     * @deprecated
     * Use services.kube_controller instead
     * 
     */
    @Deprecated /* Use services.kube_controller instead */
    @Export(name="servicesKubeControllerDeprecated", refs={ClusterServicesKubeControllerDeprecated.class}, tree="[0]")
    private Output</* @Nullable */ ClusterServicesKubeControllerDeprecated> servicesKubeControllerDeprecated;

    /**
     * @return Use services.kube_controller instead (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterServicesKubeControllerDeprecated>> servicesKubeControllerDeprecated() {
        return Codegen.optional(this.servicesKubeControllerDeprecated);
    }
    /**
     * Use services.kubeproxy instead (list maxitems:1)
     * 
     * @deprecated
     * Use services.kubeproxy instead
     * 
     */
    @Deprecated /* Use services.kubeproxy instead */
    @Export(name="servicesKubeProxyDeprecated", refs={ClusterServicesKubeProxyDeprecated.class}, tree="[0]")
    private Output</* @Nullable */ ClusterServicesKubeProxyDeprecated> servicesKubeProxyDeprecated;

    /**
     * @return Use services.kubeproxy instead (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterServicesKubeProxyDeprecated>> servicesKubeProxyDeprecated() {
        return Codegen.optional(this.servicesKubeProxyDeprecated);
    }
    /**
     * Use services.scheduler instead (list maxitems:1)
     * 
     * @deprecated
     * Use services.scheduler instead
     * 
     */
    @Deprecated /* Use services.scheduler instead */
    @Export(name="servicesKubeSchedulerDeprecated", refs={ClusterServicesKubeSchedulerDeprecated.class}, tree="[0]")
    private Output</* @Nullable */ ClusterServicesKubeSchedulerDeprecated> servicesKubeSchedulerDeprecated;

    /**
     * @return Use services.scheduler instead (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterServicesKubeSchedulerDeprecated>> servicesKubeSchedulerDeprecated() {
        return Codegen.optional(this.servicesKubeSchedulerDeprecated);
    }
    /**
     * Use services.kubelet instead (list maxitems:1)
     * 
     * @deprecated
     * Use services.kubelet instead
     * 
     */
    @Deprecated /* Use services.kubelet instead */
    @Export(name="servicesKubeletDeprecated", refs={ClusterServicesKubeletDeprecated.class}, tree="[0]")
    private Output</* @Nullable */ ClusterServicesKubeletDeprecated> servicesKubeletDeprecated;

    /**
     * @return Use services.kubelet instead (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterServicesKubeletDeprecated>> servicesKubeletDeprecated() {
        return Codegen.optional(this.servicesKubeletDeprecated);
    }
    /**
     * SSH Agent Auth enable (bool)
     * 
     */
    @Export(name="sshAgentAuth", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> sshAgentAuth;

    /**
     * @return SSH Agent Auth enable (bool)
     * 
     */
    public Output<Boolean> sshAgentAuth() {
        return this.sshAgentAuth;
    }
    /**
     * SSH Certificate Path (string)
     * 
     */
    @Export(name="sshCertPath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sshCertPath;

    /**
     * @return SSH Certificate Path (string)
     * 
     */
    public Output<Optional<String>> sshCertPath() {
        return Codegen.optional(this.sshCertPath);
    }
    /**
     * SSH Private Key Path (string)
     * 
     */
    @Export(name="sshKeyPath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sshKeyPath;

    /**
     * @return SSH Private Key Path (string)
     * 
     */
    public Output<Optional<String>> sshKeyPath() {
        return Codegen.optional(this.sshKeyPath);
    }
    /**
     * RKE k8s cluster system images list (list maxitems:1)
     * 
     */
    @Export(name="systemImages", refs={ClusterSystemImages.class}, tree="[0]")
    private Output</* @Nullable */ ClusterSystemImages> systemImages;

    /**
     * @return RKE k8s cluster system images list (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterSystemImages>> systemImages() {
        return Codegen.optional(this.systemImages);
    }
    /**
     * Skip idempotent deployment of control and etcd plane. Default `false` (bool)
     * 
     */
    @Export(name="updateOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> updateOnly;

    /**
     * @return Skip idempotent deployment of control and etcd plane. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> updateOnly() {
        return Codegen.optional(this.updateOnly);
    }
    /**
     * RKE k8s cluster upgrade strategy (list maxitems:1)
     * 
     */
    @Export(name="upgradeStrategy", refs={ClusterUpgradeStrategy.class}, tree="[0]")
    private Output</* @Nullable */ ClusterUpgradeStrategy> upgradeStrategy;

    /**
     * @return RKE k8s cluster upgrade strategy (list maxitems:1)
     * 
     */
    public Output<Optional<ClusterUpgradeStrategy>> upgradeStrategy() {
        return Codegen.optional(this.upgradeStrategy);
    }
    /**
     * (Computed) RKE k8s cluster worker nodes (list)
     * 
     */
    @Export(name="workerHosts", refs={List.class,ClusterWorkerHost.class}, tree="[0,1]")
    private Output<List<ClusterWorkerHost>> workerHosts;

    /**
     * @return (Computed) RKE k8s cluster worker nodes (list)
     * 
     */
    public Output<List<ClusterWorkerHost>> workerHosts() {
        return this.workerHosts;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, @Nullable ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rke:index/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rke:index/cluster:Cluster", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "caCrt",
                "certificates",
                "clientCert",
                "clientKey",
                "clusterYaml",
                "internalKubeConfigYaml",
                "kubeConfigYaml",
                "rkeClusterYaml",
                "rkeState"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
