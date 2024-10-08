// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rke.outputs.ClusterNetworkAciNetworkProvider;
import com.pulumi.rke.outputs.ClusterNetworkCalicoNetworkProvider;
import com.pulumi.rke.outputs.ClusterNetworkCanalNetworkProvider;
import com.pulumi.rke.outputs.ClusterNetworkFlannelNetworkProvider;
import com.pulumi.rke.outputs.ClusterNetworkWeaveNetworkProvider;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNetwork {
    /**
     * @return Aci network provider config
     * 
     */
    private @Nullable ClusterNetworkAciNetworkProvider aciNetworkProvider;
    /**
     * @return Calico network provider config
     * 
     */
    private @Nullable ClusterNetworkCalicoNetworkProvider calicoNetworkProvider;
    /**
     * @return Canal network provider config
     * 
     */
    private @Nullable ClusterNetworkCanalNetworkProvider canalNetworkProvider;
    /**
     * @return Flannel network provider config
     * 
     */
    private @Nullable ClusterNetworkFlannelNetworkProvider flannelNetworkProvider;
    /**
     * @return Network provider MTU
     * 
     */
    private @Nullable Integer mtu;
    /**
     * @return Network provider options
     * 
     */
    private @Nullable Map<String,String> options;
    /**
     * @return Network provider plugin
     * 
     */
    private @Nullable String plugin;
    /**
     * @return Weave network provider config
     * 
     */
    private @Nullable ClusterNetworkWeaveNetworkProvider weaveNetworkProvider;

    private ClusterNetwork() {}
    /**
     * @return Aci network provider config
     * 
     */
    public Optional<ClusterNetworkAciNetworkProvider> aciNetworkProvider() {
        return Optional.ofNullable(this.aciNetworkProvider);
    }
    /**
     * @return Calico network provider config
     * 
     */
    public Optional<ClusterNetworkCalicoNetworkProvider> calicoNetworkProvider() {
        return Optional.ofNullable(this.calicoNetworkProvider);
    }
    /**
     * @return Canal network provider config
     * 
     */
    public Optional<ClusterNetworkCanalNetworkProvider> canalNetworkProvider() {
        return Optional.ofNullable(this.canalNetworkProvider);
    }
    /**
     * @return Flannel network provider config
     * 
     */
    public Optional<ClusterNetworkFlannelNetworkProvider> flannelNetworkProvider() {
        return Optional.ofNullable(this.flannelNetworkProvider);
    }
    /**
     * @return Network provider MTU
     * 
     */
    public Optional<Integer> mtu() {
        return Optional.ofNullable(this.mtu);
    }
    /**
     * @return Network provider options
     * 
     */
    public Map<String,String> options() {
        return this.options == null ? Map.of() : this.options;
    }
    /**
     * @return Network provider plugin
     * 
     */
    public Optional<String> plugin() {
        return Optional.ofNullable(this.plugin);
    }
    /**
     * @return Weave network provider config
     * 
     */
    public Optional<ClusterNetworkWeaveNetworkProvider> weaveNetworkProvider() {
        return Optional.ofNullable(this.weaveNetworkProvider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterNetworkAciNetworkProvider aciNetworkProvider;
        private @Nullable ClusterNetworkCalicoNetworkProvider calicoNetworkProvider;
        private @Nullable ClusterNetworkCanalNetworkProvider canalNetworkProvider;
        private @Nullable ClusterNetworkFlannelNetworkProvider flannelNetworkProvider;
        private @Nullable Integer mtu;
        private @Nullable Map<String,String> options;
        private @Nullable String plugin;
        private @Nullable ClusterNetworkWeaveNetworkProvider weaveNetworkProvider;
        public Builder() {}
        public Builder(ClusterNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aciNetworkProvider = defaults.aciNetworkProvider;
    	      this.calicoNetworkProvider = defaults.calicoNetworkProvider;
    	      this.canalNetworkProvider = defaults.canalNetworkProvider;
    	      this.flannelNetworkProvider = defaults.flannelNetworkProvider;
    	      this.mtu = defaults.mtu;
    	      this.options = defaults.options;
    	      this.plugin = defaults.plugin;
    	      this.weaveNetworkProvider = defaults.weaveNetworkProvider;
        }

        @CustomType.Setter
        public Builder aciNetworkProvider(@Nullable ClusterNetworkAciNetworkProvider aciNetworkProvider) {

            this.aciNetworkProvider = aciNetworkProvider;
            return this;
        }
        @CustomType.Setter
        public Builder calicoNetworkProvider(@Nullable ClusterNetworkCalicoNetworkProvider calicoNetworkProvider) {

            this.calicoNetworkProvider = calicoNetworkProvider;
            return this;
        }
        @CustomType.Setter
        public Builder canalNetworkProvider(@Nullable ClusterNetworkCanalNetworkProvider canalNetworkProvider) {

            this.canalNetworkProvider = canalNetworkProvider;
            return this;
        }
        @CustomType.Setter
        public Builder flannelNetworkProvider(@Nullable ClusterNetworkFlannelNetworkProvider flannelNetworkProvider) {

            this.flannelNetworkProvider = flannelNetworkProvider;
            return this;
        }
        @CustomType.Setter
        public Builder mtu(@Nullable Integer mtu) {

            this.mtu = mtu;
            return this;
        }
        @CustomType.Setter
        public Builder options(@Nullable Map<String,String> options) {

            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder plugin(@Nullable String plugin) {

            this.plugin = plugin;
            return this;
        }
        @CustomType.Setter
        public Builder weaveNetworkProvider(@Nullable ClusterNetworkWeaveNetworkProvider weaveNetworkProvider) {

            this.weaveNetworkProvider = weaveNetworkProvider;
            return this;
        }
        public ClusterNetwork build() {
            final var _resultValue = new ClusterNetwork();
            _resultValue.aciNetworkProvider = aciNetworkProvider;
            _resultValue.calicoNetworkProvider = calicoNetworkProvider;
            _resultValue.canalNetworkProvider = canalNetworkProvider;
            _resultValue.flannelNetworkProvider = flannelNetworkProvider;
            _resultValue.mtu = mtu;
            _resultValue.options = options;
            _resultValue.plugin = plugin;
            _resultValue.weaveNetworkProvider = weaveNetworkProvider;
            return _resultValue;
        }
    }
}
