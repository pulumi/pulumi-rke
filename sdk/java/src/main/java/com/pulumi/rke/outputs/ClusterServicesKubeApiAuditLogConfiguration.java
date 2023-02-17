// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterServicesKubeApiAuditLogConfiguration {
    /**
     * @return Audit log format (string)
     * 
     */
    private @Nullable String format;
    /**
     * @return Audit log max age (int)
     * 
     */
    private @Nullable Integer maxAge;
    /**
     * @return Audit log max backup. Default: `10` (int)
     * 
     */
    private @Nullable Integer maxBackup;
    /**
     * @return Audit log max size. Default: `100` (int)
     * 
     */
    private @Nullable Integer maxSize;
    /**
     * @return Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
     * 
     */
    private @Nullable String path;
    /**
     * @return Audit policy json encoded definition. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;` fields are required in the json. Ex. `jsonencode({&#34;apiVersion&#34;:&#34;audit.k8s.io/v1&#34;,&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;:[{&#34;level&#34;:&#34;RequestResponse&#34;,&#34;resources&#34;:[{&#34;group&#34;:&#34;&#34;,&#34;resources&#34;:[&#34;pods&#34;]}]}]})` [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string)
     * 
     */
    private @Nullable String policy;

    private ClusterServicesKubeApiAuditLogConfiguration() {}
    /**
     * @return Audit log format (string)
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * @return Audit log max age (int)
     * 
     */
    public Optional<Integer> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }
    /**
     * @return Audit log max backup. Default: `10` (int)
     * 
     */
    public Optional<Integer> maxBackup() {
        return Optional.ofNullable(this.maxBackup);
    }
    /**
     * @return Audit log max size. Default: `100` (int)
     * 
     */
    public Optional<Integer> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }
    /**
     * @return Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Audit policy json encoded definition. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;` fields are required in the json. Ex. `jsonencode({&#34;apiVersion&#34;:&#34;audit.k8s.io/v1&#34;,&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;:[{&#34;level&#34;:&#34;RequestResponse&#34;,&#34;resources&#34;:[{&#34;group&#34;:&#34;&#34;,&#34;resources&#34;:[&#34;pods&#34;]}]}]})` [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string)
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterServicesKubeApiAuditLogConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String format;
        private @Nullable Integer maxAge;
        private @Nullable Integer maxBackup;
        private @Nullable Integer maxSize;
        private @Nullable String path;
        private @Nullable String policy;
        public Builder() {}
        public Builder(ClusterServicesKubeApiAuditLogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.maxAge = defaults.maxAge;
    	      this.maxBackup = defaults.maxBackup;
    	      this.maxSize = defaults.maxSize;
    	      this.path = defaults.path;
    	      this.policy = defaults.policy;
        }

        @CustomType.Setter
        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        @CustomType.Setter
        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        @CustomType.Setter
        public Builder maxBackup(@Nullable Integer maxBackup) {
            this.maxBackup = maxBackup;
            return this;
        }
        @CustomType.Setter
        public Builder maxSize(@Nullable Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder policy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }
        public ClusterServicesKubeApiAuditLogConfiguration build() {
            final var o = new ClusterServicesKubeApiAuditLogConfiguration();
            o.format = format;
            o.maxAge = maxAge;
            o.maxBackup = maxBackup;
            o.maxSize = maxSize;
            o.path = path;
            o.policy = policy;
            return o;
        }
    }
}