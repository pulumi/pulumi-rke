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


public final class ClusterServicesKubeSchedulerDeprecatedArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesKubeSchedulerDeprecatedArgs Empty = new ClusterServicesKubeSchedulerDeprecatedArgs();

    /**
     * Extra arguments that are added to the scheduler services
     * 
     */
    @Import(name="extraArgs")
    private @Nullable Output<Map<String,String>> extraArgs;

    /**
     * @return Extra arguments that are added to the scheduler services
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
     * Docker image of the scheduler service
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Docker image of the scheduler service
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    private ClusterServicesKubeSchedulerDeprecatedArgs() {}

    private ClusterServicesKubeSchedulerDeprecatedArgs(ClusterServicesKubeSchedulerDeprecatedArgs $) {
        this.extraArgs = $.extraArgs;
        this.extraBinds = $.extraBinds;
        this.extraEnvs = $.extraEnvs;
        this.image = $.image;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterServicesKubeSchedulerDeprecatedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesKubeSchedulerDeprecatedArgs $;

        public Builder() {
            $ = new ClusterServicesKubeSchedulerDeprecatedArgs();
        }

        public Builder(ClusterServicesKubeSchedulerDeprecatedArgs defaults) {
            $ = new ClusterServicesKubeSchedulerDeprecatedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extraArgs Extra arguments that are added to the scheduler services
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(@Nullable Output<Map<String,String>> extraArgs) {
            $.extraArgs = extraArgs;
            return this;
        }

        /**
         * @param extraArgs Extra arguments that are added to the scheduler services
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
         * @param image Docker image of the scheduler service
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Docker image of the scheduler service
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        public ClusterServicesKubeSchedulerDeprecatedArgs build() {
            return $;
        }
    }

}
