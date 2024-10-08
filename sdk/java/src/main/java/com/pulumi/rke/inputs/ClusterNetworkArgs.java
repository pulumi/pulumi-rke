// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rke.inputs.ClusterNetworkAciNetworkProviderArgs;
import com.pulumi.rke.inputs.ClusterNetworkCalicoNetworkProviderArgs;
import com.pulumi.rke.inputs.ClusterNetworkCanalNetworkProviderArgs;
import com.pulumi.rke.inputs.ClusterNetworkFlannelNetworkProviderArgs;
import com.pulumi.rke.inputs.ClusterNetworkWeaveNetworkProviderArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNetworkArgs Empty = new ClusterNetworkArgs();

    /**
     * Aci network provider config
     * 
     */
    @Import(name="aciNetworkProvider")
    private @Nullable Output<ClusterNetworkAciNetworkProviderArgs> aciNetworkProvider;

    /**
     * @return Aci network provider config
     * 
     */
    public Optional<Output<ClusterNetworkAciNetworkProviderArgs>> aciNetworkProvider() {
        return Optional.ofNullable(this.aciNetworkProvider);
    }

    /**
     * Calico network provider config
     * 
     */
    @Import(name="calicoNetworkProvider")
    private @Nullable Output<ClusterNetworkCalicoNetworkProviderArgs> calicoNetworkProvider;

    /**
     * @return Calico network provider config
     * 
     */
    public Optional<Output<ClusterNetworkCalicoNetworkProviderArgs>> calicoNetworkProvider() {
        return Optional.ofNullable(this.calicoNetworkProvider);
    }

    /**
     * Canal network provider config
     * 
     */
    @Import(name="canalNetworkProvider")
    private @Nullable Output<ClusterNetworkCanalNetworkProviderArgs> canalNetworkProvider;

    /**
     * @return Canal network provider config
     * 
     */
    public Optional<Output<ClusterNetworkCanalNetworkProviderArgs>> canalNetworkProvider() {
        return Optional.ofNullable(this.canalNetworkProvider);
    }

    /**
     * Flannel network provider config
     * 
     */
    @Import(name="flannelNetworkProvider")
    private @Nullable Output<ClusterNetworkFlannelNetworkProviderArgs> flannelNetworkProvider;

    /**
     * @return Flannel network provider config
     * 
     */
    public Optional<Output<ClusterNetworkFlannelNetworkProviderArgs>> flannelNetworkProvider() {
        return Optional.ofNullable(this.flannelNetworkProvider);
    }

    /**
     * Network provider MTU
     * 
     */
    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    /**
     * @return Network provider MTU
     * 
     */
    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
    }

    /**
     * Network provider options
     * 
     */
    @Import(name="options")
    private @Nullable Output<Map<String,String>> options;

    /**
     * @return Network provider options
     * 
     */
    public Optional<Output<Map<String,String>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Network provider plugin
     * 
     */
    @Import(name="plugin")
    private @Nullable Output<String> plugin;

    /**
     * @return Network provider plugin
     * 
     */
    public Optional<Output<String>> plugin() {
        return Optional.ofNullable(this.plugin);
    }

    /**
     * Weave network provider config
     * 
     */
    @Import(name="weaveNetworkProvider")
    private @Nullable Output<ClusterNetworkWeaveNetworkProviderArgs> weaveNetworkProvider;

    /**
     * @return Weave network provider config
     * 
     */
    public Optional<Output<ClusterNetworkWeaveNetworkProviderArgs>> weaveNetworkProvider() {
        return Optional.ofNullable(this.weaveNetworkProvider);
    }

    private ClusterNetworkArgs() {}

    private ClusterNetworkArgs(ClusterNetworkArgs $) {
        this.aciNetworkProvider = $.aciNetworkProvider;
        this.calicoNetworkProvider = $.calicoNetworkProvider;
        this.canalNetworkProvider = $.canalNetworkProvider;
        this.flannelNetworkProvider = $.flannelNetworkProvider;
        this.mtu = $.mtu;
        this.options = $.options;
        this.plugin = $.plugin;
        this.weaveNetworkProvider = $.weaveNetworkProvider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNetworkArgs $;

        public Builder() {
            $ = new ClusterNetworkArgs();
        }

        public Builder(ClusterNetworkArgs defaults) {
            $ = new ClusterNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aciNetworkProvider Aci network provider config
         * 
         * @return builder
         * 
         */
        public Builder aciNetworkProvider(@Nullable Output<ClusterNetworkAciNetworkProviderArgs> aciNetworkProvider) {
            $.aciNetworkProvider = aciNetworkProvider;
            return this;
        }

        /**
         * @param aciNetworkProvider Aci network provider config
         * 
         * @return builder
         * 
         */
        public Builder aciNetworkProvider(ClusterNetworkAciNetworkProviderArgs aciNetworkProvider) {
            return aciNetworkProvider(Output.of(aciNetworkProvider));
        }

        /**
         * @param calicoNetworkProvider Calico network provider config
         * 
         * @return builder
         * 
         */
        public Builder calicoNetworkProvider(@Nullable Output<ClusterNetworkCalicoNetworkProviderArgs> calicoNetworkProvider) {
            $.calicoNetworkProvider = calicoNetworkProvider;
            return this;
        }

        /**
         * @param calicoNetworkProvider Calico network provider config
         * 
         * @return builder
         * 
         */
        public Builder calicoNetworkProvider(ClusterNetworkCalicoNetworkProviderArgs calicoNetworkProvider) {
            return calicoNetworkProvider(Output.of(calicoNetworkProvider));
        }

        /**
         * @param canalNetworkProvider Canal network provider config
         * 
         * @return builder
         * 
         */
        public Builder canalNetworkProvider(@Nullable Output<ClusterNetworkCanalNetworkProviderArgs> canalNetworkProvider) {
            $.canalNetworkProvider = canalNetworkProvider;
            return this;
        }

        /**
         * @param canalNetworkProvider Canal network provider config
         * 
         * @return builder
         * 
         */
        public Builder canalNetworkProvider(ClusterNetworkCanalNetworkProviderArgs canalNetworkProvider) {
            return canalNetworkProvider(Output.of(canalNetworkProvider));
        }

        /**
         * @param flannelNetworkProvider Flannel network provider config
         * 
         * @return builder
         * 
         */
        public Builder flannelNetworkProvider(@Nullable Output<ClusterNetworkFlannelNetworkProviderArgs> flannelNetworkProvider) {
            $.flannelNetworkProvider = flannelNetworkProvider;
            return this;
        }

        /**
         * @param flannelNetworkProvider Flannel network provider config
         * 
         * @return builder
         * 
         */
        public Builder flannelNetworkProvider(ClusterNetworkFlannelNetworkProviderArgs flannelNetworkProvider) {
            return flannelNetworkProvider(Output.of(flannelNetworkProvider));
        }

        /**
         * @param mtu Network provider MTU
         * 
         * @return builder
         * 
         */
        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        /**
         * @param mtu Network provider MTU
         * 
         * @return builder
         * 
         */
        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        /**
         * @param options Network provider options
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Map<String,String>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Network provider options
         * 
         * @return builder
         * 
         */
        public Builder options(Map<String,String> options) {
            return options(Output.of(options));
        }

        /**
         * @param plugin Network provider plugin
         * 
         * @return builder
         * 
         */
        public Builder plugin(@Nullable Output<String> plugin) {
            $.plugin = plugin;
            return this;
        }

        /**
         * @param plugin Network provider plugin
         * 
         * @return builder
         * 
         */
        public Builder plugin(String plugin) {
            return plugin(Output.of(plugin));
        }

        /**
         * @param weaveNetworkProvider Weave network provider config
         * 
         * @return builder
         * 
         */
        public Builder weaveNetworkProvider(@Nullable Output<ClusterNetworkWeaveNetworkProviderArgs> weaveNetworkProvider) {
            $.weaveNetworkProvider = weaveNetworkProvider;
            return this;
        }

        /**
         * @param weaveNetworkProvider Weave network provider config
         * 
         * @return builder
         * 
         */
        public Builder weaveNetworkProvider(ClusterNetworkWeaveNetworkProviderArgs weaveNetworkProvider) {
            return weaveNetworkProvider(Output.of(weaveNetworkProvider));
        }

        public ClusterNetworkArgs build() {
            return $;
        }
    }

}
