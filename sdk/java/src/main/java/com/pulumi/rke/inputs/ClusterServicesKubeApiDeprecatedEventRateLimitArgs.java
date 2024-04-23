// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterServicesKubeApiDeprecatedEventRateLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesKubeApiDeprecatedEventRateLimitArgs Empty = new ClusterServicesKubeApiDeprecatedEventRateLimitArgs();

    @Import(name="configuration")
    private @Nullable Output<String> configuration;

    public Optional<Output<String>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ClusterServicesKubeApiDeprecatedEventRateLimitArgs() {}

    private ClusterServicesKubeApiDeprecatedEventRateLimitArgs(ClusterServicesKubeApiDeprecatedEventRateLimitArgs $) {
        this.configuration = $.configuration;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterServicesKubeApiDeprecatedEventRateLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesKubeApiDeprecatedEventRateLimitArgs $;

        public Builder() {
            $ = new ClusterServicesKubeApiDeprecatedEventRateLimitArgs();
        }

        public Builder(ClusterServicesKubeApiDeprecatedEventRateLimitArgs defaults) {
            $ = new ClusterServicesKubeApiDeprecatedEventRateLimitArgs(Objects.requireNonNull(defaults));
        }

        public Builder configuration(@Nullable Output<String> configuration) {
            $.configuration = configuration;
            return this;
        }

        public Builder configuration(String configuration) {
            return configuration(Output.of(configuration));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterServicesKubeApiDeprecatedEventRateLimitArgs build() {
            return $;
        }
    }

}
