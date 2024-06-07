// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderOpenstackCloudProviderMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderOpenstackCloudProviderMetadataArgs Empty = new ClusterCloudProviderOpenstackCloudProviderMetadataArgs();

    @Import(name="requestTimeout")
    private @Nullable Output<Integer> requestTimeout;

    public Optional<Output<Integer>> requestTimeout() {
        return Optional.ofNullable(this.requestTimeout);
    }

    @Import(name="searchOrder")
    private @Nullable Output<String> searchOrder;

    public Optional<Output<String>> searchOrder() {
        return Optional.ofNullable(this.searchOrder);
    }

    private ClusterCloudProviderOpenstackCloudProviderMetadataArgs() {}

    private ClusterCloudProviderOpenstackCloudProviderMetadataArgs(ClusterCloudProviderOpenstackCloudProviderMetadataArgs $) {
        this.requestTimeout = $.requestTimeout;
        this.searchOrder = $.searchOrder;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCloudProviderOpenstackCloudProviderMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderOpenstackCloudProviderMetadataArgs $;

        public Builder() {
            $ = new ClusterCloudProviderOpenstackCloudProviderMetadataArgs();
        }

        public Builder(ClusterCloudProviderOpenstackCloudProviderMetadataArgs defaults) {
            $ = new ClusterCloudProviderOpenstackCloudProviderMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder requestTimeout(@Nullable Output<Integer> requestTimeout) {
            $.requestTimeout = requestTimeout;
            return this;
        }

        public Builder requestTimeout(Integer requestTimeout) {
            return requestTimeout(Output.of(requestTimeout));
        }

        public Builder searchOrder(@Nullable Output<String> searchOrder) {
            $.searchOrder = searchOrder;
            return this;
        }

        public Builder searchOrder(String searchOrder) {
            return searchOrder(Output.of(searchOrder));
        }

        public ClusterCloudProviderOpenstackCloudProviderMetadataArgs build() {
            return $;
        }
    }

}