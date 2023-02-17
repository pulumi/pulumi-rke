// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudProviderVsphereCloudConfigNetwork {
    /**
     * @return (string)
     * 
     */
    private @Nullable String publicNetwork;

    private ClusterCloudProviderVsphereCloudConfigNetwork() {}
    /**
     * @return (string)
     * 
     */
    public Optional<String> publicNetwork() {
        return Optional.ofNullable(this.publicNetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderVsphereCloudConfigNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String publicNetwork;
        public Builder() {}
        public Builder(ClusterCloudProviderVsphereCloudConfigNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicNetwork = defaults.publicNetwork;
        }

        @CustomType.Setter
        public Builder publicNetwork(@Nullable String publicNetwork) {
            this.publicNetwork = publicNetwork;
            return this;
        }
        public ClusterCloudProviderVsphereCloudConfigNetwork build() {
            final var o = new ClusterCloudProviderVsphereCloudConfigNetwork();
            o.publicNetwork = publicNetwork;
            return o;
        }
    }
}