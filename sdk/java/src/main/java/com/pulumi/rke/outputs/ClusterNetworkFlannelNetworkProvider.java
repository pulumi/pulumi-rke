// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNetworkFlannelNetworkProvider {
    private @Nullable String iface;

    private ClusterNetworkFlannelNetworkProvider() {}
    public Optional<String> iface() {
        return Optional.ofNullable(this.iface);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNetworkFlannelNetworkProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String iface;
        public Builder() {}
        public Builder(ClusterNetworkFlannelNetworkProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iface = defaults.iface;
        }

        @CustomType.Setter
        public Builder iface(@Nullable String iface) {

            this.iface = iface;
            return this;
        }
        public ClusterNetworkFlannelNetworkProvider build() {
            final var _resultValue = new ClusterNetworkFlannelNetworkProvider();
            _resultValue.iface = iface;
            return _resultValue;
        }
    }
}
