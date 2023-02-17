// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rke.inputs.ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderOpenstackCloudConfigGlobalArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderOpenstackCloudConfigMetadataArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderOpenstackCloudConfigRouteArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderOpenstackCloudConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderOpenstackCloudConfigArgs Empty = new ClusterCloudProviderOpenstackCloudConfigArgs();

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="blockStorage")
    private @Nullable Output<ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs> blockStorage;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs>> blockStorage() {
        return Optional.ofNullable(this.blockStorage);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="global", required=true)
    private Output<ClusterCloudProviderOpenstackCloudConfigGlobalArgs> global;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Output<ClusterCloudProviderOpenstackCloudConfigGlobalArgs> global() {
        return this.global;
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="loadBalancer")
    private @Nullable Output<ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs> loadBalancer;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs>> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ClusterCloudProviderOpenstackCloudConfigMetadataArgs> metadata;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterCloudProviderOpenstackCloudConfigMetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="route")
    private @Nullable Output<ClusterCloudProviderOpenstackCloudConfigRouteArgs> route;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterCloudProviderOpenstackCloudConfigRouteArgs>> route() {
        return Optional.ofNullable(this.route);
    }

    private ClusterCloudProviderOpenstackCloudConfigArgs() {}

    private ClusterCloudProviderOpenstackCloudConfigArgs(ClusterCloudProviderOpenstackCloudConfigArgs $) {
        this.blockStorage = $.blockStorage;
        this.global = $.global;
        this.loadBalancer = $.loadBalancer;
        this.metadata = $.metadata;
        this.route = $.route;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCloudProviderOpenstackCloudConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderOpenstackCloudConfigArgs $;

        public Builder() {
            $ = new ClusterCloudProviderOpenstackCloudConfigArgs();
        }

        public Builder(ClusterCloudProviderOpenstackCloudConfigArgs defaults) {
            $ = new ClusterCloudProviderOpenstackCloudConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockStorage (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder blockStorage(@Nullable Output<ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs> blockStorage) {
            $.blockStorage = blockStorage;
            return this;
        }

        /**
         * @param blockStorage (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder blockStorage(ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs blockStorage) {
            return blockStorage(Output.of(blockStorage));
        }

        /**
         * @param global (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder global(Output<ClusterCloudProviderOpenstackCloudConfigGlobalArgs> global) {
            $.global = global;
            return this;
        }

        /**
         * @param global (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder global(ClusterCloudProviderOpenstackCloudConfigGlobalArgs global) {
            return global(Output.of(global));
        }

        /**
         * @param loadBalancer (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(@Nullable Output<ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs> loadBalancer) {
            $.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * @param loadBalancer (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs loadBalancer) {
            return loadBalancer(Output.of(loadBalancer));
        }

        /**
         * @param metadata (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ClusterCloudProviderOpenstackCloudConfigMetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder metadata(ClusterCloudProviderOpenstackCloudConfigMetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param route (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder route(@Nullable Output<ClusterCloudProviderOpenstackCloudConfigRouteArgs> route) {
            $.route = route;
            return this;
        }

        /**
         * @param route (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder route(ClusterCloudProviderOpenstackCloudConfigRouteArgs route) {
            return route(Output.of(route));
        }

        public ClusterCloudProviderOpenstackCloudConfigArgs build() {
            $.global = Objects.requireNonNull($.global, "expected parameter 'global' to be non-null");
            return $;
        }
    }

}