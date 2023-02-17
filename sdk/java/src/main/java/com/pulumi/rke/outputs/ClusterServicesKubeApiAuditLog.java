// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rke.outputs.ClusterServicesKubeApiAuditLogConfiguration;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterServicesKubeApiAuditLog {
    /**
     * @return Event rate limit yaml encoded configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Configuration&#34;` fields are required in the yaml. Ex. `apiVersion: eventratelimit.admission.k8s.io/v1alpha1\nkind: Configuration\nlimits:\n- type: Server\n  burst: 30000\n  qps: 6000\n` [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string)
     * 
     */
    private @Nullable ClusterServicesKubeApiAuditLogConfiguration configuration;
    /**
     * @return Enable secrets encryption (bool)
     * 
     */
    private @Nullable Boolean enabled;

    private ClusterServicesKubeApiAuditLog() {}
    /**
     * @return Event rate limit yaml encoded configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Configuration&#34;` fields are required in the yaml. Ex. `apiVersion: eventratelimit.admission.k8s.io/v1alpha1\nkind: Configuration\nlimits:\n- type: Server\n  burst: 30000\n  qps: 6000\n` [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string)
     * 
     */
    public Optional<ClusterServicesKubeApiAuditLogConfiguration> configuration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * @return Enable secrets encryption (bool)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterServicesKubeApiAuditLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterServicesKubeApiAuditLogConfiguration configuration;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ClusterServicesKubeApiAuditLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder configuration(@Nullable ClusterServicesKubeApiAuditLogConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public ClusterServicesKubeApiAuditLog build() {
            final var o = new ClusterServicesKubeApiAuditLog();
            o.configuration = configuration;
            o.enabled = enabled;
            return o;
        }
    }
}