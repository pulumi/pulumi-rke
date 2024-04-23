// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterServicesKubeletArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesKubeletArgs Empty = new ClusterServicesKubeletArgs();

    /**
     * (Computed) RKE k8s cluster dns server (string)
     * 
     */
    @Import(name="clusterDnsServer")
    private @Nullable Output<String> clusterDnsServer;

    /**
     * @return (Computed) RKE k8s cluster dns server (string)
     * 
     */
    public Optional<Output<String>> clusterDnsServer() {
        return Optional.ofNullable(this.clusterDnsServer);
    }

    /**
     * (Computed) RKE k8s cluster domain (string)
     * 
     */
    @Import(name="clusterDomain")
    private @Nullable Output<String> clusterDomain;

    /**
     * @return (Computed) RKE k8s cluster domain (string)
     * 
     */
    public Optional<Output<String>> clusterDomain() {
        return Optional.ofNullable(this.clusterDomain);
    }

    /**
     * Extra arguments that are added to the kubelet services
     * 
     */
    @Import(name="extraArgs")
    private @Nullable Output<Map<String,Object>> extraArgs;

    /**
     * @return Extra arguments that are added to the kubelet services
     * 
     */
    public Optional<Output<Map<String,Object>>> extraArgs() {
        return Optional.ofNullable(this.extraArgs);
    }

    /**
     * Extra binds added to the worker nodes
     * 
     */
    @Import(name="extraBinds")
    private @Nullable Output<List<String>> extraBinds;

    /**
     * @return Extra binds added to the worker nodes
     * 
     */
    public Optional<Output<List<String>>> extraBinds() {
        return Optional.ofNullable(this.extraBinds);
    }

    /**
     * Extra env added to the nodes
     * 
     */
    @Import(name="extraEnvs")
    private @Nullable Output<List<String>> extraEnvs;

    /**
     * @return Extra env added to the nodes
     * 
     */
    public Optional<Output<List<String>>> extraEnvs() {
        return Optional.ofNullable(this.extraEnvs);
    }

    /**
     * Fail if swap is enabled
     * 
     */
    @Import(name="failSwapOn")
    private @Nullable Output<Boolean> failSwapOn;

    /**
     * @return Fail if swap is enabled
     * 
     */
    public Optional<Output<Boolean>> failSwapOn() {
        return Optional.ofNullable(this.failSwapOn);
    }

    @Import(name="generateServingCertificate")
    private @Nullable Output<Boolean> generateServingCertificate;

    public Optional<Output<Boolean>> generateServingCertificate() {
        return Optional.ofNullable(this.generateServingCertificate);
    }

    /**
     * Docker image of the kubelet service
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Docker image of the kubelet service
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * The image whose network/ipc namespaces containers in each pod will use
     * 
     */
    @Import(name="infraContainerImage")
    private @Nullable Output<String> infraContainerImage;

    /**
     * @return The image whose network/ipc namespaces containers in each pod will use
     * 
     */
    public Optional<Output<String>> infraContainerImage() {
        return Optional.ofNullable(this.infraContainerImage);
    }

    private ClusterServicesKubeletArgs() {}

    private ClusterServicesKubeletArgs(ClusterServicesKubeletArgs $) {
        this.clusterDnsServer = $.clusterDnsServer;
        this.clusterDomain = $.clusterDomain;
        this.extraArgs = $.extraArgs;
        this.extraBinds = $.extraBinds;
        this.extraEnvs = $.extraEnvs;
        this.failSwapOn = $.failSwapOn;
        this.generateServingCertificate = $.generateServingCertificate;
        this.image = $.image;
        this.infraContainerImage = $.infraContainerImage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterServicesKubeletArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesKubeletArgs $;

        public Builder() {
            $ = new ClusterServicesKubeletArgs();
        }

        public Builder(ClusterServicesKubeletArgs defaults) {
            $ = new ClusterServicesKubeletArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterDnsServer (Computed) RKE k8s cluster dns server (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterDnsServer(@Nullable Output<String> clusterDnsServer) {
            $.clusterDnsServer = clusterDnsServer;
            return this;
        }

        /**
         * @param clusterDnsServer (Computed) RKE k8s cluster dns server (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterDnsServer(String clusterDnsServer) {
            return clusterDnsServer(Output.of(clusterDnsServer));
        }

        /**
         * @param clusterDomain (Computed) RKE k8s cluster domain (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterDomain(@Nullable Output<String> clusterDomain) {
            $.clusterDomain = clusterDomain;
            return this;
        }

        /**
         * @param clusterDomain (Computed) RKE k8s cluster domain (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterDomain(String clusterDomain) {
            return clusterDomain(Output.of(clusterDomain));
        }

        /**
         * @param extraArgs Extra arguments that are added to the kubelet services
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(@Nullable Output<Map<String,Object>> extraArgs) {
            $.extraArgs = extraArgs;
            return this;
        }

        /**
         * @param extraArgs Extra arguments that are added to the kubelet services
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(Map<String,Object> extraArgs) {
            return extraArgs(Output.of(extraArgs));
        }

        /**
         * @param extraBinds Extra binds added to the worker nodes
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(@Nullable Output<List<String>> extraBinds) {
            $.extraBinds = extraBinds;
            return this;
        }

        /**
         * @param extraBinds Extra binds added to the worker nodes
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(List<String> extraBinds) {
            return extraBinds(Output.of(extraBinds));
        }

        /**
         * @param extraBinds Extra binds added to the worker nodes
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }

        /**
         * @param extraEnvs Extra env added to the nodes
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(@Nullable Output<List<String>> extraEnvs) {
            $.extraEnvs = extraEnvs;
            return this;
        }

        /**
         * @param extraEnvs Extra env added to the nodes
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(List<String> extraEnvs) {
            return extraEnvs(Output.of(extraEnvs));
        }

        /**
         * @param extraEnvs Extra env added to the nodes
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }

        /**
         * @param failSwapOn Fail if swap is enabled
         * 
         * @return builder
         * 
         */
        public Builder failSwapOn(@Nullable Output<Boolean> failSwapOn) {
            $.failSwapOn = failSwapOn;
            return this;
        }

        /**
         * @param failSwapOn Fail if swap is enabled
         * 
         * @return builder
         * 
         */
        public Builder failSwapOn(Boolean failSwapOn) {
            return failSwapOn(Output.of(failSwapOn));
        }

        public Builder generateServingCertificate(@Nullable Output<Boolean> generateServingCertificate) {
            $.generateServingCertificate = generateServingCertificate;
            return this;
        }

        public Builder generateServingCertificate(Boolean generateServingCertificate) {
            return generateServingCertificate(Output.of(generateServingCertificate));
        }

        /**
         * @param image Docker image of the kubelet service
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Docker image of the kubelet service
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param infraContainerImage The image whose network/ipc namespaces containers in each pod will use
         * 
         * @return builder
         * 
         */
        public Builder infraContainerImage(@Nullable Output<String> infraContainerImage) {
            $.infraContainerImage = infraContainerImage;
            return this;
        }

        /**
         * @param infraContainerImage The image whose network/ipc namespaces containers in each pod will use
         * 
         * @return builder
         * 
         */
        public Builder infraContainerImage(String infraContainerImage) {
            return infraContainerImage(Output.of(infraContainerImage));
        }

        public ClusterServicesKubeletArgs build() {
            return $;
        }
    }

}
