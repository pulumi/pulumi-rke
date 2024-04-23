// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderVsphereCloudProviderNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderVsphereCloudProviderNetworkArgs Empty = new ClusterCloudProviderVsphereCloudProviderNetworkArgs();

    @Import(name="publicNetwork")
    private @Nullable Output<String> publicNetwork;

    public Optional<Output<String>> publicNetwork() {
        return Optional.ofNullable(this.publicNetwork);
    }

    private ClusterCloudProviderVsphereCloudProviderNetworkArgs() {}

    private ClusterCloudProviderVsphereCloudProviderNetworkArgs(ClusterCloudProviderVsphereCloudProviderNetworkArgs $) {
        this.publicNetwork = $.publicNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCloudProviderVsphereCloudProviderNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderVsphereCloudProviderNetworkArgs $;

        public Builder() {
            $ = new ClusterCloudProviderVsphereCloudProviderNetworkArgs();
        }

        public Builder(ClusterCloudProviderVsphereCloudProviderNetworkArgs defaults) {
            $ = new ClusterCloudProviderVsphereCloudProviderNetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder publicNetwork(@Nullable Output<String> publicNetwork) {
            $.publicNetwork = publicNetwork;
            return this;
        }

        public Builder publicNetwork(String publicNetwork) {
            return publicNetwork(Output.of(publicNetwork));
        }

        public ClusterCloudProviderVsphereCloudProviderNetworkArgs build() {
            return $;
        }
    }

}
