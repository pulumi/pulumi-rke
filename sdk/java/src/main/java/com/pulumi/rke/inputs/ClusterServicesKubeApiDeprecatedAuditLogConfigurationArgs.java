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


public final class ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs Empty = new ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs();

    /**
     * Audit log format (string)
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Audit log format (string)
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Audit log max age (int)
     * 
     */
    @Import(name="maxAge")
    private @Nullable Output<Integer> maxAge;

    /**
     * @return Audit log max age (int)
     * 
     */
    public Optional<Output<Integer>> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    /**
     * Audit log max backup. Default: `10` (int)
     * 
     */
    @Import(name="maxBackup")
    private @Nullable Output<Integer> maxBackup;

    /**
     * @return Audit log max backup. Default: `10` (int)
     * 
     */
    public Optional<Output<Integer>> maxBackup() {
        return Optional.ofNullable(this.maxBackup);
    }

    /**
     * Audit log max size. Default: `100` (int)
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    /**
     * @return Audit log max size. Default: `100` (int)
     * 
     */
    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Audit policy json encoded definition. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;` fields are required in the json. Ex. `jsonencode({&#34;apiVersion&#34;:&#34;audit.k8s.io/v1&#34;,&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;:[{&#34;level&#34;:&#34;RequestResponse&#34;,&#34;resources&#34;:[{&#34;group&#34;:&#34;&#34;,&#34;resources&#34;:[&#34;pods&#34;]}]}]})` [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string)
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return Audit policy json encoded definition. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;` fields are required in the json. Ex. `jsonencode({&#34;apiVersion&#34;:&#34;audit.k8s.io/v1&#34;,&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;:[{&#34;level&#34;:&#34;RequestResponse&#34;,&#34;resources&#34;:[{&#34;group&#34;:&#34;&#34;,&#34;resources&#34;:[&#34;pods&#34;]}]}]})` [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string)
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs() {}

    private ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs(ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs $) {
        this.format = $.format;
        this.maxAge = $.maxAge;
        this.maxBackup = $.maxBackup;
        this.maxSize = $.maxSize;
        this.path = $.path;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs $;

        public Builder() {
            $ = new ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs();
        }

        public Builder(ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs defaults) {
            $ = new ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format Audit log format (string)
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Audit log format (string)
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param maxAge Audit log max age (int)
         * 
         * @return builder
         * 
         */
        public Builder maxAge(@Nullable Output<Integer> maxAge) {
            $.maxAge = maxAge;
            return this;
        }

        /**
         * @param maxAge Audit log max age (int)
         * 
         * @return builder
         * 
         */
        public Builder maxAge(Integer maxAge) {
            return maxAge(Output.of(maxAge));
        }

        /**
         * @param maxBackup Audit log max backup. Default: `10` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxBackup(@Nullable Output<Integer> maxBackup) {
            $.maxBackup = maxBackup;
            return this;
        }

        /**
         * @param maxBackup Audit log max backup. Default: `10` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxBackup(Integer maxBackup) {
            return maxBackup(Output.of(maxBackup));
        }

        /**
         * @param maxSize Audit log max size. Default: `100` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize Audit log max size. Default: `100` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param path Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param policy Audit policy json encoded definition. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;` fields are required in the json. Ex. `jsonencode({&#34;apiVersion&#34;:&#34;audit.k8s.io/v1&#34;,&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;:[{&#34;level&#34;:&#34;RequestResponse&#34;,&#34;resources&#34;:[{&#34;group&#34;:&#34;&#34;,&#34;resources&#34;:[&#34;pods&#34;]}]}]})` [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string)
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Audit policy json encoded definition. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;` fields are required in the json. Ex. `jsonencode({&#34;apiVersion&#34;:&#34;audit.k8s.io/v1&#34;,&#34;kind&#34;:&#34;Policy&#34;,&#34;rules&#34;:[{&#34;level&#34;:&#34;RequestResponse&#34;,&#34;resources&#34;:[{&#34;group&#34;:&#34;&#34;,&#34;resources&#34;:[&#34;pods&#34;]}]}]})` [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string)
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public ClusterServicesKubeApiDeprecatedAuditLogConfigurationArgs build() {
            return $;
        }
    }

}
