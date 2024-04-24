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


public final class ClusterServicesKubeApiAuditLogConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesKubeApiAuditLogConfigurationArgs Empty = new ClusterServicesKubeApiAuditLogConfigurationArgs();

    @Import(name="format")
    private @Nullable Output<String> format;

    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    @Import(name="maxAge")
    private @Nullable Output<Integer> maxAge;

    public Optional<Output<Integer>> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    @Import(name="maxBackup")
    private @Nullable Output<Integer> maxBackup;

    public Optional<Output<Integer>> maxBackup() {
        return Optional.ofNullable(this.maxBackup);
    }

    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    @Import(name="policy")
    private @Nullable Output<String> policy;

    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private ClusterServicesKubeApiAuditLogConfigurationArgs() {}

    private ClusterServicesKubeApiAuditLogConfigurationArgs(ClusterServicesKubeApiAuditLogConfigurationArgs $) {
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
    public static Builder builder(ClusterServicesKubeApiAuditLogConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesKubeApiAuditLogConfigurationArgs $;

        public Builder() {
            $ = new ClusterServicesKubeApiAuditLogConfigurationArgs();
        }

        public Builder(ClusterServicesKubeApiAuditLogConfigurationArgs defaults) {
            $ = new ClusterServicesKubeApiAuditLogConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        public Builder format(String format) {
            return format(Output.of(format));
        }

        public Builder maxAge(@Nullable Output<Integer> maxAge) {
            $.maxAge = maxAge;
            return this;
        }

        public Builder maxAge(Integer maxAge) {
            return maxAge(Output.of(maxAge));
        }

        public Builder maxBackup(@Nullable Output<Integer> maxBackup) {
            $.maxBackup = maxBackup;
            return this;
        }

        public Builder maxBackup(Integer maxBackup) {
            return maxBackup(Output.of(maxBackup));
        }

        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public ClusterServicesKubeApiAuditLogConfigurationArgs build() {
            return $;
        }
    }

}
