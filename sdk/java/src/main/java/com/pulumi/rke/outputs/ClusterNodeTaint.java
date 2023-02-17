// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNodeTaint {
    /**
     * @return Taint effect. `NoExecute`, `NoSchedule` (default) and `PreferNoSchedule` are supported (string)
     * 
     */
    private @Nullable String effect;
    /**
     * @return TLS key for etcd service (string)
     * 
     */
    private String key;
    /**
     * @return Taint value (string)
     * 
     */
    private String value;

    private ClusterNodeTaint() {}
    /**
     * @return Taint effect. `NoExecute`, `NoSchedule` (default) and `PreferNoSchedule` are supported (string)
     * 
     */
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    /**
     * @return TLS key for etcd service (string)
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Taint value (string)
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String effect;
        private String key;
        private String value;
        public Builder() {}
        public Builder(ClusterNodeTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ClusterNodeTaint build() {
            final var o = new ClusterNodeTaint();
            o.effect = effect;
            o.key = key;
            o.value = value;
            return o;
        }
    }
}