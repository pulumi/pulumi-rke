// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAuthorization {
    /**
     * @return RKE mode for authorization. `rbac` and `none` modes are available. Default `rbac` (string)
     * 
     */
    private @Nullable String mode;
    /**
     * @return Authorization mode options
     * 
     */
    private @Nullable Map<String,Object> options;

    private ClusterAuthorization() {}
    /**
     * @return RKE mode for authorization. `rbac` and `none` modes are available. Default `rbac` (string)
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Authorization mode options
     * 
     */
    public Map<String,Object> options() {
        return this.options == null ? Map.of() : this.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAuthorization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mode;
        private @Nullable Map<String,Object> options;
        public Builder() {}
        public Builder(ClusterAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.options = defaults.options;
        }

        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder options(@Nullable Map<String,Object> options) {

            this.options = options;
            return this;
        }
        public ClusterAuthorization build() {
            final var _resultValue = new ClusterAuthorization();
            _resultValue.mode = mode;
            _resultValue.options = options;
            return _resultValue;
        }
    }
}
