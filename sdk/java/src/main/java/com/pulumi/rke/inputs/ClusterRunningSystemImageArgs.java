// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRunningSystemImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRunningSystemImageArgs Empty = new ClusterRunningSystemImageArgs();

    /**
     * Docker image for aci_cni_deploy_container (string)
     * 
     */
    @Import(name="aciCniDeployContainer")
    private @Nullable Output<String> aciCniDeployContainer;

    /**
     * @return Docker image for aci_cni_deploy_container (string)
     * 
     */
    public Optional<Output<String>> aciCniDeployContainer() {
        return Optional.ofNullable(this.aciCniDeployContainer);
    }

    /**
     * Docker image for aci_controller_container (string)
     * 
     */
    @Import(name="aciControllerContainer")
    private @Nullable Output<String> aciControllerContainer;

    /**
     * @return Docker image for aci_controller_container (string)
     * 
     */
    public Optional<Output<String>> aciControllerContainer() {
        return Optional.ofNullable(this.aciControllerContainer);
    }

    /**
     * Docker image for aci_host_container (string)
     * 
     */
    @Import(name="aciHostContainer")
    private @Nullable Output<String> aciHostContainer;

    /**
     * @return Docker image for aci_host_container (string)
     * 
     */
    public Optional<Output<String>> aciHostContainer() {
        return Optional.ofNullable(this.aciHostContainer);
    }

    /**
     * Docker image for aci_mcast_container (string)
     * 
     */
    @Import(name="aciMcastContainer")
    private @Nullable Output<String> aciMcastContainer;

    /**
     * @return Docker image for aci_mcast_container (string)
     * 
     */
    public Optional<Output<String>> aciMcastContainer() {
        return Optional.ofNullable(this.aciMcastContainer);
    }

    /**
     * Docker image for aci_opflex_container (string)
     * 
     */
    @Import(name="aciOpflexContainer")
    private @Nullable Output<String> aciOpflexContainer;

    /**
     * @return Docker image for aci_opflex_container (string)
     * 
     */
    public Optional<Output<String>> aciOpflexContainer() {
        return Optional.ofNullable(this.aciOpflexContainer);
    }

    /**
     * Docker image for aci_ovs_container (string)
     * 
     */
    @Import(name="aciOvsContainer")
    private @Nullable Output<String> aciOvsContainer;

    /**
     * @return Docker image for aci_ovs_container (string)
     * 
     */
    public Optional<Output<String>> aciOvsContainer() {
        return Optional.ofNullable(this.aciOvsContainer);
    }

    /**
     * Docker image for alpine (string)
     * 
     */
    @Import(name="alpine")
    private @Nullable Output<String> alpine;

    /**
     * @return Docker image for alpine (string)
     * 
     */
    public Optional<Output<String>> alpine() {
        return Optional.ofNullable(this.alpine);
    }

    /**
     * Docker image for calico_cni (string)
     * 
     */
    @Import(name="calicoCni")
    private @Nullable Output<String> calicoCni;

    /**
     * @return Docker image for calico_cni (string)
     * 
     */
    public Optional<Output<String>> calicoCni() {
        return Optional.ofNullable(this.calicoCni);
    }

    /**
     * Docker image for calico_controllers (string)
     * 
     */
    @Import(name="calicoControllers")
    private @Nullable Output<String> calicoControllers;

    /**
     * @return Docker image for calico_controllers (string)
     * 
     */
    public Optional<Output<String>> calicoControllers() {
        return Optional.ofNullable(this.calicoControllers);
    }

    /**
     * Docker image for calico_ctl (string)
     * 
     */
    @Import(name="calicoCtl")
    private @Nullable Output<String> calicoCtl;

    /**
     * @return Docker image for calico_ctl (string)
     * 
     */
    public Optional<Output<String>> calicoCtl() {
        return Optional.ofNullable(this.calicoCtl);
    }

    /**
     * Docker image for calico_flex_vol (string)
     * 
     */
    @Import(name="calicoFlexVol")
    private @Nullable Output<String> calicoFlexVol;

    /**
     * @return Docker image for calico_flex_vol (string)
     * 
     */
    public Optional<Output<String>> calicoFlexVol() {
        return Optional.ofNullable(this.calicoFlexVol);
    }

    /**
     * Docker image for calico_node (string)
     * 
     */
    @Import(name="calicoNode")
    private @Nullable Output<String> calicoNode;

    /**
     * @return Docker image for calico_node (string)
     * 
     */
    public Optional<Output<String>> calicoNode() {
        return Optional.ofNullable(this.calicoNode);
    }

    /**
     * Docker image for canal_cni (string)
     * 
     */
    @Import(name="canalCni")
    private @Nullable Output<String> canalCni;

    /**
     * @return Docker image for canal_cni (string)
     * 
     */
    public Optional<Output<String>> canalCni() {
        return Optional.ofNullable(this.canalCni);
    }

    /**
     * Docker image for canal_flannel (string)
     * 
     */
    @Import(name="canalFlannel")
    private @Nullable Output<String> canalFlannel;

    /**
     * @return Docker image for canal_flannel (string)
     * 
     */
    public Optional<Output<String>> canalFlannel() {
        return Optional.ofNullable(this.canalFlannel);
    }

    /**
     * Docker image for canal_flex_vol (string)
     * 
     */
    @Import(name="canalFlexVol")
    private @Nullable Output<String> canalFlexVol;

    /**
     * @return Docker image for canal_flex_vol (string)
     * 
     */
    public Optional<Output<String>> canalFlexVol() {
        return Optional.ofNullable(this.canalFlexVol);
    }

    /**
     * Docker image for canal_node (string)
     * 
     */
    @Import(name="canalNode")
    private @Nullable Output<String> canalNode;

    /**
     * @return Docker image for canal_node (string)
     * 
     */
    public Optional<Output<String>> canalNode() {
        return Optional.ofNullable(this.canalNode);
    }

    /**
     * Docker image for cert_downloader (string)
     * 
     */
    @Import(name="certDownloader")
    private @Nullable Output<String> certDownloader;

    /**
     * @return Docker image for cert_downloader (string)
     * 
     */
    public Optional<Output<String>> certDownloader() {
        return Optional.ofNullable(this.certDownloader);
    }

    /**
     * Docker image for coredns (string)
     * 
     */
    @Import(name="coredns")
    private @Nullable Output<String> coredns;

    /**
     * @return Docker image for coredns (string)
     * 
     */
    public Optional<Output<String>> coredns() {
        return Optional.ofNullable(this.coredns);
    }

    /**
     * Docker image for coredns_autoscaler (string)
     * 
     */
    @Import(name="corednsAutoscaler")
    private @Nullable Output<String> corednsAutoscaler;

    /**
     * @return Docker image for coredns_autoscaler (string)
     * 
     */
    public Optional<Output<String>> corednsAutoscaler() {
        return Optional.ofNullable(this.corednsAutoscaler);
    }

    /**
     * Docker image for dnsmasq (string)
     * 
     */
    @Import(name="dnsmasq")
    private @Nullable Output<String> dnsmasq;

    /**
     * @return Docker image for dnsmasq (string)
     * 
     */
    public Optional<Output<String>> dnsmasq() {
        return Optional.ofNullable(this.dnsmasq);
    }

    /**
     * Docker image for etcd (string)
     * 
     */
    @Import(name="etcd")
    private @Nullable Output<String> etcd;

    /**
     * @return Docker image for etcd (string)
     * 
     */
    public Optional<Output<String>> etcd() {
        return Optional.ofNullable(this.etcd);
    }

    /**
     * Docker image for flannel (string)
     * 
     */
    @Import(name="flannel")
    private @Nullable Output<String> flannel;

    /**
     * @return Docker image for flannel (string)
     * 
     */
    public Optional<Output<String>> flannel() {
        return Optional.ofNullable(this.flannel);
    }

    /**
     * Docker image for flannel_cni (string)
     * 
     */
    @Import(name="flannelCni")
    private @Nullable Output<String> flannelCni;

    /**
     * @return Docker image for flannel_cni (string)
     * 
     */
    public Optional<Output<String>> flannelCni() {
        return Optional.ofNullable(this.flannelCni);
    }

    /**
     * RKE k8s cluster ingress controller configuration (list maxitems:1)
     * 
     */
    @Import(name="ingress")
    private @Nullable Output<String> ingress;

    /**
     * @return RKE k8s cluster ingress controller configuration (list maxitems:1)
     * 
     */
    public Optional<Output<String>> ingress() {
        return Optional.ofNullable(this.ingress);
    }

    /**
     * Docker image for ingress_backend (string)
     * 
     */
    @Import(name="ingressBackend")
    private @Nullable Output<String> ingressBackend;

    /**
     * @return Docker image for ingress_backend (string)
     * 
     */
    public Optional<Output<String>> ingressBackend() {
        return Optional.ofNullable(this.ingressBackend);
    }

    /**
     * Docker image for kube_dns (string)
     * 
     */
    @Import(name="kubeDns")
    private @Nullable Output<String> kubeDns;

    /**
     * @return Docker image for kube_dns (string)
     * 
     */
    public Optional<Output<String>> kubeDns() {
        return Optional.ofNullable(this.kubeDns);
    }

    /**
     * Docker image for kube_dns_autoscaler (string)
     * 
     */
    @Import(name="kubeDnsAutoscaler")
    private @Nullable Output<String> kubeDnsAutoscaler;

    /**
     * @return Docker image for kube_dns_autoscaler (string)
     * 
     */
    public Optional<Output<String>> kubeDnsAutoscaler() {
        return Optional.ofNullable(this.kubeDnsAutoscaler);
    }

    /**
     * Docker image for kube_dns_sidecar (string)
     * 
     */
    @Import(name="kubeDnsSidecar")
    private @Nullable Output<String> kubeDnsSidecar;

    /**
     * @return Docker image for kube_dns_sidecar (string)
     * 
     */
    public Optional<Output<String>> kubeDnsSidecar() {
        return Optional.ofNullable(this.kubeDnsSidecar);
    }

    /**
     * Docker image for kubernetes (string)
     * 
     */
    @Import(name="kubernetes")
    private @Nullable Output<String> kubernetes;

    /**
     * @return Docker image for kubernetes (string)
     * 
     */
    public Optional<Output<String>> kubernetes() {
        return Optional.ofNullable(this.kubernetes);
    }

    /**
     * Docker image for kubernetes_services_sidecar (string)
     * 
     */
    @Import(name="kubernetesServicesSidecar")
    private @Nullable Output<String> kubernetesServicesSidecar;

    /**
     * @return Docker image for kubernetes_services_sidecar (string)
     * 
     */
    public Optional<Output<String>> kubernetesServicesSidecar() {
        return Optional.ofNullable(this.kubernetesServicesSidecar);
    }

    /**
     * Docker image for metrics_server (string)
     * 
     */
    @Import(name="metricsServer")
    private @Nullable Output<String> metricsServer;

    /**
     * @return Docker image for metrics_server (string)
     * 
     */
    public Optional<Output<String>> metricsServer() {
        return Optional.ofNullable(this.metricsServer);
    }

    /**
     * Docker image for nginx_proxy (string)
     * 
     */
    @Import(name="nginxProxy")
    private @Nullable Output<String> nginxProxy;

    /**
     * @return Docker image for nginx_proxy (string)
     * 
     */
    public Optional<Output<String>> nginxProxy() {
        return Optional.ofNullable(this.nginxProxy);
    }

    /**
     * Docker image for nodelocal (string)
     * 
     */
    @Import(name="nodelocal")
    private @Nullable Output<String> nodelocal;

    /**
     * @return Docker image for nodelocal (string)
     * 
     */
    public Optional<Output<String>> nodelocal() {
        return Optional.ofNullable(this.nodelocal);
    }

    /**
     * Docker image for pod_infra_container (string)
     * 
     */
    @Import(name="podInfraContainer")
    private @Nullable Output<String> podInfraContainer;

    /**
     * @return Docker image for pod_infra_container (string)
     * 
     */
    public Optional<Output<String>> podInfraContainer() {
        return Optional.ofNullable(this.podInfraContainer);
    }

    /**
     * Docker image for weave_cni (string)
     * 
     */
    @Import(name="weaveCni")
    private @Nullable Output<String> weaveCni;

    /**
     * @return Docker image for weave_cni (string)
     * 
     */
    public Optional<Output<String>> weaveCni() {
        return Optional.ofNullable(this.weaveCni);
    }

    /**
     * Docker image for weave_node (string)
     * 
     */
    @Import(name="weaveNode")
    private @Nullable Output<String> weaveNode;

    /**
     * @return Docker image for weave_node (string)
     * 
     */
    public Optional<Output<String>> weaveNode() {
        return Optional.ofNullable(this.weaveNode);
    }

    /**
     * Docker image for windows_pod_infra_container (string)
     * 
     */
    @Import(name="windowsPodInfraContainer")
    private @Nullable Output<String> windowsPodInfraContainer;

    /**
     * @return Docker image for windows_pod_infra_container (string)
     * 
     */
    public Optional<Output<String>> windowsPodInfraContainer() {
        return Optional.ofNullable(this.windowsPodInfraContainer);
    }

    private ClusterRunningSystemImageArgs() {}

    private ClusterRunningSystemImageArgs(ClusterRunningSystemImageArgs $) {
        this.aciCniDeployContainer = $.aciCniDeployContainer;
        this.aciControllerContainer = $.aciControllerContainer;
        this.aciHostContainer = $.aciHostContainer;
        this.aciMcastContainer = $.aciMcastContainer;
        this.aciOpflexContainer = $.aciOpflexContainer;
        this.aciOvsContainer = $.aciOvsContainer;
        this.alpine = $.alpine;
        this.calicoCni = $.calicoCni;
        this.calicoControllers = $.calicoControllers;
        this.calicoCtl = $.calicoCtl;
        this.calicoFlexVol = $.calicoFlexVol;
        this.calicoNode = $.calicoNode;
        this.canalCni = $.canalCni;
        this.canalFlannel = $.canalFlannel;
        this.canalFlexVol = $.canalFlexVol;
        this.canalNode = $.canalNode;
        this.certDownloader = $.certDownloader;
        this.coredns = $.coredns;
        this.corednsAutoscaler = $.corednsAutoscaler;
        this.dnsmasq = $.dnsmasq;
        this.etcd = $.etcd;
        this.flannel = $.flannel;
        this.flannelCni = $.flannelCni;
        this.ingress = $.ingress;
        this.ingressBackend = $.ingressBackend;
        this.kubeDns = $.kubeDns;
        this.kubeDnsAutoscaler = $.kubeDnsAutoscaler;
        this.kubeDnsSidecar = $.kubeDnsSidecar;
        this.kubernetes = $.kubernetes;
        this.kubernetesServicesSidecar = $.kubernetesServicesSidecar;
        this.metricsServer = $.metricsServer;
        this.nginxProxy = $.nginxProxy;
        this.nodelocal = $.nodelocal;
        this.podInfraContainer = $.podInfraContainer;
        this.weaveCni = $.weaveCni;
        this.weaveNode = $.weaveNode;
        this.windowsPodInfraContainer = $.windowsPodInfraContainer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRunningSystemImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRunningSystemImageArgs $;

        public Builder() {
            $ = new ClusterRunningSystemImageArgs();
        }

        public Builder(ClusterRunningSystemImageArgs defaults) {
            $ = new ClusterRunningSystemImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aciCniDeployContainer Docker image for aci_cni_deploy_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciCniDeployContainer(@Nullable Output<String> aciCniDeployContainer) {
            $.aciCniDeployContainer = aciCniDeployContainer;
            return this;
        }

        /**
         * @param aciCniDeployContainer Docker image for aci_cni_deploy_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciCniDeployContainer(String aciCniDeployContainer) {
            return aciCniDeployContainer(Output.of(aciCniDeployContainer));
        }

        /**
         * @param aciControllerContainer Docker image for aci_controller_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciControllerContainer(@Nullable Output<String> aciControllerContainer) {
            $.aciControllerContainer = aciControllerContainer;
            return this;
        }

        /**
         * @param aciControllerContainer Docker image for aci_controller_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciControllerContainer(String aciControllerContainer) {
            return aciControllerContainer(Output.of(aciControllerContainer));
        }

        /**
         * @param aciHostContainer Docker image for aci_host_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciHostContainer(@Nullable Output<String> aciHostContainer) {
            $.aciHostContainer = aciHostContainer;
            return this;
        }

        /**
         * @param aciHostContainer Docker image for aci_host_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciHostContainer(String aciHostContainer) {
            return aciHostContainer(Output.of(aciHostContainer));
        }

        /**
         * @param aciMcastContainer Docker image for aci_mcast_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciMcastContainer(@Nullable Output<String> aciMcastContainer) {
            $.aciMcastContainer = aciMcastContainer;
            return this;
        }

        /**
         * @param aciMcastContainer Docker image for aci_mcast_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciMcastContainer(String aciMcastContainer) {
            return aciMcastContainer(Output.of(aciMcastContainer));
        }

        /**
         * @param aciOpflexContainer Docker image for aci_opflex_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciOpflexContainer(@Nullable Output<String> aciOpflexContainer) {
            $.aciOpflexContainer = aciOpflexContainer;
            return this;
        }

        /**
         * @param aciOpflexContainer Docker image for aci_opflex_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciOpflexContainer(String aciOpflexContainer) {
            return aciOpflexContainer(Output.of(aciOpflexContainer));
        }

        /**
         * @param aciOvsContainer Docker image for aci_ovs_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciOvsContainer(@Nullable Output<String> aciOvsContainer) {
            $.aciOvsContainer = aciOvsContainer;
            return this;
        }

        /**
         * @param aciOvsContainer Docker image for aci_ovs_container (string)
         * 
         * @return builder
         * 
         */
        public Builder aciOvsContainer(String aciOvsContainer) {
            return aciOvsContainer(Output.of(aciOvsContainer));
        }

        /**
         * @param alpine Docker image for alpine (string)
         * 
         * @return builder
         * 
         */
        public Builder alpine(@Nullable Output<String> alpine) {
            $.alpine = alpine;
            return this;
        }

        /**
         * @param alpine Docker image for alpine (string)
         * 
         * @return builder
         * 
         */
        public Builder alpine(String alpine) {
            return alpine(Output.of(alpine));
        }

        /**
         * @param calicoCni Docker image for calico_cni (string)
         * 
         * @return builder
         * 
         */
        public Builder calicoCni(@Nullable Output<String> calicoCni) {
            $.calicoCni = calicoCni;
            return this;
        }

        /**
         * @param calicoCni Docker image for calico_cni (string)
         * 
         * @return builder
         * 
         */
        public Builder calicoCni(String calicoCni) {
            return calicoCni(Output.of(calicoCni));
        }

        /**
         * @param calicoControllers Docker image for calico_controllers (string)
         * 
         * @return builder
         * 
         */
        public Builder calicoControllers(@Nullable Output<String> calicoControllers) {
            $.calicoControllers = calicoControllers;
            return this;
        }

        /**
         * @param calicoControllers Docker image for calico_controllers (string)
         * 
         * @return builder
         * 
         */
        public Builder calicoControllers(String calicoControllers) {
            return calicoControllers(Output.of(calicoControllers));
        }

        /**
         * @param calicoCtl Docker image for calico_ctl (string)
         * 
         * @return builder
         * 
         */
        public Builder calicoCtl(@Nullable Output<String> calicoCtl) {
            $.calicoCtl = calicoCtl;
            return this;
        }

        /**
         * @param calicoCtl Docker image for calico_ctl (string)
         * 
         * @return builder
         * 
         */
        public Builder calicoCtl(String calicoCtl) {
            return calicoCtl(Output.of(calicoCtl));
        }

        /**
         * @param calicoFlexVol Docker image for calico_flex_vol (string)
         * 
         * @return builder
         * 
         */
        public Builder calicoFlexVol(@Nullable Output<String> calicoFlexVol) {
            $.calicoFlexVol = calicoFlexVol;
            return this;
        }

        /**
         * @param calicoFlexVol Docker image for calico_flex_vol (string)
         * 
         * @return builder
         * 
         */
        public Builder calicoFlexVol(String calicoFlexVol) {
            return calicoFlexVol(Output.of(calicoFlexVol));
        }

        /**
         * @param calicoNode Docker image for calico_node (string)
         * 
         * @return builder
         * 
         */
        public Builder calicoNode(@Nullable Output<String> calicoNode) {
            $.calicoNode = calicoNode;
            return this;
        }

        /**
         * @param calicoNode Docker image for calico_node (string)
         * 
         * @return builder
         * 
         */
        public Builder calicoNode(String calicoNode) {
            return calicoNode(Output.of(calicoNode));
        }

        /**
         * @param canalCni Docker image for canal_cni (string)
         * 
         * @return builder
         * 
         */
        public Builder canalCni(@Nullable Output<String> canalCni) {
            $.canalCni = canalCni;
            return this;
        }

        /**
         * @param canalCni Docker image for canal_cni (string)
         * 
         * @return builder
         * 
         */
        public Builder canalCni(String canalCni) {
            return canalCni(Output.of(canalCni));
        }

        /**
         * @param canalFlannel Docker image for canal_flannel (string)
         * 
         * @return builder
         * 
         */
        public Builder canalFlannel(@Nullable Output<String> canalFlannel) {
            $.canalFlannel = canalFlannel;
            return this;
        }

        /**
         * @param canalFlannel Docker image for canal_flannel (string)
         * 
         * @return builder
         * 
         */
        public Builder canalFlannel(String canalFlannel) {
            return canalFlannel(Output.of(canalFlannel));
        }

        /**
         * @param canalFlexVol Docker image for canal_flex_vol (string)
         * 
         * @return builder
         * 
         */
        public Builder canalFlexVol(@Nullable Output<String> canalFlexVol) {
            $.canalFlexVol = canalFlexVol;
            return this;
        }

        /**
         * @param canalFlexVol Docker image for canal_flex_vol (string)
         * 
         * @return builder
         * 
         */
        public Builder canalFlexVol(String canalFlexVol) {
            return canalFlexVol(Output.of(canalFlexVol));
        }

        /**
         * @param canalNode Docker image for canal_node (string)
         * 
         * @return builder
         * 
         */
        public Builder canalNode(@Nullable Output<String> canalNode) {
            $.canalNode = canalNode;
            return this;
        }

        /**
         * @param canalNode Docker image for canal_node (string)
         * 
         * @return builder
         * 
         */
        public Builder canalNode(String canalNode) {
            return canalNode(Output.of(canalNode));
        }

        /**
         * @param certDownloader Docker image for cert_downloader (string)
         * 
         * @return builder
         * 
         */
        public Builder certDownloader(@Nullable Output<String> certDownloader) {
            $.certDownloader = certDownloader;
            return this;
        }

        /**
         * @param certDownloader Docker image for cert_downloader (string)
         * 
         * @return builder
         * 
         */
        public Builder certDownloader(String certDownloader) {
            return certDownloader(Output.of(certDownloader));
        }

        /**
         * @param coredns Docker image for coredns (string)
         * 
         * @return builder
         * 
         */
        public Builder coredns(@Nullable Output<String> coredns) {
            $.coredns = coredns;
            return this;
        }

        /**
         * @param coredns Docker image for coredns (string)
         * 
         * @return builder
         * 
         */
        public Builder coredns(String coredns) {
            return coredns(Output.of(coredns));
        }

        /**
         * @param corednsAutoscaler Docker image for coredns_autoscaler (string)
         * 
         * @return builder
         * 
         */
        public Builder corednsAutoscaler(@Nullable Output<String> corednsAutoscaler) {
            $.corednsAutoscaler = corednsAutoscaler;
            return this;
        }

        /**
         * @param corednsAutoscaler Docker image for coredns_autoscaler (string)
         * 
         * @return builder
         * 
         */
        public Builder corednsAutoscaler(String corednsAutoscaler) {
            return corednsAutoscaler(Output.of(corednsAutoscaler));
        }

        /**
         * @param dnsmasq Docker image for dnsmasq (string)
         * 
         * @return builder
         * 
         */
        public Builder dnsmasq(@Nullable Output<String> dnsmasq) {
            $.dnsmasq = dnsmasq;
            return this;
        }

        /**
         * @param dnsmasq Docker image for dnsmasq (string)
         * 
         * @return builder
         * 
         */
        public Builder dnsmasq(String dnsmasq) {
            return dnsmasq(Output.of(dnsmasq));
        }

        /**
         * @param etcd Docker image for etcd (string)
         * 
         * @return builder
         * 
         */
        public Builder etcd(@Nullable Output<String> etcd) {
            $.etcd = etcd;
            return this;
        }

        /**
         * @param etcd Docker image for etcd (string)
         * 
         * @return builder
         * 
         */
        public Builder etcd(String etcd) {
            return etcd(Output.of(etcd));
        }

        /**
         * @param flannel Docker image for flannel (string)
         * 
         * @return builder
         * 
         */
        public Builder flannel(@Nullable Output<String> flannel) {
            $.flannel = flannel;
            return this;
        }

        /**
         * @param flannel Docker image for flannel (string)
         * 
         * @return builder
         * 
         */
        public Builder flannel(String flannel) {
            return flannel(Output.of(flannel));
        }

        /**
         * @param flannelCni Docker image for flannel_cni (string)
         * 
         * @return builder
         * 
         */
        public Builder flannelCni(@Nullable Output<String> flannelCni) {
            $.flannelCni = flannelCni;
            return this;
        }

        /**
         * @param flannelCni Docker image for flannel_cni (string)
         * 
         * @return builder
         * 
         */
        public Builder flannelCni(String flannelCni) {
            return flannelCni(Output.of(flannelCni));
        }

        /**
         * @param ingress RKE k8s cluster ingress controller configuration (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder ingress(@Nullable Output<String> ingress) {
            $.ingress = ingress;
            return this;
        }

        /**
         * @param ingress RKE k8s cluster ingress controller configuration (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder ingress(String ingress) {
            return ingress(Output.of(ingress));
        }

        /**
         * @param ingressBackend Docker image for ingress_backend (string)
         * 
         * @return builder
         * 
         */
        public Builder ingressBackend(@Nullable Output<String> ingressBackend) {
            $.ingressBackend = ingressBackend;
            return this;
        }

        /**
         * @param ingressBackend Docker image for ingress_backend (string)
         * 
         * @return builder
         * 
         */
        public Builder ingressBackend(String ingressBackend) {
            return ingressBackend(Output.of(ingressBackend));
        }

        /**
         * @param kubeDns Docker image for kube_dns (string)
         * 
         * @return builder
         * 
         */
        public Builder kubeDns(@Nullable Output<String> kubeDns) {
            $.kubeDns = kubeDns;
            return this;
        }

        /**
         * @param kubeDns Docker image for kube_dns (string)
         * 
         * @return builder
         * 
         */
        public Builder kubeDns(String kubeDns) {
            return kubeDns(Output.of(kubeDns));
        }

        /**
         * @param kubeDnsAutoscaler Docker image for kube_dns_autoscaler (string)
         * 
         * @return builder
         * 
         */
        public Builder kubeDnsAutoscaler(@Nullable Output<String> kubeDnsAutoscaler) {
            $.kubeDnsAutoscaler = kubeDnsAutoscaler;
            return this;
        }

        /**
         * @param kubeDnsAutoscaler Docker image for kube_dns_autoscaler (string)
         * 
         * @return builder
         * 
         */
        public Builder kubeDnsAutoscaler(String kubeDnsAutoscaler) {
            return kubeDnsAutoscaler(Output.of(kubeDnsAutoscaler));
        }

        /**
         * @param kubeDnsSidecar Docker image for kube_dns_sidecar (string)
         * 
         * @return builder
         * 
         */
        public Builder kubeDnsSidecar(@Nullable Output<String> kubeDnsSidecar) {
            $.kubeDnsSidecar = kubeDnsSidecar;
            return this;
        }

        /**
         * @param kubeDnsSidecar Docker image for kube_dns_sidecar (string)
         * 
         * @return builder
         * 
         */
        public Builder kubeDnsSidecar(String kubeDnsSidecar) {
            return kubeDnsSidecar(Output.of(kubeDnsSidecar));
        }

        /**
         * @param kubernetes Docker image for kubernetes (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetes(@Nullable Output<String> kubernetes) {
            $.kubernetes = kubernetes;
            return this;
        }

        /**
         * @param kubernetes Docker image for kubernetes (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetes(String kubernetes) {
            return kubernetes(Output.of(kubernetes));
        }

        /**
         * @param kubernetesServicesSidecar Docker image for kubernetes_services_sidecar (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesServicesSidecar(@Nullable Output<String> kubernetesServicesSidecar) {
            $.kubernetesServicesSidecar = kubernetesServicesSidecar;
            return this;
        }

        /**
         * @param kubernetesServicesSidecar Docker image for kubernetes_services_sidecar (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesServicesSidecar(String kubernetesServicesSidecar) {
            return kubernetesServicesSidecar(Output.of(kubernetesServicesSidecar));
        }

        /**
         * @param metricsServer Docker image for metrics_server (string)
         * 
         * @return builder
         * 
         */
        public Builder metricsServer(@Nullable Output<String> metricsServer) {
            $.metricsServer = metricsServer;
            return this;
        }

        /**
         * @param metricsServer Docker image for metrics_server (string)
         * 
         * @return builder
         * 
         */
        public Builder metricsServer(String metricsServer) {
            return metricsServer(Output.of(metricsServer));
        }

        /**
         * @param nginxProxy Docker image for nginx_proxy (string)
         * 
         * @return builder
         * 
         */
        public Builder nginxProxy(@Nullable Output<String> nginxProxy) {
            $.nginxProxy = nginxProxy;
            return this;
        }

        /**
         * @param nginxProxy Docker image for nginx_proxy (string)
         * 
         * @return builder
         * 
         */
        public Builder nginxProxy(String nginxProxy) {
            return nginxProxy(Output.of(nginxProxy));
        }

        /**
         * @param nodelocal Docker image for nodelocal (string)
         * 
         * @return builder
         * 
         */
        public Builder nodelocal(@Nullable Output<String> nodelocal) {
            $.nodelocal = nodelocal;
            return this;
        }

        /**
         * @param nodelocal Docker image for nodelocal (string)
         * 
         * @return builder
         * 
         */
        public Builder nodelocal(String nodelocal) {
            return nodelocal(Output.of(nodelocal));
        }

        /**
         * @param podInfraContainer Docker image for pod_infra_container (string)
         * 
         * @return builder
         * 
         */
        public Builder podInfraContainer(@Nullable Output<String> podInfraContainer) {
            $.podInfraContainer = podInfraContainer;
            return this;
        }

        /**
         * @param podInfraContainer Docker image for pod_infra_container (string)
         * 
         * @return builder
         * 
         */
        public Builder podInfraContainer(String podInfraContainer) {
            return podInfraContainer(Output.of(podInfraContainer));
        }

        /**
         * @param weaveCni Docker image for weave_cni (string)
         * 
         * @return builder
         * 
         */
        public Builder weaveCni(@Nullable Output<String> weaveCni) {
            $.weaveCni = weaveCni;
            return this;
        }

        /**
         * @param weaveCni Docker image for weave_cni (string)
         * 
         * @return builder
         * 
         */
        public Builder weaveCni(String weaveCni) {
            return weaveCni(Output.of(weaveCni));
        }

        /**
         * @param weaveNode Docker image for weave_node (string)
         * 
         * @return builder
         * 
         */
        public Builder weaveNode(@Nullable Output<String> weaveNode) {
            $.weaveNode = weaveNode;
            return this;
        }

        /**
         * @param weaveNode Docker image for weave_node (string)
         * 
         * @return builder
         * 
         */
        public Builder weaveNode(String weaveNode) {
            return weaveNode(Output.of(weaveNode));
        }

        /**
         * @param windowsPodInfraContainer Docker image for windows_pod_infra_container (string)
         * 
         * @return builder
         * 
         */
        public Builder windowsPodInfraContainer(@Nullable Output<String> windowsPodInfraContainer) {
            $.windowsPodInfraContainer = windowsPodInfraContainer;
            return this;
        }

        /**
         * @param windowsPodInfraContainer Docker image for windows_pod_infra_container (string)
         * 
         * @return builder
         * 
         */
        public Builder windowsPodInfraContainer(String windowsPodInfraContainer) {
            return windowsPodInfraContainer(Output.of(windowsPodInfraContainer));
        }

        public ClusterRunningSystemImageArgs build() {
            return $;
        }
    }

}
