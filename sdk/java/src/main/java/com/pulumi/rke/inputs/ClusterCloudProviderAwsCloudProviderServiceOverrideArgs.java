// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderAwsCloudProviderServiceOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderAwsCloudProviderServiceOverrideArgs Empty = new ClusterCloudProviderAwsCloudProviderServiceOverrideArgs();

    /**
     * TLS key for etcd service (string)
     * 
     * @deprecated
     * Use service instead
     * 
     */
    @Deprecated /* Use service instead */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return TLS key for etcd service (string)
     * 
     * @deprecated
     * Use service instead
     * 
     */
    @Deprecated /* Use service instead */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Region for S3 service (string)
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Region for S3 service (string)
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * (string)
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return (string)
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     * (string)
     * 
     */
    @Import(name="signingMethod")
    private @Nullable Output<String> signingMethod;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> signingMethod() {
        return Optional.ofNullable(this.signingMethod);
    }

    /**
     * (string)
     * 
     */
    @Import(name="signingName")
    private @Nullable Output<String> signingName;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> signingName() {
        return Optional.ofNullable(this.signingName);
    }

    /**
     * (string)
     * 
     */
    @Import(name="signingRegion")
    private @Nullable Output<String> signingRegion;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> signingRegion() {
        return Optional.ofNullable(this.signingRegion);
    }

    /**
     * Registry URL (string)
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return Registry URL (string)
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private ClusterCloudProviderAwsCloudProviderServiceOverrideArgs() {}

    private ClusterCloudProviderAwsCloudProviderServiceOverrideArgs(ClusterCloudProviderAwsCloudProviderServiceOverrideArgs $) {
        this.key = $.key;
        this.region = $.region;
        this.service = $.service;
        this.signingMethod = $.signingMethod;
        this.signingName = $.signingName;
        this.signingRegion = $.signingRegion;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCloudProviderAwsCloudProviderServiceOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderAwsCloudProviderServiceOverrideArgs $;

        public Builder() {
            $ = new ClusterCloudProviderAwsCloudProviderServiceOverrideArgs();
        }

        public Builder(ClusterCloudProviderAwsCloudProviderServiceOverrideArgs defaults) {
            $ = new ClusterCloudProviderAwsCloudProviderServiceOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key TLS key for etcd service (string)
         * 
         * @return builder
         * 
         * @deprecated
         * Use service instead
         * 
         */
        @Deprecated /* Use service instead */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key TLS key for etcd service (string)
         * 
         * @return builder
         * 
         * @deprecated
         * Use service instead
         * 
         */
        @Deprecated /* Use service instead */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param region Region for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param service (string)
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service (string)
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param signingMethod (string)
         * 
         * @return builder
         * 
         */
        public Builder signingMethod(@Nullable Output<String> signingMethod) {
            $.signingMethod = signingMethod;
            return this;
        }

        /**
         * @param signingMethod (string)
         * 
         * @return builder
         * 
         */
        public Builder signingMethod(String signingMethod) {
            return signingMethod(Output.of(signingMethod));
        }

        /**
         * @param signingName (string)
         * 
         * @return builder
         * 
         */
        public Builder signingName(@Nullable Output<String> signingName) {
            $.signingName = signingName;
            return this;
        }

        /**
         * @param signingName (string)
         * 
         * @return builder
         * 
         */
        public Builder signingName(String signingName) {
            return signingName(Output.of(signingName));
        }

        /**
         * @param signingRegion (string)
         * 
         * @return builder
         * 
         */
        public Builder signingRegion(@Nullable Output<String> signingRegion) {
            $.signingRegion = signingRegion;
            return this;
        }

        /**
         * @param signingRegion (string)
         * 
         * @return builder
         * 
         */
        public Builder signingRegion(String signingRegion) {
            return signingRegion(Output.of(signingRegion));
        }

        /**
         * @param url Registry URL (string)
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Registry URL (string)
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ClusterCloudProviderAwsCloudProviderServiceOverrideArgs build() {
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
