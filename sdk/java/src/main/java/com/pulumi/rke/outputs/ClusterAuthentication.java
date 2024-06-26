// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rke.outputs.ClusterAuthenticationWebhook;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAuthentication {
    /**
     * @return List of additional hostnames and IPs to include in the api server PKI cert
     * 
     */
    private @Nullable List<String> sans;
    /**
     * @return Authentication strategy that will be used in RKE k8s cluster
     * 
     */
    private @Nullable String strategy;
    /**
     * @return Webhook configuration options
     * 
     */
    private @Nullable ClusterAuthenticationWebhook webhook;

    private ClusterAuthentication() {}
    /**
     * @return List of additional hostnames and IPs to include in the api server PKI cert
     * 
     */
    public List<String> sans() {
        return this.sans == null ? List.of() : this.sans;
    }
    /**
     * @return Authentication strategy that will be used in RKE k8s cluster
     * 
     */
    public Optional<String> strategy() {
        return Optional.ofNullable(this.strategy);
    }
    /**
     * @return Webhook configuration options
     * 
     */
    public Optional<ClusterAuthenticationWebhook> webhook() {
        return Optional.ofNullable(this.webhook);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> sans;
        private @Nullable String strategy;
        private @Nullable ClusterAuthenticationWebhook webhook;
        public Builder() {}
        public Builder(ClusterAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sans = defaults.sans;
    	      this.strategy = defaults.strategy;
    	      this.webhook = defaults.webhook;
        }

        @CustomType.Setter
        public Builder sans(@Nullable List<String> sans) {

            this.sans = sans;
            return this;
        }
        public Builder sans(String... sans) {
            return sans(List.of(sans));
        }
        @CustomType.Setter
        public Builder strategy(@Nullable String strategy) {

            this.strategy = strategy;
            return this;
        }
        @CustomType.Setter
        public Builder webhook(@Nullable ClusterAuthenticationWebhook webhook) {

            this.webhook = webhook;
            return this;
        }
        public ClusterAuthentication build() {
            final var _resultValue = new ClusterAuthentication();
            _resultValue.sans = sans;
            _resultValue.strategy = strategy;
            _resultValue.webhook = webhook;
            return _resultValue;
        }
    }
}
