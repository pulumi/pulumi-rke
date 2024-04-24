// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rke.inputs.ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterServicesKubeApiDeprecatedAuditLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesKubeApiDeprecatedAuditLogArgs Empty = new ClusterServicesKubeApiDeprecatedAuditLogArgs();

    @Import(name="configuration")
    private @Nullable Output<ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs> configuration;

    public Optional<Output<ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ClusterServicesKubeApiDeprecatedAuditLogArgs() {}

    private ClusterServicesKubeApiDeprecatedAuditLogArgs(ClusterServicesKubeApiDeprecatedAuditLogArgs $) {
        this.configuration = $.configuration;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterServicesKubeApiDeprecatedAuditLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesKubeApiDeprecatedAuditLogArgs $;

        public Builder() {
            $ = new ClusterServicesKubeApiDeprecatedAuditLogArgs();
        }

        public Builder(ClusterServicesKubeApiDeprecatedAuditLogArgs defaults) {
            $ = new ClusterServicesKubeApiDeprecatedAuditLogArgs(Objects.requireNonNull(defaults));
        }

        public Builder configuration(@Nullable Output<ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        public Builder configuration(ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterServicesKubeApiDeprecatedAuditLogArgs build() {
            return $;
        }
    }

}
