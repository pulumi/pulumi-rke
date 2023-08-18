// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRestore {
    /**
     * @return RKE k8s cluster restore configuration (list maxitems:1)
     * 
     */
    private @Nullable Boolean restore;
    /**
     * @return Snapshot name (string)
     * 
     */
    private @Nullable String snapshotName;

    private ClusterRestore() {}
    /**
     * @return RKE k8s cluster restore configuration (list maxitems:1)
     * 
     */
    public Optional<Boolean> restore() {
        return Optional.ofNullable(this.restore);
    }
    /**
     * @return Snapshot name (string)
     * 
     */
    public Optional<String> snapshotName() {
        return Optional.ofNullable(this.snapshotName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRestore defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean restore;
        private @Nullable String snapshotName;
        public Builder() {}
        public Builder(ClusterRestore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.restore = defaults.restore;
    	      this.snapshotName = defaults.snapshotName;
        }

        @CustomType.Setter
        public Builder restore(@Nullable Boolean restore) {
            this.restore = restore;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotName(@Nullable String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public ClusterRestore build() {
            final var o = new ClusterRestore();
            o.restore = restore;
            o.snapshotName = snapshotName;
            return o;
        }
    }
}
