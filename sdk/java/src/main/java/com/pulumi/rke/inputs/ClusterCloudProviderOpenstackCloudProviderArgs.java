// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rke.inputs.ClusterCloudProviderOpenstackCloudProviderBlockStorageArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderOpenstackCloudProviderGlobalArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderOpenstackCloudProviderLoadBalancerArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderOpenstackCloudProviderMetadataArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderOpenstackCloudProviderRouteArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderOpenstackCloudProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderOpenstackCloudProviderArgs Empty = new ClusterCloudProviderOpenstackCloudProviderArgs();

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="blockStorage")
    private @Nullable Output<ClusterCloudProviderOpenstackCloudProviderBlockStorageArgs> blockStorage;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterCloudProviderOpenstackCloudProviderBlockStorageArgs>> blockStorage() {
        return Optional.ofNullable(this.blockStorage);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="global", required=true)
    private Output<ClusterCloudProviderOpenstackCloudProviderGlobalArgs> global;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Output<ClusterCloudProviderOpenstackCloudProviderGlobalArgs> global() {
        return this.global;
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="loadBalancer")
    private @Nullable Output<ClusterCloudProviderOpenstackCloudProviderLoadBalancerArgs> loadBalancer;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterCloudProviderOpenstackCloudProviderLoadBalancerArgs>> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ClusterCloudProviderOpenstackCloudProviderMetadataArgs> metadata;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterCloudProviderOpenstackCloudProviderMetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="route")
    private @Nullable Output<ClusterCloudProviderOpenstackCloudProviderRouteArgs> route;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterCloudProviderOpenstackCloudProviderRouteArgs>> route() {
        return Optional.ofNullable(this.route);
    }

    private ClusterCloudProviderOpenstackCloudProviderArgs() {}

    private ClusterCloudProviderOpenstackCloudProviderArgs(ClusterCloudProviderOpenstackCloudProviderArgs $) {
        this.blockStorage = $.blockStorage;
        this.global = $.global;
        this.loadBalancer = $.loadBalancer;
        this.metadata = $.metadata;
        this.route = $.route;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCloudProviderOpenstackCloudProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderOpenstackCloudProviderArgs $;

        public Builder() {
            $ = new ClusterCloudProviderOpenstackCloudProviderArgs();
        }

        public Builder(ClusterCloudProviderOpenstackCloudProviderArgs defaults) {
            $ = new ClusterCloudProviderOpenstackCloudProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockStorage (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder blockStorage(@Nullable Output<ClusterCloudProviderOpenstackCloudProviderBlockStorageArgs> blockStorage) {
            $.blockStorage = blockStorage;
            return this;
        }

        /**
         * @param blockStorage (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder blockStorage(ClusterCloudProviderOpenstackCloudProviderBlockStorageArgs blockStorage) {
            return blockStorage(Output.of(blockStorage));
        }

        /**
         * @param global (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder global(Output<ClusterCloudProviderOpenstackCloudProviderGlobalArgs> global) {
            $.global = global;
            return this;
        }

        /**
         * @param global (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder global(ClusterCloudProviderOpenstackCloudProviderGlobalArgs global) {
            return global(Output.of(global));
        }

        /**
         * @param loadBalancer (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(@Nullable Output<ClusterCloudProviderOpenstackCloudProviderLoadBalancerArgs> loadBalancer) {
            $.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * @param loadBalancer (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(ClusterCloudProviderOpenstackCloudProviderLoadBalancerArgs loadBalancer) {
            return loadBalancer(Output.of(loadBalancer));
        }

        /**
         * @param metadata (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ClusterCloudProviderOpenstackCloudProviderMetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder metadata(ClusterCloudProviderOpenstackCloudProviderMetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param route (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder route(@Nullable Output<ClusterCloudProviderOpenstackCloudProviderRouteArgs> route) {
            $.route = route;
            return this;
        }

        /**
         * @param route (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder route(ClusterCloudProviderOpenstackCloudProviderRouteArgs route) {
            return route(Output.of(route));
        }

        public ClusterCloudProviderOpenstackCloudProviderArgs build() {
            if ($.global == null) {
                throw new MissingRequiredPropertyException("ClusterCloudProviderOpenstackCloudProviderArgs", "global");
            }
            return $;
        }
    }

}
