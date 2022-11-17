// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rke.inputs.ClusterServicesKubeApiDeprecatedAuditLogArgs;
import com.pulumi.rke.inputs.ClusterServicesKubeApiDeprecatedEventRateLimitArgs;
import com.pulumi.rke.inputs.ClusterServicesKubeApiDeprecatedSecretsEncryptionConfigArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterServicesKubeApiDeprecatedArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesKubeApiDeprecatedArgs Empty = new ClusterServicesKubeApiDeprecatedArgs();

    /**
     * Enable [AlwaysPullImages](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/#alwayspullimages) Admission controller plugin. [Rancher docs](https://rancher.com/docs/rke/latest/en/config-options/services/#kubernetes-api-server-options) (bool)
     * 
     */
    @Import(name="alwaysPullImages")
    private @Nullable Output<Boolean> alwaysPullImages;

    /**
     * @return Enable [AlwaysPullImages](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/#alwayspullimages) Admission controller plugin. [Rancher docs](https://rancher.com/docs/rke/latest/en/config-options/services/#kubernetes-api-server-options) (bool)
     * 
     */
    public Optional<Output<Boolean>> alwaysPullImages() {
        return Optional.ofNullable(this.alwaysPullImages);
    }

    /**
     * K8s audit log configuration. (list maxitem: 1)
     * 
     */
    @Import(name="auditLog")
    private @Nullable Output<ClusterServicesKubeApiDeprecatedAuditLogArgs> auditLog;

    /**
     * @return K8s audit log configuration. (list maxitem: 1)
     * 
     */
    public Optional<Output<ClusterServicesKubeApiDeprecatedAuditLogArgs>> auditLog() {
        return Optional.ofNullable(this.auditLog);
    }

    /**
     * K8s event rate limit configuration. (list maxitem: 1)
     * 
     */
    @Import(name="eventRateLimit")
    private @Nullable Output<ClusterServicesKubeApiDeprecatedEventRateLimitArgs> eventRateLimit;

    /**
     * @return K8s event rate limit configuration. (list maxitem: 1)
     * 
     */
    public Optional<Output<ClusterServicesKubeApiDeprecatedEventRateLimitArgs>> eventRateLimit() {
        return Optional.ofNullable(this.eventRateLimit);
    }

    /**
     * Extra arguments for scheduler service (map)
     * 
     */
    @Import(name="extraArgs")
    private @Nullable Output<Map<String,Object>> extraArgs;

    /**
     * @return Extra arguments for scheduler service (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> extraArgs() {
        return Optional.ofNullable(this.extraArgs);
    }

    /**
     * Extra binds for scheduler service (list)
     * 
     */
    @Import(name="extraBinds")
    private @Nullable Output<List<String>> extraBinds;

    /**
     * @return Extra binds for scheduler service (list)
     * 
     */
    public Optional<Output<List<String>>> extraBinds() {
        return Optional.ofNullable(this.extraBinds);
    }

    /**
     * Extra environment for scheduler service (list)
     * 
     */
    @Import(name="extraEnvs")
    private @Nullable Output<List<String>> extraEnvs;

    /**
     * @return Extra environment for scheduler service (list)
     * 
     */
    public Optional<Output<List<String>>> extraEnvs() {
        return Optional.ofNullable(this.extraEnvs);
    }

    /**
     * Docker image for scheduler service (string)
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Docker image for scheduler service (string)
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Pod Security Policy option for kube API service (bool)
     * 
     */
    @Import(name="podSecurityPolicy")
    private @Nullable Output<Boolean> podSecurityPolicy;

    /**
     * @return Pod Security Policy option for kube API service (bool)
     * 
     */
    public Optional<Output<Boolean>> podSecurityPolicy() {
        return Optional.ofNullable(this.podSecurityPolicy);
    }

    /**
     * [Encrypt k8s secret data configration](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/). (list maxitem: 1)
     * 
     */
    @Import(name="secretsEncryptionConfig")
    private @Nullable Output<ClusterServicesKubeApiDeprecatedSecretsEncryptionConfigArgs> secretsEncryptionConfig;

    /**
     * @return [Encrypt k8s secret data configration](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/). (list maxitem: 1)
     * 
     */
    public Optional<Output<ClusterServicesKubeApiDeprecatedSecretsEncryptionConfigArgs>> secretsEncryptionConfig() {
        return Optional.ofNullable(this.secretsEncryptionConfig);
    }

    /**
     * Service Cluster ip Range option for kube controller service (string)
     * 
     */
    @Import(name="serviceClusterIpRange")
    private @Nullable Output<String> serviceClusterIpRange;

    /**
     * @return Service Cluster ip Range option for kube controller service (string)
     * 
     */
    public Optional<Output<String>> serviceClusterIpRange() {
        return Optional.ofNullable(this.serviceClusterIpRange);
    }

    /**
     * Service Node Port Range option for kube API service (string)
     * 
     */
    @Import(name="serviceNodePortRange")
    private @Nullable Output<String> serviceNodePortRange;

    /**
     * @return Service Node Port Range option for kube API service (string)
     * 
     */
    public Optional<Output<String>> serviceNodePortRange() {
        return Optional.ofNullable(this.serviceNodePortRange);
    }

    private ClusterServicesKubeApiDeprecatedArgs() {}

    private ClusterServicesKubeApiDeprecatedArgs(ClusterServicesKubeApiDeprecatedArgs $) {
        this.alwaysPullImages = $.alwaysPullImages;
        this.auditLog = $.auditLog;
        this.eventRateLimit = $.eventRateLimit;
        this.extraArgs = $.extraArgs;
        this.extraBinds = $.extraBinds;
        this.extraEnvs = $.extraEnvs;
        this.image = $.image;
        this.podSecurityPolicy = $.podSecurityPolicy;
        this.secretsEncryptionConfig = $.secretsEncryptionConfig;
        this.serviceClusterIpRange = $.serviceClusterIpRange;
        this.serviceNodePortRange = $.serviceNodePortRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterServicesKubeApiDeprecatedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesKubeApiDeprecatedArgs $;

        public Builder() {
            $ = new ClusterServicesKubeApiDeprecatedArgs();
        }

        public Builder(ClusterServicesKubeApiDeprecatedArgs defaults) {
            $ = new ClusterServicesKubeApiDeprecatedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alwaysPullImages Enable [AlwaysPullImages](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/#alwayspullimages) Admission controller plugin. [Rancher docs](https://rancher.com/docs/rke/latest/en/config-options/services/#kubernetes-api-server-options) (bool)
         * 
         * @return builder
         * 
         */
        public Builder alwaysPullImages(@Nullable Output<Boolean> alwaysPullImages) {
            $.alwaysPullImages = alwaysPullImages;
            return this;
        }

        /**
         * @param alwaysPullImages Enable [AlwaysPullImages](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/#alwayspullimages) Admission controller plugin. [Rancher docs](https://rancher.com/docs/rke/latest/en/config-options/services/#kubernetes-api-server-options) (bool)
         * 
         * @return builder
         * 
         */
        public Builder alwaysPullImages(Boolean alwaysPullImages) {
            return alwaysPullImages(Output.of(alwaysPullImages));
        }

        /**
         * @param auditLog K8s audit log configuration. (list maxitem: 1)
         * 
         * @return builder
         * 
         */
        public Builder auditLog(@Nullable Output<ClusterServicesKubeApiDeprecatedAuditLogArgs> auditLog) {
            $.auditLog = auditLog;
            return this;
        }

        /**
         * @param auditLog K8s audit log configuration. (list maxitem: 1)
         * 
         * @return builder
         * 
         */
        public Builder auditLog(ClusterServicesKubeApiDeprecatedAuditLogArgs auditLog) {
            return auditLog(Output.of(auditLog));
        }

        /**
         * @param eventRateLimit K8s event rate limit configuration. (list maxitem: 1)
         * 
         * @return builder
         * 
         */
        public Builder eventRateLimit(@Nullable Output<ClusterServicesKubeApiDeprecatedEventRateLimitArgs> eventRateLimit) {
            $.eventRateLimit = eventRateLimit;
            return this;
        }

        /**
         * @param eventRateLimit K8s event rate limit configuration. (list maxitem: 1)
         * 
         * @return builder
         * 
         */
        public Builder eventRateLimit(ClusterServicesKubeApiDeprecatedEventRateLimitArgs eventRateLimit) {
            return eventRateLimit(Output.of(eventRateLimit));
        }

        /**
         * @param extraArgs Extra arguments for scheduler service (map)
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(@Nullable Output<Map<String,Object>> extraArgs) {
            $.extraArgs = extraArgs;
            return this;
        }

        /**
         * @param extraArgs Extra arguments for scheduler service (map)
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(Map<String,Object> extraArgs) {
            return extraArgs(Output.of(extraArgs));
        }

        /**
         * @param extraBinds Extra binds for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(@Nullable Output<List<String>> extraBinds) {
            $.extraBinds = extraBinds;
            return this;
        }

        /**
         * @param extraBinds Extra binds for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(List<String> extraBinds) {
            return extraBinds(Output.of(extraBinds));
        }

        /**
         * @param extraBinds Extra binds for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }

        /**
         * @param extraEnvs Extra environment for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(@Nullable Output<List<String>> extraEnvs) {
            $.extraEnvs = extraEnvs;
            return this;
        }

        /**
         * @param extraEnvs Extra environment for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(List<String> extraEnvs) {
            return extraEnvs(Output.of(extraEnvs));
        }

        /**
         * @param extraEnvs Extra environment for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }

        /**
         * @param image Docker image for scheduler service (string)
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Docker image for scheduler service (string)
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param podSecurityPolicy Pod Security Policy option for kube API service (bool)
         * 
         * @return builder
         * 
         */
        public Builder podSecurityPolicy(@Nullable Output<Boolean> podSecurityPolicy) {
            $.podSecurityPolicy = podSecurityPolicy;
            return this;
        }

        /**
         * @param podSecurityPolicy Pod Security Policy option for kube API service (bool)
         * 
         * @return builder
         * 
         */
        public Builder podSecurityPolicy(Boolean podSecurityPolicy) {
            return podSecurityPolicy(Output.of(podSecurityPolicy));
        }

        /**
         * @param secretsEncryptionConfig [Encrypt k8s secret data configration](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/). (list maxitem: 1)
         * 
         * @return builder
         * 
         */
        public Builder secretsEncryptionConfig(@Nullable Output<ClusterServicesKubeApiDeprecatedSecretsEncryptionConfigArgs> secretsEncryptionConfig) {
            $.secretsEncryptionConfig = secretsEncryptionConfig;
            return this;
        }

        /**
         * @param secretsEncryptionConfig [Encrypt k8s secret data configration](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/). (list maxitem: 1)
         * 
         * @return builder
         * 
         */
        public Builder secretsEncryptionConfig(ClusterServicesKubeApiDeprecatedSecretsEncryptionConfigArgs secretsEncryptionConfig) {
            return secretsEncryptionConfig(Output.of(secretsEncryptionConfig));
        }

        /**
         * @param serviceClusterIpRange Service Cluster ip Range option for kube controller service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceClusterIpRange(@Nullable Output<String> serviceClusterIpRange) {
            $.serviceClusterIpRange = serviceClusterIpRange;
            return this;
        }

        /**
         * @param serviceClusterIpRange Service Cluster ip Range option for kube controller service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceClusterIpRange(String serviceClusterIpRange) {
            return serviceClusterIpRange(Output.of(serviceClusterIpRange));
        }

        /**
         * @param serviceNodePortRange Service Node Port Range option for kube API service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceNodePortRange(@Nullable Output<String> serviceNodePortRange) {
            $.serviceNodePortRange = serviceNodePortRange;
            return this;
        }

        /**
         * @param serviceNodePortRange Service Node Port Range option for kube API service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceNodePortRange(String serviceNodePortRange) {
            return serviceNodePortRange(Output.of(serviceNodePortRange));
        }

        public ClusterServicesKubeApiDeprecatedArgs build() {
            return $;
        }
    }

}
