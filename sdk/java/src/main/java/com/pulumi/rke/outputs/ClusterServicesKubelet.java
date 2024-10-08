// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterServicesKubelet {
    /**
     * @return (Computed) RKE k8s cluster dns server (string)
     * 
     */
    private @Nullable String clusterDnsServer;
    /**
     * @return (Computed) RKE k8s cluster domain (string)
     * 
     */
    private @Nullable String clusterDomain;
    /**
     * @return Extra arguments that are added to the kubelet services
     * 
     */
    private @Nullable Map<String,String> extraArgs;
    /**
     * @return Extra binds added to the worker nodes
     * 
     */
    private @Nullable List<String> extraBinds;
    /**
     * @return Extra env added to the nodes
     * 
     */
    private @Nullable List<String> extraEnvs;
    /**
     * @return Fail if swap is enabled
     * 
     */
    private @Nullable Boolean failSwapOn;
    /**
     * @return [Generate a certificate signed by the kube-ca](https://rancher.com/docs/rke/latest/en/config-options/services/#kubelet-serving-certificate-requirements). Default `false` (bool)
     * 
     */
    private @Nullable Boolean generateServingCertificate;
    /**
     * @return Docker image of the kubelet service
     * 
     */
    private @Nullable String image;
    /**
     * @return The image whose network/ipc namespaces containers in each pod will use
     * 
     */
    private @Nullable String infraContainerImage;

    private ClusterServicesKubelet() {}
    /**
     * @return (Computed) RKE k8s cluster dns server (string)
     * 
     */
    public Optional<String> clusterDnsServer() {
        return Optional.ofNullable(this.clusterDnsServer);
    }
    /**
     * @return (Computed) RKE k8s cluster domain (string)
     * 
     */
    public Optional<String> clusterDomain() {
        return Optional.ofNullable(this.clusterDomain);
    }
    /**
     * @return Extra arguments that are added to the kubelet services
     * 
     */
    public Map<String,String> extraArgs() {
        return this.extraArgs == null ? Map.of() : this.extraArgs;
    }
    /**
     * @return Extra binds added to the worker nodes
     * 
     */
    public List<String> extraBinds() {
        return this.extraBinds == null ? List.of() : this.extraBinds;
    }
    /**
     * @return Extra env added to the nodes
     * 
     */
    public List<String> extraEnvs() {
        return this.extraEnvs == null ? List.of() : this.extraEnvs;
    }
    /**
     * @return Fail if swap is enabled
     * 
     */
    public Optional<Boolean> failSwapOn() {
        return Optional.ofNullable(this.failSwapOn);
    }
    /**
     * @return [Generate a certificate signed by the kube-ca](https://rancher.com/docs/rke/latest/en/config-options/services/#kubelet-serving-certificate-requirements). Default `false` (bool)
     * 
     */
    public Optional<Boolean> generateServingCertificate() {
        return Optional.ofNullable(this.generateServingCertificate);
    }
    /**
     * @return Docker image of the kubelet service
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return The image whose network/ipc namespaces containers in each pod will use
     * 
     */
    public Optional<String> infraContainerImage() {
        return Optional.ofNullable(this.infraContainerImage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterServicesKubelet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clusterDnsServer;
        private @Nullable String clusterDomain;
        private @Nullable Map<String,String> extraArgs;
        private @Nullable List<String> extraBinds;
        private @Nullable List<String> extraEnvs;
        private @Nullable Boolean failSwapOn;
        private @Nullable Boolean generateServingCertificate;
        private @Nullable String image;
        private @Nullable String infraContainerImage;
        public Builder() {}
        public Builder(ClusterServicesKubelet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDnsServer = defaults.clusterDnsServer;
    	      this.clusterDomain = defaults.clusterDomain;
    	      this.extraArgs = defaults.extraArgs;
    	      this.extraBinds = defaults.extraBinds;
    	      this.extraEnvs = defaults.extraEnvs;
    	      this.failSwapOn = defaults.failSwapOn;
    	      this.generateServingCertificate = defaults.generateServingCertificate;
    	      this.image = defaults.image;
    	      this.infraContainerImage = defaults.infraContainerImage;
        }

        @CustomType.Setter
        public Builder clusterDnsServer(@Nullable String clusterDnsServer) {

            this.clusterDnsServer = clusterDnsServer;
            return this;
        }
        @CustomType.Setter
        public Builder clusterDomain(@Nullable String clusterDomain) {

            this.clusterDomain = clusterDomain;
            return this;
        }
        @CustomType.Setter
        public Builder extraArgs(@Nullable Map<String,String> extraArgs) {

            this.extraArgs = extraArgs;
            return this;
        }
        @CustomType.Setter
        public Builder extraBinds(@Nullable List<String> extraBinds) {

            this.extraBinds = extraBinds;
            return this;
        }
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }
        @CustomType.Setter
        public Builder extraEnvs(@Nullable List<String> extraEnvs) {

            this.extraEnvs = extraEnvs;
            return this;
        }
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }
        @CustomType.Setter
        public Builder failSwapOn(@Nullable Boolean failSwapOn) {

            this.failSwapOn = failSwapOn;
            return this;
        }
        @CustomType.Setter
        public Builder generateServingCertificate(@Nullable Boolean generateServingCertificate) {

            this.generateServingCertificate = generateServingCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder image(@Nullable String image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder infraContainerImage(@Nullable String infraContainerImage) {

            this.infraContainerImage = infraContainerImage;
            return this;
        }
        public ClusterServicesKubelet build() {
            final var _resultValue = new ClusterServicesKubelet();
            _resultValue.clusterDnsServer = clusterDnsServer;
            _resultValue.clusterDomain = clusterDomain;
            _resultValue.extraArgs = extraArgs;
            _resultValue.extraBinds = extraBinds;
            _resultValue.extraEnvs = extraEnvs;
            _resultValue.failSwapOn = failSwapOn;
            _resultValue.generateServingCertificate = generateServingCertificate;
            _resultValue.image = image;
            _resultValue.infraContainerImage = infraContainerImage;
            return _resultValue;
        }
    }
}
