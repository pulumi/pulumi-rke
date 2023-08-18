// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNetworkCalicoNetworkProvider {
    /**
     * @return RKE k8s cluster cloud provider configuration [rke-cloud-providers](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/) (list maxitems:1)
     * 
     */
    private @Nullable String cloudProvider;

    private ClusterNetworkCalicoNetworkProvider() {}
    /**
     * @return RKE k8s cluster cloud provider configuration [rke-cloud-providers](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/) (list maxitems:1)
     * 
     */
    public Optional<String> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNetworkCalicoNetworkProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cloudProvider;
        public Builder() {}
        public Builder(ClusterNetworkCalicoNetworkProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
        }

        @CustomType.Setter
        public Builder cloudProvider(@Nullable String cloudProvider) {
            this.cloudProvider = cloudProvider;
            return this;
        }
        public ClusterNetworkCalicoNetworkProvider build() {
            final var o = new ClusterNetworkCalicoNetworkProvider();
            o.cloudProvider = cloudProvider;
            return o;
        }
    }
}
