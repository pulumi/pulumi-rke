// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rke.outputs.ClusterCloudProviderOpenstackCloudProviderBlockStorage;
import com.pulumi.rke.outputs.ClusterCloudProviderOpenstackCloudProviderGlobal;
import com.pulumi.rke.outputs.ClusterCloudProviderOpenstackCloudProviderLoadBalancer;
import com.pulumi.rke.outputs.ClusterCloudProviderOpenstackCloudProviderMetadata;
import com.pulumi.rke.outputs.ClusterCloudProviderOpenstackCloudProviderRoute;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudProviderOpenstackCloudProvider {
    private @Nullable ClusterCloudProviderOpenstackCloudProviderBlockStorage blockStorage;
    private ClusterCloudProviderOpenstackCloudProviderGlobal global;
    private @Nullable ClusterCloudProviderOpenstackCloudProviderLoadBalancer loadBalancer;
    private @Nullable ClusterCloudProviderOpenstackCloudProviderMetadata metadata;
    private @Nullable ClusterCloudProviderOpenstackCloudProviderRoute route;

    private ClusterCloudProviderOpenstackCloudProvider() {}
    public Optional<ClusterCloudProviderOpenstackCloudProviderBlockStorage> blockStorage() {
        return Optional.ofNullable(this.blockStorage);
    }
    public ClusterCloudProviderOpenstackCloudProviderGlobal global() {
        return this.global;
    }
    public Optional<ClusterCloudProviderOpenstackCloudProviderLoadBalancer> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }
    public Optional<ClusterCloudProviderOpenstackCloudProviderMetadata> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<ClusterCloudProviderOpenstackCloudProviderRoute> route() {
        return Optional.ofNullable(this.route);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderOpenstackCloudProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterCloudProviderOpenstackCloudProviderBlockStorage blockStorage;
        private ClusterCloudProviderOpenstackCloudProviderGlobal global;
        private @Nullable ClusterCloudProviderOpenstackCloudProviderLoadBalancer loadBalancer;
        private @Nullable ClusterCloudProviderOpenstackCloudProviderMetadata metadata;
        private @Nullable ClusterCloudProviderOpenstackCloudProviderRoute route;
        public Builder() {}
        public Builder(ClusterCloudProviderOpenstackCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockStorage = defaults.blockStorage;
    	      this.global = defaults.global;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.metadata = defaults.metadata;
    	      this.route = defaults.route;
        }

        @CustomType.Setter
        public Builder blockStorage(@Nullable ClusterCloudProviderOpenstackCloudProviderBlockStorage blockStorage) {

            this.blockStorage = blockStorage;
            return this;
        }
        @CustomType.Setter
        public Builder global(ClusterCloudProviderOpenstackCloudProviderGlobal global) {
            if (global == null) {
              throw new MissingRequiredPropertyException("ClusterCloudProviderOpenstackCloudProvider", "global");
            }
            this.global = global;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancer(@Nullable ClusterCloudProviderOpenstackCloudProviderLoadBalancer loadBalancer) {

            this.loadBalancer = loadBalancer;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable ClusterCloudProviderOpenstackCloudProviderMetadata metadata) {

            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder route(@Nullable ClusterCloudProviderOpenstackCloudProviderRoute route) {

            this.route = route;
            return this;
        }
        public ClusterCloudProviderOpenstackCloudProvider build() {
            final var _resultValue = new ClusterCloudProviderOpenstackCloudProvider();
            _resultValue.blockStorage = blockStorage;
            _resultValue.global = global;
            _resultValue.loadBalancer = loadBalancer;
            _resultValue.metadata = metadata;
            _resultValue.route = route;
            return _resultValue;
        }
    }
}
