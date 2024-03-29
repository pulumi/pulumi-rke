// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rke.outputs.ClusterUpgradeStrategyDrainInput;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterUpgradeStrategy {
    /**
     * @return RKE drain nodes (bool)
     * 
     */
    private @Nullable Boolean drain;
    /**
     * @return RKE drain node input (list Maxitems: 1)
     * 
     */
    private @Nullable ClusterUpgradeStrategyDrainInput drainInput;
    /**
     * @return RKE max unavailable controlplane nodes (string)
     * 
     */
    private @Nullable String maxUnavailableControlplane;
    /**
     * @return RKE max unavailable worker nodes (string)
     * 
     */
    private @Nullable String maxUnavailableWorker;

    private ClusterUpgradeStrategy() {}
    /**
     * @return RKE drain nodes (bool)
     * 
     */
    public Optional<Boolean> drain() {
        return Optional.ofNullable(this.drain);
    }
    /**
     * @return RKE drain node input (list Maxitems: 1)
     * 
     */
    public Optional<ClusterUpgradeStrategyDrainInput> drainInput() {
        return Optional.ofNullable(this.drainInput);
    }
    /**
     * @return RKE max unavailable controlplane nodes (string)
     * 
     */
    public Optional<String> maxUnavailableControlplane() {
        return Optional.ofNullable(this.maxUnavailableControlplane);
    }
    /**
     * @return RKE max unavailable worker nodes (string)
     * 
     */
    public Optional<String> maxUnavailableWorker() {
        return Optional.ofNullable(this.maxUnavailableWorker);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterUpgradeStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean drain;
        private @Nullable ClusterUpgradeStrategyDrainInput drainInput;
        private @Nullable String maxUnavailableControlplane;
        private @Nullable String maxUnavailableWorker;
        public Builder() {}
        public Builder(ClusterUpgradeStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drain = defaults.drain;
    	      this.drainInput = defaults.drainInput;
    	      this.maxUnavailableControlplane = defaults.maxUnavailableControlplane;
    	      this.maxUnavailableWorker = defaults.maxUnavailableWorker;
        }

        @CustomType.Setter
        public Builder drain(@Nullable Boolean drain) {

            this.drain = drain;
            return this;
        }
        @CustomType.Setter
        public Builder drainInput(@Nullable ClusterUpgradeStrategyDrainInput drainInput) {

            this.drainInput = drainInput;
            return this;
        }
        @CustomType.Setter
        public Builder maxUnavailableControlplane(@Nullable String maxUnavailableControlplane) {

            this.maxUnavailableControlplane = maxUnavailableControlplane;
            return this;
        }
        @CustomType.Setter
        public Builder maxUnavailableWorker(@Nullable String maxUnavailableWorker) {

            this.maxUnavailableWorker = maxUnavailableWorker;
            return this;
        }
        public ClusterUpgradeStrategy build() {
            final var _resultValue = new ClusterUpgradeStrategy();
            _resultValue.drain = drain;
            _resultValue.drainInput = drainInput;
            _resultValue.maxUnavailableControlplane = maxUnavailableControlplane;
            _resultValue.maxUnavailableWorker = maxUnavailableWorker;
            return _resultValue;
        }
    }
}
