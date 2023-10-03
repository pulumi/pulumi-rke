// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rke.inputs.ClusterServicesKubeApiAuditLogConfigurationArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterServicesKubeApiAuditLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesKubeApiAuditLogArgs Empty = new ClusterServicesKubeApiAuditLogArgs();

    /**
     * Event rate limit yaml encoded configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Configuration&#34;` fields are required in the yaml. Ex. `apiVersion: eventratelimit.admission.k8s.io/v1alpha1\nkind: Configuration\nlimits:\n- type: Server\n  burst: 30000\n  qps: 6000\n` [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string)
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<ClusterServicesKubeApiAuditLogConfigurationArgs> configuration;

    /**
     * @return Event rate limit yaml encoded configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Configuration&#34;` fields are required in the yaml. Ex. `apiVersion: eventratelimit.admission.k8s.io/v1alpha1\nkind: Configuration\nlimits:\n- type: Server\n  burst: 30000\n  qps: 6000\n` [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string)
     * 
     */
    public Optional<Output<ClusterServicesKubeApiAuditLogConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Enable secrets encryption (bool)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable secrets encryption (bool)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ClusterServicesKubeApiAuditLogArgs() {}

    private ClusterServicesKubeApiAuditLogArgs(ClusterServicesKubeApiAuditLogArgs $) {
        this.configuration = $.configuration;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterServicesKubeApiAuditLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesKubeApiAuditLogArgs $;

        public Builder() {
            $ = new ClusterServicesKubeApiAuditLogArgs();
        }

        public Builder(ClusterServicesKubeApiAuditLogArgs defaults) {
            $ = new ClusterServicesKubeApiAuditLogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration Event rate limit yaml encoded configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Configuration&#34;` fields are required in the yaml. Ex. `apiVersion: eventratelimit.admission.k8s.io/v1alpha1\nkind: Configuration\nlimits:\n- type: Server\n  burst: 30000\n  qps: 6000\n` [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string)
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<ClusterServicesKubeApiAuditLogConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Event rate limit yaml encoded configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Configuration&#34;` fields are required in the yaml. Ex. `apiVersion: eventratelimit.admission.k8s.io/v1alpha1\nkind: Configuration\nlimits:\n- type: Server\n  burst: 30000\n  qps: 6000\n` [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string)
         * 
         * @return builder
         * 
         */
        public Builder configuration(ClusterServicesKubeApiAuditLogConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param enabled Enable secrets encryption (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable secrets encryption (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterServicesKubeApiAuditLogArgs build() {
            return $;
        }
    }

}
