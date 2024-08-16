// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterServicesKubeControllerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesKubeControllerArgs Empty = new ClusterServicesKubeControllerArgs();

    /**
     * (Computed) RKE k8s cluster cidr (string)
     * 
     */
    @Import(name="clusterCidr")
    private @Nullable Output<String> clusterCidr;

    /**
     * @return (Computed) RKE k8s cluster cidr (string)
     * 
     */
    public Optional<Output<String>> clusterCidr() {
        return Optional.ofNullable(this.clusterCidr);
    }

    /**
     * Extra arguments that are added to the kube-controller service
     * 
     */
    @Import(name="extraArgs")
    private @Nullable Output<Map<String,String>> extraArgs;

    /**
     * @return Extra arguments that are added to the kube-controller service
     * 
     */
    public Optional<Output<Map<String,String>>> extraArgs() {
        return Optional.ofNullable(this.extraArgs);
    }

    /**
     * Extra binds added to the controlplane nodes
     * 
     */
    @Import(name="extraBinds")
    private @Nullable Output<List<String>> extraBinds;

    /**
     * @return Extra binds added to the controlplane nodes
     * 
     */
    public Optional<Output<List<String>>> extraBinds() {
        return Optional.ofNullable(this.extraBinds);
    }

    /**
     * Extra env added to the controlplane nodes
     * 
     */
    @Import(name="extraEnvs")
    private @Nullable Output<List<String>> extraEnvs;

    /**
     * @return Extra env added to the controlplane nodes
     * 
     */
    public Optional<Output<List<String>>> extraEnvs() {
        return Optional.ofNullable(this.extraEnvs);
    }

    /**
     * Docker image of the kube-controller service
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Docker image of the kube-controller service
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Virtual IP range that will be used by Kubernetes services
     * 
     */
    @Import(name="serviceClusterIpRange")
    private @Nullable Output<String> serviceClusterIpRange;

    /**
     * @return Virtual IP range that will be used by Kubernetes services
     * 
     */
    public Optional<Output<String>> serviceClusterIpRange() {
        return Optional.ofNullable(this.serviceClusterIpRange);
    }

    private ClusterServicesKubeControllerArgs() {}

    private ClusterServicesKubeControllerArgs(ClusterServicesKubeControllerArgs $) {
        this.clusterCidr = $.clusterCidr;
        this.extraArgs = $.extraArgs;
        this.extraBinds = $.extraBinds;
        this.extraEnvs = $.extraEnvs;
        this.image = $.image;
        this.serviceClusterIpRange = $.serviceClusterIpRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterServicesKubeControllerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesKubeControllerArgs $;

        public Builder() {
            $ = new ClusterServicesKubeControllerArgs();
        }

        public Builder(ClusterServicesKubeControllerArgs defaults) {
            $ = new ClusterServicesKubeControllerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterCidr (Computed) RKE k8s cluster cidr (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterCidr(@Nullable Output<String> clusterCidr) {
            $.clusterCidr = clusterCidr;
            return this;
        }

        /**
         * @param clusterCidr (Computed) RKE k8s cluster cidr (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterCidr(String clusterCidr) {
            return clusterCidr(Output.of(clusterCidr));
        }

        /**
         * @param extraArgs Extra arguments that are added to the kube-controller service
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(@Nullable Output<Map<String,String>> extraArgs) {
            $.extraArgs = extraArgs;
            return this;
        }

        /**
         * @param extraArgs Extra arguments that are added to the kube-controller service
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(Map<String,String> extraArgs) {
            return extraArgs(Output.of(extraArgs));
        }

        /**
         * @param extraBinds Extra binds added to the controlplane nodes
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(@Nullable Output<List<String>> extraBinds) {
            $.extraBinds = extraBinds;
            return this;
        }

        /**
         * @param extraBinds Extra binds added to the controlplane nodes
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(List<String> extraBinds) {
            return extraBinds(Output.of(extraBinds));
        }

        /**
         * @param extraBinds Extra binds added to the controlplane nodes
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }

        /**
         * @param extraEnvs Extra env added to the controlplane nodes
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(@Nullable Output<List<String>> extraEnvs) {
            $.extraEnvs = extraEnvs;
            return this;
        }

        /**
         * @param extraEnvs Extra env added to the controlplane nodes
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(List<String> extraEnvs) {
            return extraEnvs(Output.of(extraEnvs));
        }

        /**
         * @param extraEnvs Extra env added to the controlplane nodes
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }

        /**
         * @param image Docker image of the kube-controller service
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Docker image of the kube-controller service
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param serviceClusterIpRange Virtual IP range that will be used by Kubernetes services
         * 
         * @return builder
         * 
         */
        public Builder serviceClusterIpRange(@Nullable Output<String> serviceClusterIpRange) {
            $.serviceClusterIpRange = serviceClusterIpRange;
            return this;
        }

        /**
         * @param serviceClusterIpRange Virtual IP range that will be used by Kubernetes services
         * 
         * @return builder
         * 
         */
        public Builder serviceClusterIpRange(String serviceClusterIpRange) {
            return serviceClusterIpRange(Output.of(serviceClusterIpRange));
        }

        public ClusterServicesKubeControllerArgs build() {
            return $;
        }
    }

}
