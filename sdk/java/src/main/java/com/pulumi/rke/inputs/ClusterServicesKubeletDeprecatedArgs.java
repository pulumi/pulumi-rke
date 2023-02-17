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


public final class ClusterServicesKubeletDeprecatedArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesKubeletDeprecatedArgs Empty = new ClusterServicesKubeletDeprecatedArgs();

    /**
     * Cluster DNS Server option for kubelet service (string)
     * 
     */
    @Import(name="clusterDnsServer")
    private @Nullable Output<String> clusterDnsServer;

    /**
     * @return Cluster DNS Server option for kubelet service (string)
     * 
     */
    public Optional<Output<String>> clusterDnsServer() {
        return Optional.ofNullable(this.clusterDnsServer);
    }

    /**
     * Cluster Domain option for kubelet service. Default `cluster.local` (string)
     * 
     */
    @Import(name="clusterDomain")
    private @Nullable Output<String> clusterDomain;

    /**
     * @return Cluster Domain option for kubelet service. Default `cluster.local` (string)
     * 
     */
    public Optional<Output<String>> clusterDomain() {
        return Optional.ofNullable(this.clusterDomain);
    }

    /**
     * Extra arguments for scheduler service (map)
     * 
     */
    @Import(name="extraArgs")
    private @Nullable Output<Map<String,Object>> extraArgs;

    /**
     * @return Extra arguments for scheduler service (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> extraArgs() {
        return Optional.ofNullable(this.extraArgs);
    }

    /**
     * Extra binds for scheduler service (list)
     * 
     */
    @Import(name="extraBinds")
    private @Nullable Output<List<String>> extraBinds;

    /**
     * @return Extra binds for scheduler service (list)
     * 
     */
    public Optional<Output<List<String>>> extraBinds() {
        return Optional.ofNullable(this.extraBinds);
    }

    /**
     * Extra environment for scheduler service (list)
     * 
     */
    @Import(name="extraEnvs")
    private @Nullable Output<List<String>> extraEnvs;

    /**
     * @return Extra environment for scheduler service (list)
     * 
     */
    public Optional<Output<List<String>>> extraEnvs() {
        return Optional.ofNullable(this.extraEnvs);
    }

    /**
     * Enable or disable failing when swap on is not supported (bool)
     * 
     */
    @Import(name="failSwapOn")
    private @Nullable Output<Boolean> failSwapOn;

    /**
     * @return Enable or disable failing when swap on is not supported (bool)
     * 
     */
    public Optional<Output<Boolean>> failSwapOn() {
        return Optional.ofNullable(this.failSwapOn);
    }

    /**
     * [Generate a certificate signed by the kube-ca](https://rancher.com/docs/rke/latest/en/config-options/services/#kubelet-serving-certificate-requirements). Default `false` (bool)
     * 
     */
    @Import(name="generateServingCertificate")
    private @Nullable Output<Boolean> generateServingCertificate;

    /**
     * @return [Generate a certificate signed by the kube-ca](https://rancher.com/docs/rke/latest/en/config-options/services/#kubelet-serving-certificate-requirements). Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> generateServingCertificate() {
        return Optional.ofNullable(this.generateServingCertificate);
    }

    /**
     * Docker image for scheduler service (string)
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Docker image for scheduler service (string)
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Infra container image for kubelet service (string)
     * 
     */
    @Import(name="infraContainerImage")
    private @Nullable Output<String> infraContainerImage;

    /**
     * @return Infra container image for kubelet service (string)
     * 
     */
    public Optional<Output<String>> infraContainerImage() {
        return Optional.ofNullable(this.infraContainerImage);
    }

    private ClusterServicesKubeletDeprecatedArgs() {}

    private ClusterServicesKubeletDeprecatedArgs(ClusterServicesKubeletDeprecatedArgs $) {
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
    public static Builder builder(ClusterServicesKubeletDeprecatedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesKubeletDeprecatedArgs $;

        public Builder() {
            $ = new ClusterServicesKubeletDeprecatedArgs();
        }

        public Builder(ClusterServicesKubeletDeprecatedArgs defaults) {
            $ = new ClusterServicesKubeletDeprecatedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterDnsServer Cluster DNS Server option for kubelet service (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterDnsServer(@Nullable Output<String> clusterDnsServer) {
            $.clusterDnsServer = clusterDnsServer;
            return this;
        }

        /**
         * @param clusterDnsServer Cluster DNS Server option for kubelet service (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterDnsServer(String clusterDnsServer) {
            return clusterDnsServer(Output.of(clusterDnsServer));
        }

        /**
         * @param clusterDomain Cluster Domain option for kubelet service. Default `cluster.local` (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterDomain(@Nullable Output<String> clusterDomain) {
            $.clusterDomain = clusterDomain;
            return this;
        }

        /**
         * @param clusterDomain Cluster Domain option for kubelet service. Default `cluster.local` (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterDomain(String clusterDomain) {
            return clusterDomain(Output.of(clusterDomain));
        }

        /**
         * @param extraArgs Extra arguments for scheduler service (map)
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(@Nullable Output<Map<String,Object>> extraArgs) {
            $.extraArgs = extraArgs;
            return this;
        }

        /**
         * @param extraArgs Extra arguments for scheduler service (map)
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(Map<String,Object> extraArgs) {
            return extraArgs(Output.of(extraArgs));
        }

        /**
         * @param extraBinds Extra binds for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(@Nullable Output<List<String>> extraBinds) {
            $.extraBinds = extraBinds;
            return this;
        }

        /**
         * @param extraBinds Extra binds for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(List<String> extraBinds) {
            return extraBinds(Output.of(extraBinds));
        }

        /**
         * @param extraBinds Extra binds for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }

        /**
         * @param extraEnvs Extra environment for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(@Nullable Output<List<String>> extraEnvs) {
            $.extraEnvs = extraEnvs;
            return this;
        }

        /**
         * @param extraEnvs Extra environment for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(List<String> extraEnvs) {
            return extraEnvs(Output.of(extraEnvs));
        }

        /**
         * @param extraEnvs Extra environment for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }

        /**
         * @param failSwapOn Enable or disable failing when swap on is not supported (bool)
         * 
         * @return builder
         * 
         */
        public Builder failSwapOn(@Nullable Output<Boolean> failSwapOn) {
            $.failSwapOn = failSwapOn;
            return this;
        }

        /**
         * @param failSwapOn Enable or disable failing when swap on is not supported (bool)
         * 
         * @return builder
         * 
         */
        public Builder failSwapOn(Boolean failSwapOn) {
            return failSwapOn(Output.of(failSwapOn));
        }

        /**
         * @param generateServingCertificate [Generate a certificate signed by the kube-ca](https://rancher.com/docs/rke/latest/en/config-options/services/#kubelet-serving-certificate-requirements). Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder generateServingCertificate(@Nullable Output<Boolean> generateServingCertificate) {
            $.generateServingCertificate = generateServingCertificate;
            return this;
        }

        /**
         * @param generateServingCertificate [Generate a certificate signed by the kube-ca](https://rancher.com/docs/rke/latest/en/config-options/services/#kubelet-serving-certificate-requirements). Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder generateServingCertificate(Boolean generateServingCertificate) {
            return generateServingCertificate(Output.of(generateServingCertificate));
        }

        /**
         * @param image Docker image for scheduler service (string)
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Docker image for scheduler service (string)
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param infraContainerImage Infra container image for kubelet service (string)
         * 
         * @return builder
         * 
         */
        public Builder infraContainerImage(@Nullable Output<String> infraContainerImage) {
            $.infraContainerImage = infraContainerImage;
            return this;
        }

        /**
         * @param infraContainerImage Infra container image for kubelet service (string)
         * 
         * @return builder
         * 
         */
        public Builder infraContainerImage(String infraContainerImage) {
            return infraContainerImage(Output.of(infraContainerImage));
        }

        public ClusterServicesKubeletDeprecatedArgs build() {
            return $;
        }
    }

}