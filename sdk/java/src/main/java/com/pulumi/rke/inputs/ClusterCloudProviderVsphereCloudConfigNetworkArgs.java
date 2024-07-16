// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderVsphereCloudConfigNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderVsphereCloudConfigNetworkArgs Empty = new ClusterCloudProviderVsphereCloudConfigNetworkArgs();

    /**
     * (string)
     * 
     */
    @Import(name="publicNetwork")
    private @Nullable Output<String> publicNetwork;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> publicNetwork() {
        return Optional.ofNullable(this.publicNetwork);
    }

    private ClusterCloudProviderVsphereCloudConfigNetworkArgs() {}

    private ClusterCloudProviderVsphereCloudConfigNetworkArgs(ClusterCloudProviderVsphereCloudConfigNetworkArgs $) {
        this.publicNetwork = $.publicNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCloudProviderVsphereCloudConfigNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderVsphereCloudConfigNetworkArgs $;

        public Builder() {
            $ = new ClusterCloudProviderVsphereCloudConfigNetworkArgs();
        }

        public Builder(ClusterCloudProviderVsphereCloudConfigNetworkArgs defaults) {
            $ = new ClusterCloudProviderVsphereCloudConfigNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicNetwork (string)
         * 
         * @return builder
         * 
         */
        public Builder publicNetwork(@Nullable Output<String> publicNetwork) {
            $.publicNetwork = publicNetwork;
            return this;
        }

        /**
         * @param publicNetwork (string)
         * 
         * @return builder
         * 
         */
        public Builder publicNetwork(String publicNetwork) {
            return publicNetwork(Output.of(publicNetwork));
        }

        public ClusterCloudProviderVsphereCloudConfigNetworkArgs build() {
            return $;
        }
    }

}
