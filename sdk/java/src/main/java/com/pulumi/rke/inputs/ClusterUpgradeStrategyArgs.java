// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rke.inputs.ClusterUpgradeStrategyDrainInputArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterUpgradeStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterUpgradeStrategyArgs Empty = new ClusterUpgradeStrategyArgs();

    @Import(name="drain")
    private @Nullable Output<Boolean> drain;

    public Optional<Output<Boolean>> drain() {
        return Optional.ofNullable(this.drain);
    }

    @Import(name="drainInput")
    private @Nullable Output<ClusterUpgradeStrategyDrainInputArgs> drainInput;

    public Optional<Output<ClusterUpgradeStrategyDrainInputArgs>> drainInput() {
        return Optional.ofNullable(this.drainInput);
    }

    @Import(name="maxUnavailableControlplane")
    private @Nullable Output<String> maxUnavailableControlplane;

    public Optional<Output<String>> maxUnavailableControlplane() {
        return Optional.ofNullable(this.maxUnavailableControlplane);
    }

    @Import(name="maxUnavailableWorker")
    private @Nullable Output<String> maxUnavailableWorker;

    public Optional<Output<String>> maxUnavailableWorker() {
        return Optional.ofNullable(this.maxUnavailableWorker);
    }

    private ClusterUpgradeStrategyArgs() {}

    private ClusterUpgradeStrategyArgs(ClusterUpgradeStrategyArgs $) {
        this.drain = $.drain;
        this.drainInput = $.drainInput;
        this.maxUnavailableControlplane = $.maxUnavailableControlplane;
        this.maxUnavailableWorker = $.maxUnavailableWorker;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterUpgradeStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterUpgradeStrategyArgs $;

        public Builder() {
            $ = new ClusterUpgradeStrategyArgs();
        }

        public Builder(ClusterUpgradeStrategyArgs defaults) {
            $ = new ClusterUpgradeStrategyArgs(Objects.requireNonNull(defaults));
        }

        public Builder drain(@Nullable Output<Boolean> drain) {
            $.drain = drain;
            return this;
        }

        public Builder drain(Boolean drain) {
            return drain(Output.of(drain));
        }

        public Builder drainInput(@Nullable Output<ClusterUpgradeStrategyDrainInputArgs> drainInput) {
            $.drainInput = drainInput;
            return this;
        }

        public Builder drainInput(ClusterUpgradeStrategyDrainInputArgs drainInput) {
            return drainInput(Output.of(drainInput));
        }

        public Builder maxUnavailableControlplane(@Nullable Output<String> maxUnavailableControlplane) {
            $.maxUnavailableControlplane = maxUnavailableControlplane;
            return this;
        }

        public Builder maxUnavailableControlplane(String maxUnavailableControlplane) {
            return maxUnavailableControlplane(Output.of(maxUnavailableControlplane));
        }

        public Builder maxUnavailableWorker(@Nullable Output<String> maxUnavailableWorker) {
            $.maxUnavailableWorker = maxUnavailableWorker;
            return this;
        }

        public Builder maxUnavailableWorker(String maxUnavailableWorker) {
            return maxUnavailableWorker(Output.of(maxUnavailableWorker));
        }

        public ClusterUpgradeStrategyArgs build() {
            return $;
        }
    }

}
