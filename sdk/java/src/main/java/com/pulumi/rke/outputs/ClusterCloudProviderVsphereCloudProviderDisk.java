// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudProviderVsphereCloudProviderDisk {
    /**
     * @return (string)
     * 
     */
    private @Nullable String scsiControllerType;

    private ClusterCloudProviderVsphereCloudProviderDisk() {}
    /**
     * @return (string)
     * 
     */
    public Optional<String> scsiControllerType() {
        return Optional.ofNullable(this.scsiControllerType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderVsphereCloudProviderDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String scsiControllerType;
        public Builder() {}
        public Builder(ClusterCloudProviderVsphereCloudProviderDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scsiControllerType = defaults.scsiControllerType;
        }

        @CustomType.Setter
        public Builder scsiControllerType(@Nullable String scsiControllerType) {
            this.scsiControllerType = scsiControllerType;
            return this;
        }
        public ClusterCloudProviderVsphereCloudProviderDisk build() {
            final var o = new ClusterCloudProviderVsphereCloudProviderDisk();
            o.scsiControllerType = scsiControllerType;
            return o;
        }
    }
}
