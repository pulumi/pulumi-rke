// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterSystemImagesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterSystemImagesArgs Empty = new ClusterSystemImagesArgs();

    @Import(name="aciCniDeployContainer")
    private @Nullable Output<String> aciCniDeployContainer;

    public Optional<Output<String>> aciCniDeployContainer() {
        return Optional.ofNullable(this.aciCniDeployContainer);
    }

    @Import(name="aciControllerContainer")
    private @Nullable Output<String> aciControllerContainer;

    public Optional<Output<String>> aciControllerContainer() {
        return Optional.ofNullable(this.aciControllerContainer);
    }

    @Import(name="aciHostContainer")
    private @Nullable Output<String> aciHostContainer;

    public Optional<Output<String>> aciHostContainer() {
        return Optional.ofNullable(this.aciHostContainer);
    }

    @Import(name="aciMcastContainer")
    private @Nullable Output<String> aciMcastContainer;

    public Optional<Output<String>> aciMcastContainer() {
        return Optional.ofNullable(this.aciMcastContainer);
    }

    @Import(name="aciOpflexContainer")
    private @Nullable Output<String> aciOpflexContainer;

    public Optional<Output<String>> aciOpflexContainer() {
        return Optional.ofNullable(this.aciOpflexContainer);
    }

    @Import(name="aciOvsContainer")
    private @Nullable Output<String> aciOvsContainer;

    public Optional<Output<String>> aciOvsContainer() {
        return Optional.ofNullable(this.aciOvsContainer);
    }

    @Import(name="alpine")
    private @Nullable Output<String> alpine;

    public Optional<Output<String>> alpine() {
        return Optional.ofNullable(this.alpine);
    }

    @Import(name="calicoCni")
    private @Nullable Output<String> calicoCni;

    public Optional<Output<String>> calicoCni() {
        return Optional.ofNullable(this.calicoCni);
    }

    @Import(name="calicoControllers")
    private @Nullable Output<String> calicoControllers;

    public Optional<Output<String>> calicoControllers() {
        return Optional.ofNullable(this.calicoControllers);
    }

    @Import(name="calicoCtl")
    private @Nullable Output<String> calicoCtl;

    public Optional<Output<String>> calicoCtl() {
        return Optional.ofNullable(this.calicoCtl);
    }

    @Import(name="calicoFlexVol")
    private @Nullable Output<String> calicoFlexVol;

    public Optional<Output<String>> calicoFlexVol() {
        return Optional.ofNullable(this.calicoFlexVol);
    }

    @Import(name="calicoNode")
    private @Nullable Output<String> calicoNode;

    public Optional<Output<String>> calicoNode() {
        return Optional.ofNullable(this.calicoNode);
    }

    @Import(name="canalCni")
    private @Nullable Output<String> canalCni;

    public Optional<Output<String>> canalCni() {
        return Optional.ofNullable(this.canalCni);
    }

    @Import(name="canalFlannel")
    private @Nullable Output<String> canalFlannel;

    public Optional<Output<String>> canalFlannel() {
        return Optional.ofNullable(this.canalFlannel);
    }

    @Import(name="canalFlexVol")
    private @Nullable Output<String> canalFlexVol;

    public Optional<Output<String>> canalFlexVol() {
        return Optional.ofNullable(this.canalFlexVol);
    }

    @Import(name="canalNode")
    private @Nullable Output<String> canalNode;

    public Optional<Output<String>> canalNode() {
        return Optional.ofNullable(this.canalNode);
    }

    @Import(name="certDownloader")
    private @Nullable Output<String> certDownloader;

    public Optional<Output<String>> certDownloader() {
        return Optional.ofNullable(this.certDownloader);
    }

    @Import(name="coredns")
    private @Nullable Output<String> coredns;

    public Optional<Output<String>> coredns() {
        return Optional.ofNullable(this.coredns);
    }

    @Import(name="corednsAutoscaler")
    private @Nullable Output<String> corednsAutoscaler;

    public Optional<Output<String>> corednsAutoscaler() {
        return Optional.ofNullable(this.corednsAutoscaler);
    }

    @Import(name="dnsmasq")
    private @Nullable Output<String> dnsmasq;

    public Optional<Output<String>> dnsmasq() {
        return Optional.ofNullable(this.dnsmasq);
    }

    @Import(name="etcd")
    private @Nullable Output<String> etcd;

    public Optional<Output<String>> etcd() {
        return Optional.ofNullable(this.etcd);
    }

    @Import(name="flannel")
    private @Nullable Output<String> flannel;

    public Optional<Output<String>> flannel() {
        return Optional.ofNullable(this.flannel);
    }

    @Import(name="flannelCni")
    private @Nullable Output<String> flannelCni;

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

    @Import(name="ingressBackend")
    private @Nullable Output<String> ingressBackend;

    public Optional<Output<String>> ingressBackend() {
        return Optional.ofNullable(this.ingressBackend);
    }

    @Import(name="kubeDns")
    private @Nullable Output<String> kubeDns;

    public Optional<Output<String>> kubeDns() {
        return Optional.ofNullable(this.kubeDns);
    }

    @Import(name="kubeDnsAutoscaler")
    private @Nullable Output<String> kubeDnsAutoscaler;

    public Optional<Output<String>> kubeDnsAutoscaler() {
        return Optional.ofNullable(this.kubeDnsAutoscaler);
    }

    @Import(name="kubeDnsSidecar")
    private @Nullable Output<String> kubeDnsSidecar;

    public Optional<Output<String>> kubeDnsSidecar() {
        return Optional.ofNullable(this.kubeDnsSidecar);
    }

    @Import(name="kubernetes")
    private @Nullable Output<String> kubernetes;

    public Optional<Output<String>> kubernetes() {
        return Optional.ofNullable(this.kubernetes);
    }

    @Import(name="kubernetesServicesSidecar")
    private @Nullable Output<String> kubernetesServicesSidecar;

    public Optional<Output<String>> kubernetesServicesSidecar() {
        return Optional.ofNullable(this.kubernetesServicesSidecar);
    }

    @Import(name="metricsServer")
    private @Nullable Output<String> metricsServer;

    public Optional<Output<String>> metricsServer() {
        return Optional.ofNullable(this.metricsServer);
    }

    @Import(name="nginxProxy")
    private @Nullable Output<String> nginxProxy;

    public Optional<Output<String>> nginxProxy() {
        return Optional.ofNullable(this.nginxProxy);
    }

    @Import(name="nodelocal")
    private @Nullable Output<String> nodelocal;

    public Optional<Output<String>> nodelocal() {
        return Optional.ofNullable(this.nodelocal);
    }

    @Import(name="podInfraContainer")
    private @Nullable Output<String> podInfraContainer;

    public Optional<Output<String>> podInfraContainer() {
        return Optional.ofNullable(this.podInfraContainer);
    }

    @Import(name="weaveCni")
    private @Nullable Output<String> weaveCni;

    public Optional<Output<String>> weaveCni() {
        return Optional.ofNullable(this.weaveCni);
    }

    @Import(name="weaveNode")
    private @Nullable Output<String> weaveNode;

    public Optional<Output<String>> weaveNode() {
        return Optional.ofNullable(this.weaveNode);
    }

    @Import(name="windowsPodInfraContainer")
    private @Nullable Output<String> windowsPodInfraContainer;

    public Optional<Output<String>> windowsPodInfraContainer() {
        return Optional.ofNullable(this.windowsPodInfraContainer);
    }

    private ClusterSystemImagesArgs() {}

    private ClusterSystemImagesArgs(ClusterSystemImagesArgs $) {
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
    public static Builder builder(ClusterSystemImagesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterSystemImagesArgs $;

        public Builder() {
            $ = new ClusterSystemImagesArgs();
        }

        public Builder(ClusterSystemImagesArgs defaults) {
            $ = new ClusterSystemImagesArgs(Objects.requireNonNull(defaults));
        }

        public Builder aciCniDeployContainer(@Nullable Output<String> aciCniDeployContainer) {
            $.aciCniDeployContainer = aciCniDeployContainer;
            return this;
        }

        public Builder aciCniDeployContainer(String aciCniDeployContainer) {
            return aciCniDeployContainer(Output.of(aciCniDeployContainer));
        }

        public Builder aciControllerContainer(@Nullable Output<String> aciControllerContainer) {
            $.aciControllerContainer = aciControllerContainer;
            return this;
        }

        public Builder aciControllerContainer(String aciControllerContainer) {
            return aciControllerContainer(Output.of(aciControllerContainer));
        }

        public Builder aciHostContainer(@Nullable Output<String> aciHostContainer) {
            $.aciHostContainer = aciHostContainer;
            return this;
        }

        public Builder aciHostContainer(String aciHostContainer) {
            return aciHostContainer(Output.of(aciHostContainer));
        }

        public Builder aciMcastContainer(@Nullable Output<String> aciMcastContainer) {
            $.aciMcastContainer = aciMcastContainer;
            return this;
        }

        public Builder aciMcastContainer(String aciMcastContainer) {
            return aciMcastContainer(Output.of(aciMcastContainer));
        }

        public Builder aciOpflexContainer(@Nullable Output<String> aciOpflexContainer) {
            $.aciOpflexContainer = aciOpflexContainer;
            return this;
        }

        public Builder aciOpflexContainer(String aciOpflexContainer) {
            return aciOpflexContainer(Output.of(aciOpflexContainer));
        }

        public Builder aciOvsContainer(@Nullable Output<String> aciOvsContainer) {
            $.aciOvsContainer = aciOvsContainer;
            return this;
        }

        public Builder aciOvsContainer(String aciOvsContainer) {
            return aciOvsContainer(Output.of(aciOvsContainer));
        }

        public Builder alpine(@Nullable Output<String> alpine) {
            $.alpine = alpine;
            return this;
        }

        public Builder alpine(String alpine) {
            return alpine(Output.of(alpine));
        }

        public Builder calicoCni(@Nullable Output<String> calicoCni) {
            $.calicoCni = calicoCni;
            return this;
        }

        public Builder calicoCni(String calicoCni) {
            return calicoCni(Output.of(calicoCni));
        }

        public Builder calicoControllers(@Nullable Output<String> calicoControllers) {
            $.calicoControllers = calicoControllers;
            return this;
        }

        public Builder calicoControllers(String calicoControllers) {
            return calicoControllers(Output.of(calicoControllers));
        }

        public Builder calicoCtl(@Nullable Output<String> calicoCtl) {
            $.calicoCtl = calicoCtl;
            return this;
        }

        public Builder calicoCtl(String calicoCtl) {
            return calicoCtl(Output.of(calicoCtl));
        }

        public Builder calicoFlexVol(@Nullable Output<String> calicoFlexVol) {
            $.calicoFlexVol = calicoFlexVol;
            return this;
        }

        public Builder calicoFlexVol(String calicoFlexVol) {
            return calicoFlexVol(Output.of(calicoFlexVol));
        }

        public Builder calicoNode(@Nullable Output<String> calicoNode) {
            $.calicoNode = calicoNode;
            return this;
        }

        public Builder calicoNode(String calicoNode) {
            return calicoNode(Output.of(calicoNode));
        }

        public Builder canalCni(@Nullable Output<String> canalCni) {
            $.canalCni = canalCni;
            return this;
        }

        public Builder canalCni(String canalCni) {
            return canalCni(Output.of(canalCni));
        }

        public Builder canalFlannel(@Nullable Output<String> canalFlannel) {
            $.canalFlannel = canalFlannel;
            return this;
        }

        public Builder canalFlannel(String canalFlannel) {
            return canalFlannel(Output.of(canalFlannel));
        }

        public Builder canalFlexVol(@Nullable Output<String> canalFlexVol) {
            $.canalFlexVol = canalFlexVol;
            return this;
        }

        public Builder canalFlexVol(String canalFlexVol) {
            return canalFlexVol(Output.of(canalFlexVol));
        }

        public Builder canalNode(@Nullable Output<String> canalNode) {
            $.canalNode = canalNode;
            return this;
        }

        public Builder canalNode(String canalNode) {
            return canalNode(Output.of(canalNode));
        }

        public Builder certDownloader(@Nullable Output<String> certDownloader) {
            $.certDownloader = certDownloader;
            return this;
        }

        public Builder certDownloader(String certDownloader) {
            return certDownloader(Output.of(certDownloader));
        }

        public Builder coredns(@Nullable Output<String> coredns) {
            $.coredns = coredns;
            return this;
        }

        public Builder coredns(String coredns) {
            return coredns(Output.of(coredns));
        }

        public Builder corednsAutoscaler(@Nullable Output<String> corednsAutoscaler) {
            $.corednsAutoscaler = corednsAutoscaler;
            return this;
        }

        public Builder corednsAutoscaler(String corednsAutoscaler) {
            return corednsAutoscaler(Output.of(corednsAutoscaler));
        }

        public Builder dnsmasq(@Nullable Output<String> dnsmasq) {
            $.dnsmasq = dnsmasq;
            return this;
        }

        public Builder dnsmasq(String dnsmasq) {
            return dnsmasq(Output.of(dnsmasq));
        }

        public Builder etcd(@Nullable Output<String> etcd) {
            $.etcd = etcd;
            return this;
        }

        public Builder etcd(String etcd) {
            return etcd(Output.of(etcd));
        }

        public Builder flannel(@Nullable Output<String> flannel) {
            $.flannel = flannel;
            return this;
        }

        public Builder flannel(String flannel) {
            return flannel(Output.of(flannel));
        }

        public Builder flannelCni(@Nullable Output<String> flannelCni) {
            $.flannelCni = flannelCni;
            return this;
        }

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

        public Builder ingressBackend(@Nullable Output<String> ingressBackend) {
            $.ingressBackend = ingressBackend;
            return this;
        }

        public Builder ingressBackend(String ingressBackend) {
            return ingressBackend(Output.of(ingressBackend));
        }

        public Builder kubeDns(@Nullable Output<String> kubeDns) {
            $.kubeDns = kubeDns;
            return this;
        }

        public Builder kubeDns(String kubeDns) {
            return kubeDns(Output.of(kubeDns));
        }

        public Builder kubeDnsAutoscaler(@Nullable Output<String> kubeDnsAutoscaler) {
            $.kubeDnsAutoscaler = kubeDnsAutoscaler;
            return this;
        }

        public Builder kubeDnsAutoscaler(String kubeDnsAutoscaler) {
            return kubeDnsAutoscaler(Output.of(kubeDnsAutoscaler));
        }

        public Builder kubeDnsSidecar(@Nullable Output<String> kubeDnsSidecar) {
            $.kubeDnsSidecar = kubeDnsSidecar;
            return this;
        }

        public Builder kubeDnsSidecar(String kubeDnsSidecar) {
            return kubeDnsSidecar(Output.of(kubeDnsSidecar));
        }

        public Builder kubernetes(@Nullable Output<String> kubernetes) {
            $.kubernetes = kubernetes;
            return this;
        }

        public Builder kubernetes(String kubernetes) {
            return kubernetes(Output.of(kubernetes));
        }

        public Builder kubernetesServicesSidecar(@Nullable Output<String> kubernetesServicesSidecar) {
            $.kubernetesServicesSidecar = kubernetesServicesSidecar;
            return this;
        }

        public Builder kubernetesServicesSidecar(String kubernetesServicesSidecar) {
            return kubernetesServicesSidecar(Output.of(kubernetesServicesSidecar));
        }

        public Builder metricsServer(@Nullable Output<String> metricsServer) {
            $.metricsServer = metricsServer;
            return this;
        }

        public Builder metricsServer(String metricsServer) {
            return metricsServer(Output.of(metricsServer));
        }

        public Builder nginxProxy(@Nullable Output<String> nginxProxy) {
            $.nginxProxy = nginxProxy;
            return this;
        }

        public Builder nginxProxy(String nginxProxy) {
            return nginxProxy(Output.of(nginxProxy));
        }

        public Builder nodelocal(@Nullable Output<String> nodelocal) {
            $.nodelocal = nodelocal;
            return this;
        }

        public Builder nodelocal(String nodelocal) {
            return nodelocal(Output.of(nodelocal));
        }

        public Builder podInfraContainer(@Nullable Output<String> podInfraContainer) {
            $.podInfraContainer = podInfraContainer;
            return this;
        }

        public Builder podInfraContainer(String podInfraContainer) {
            return podInfraContainer(Output.of(podInfraContainer));
        }

        public Builder weaveCni(@Nullable Output<String> weaveCni) {
            $.weaveCni = weaveCni;
            return this;
        }

        public Builder weaveCni(String weaveCni) {
            return weaveCni(Output.of(weaveCni));
        }

        public Builder weaveNode(@Nullable Output<String> weaveNode) {
            $.weaveNode = weaveNode;
            return this;
        }

        public Builder weaveNode(String weaveNode) {
            return weaveNode(Output.of(weaveNode));
        }

        public Builder windowsPodInfraContainer(@Nullable Output<String> windowsPodInfraContainer) {
            $.windowsPodInfraContainer = windowsPodInfraContainer;
            return this;
        }

        public Builder windowsPodInfraContainer(String windowsPodInfraContainer) {
            return windowsPodInfraContainer(Output.of(windowsPodInfraContainer));
        }

        public ClusterSystemImagesArgs build() {
            return $;
        }
    }

}
