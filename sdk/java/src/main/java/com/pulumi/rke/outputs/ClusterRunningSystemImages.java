// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRunningSystemImages {
    /**
     * @return Docker image for aci_cni_deploy_container (string)
     * 
     */
    private @Nullable String aciCniDeployContainer;
    /**
     * @return Docker image for aci_controller_container (string)
     * 
     */
    private @Nullable String aciControllerContainer;
    /**
     * @return Docker image for aci_host_container (string)
     * 
     */
    private @Nullable String aciHostContainer;
    /**
     * @return Docker image for aci_mcast_container (string)
     * 
     */
    private @Nullable String aciMcastContainer;
    /**
     * @return Docker image for aci_opflex_container (string)
     * 
     */
    private @Nullable String aciOpflexContainer;
    /**
     * @return Docker image for aci_ovs_container (string)
     * 
     */
    private @Nullable String aciOvsContainer;
    /**
     * @return Docker image for alpine (string)
     * 
     */
    private @Nullable String alpine;
    /**
     * @return Docker image for calico_cni (string)
     * 
     */
    private @Nullable String calicoCni;
    /**
     * @return Docker image for calico_controllers (string)
     * 
     */
    private @Nullable String calicoControllers;
    /**
     * @return Docker image for calico_ctl (string)
     * 
     */
    private @Nullable String calicoCtl;
    /**
     * @return Docker image for calico_flex_vol (string)
     * 
     */
    private @Nullable String calicoFlexVol;
    /**
     * @return Docker image for calico_node (string)
     * 
     */
    private @Nullable String calicoNode;
    /**
     * @return Docker image for canal_cni (string)
     * 
     */
    private @Nullable String canalCni;
    /**
     * @return Docker image for canal_flannel (string)
     * 
     */
    private @Nullable String canalFlannel;
    /**
     * @return Docker image for canal_flex_vol (string)
     * 
     */
    private @Nullable String canalFlexVol;
    /**
     * @return Docker image for canal_node (string)
     * 
     */
    private @Nullable String canalNode;
    /**
     * @return Docker image for cert_downloader (string)
     * 
     */
    private @Nullable String certDownloader;
    /**
     * @return Docker image for coredns (string)
     * 
     */
    private @Nullable String coredns;
    /**
     * @return Docker image for coredns_autoscaler (string)
     * 
     */
    private @Nullable String corednsAutoscaler;
    /**
     * @return Docker image for dnsmasq (string)
     * 
     */
    private @Nullable String dnsmasq;
    /**
     * @return Docker image for etcd (string)
     * 
     */
    private @Nullable String etcd;
    /**
     * @return Docker image for flannel (string)
     * 
     */
    private @Nullable String flannel;
    /**
     * @return Docker image for flannel_cni (string)
     * 
     */
    private @Nullable String flannelCni;
    /**
     * @return Docker image for ingress (string)
     * 
     */
    private @Nullable String ingress;
    /**
     * @return Docker image for ingress_backend (string)
     * 
     */
    private @Nullable String ingressBackend;
    /**
     * @return Docker image for kube_dns (string)
     * 
     */
    private @Nullable String kubeDns;
    /**
     * @return Docker image for kube_dns_autoscaler (string)
     * 
     */
    private @Nullable String kubeDnsAutoscaler;
    /**
     * @return Docker image for kube_dns_sidecar (string)
     * 
     */
    private @Nullable String kubeDnsSidecar;
    /**
     * @return Docker image for kubernetes (string)
     * 
     */
    private @Nullable String kubernetes;
    /**
     * @return Docker image for kubernetes_services_sidecar (string)
     * 
     */
    private @Nullable String kubernetesServicesSidecar;
    /**
     * @return Docker image for metrics_server (string)
     * 
     */
    private @Nullable String metricsServer;
    /**
     * @return Docker image for nginx_proxy (string)
     * 
     */
    private @Nullable String nginxProxy;
    /**
     * @return Docker image for nodelocal (string)
     * 
     */
    private @Nullable String nodelocal;
    /**
     * @return Docker image for pod_infra_container (string)
     * 
     */
    private @Nullable String podInfraContainer;
    /**
     * @return Docker image for weave_cni (string)
     * 
     */
    private @Nullable String weaveCni;
    /**
     * @return Docker image for weave_node (string)
     * 
     */
    private @Nullable String weaveNode;
    /**
     * @return Docker image for windows_pod_infra_container (string)
     * 
     */
    private @Nullable String windowsPodInfraContainer;

    private ClusterRunningSystemImages() {}
    /**
     * @return Docker image for aci_cni_deploy_container (string)
     * 
     */
    public Optional<String> aciCniDeployContainer() {
        return Optional.ofNullable(this.aciCniDeployContainer);
    }
    /**
     * @return Docker image for aci_controller_container (string)
     * 
     */
    public Optional<String> aciControllerContainer() {
        return Optional.ofNullable(this.aciControllerContainer);
    }
    /**
     * @return Docker image for aci_host_container (string)
     * 
     */
    public Optional<String> aciHostContainer() {
        return Optional.ofNullable(this.aciHostContainer);
    }
    /**
     * @return Docker image for aci_mcast_container (string)
     * 
     */
    public Optional<String> aciMcastContainer() {
        return Optional.ofNullable(this.aciMcastContainer);
    }
    /**
     * @return Docker image for aci_opflex_container (string)
     * 
     */
    public Optional<String> aciOpflexContainer() {
        return Optional.ofNullable(this.aciOpflexContainer);
    }
    /**
     * @return Docker image for aci_ovs_container (string)
     * 
     */
    public Optional<String> aciOvsContainer() {
        return Optional.ofNullable(this.aciOvsContainer);
    }
    /**
     * @return Docker image for alpine (string)
     * 
     */
    public Optional<String> alpine() {
        return Optional.ofNullable(this.alpine);
    }
    /**
     * @return Docker image for calico_cni (string)
     * 
     */
    public Optional<String> calicoCni() {
        return Optional.ofNullable(this.calicoCni);
    }
    /**
     * @return Docker image for calico_controllers (string)
     * 
     */
    public Optional<String> calicoControllers() {
        return Optional.ofNullable(this.calicoControllers);
    }
    /**
     * @return Docker image for calico_ctl (string)
     * 
     */
    public Optional<String> calicoCtl() {
        return Optional.ofNullable(this.calicoCtl);
    }
    /**
     * @return Docker image for calico_flex_vol (string)
     * 
     */
    public Optional<String> calicoFlexVol() {
        return Optional.ofNullable(this.calicoFlexVol);
    }
    /**
     * @return Docker image for calico_node (string)
     * 
     */
    public Optional<String> calicoNode() {
        return Optional.ofNullable(this.calicoNode);
    }
    /**
     * @return Docker image for canal_cni (string)
     * 
     */
    public Optional<String> canalCni() {
        return Optional.ofNullable(this.canalCni);
    }
    /**
     * @return Docker image for canal_flannel (string)
     * 
     */
    public Optional<String> canalFlannel() {
        return Optional.ofNullable(this.canalFlannel);
    }
    /**
     * @return Docker image for canal_flex_vol (string)
     * 
     */
    public Optional<String> canalFlexVol() {
        return Optional.ofNullable(this.canalFlexVol);
    }
    /**
     * @return Docker image for canal_node (string)
     * 
     */
    public Optional<String> canalNode() {
        return Optional.ofNullable(this.canalNode);
    }
    /**
     * @return Docker image for cert_downloader (string)
     * 
     */
    public Optional<String> certDownloader() {
        return Optional.ofNullable(this.certDownloader);
    }
    /**
     * @return Docker image for coredns (string)
     * 
     */
    public Optional<String> coredns() {
        return Optional.ofNullable(this.coredns);
    }
    /**
     * @return Docker image for coredns_autoscaler (string)
     * 
     */
    public Optional<String> corednsAutoscaler() {
        return Optional.ofNullable(this.corednsAutoscaler);
    }
    /**
     * @return Docker image for dnsmasq (string)
     * 
     */
    public Optional<String> dnsmasq() {
        return Optional.ofNullable(this.dnsmasq);
    }
    /**
     * @return Docker image for etcd (string)
     * 
     */
    public Optional<String> etcd() {
        return Optional.ofNullable(this.etcd);
    }
    /**
     * @return Docker image for flannel (string)
     * 
     */
    public Optional<String> flannel() {
        return Optional.ofNullable(this.flannel);
    }
    /**
     * @return Docker image for flannel_cni (string)
     * 
     */
    public Optional<String> flannelCni() {
        return Optional.ofNullable(this.flannelCni);
    }
    /**
     * @return Docker image for ingress (string)
     * 
     */
    public Optional<String> ingress() {
        return Optional.ofNullable(this.ingress);
    }
    /**
     * @return Docker image for ingress_backend (string)
     * 
     */
    public Optional<String> ingressBackend() {
        return Optional.ofNullable(this.ingressBackend);
    }
    /**
     * @return Docker image for kube_dns (string)
     * 
     */
    public Optional<String> kubeDns() {
        return Optional.ofNullable(this.kubeDns);
    }
    /**
     * @return Docker image for kube_dns_autoscaler (string)
     * 
     */
    public Optional<String> kubeDnsAutoscaler() {
        return Optional.ofNullable(this.kubeDnsAutoscaler);
    }
    /**
     * @return Docker image for kube_dns_sidecar (string)
     * 
     */
    public Optional<String> kubeDnsSidecar() {
        return Optional.ofNullable(this.kubeDnsSidecar);
    }
    /**
     * @return Docker image for kubernetes (string)
     * 
     */
    public Optional<String> kubernetes() {
        return Optional.ofNullable(this.kubernetes);
    }
    /**
     * @return Docker image for kubernetes_services_sidecar (string)
     * 
     */
    public Optional<String> kubernetesServicesSidecar() {
        return Optional.ofNullable(this.kubernetesServicesSidecar);
    }
    /**
     * @return Docker image for metrics_server (string)
     * 
     */
    public Optional<String> metricsServer() {
        return Optional.ofNullable(this.metricsServer);
    }
    /**
     * @return Docker image for nginx_proxy (string)
     * 
     */
    public Optional<String> nginxProxy() {
        return Optional.ofNullable(this.nginxProxy);
    }
    /**
     * @return Docker image for nodelocal (string)
     * 
     */
    public Optional<String> nodelocal() {
        return Optional.ofNullable(this.nodelocal);
    }
    /**
     * @return Docker image for pod_infra_container (string)
     * 
     */
    public Optional<String> podInfraContainer() {
        return Optional.ofNullable(this.podInfraContainer);
    }
    /**
     * @return Docker image for weave_cni (string)
     * 
     */
    public Optional<String> weaveCni() {
        return Optional.ofNullable(this.weaveCni);
    }
    /**
     * @return Docker image for weave_node (string)
     * 
     */
    public Optional<String> weaveNode() {
        return Optional.ofNullable(this.weaveNode);
    }
    /**
     * @return Docker image for windows_pod_infra_container (string)
     * 
     */
    public Optional<String> windowsPodInfraContainer() {
        return Optional.ofNullable(this.windowsPodInfraContainer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRunningSystemImages defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aciCniDeployContainer;
        private @Nullable String aciControllerContainer;
        private @Nullable String aciHostContainer;
        private @Nullable String aciMcastContainer;
        private @Nullable String aciOpflexContainer;
        private @Nullable String aciOvsContainer;
        private @Nullable String alpine;
        private @Nullable String calicoCni;
        private @Nullable String calicoControllers;
        private @Nullable String calicoCtl;
        private @Nullable String calicoFlexVol;
        private @Nullable String calicoNode;
        private @Nullable String canalCni;
        private @Nullable String canalFlannel;
        private @Nullable String canalFlexVol;
        private @Nullable String canalNode;
        private @Nullable String certDownloader;
        private @Nullable String coredns;
        private @Nullable String corednsAutoscaler;
        private @Nullable String dnsmasq;
        private @Nullable String etcd;
        private @Nullable String flannel;
        private @Nullable String flannelCni;
        private @Nullable String ingress;
        private @Nullable String ingressBackend;
        private @Nullable String kubeDns;
        private @Nullable String kubeDnsAutoscaler;
        private @Nullable String kubeDnsSidecar;
        private @Nullable String kubernetes;
        private @Nullable String kubernetesServicesSidecar;
        private @Nullable String metricsServer;
        private @Nullable String nginxProxy;
        private @Nullable String nodelocal;
        private @Nullable String podInfraContainer;
        private @Nullable String weaveCni;
        private @Nullable String weaveNode;
        private @Nullable String windowsPodInfraContainer;
        public Builder() {}
        public Builder(ClusterRunningSystemImages defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aciCniDeployContainer = defaults.aciCniDeployContainer;
    	      this.aciControllerContainer = defaults.aciControllerContainer;
    	      this.aciHostContainer = defaults.aciHostContainer;
    	      this.aciMcastContainer = defaults.aciMcastContainer;
    	      this.aciOpflexContainer = defaults.aciOpflexContainer;
    	      this.aciOvsContainer = defaults.aciOvsContainer;
    	      this.alpine = defaults.alpine;
    	      this.calicoCni = defaults.calicoCni;
    	      this.calicoControllers = defaults.calicoControllers;
    	      this.calicoCtl = defaults.calicoCtl;
    	      this.calicoFlexVol = defaults.calicoFlexVol;
    	      this.calicoNode = defaults.calicoNode;
    	      this.canalCni = defaults.canalCni;
    	      this.canalFlannel = defaults.canalFlannel;
    	      this.canalFlexVol = defaults.canalFlexVol;
    	      this.canalNode = defaults.canalNode;
    	      this.certDownloader = defaults.certDownloader;
    	      this.coredns = defaults.coredns;
    	      this.corednsAutoscaler = defaults.corednsAutoscaler;
    	      this.dnsmasq = defaults.dnsmasq;
    	      this.etcd = defaults.etcd;
    	      this.flannel = defaults.flannel;
    	      this.flannelCni = defaults.flannelCni;
    	      this.ingress = defaults.ingress;
    	      this.ingressBackend = defaults.ingressBackend;
    	      this.kubeDns = defaults.kubeDns;
    	      this.kubeDnsAutoscaler = defaults.kubeDnsAutoscaler;
    	      this.kubeDnsSidecar = defaults.kubeDnsSidecar;
    	      this.kubernetes = defaults.kubernetes;
    	      this.kubernetesServicesSidecar = defaults.kubernetesServicesSidecar;
    	      this.metricsServer = defaults.metricsServer;
    	      this.nginxProxy = defaults.nginxProxy;
    	      this.nodelocal = defaults.nodelocal;
    	      this.podInfraContainer = defaults.podInfraContainer;
    	      this.weaveCni = defaults.weaveCni;
    	      this.weaveNode = defaults.weaveNode;
    	      this.windowsPodInfraContainer = defaults.windowsPodInfraContainer;
        }

        @CustomType.Setter
        public Builder aciCniDeployContainer(@Nullable String aciCniDeployContainer) {
            this.aciCniDeployContainer = aciCniDeployContainer;
            return this;
        }
        @CustomType.Setter
        public Builder aciControllerContainer(@Nullable String aciControllerContainer) {
            this.aciControllerContainer = aciControllerContainer;
            return this;
        }
        @CustomType.Setter
        public Builder aciHostContainer(@Nullable String aciHostContainer) {
            this.aciHostContainer = aciHostContainer;
            return this;
        }
        @CustomType.Setter
        public Builder aciMcastContainer(@Nullable String aciMcastContainer) {
            this.aciMcastContainer = aciMcastContainer;
            return this;
        }
        @CustomType.Setter
        public Builder aciOpflexContainer(@Nullable String aciOpflexContainer) {
            this.aciOpflexContainer = aciOpflexContainer;
            return this;
        }
        @CustomType.Setter
        public Builder aciOvsContainer(@Nullable String aciOvsContainer) {
            this.aciOvsContainer = aciOvsContainer;
            return this;
        }
        @CustomType.Setter
        public Builder alpine(@Nullable String alpine) {
            this.alpine = alpine;
            return this;
        }
        @CustomType.Setter
        public Builder calicoCni(@Nullable String calicoCni) {
            this.calicoCni = calicoCni;
            return this;
        }
        @CustomType.Setter
        public Builder calicoControllers(@Nullable String calicoControllers) {
            this.calicoControllers = calicoControllers;
            return this;
        }
        @CustomType.Setter
        public Builder calicoCtl(@Nullable String calicoCtl) {
            this.calicoCtl = calicoCtl;
            return this;
        }
        @CustomType.Setter
        public Builder calicoFlexVol(@Nullable String calicoFlexVol) {
            this.calicoFlexVol = calicoFlexVol;
            return this;
        }
        @CustomType.Setter
        public Builder calicoNode(@Nullable String calicoNode) {
            this.calicoNode = calicoNode;
            return this;
        }
        @CustomType.Setter
        public Builder canalCni(@Nullable String canalCni) {
            this.canalCni = canalCni;
            return this;
        }
        @CustomType.Setter
        public Builder canalFlannel(@Nullable String canalFlannel) {
            this.canalFlannel = canalFlannel;
            return this;
        }
        @CustomType.Setter
        public Builder canalFlexVol(@Nullable String canalFlexVol) {
            this.canalFlexVol = canalFlexVol;
            return this;
        }
        @CustomType.Setter
        public Builder canalNode(@Nullable String canalNode) {
            this.canalNode = canalNode;
            return this;
        }
        @CustomType.Setter
        public Builder certDownloader(@Nullable String certDownloader) {
            this.certDownloader = certDownloader;
            return this;
        }
        @CustomType.Setter
        public Builder coredns(@Nullable String coredns) {
            this.coredns = coredns;
            return this;
        }
        @CustomType.Setter
        public Builder corednsAutoscaler(@Nullable String corednsAutoscaler) {
            this.corednsAutoscaler = corednsAutoscaler;
            return this;
        }
        @CustomType.Setter
        public Builder dnsmasq(@Nullable String dnsmasq) {
            this.dnsmasq = dnsmasq;
            return this;
        }
        @CustomType.Setter
        public Builder etcd(@Nullable String etcd) {
            this.etcd = etcd;
            return this;
        }
        @CustomType.Setter
        public Builder flannel(@Nullable String flannel) {
            this.flannel = flannel;
            return this;
        }
        @CustomType.Setter
        public Builder flannelCni(@Nullable String flannelCni) {
            this.flannelCni = flannelCni;
            return this;
        }
        @CustomType.Setter
        public Builder ingress(@Nullable String ingress) {
            this.ingress = ingress;
            return this;
        }
        @CustomType.Setter
        public Builder ingressBackend(@Nullable String ingressBackend) {
            this.ingressBackend = ingressBackend;
            return this;
        }
        @CustomType.Setter
        public Builder kubeDns(@Nullable String kubeDns) {
            this.kubeDns = kubeDns;
            return this;
        }
        @CustomType.Setter
        public Builder kubeDnsAutoscaler(@Nullable String kubeDnsAutoscaler) {
            this.kubeDnsAutoscaler = kubeDnsAutoscaler;
            return this;
        }
        @CustomType.Setter
        public Builder kubeDnsSidecar(@Nullable String kubeDnsSidecar) {
            this.kubeDnsSidecar = kubeDnsSidecar;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetes(@Nullable String kubernetes) {
            this.kubernetes = kubernetes;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesServicesSidecar(@Nullable String kubernetesServicesSidecar) {
            this.kubernetesServicesSidecar = kubernetesServicesSidecar;
            return this;
        }
        @CustomType.Setter
        public Builder metricsServer(@Nullable String metricsServer) {
            this.metricsServer = metricsServer;
            return this;
        }
        @CustomType.Setter
        public Builder nginxProxy(@Nullable String nginxProxy) {
            this.nginxProxy = nginxProxy;
            return this;
        }
        @CustomType.Setter
        public Builder nodelocal(@Nullable String nodelocal) {
            this.nodelocal = nodelocal;
            return this;
        }
        @CustomType.Setter
        public Builder podInfraContainer(@Nullable String podInfraContainer) {
            this.podInfraContainer = podInfraContainer;
            return this;
        }
        @CustomType.Setter
        public Builder weaveCni(@Nullable String weaveCni) {
            this.weaveCni = weaveCni;
            return this;
        }
        @CustomType.Setter
        public Builder weaveNode(@Nullable String weaveNode) {
            this.weaveNode = weaveNode;
            return this;
        }
        @CustomType.Setter
        public Builder windowsPodInfraContainer(@Nullable String windowsPodInfraContainer) {
            this.windowsPodInfraContainer = windowsPodInfraContainer;
            return this;
        }
        public ClusterRunningSystemImages build() {
            final var o = new ClusterRunningSystemImages();
            o.aciCniDeployContainer = aciCniDeployContainer;
            o.aciControllerContainer = aciControllerContainer;
            o.aciHostContainer = aciHostContainer;
            o.aciMcastContainer = aciMcastContainer;
            o.aciOpflexContainer = aciOpflexContainer;
            o.aciOvsContainer = aciOvsContainer;
            o.alpine = alpine;
            o.calicoCni = calicoCni;
            o.calicoControllers = calicoControllers;
            o.calicoCtl = calicoCtl;
            o.calicoFlexVol = calicoFlexVol;
            o.calicoNode = calicoNode;
            o.canalCni = canalCni;
            o.canalFlannel = canalFlannel;
            o.canalFlexVol = canalFlexVol;
            o.canalNode = canalNode;
            o.certDownloader = certDownloader;
            o.coredns = coredns;
            o.corednsAutoscaler = corednsAutoscaler;
            o.dnsmasq = dnsmasq;
            o.etcd = etcd;
            o.flannel = flannel;
            o.flannelCni = flannelCni;
            o.ingress = ingress;
            o.ingressBackend = ingressBackend;
            o.kubeDns = kubeDns;
            o.kubeDnsAutoscaler = kubeDnsAutoscaler;
            o.kubeDnsSidecar = kubeDnsSidecar;
            o.kubernetes = kubernetes;
            o.kubernetesServicesSidecar = kubernetesServicesSidecar;
            o.metricsServer = metricsServer;
            o.nginxProxy = nginxProxy;
            o.nodelocal = nodelocal;
            o.podInfraContainer = podInfraContainer;
            o.weaveCni = weaveCni;
            o.weaveNode = weaveNode;
            o.windowsPodInfraContainer = windowsPodInfraContainer;
            return o;
        }
    }
}
