// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderOpenstackCloudConfigRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderOpenstackCloudConfigRouteArgs Empty = new ClusterCloudProviderOpenstackCloudConfigRouteArgs();

    @Import(name="routerId")
    private @Nullable Output<String> routerId;

    public Optional<Output<String>> routerId() {
        return Optional.ofNullable(this.routerId);
    }

    private ClusterCloudProviderOpenstackCloudConfigRouteArgs() {}

    private ClusterCloudProviderOpenstackCloudConfigRouteArgs(ClusterCloudProviderOpenstackCloudConfigRouteArgs $) {
        this.routerId = $.routerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCloudProviderOpenstackCloudConfigRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderOpenstackCloudConfigRouteArgs $;

        public Builder() {
            $ = new ClusterCloudProviderOpenstackCloudConfigRouteArgs();
        }

        public Builder(ClusterCloudProviderOpenstackCloudConfigRouteArgs defaults) {
            $ = new ClusterCloudProviderOpenstackCloudConfigRouteArgs(Objects.requireNonNull(defaults));
        }

        public Builder routerId(@Nullable Output<String> routerId) {
            $.routerId = routerId;
            return this;
        }

        public Builder routerId(String routerId) {
            return routerId(Output.of(routerId));
        }

        public ClusterCloudProviderOpenstackCloudConfigRouteArgs build() {
            return $;
        }
    }

}
