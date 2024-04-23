// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterControlPlaneHost {
    private @Nullable String address;
    private @Nullable String nodeName;

    private ClusterControlPlaneHost() {}
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    public Optional<String> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterControlPlaneHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String nodeName;
        public Builder() {}
        public Builder(ClusterControlPlaneHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.nodeName = defaults.nodeName;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(@Nullable String nodeName) {

            this.nodeName = nodeName;
            return this;
        }
        public ClusterControlPlaneHost build() {
            final var _resultValue = new ClusterControlPlaneHost();
            _resultValue.address = address;
            _resultValue.nodeName = nodeName;
            return _resultValue;
        }
    }
}
