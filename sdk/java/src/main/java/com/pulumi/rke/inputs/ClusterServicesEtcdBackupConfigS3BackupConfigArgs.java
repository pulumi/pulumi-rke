// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterServicesEtcdBackupConfigS3BackupConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesEtcdBackupConfigS3BackupConfigArgs Empty = new ClusterServicesEtcdBackupConfigS3BackupConfigArgs();

    /**
     * Access key for S3 service (string)
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return Access key for S3 service (string)
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * Bucket name for S3 service (string)
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return Bucket name for S3 service (string)
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * Base64 encoded custom CA for S3 service. Use filebase64(&lt;FILE&gt;) for encoding file. Available from Rancher v2.2.5 (string)
     * 
     */
    @Import(name="customCa")
    private @Nullable Output<String> customCa;

    /**
     * @return Base64 encoded custom CA for S3 service. Use filebase64(&lt;FILE&gt;) for encoding file. Available from Rancher v2.2.5 (string)
     * 
     */
    public Optional<Output<String>> customCa() {
        return Optional.ofNullable(this.customCa);
    }

    /**
     * Endpoint for S3 service (string)
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return Endpoint for S3 service (string)
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Folder for S3 service. Available from Rancher v2.2.7 (string)
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return Folder for S3 service. Available from Rancher v2.2.7 (string)
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
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
     * Secret key for S3 service (string)
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return Secret key for S3 service (string)
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    private ClusterServicesEtcdBackupConfigS3BackupConfigArgs() {}

    private ClusterServicesEtcdBackupConfigS3BackupConfigArgs(ClusterServicesEtcdBackupConfigS3BackupConfigArgs $) {
        this.accessKey = $.accessKey;
        this.bucketName = $.bucketName;
        this.customCa = $.customCa;
        this.endpoint = $.endpoint;
        this.folder = $.folder;
        this.region = $.region;
        this.secretKey = $.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterServicesEtcdBackupConfigS3BackupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesEtcdBackupConfigS3BackupConfigArgs $;

        public Builder() {
            $ = new ClusterServicesEtcdBackupConfigS3BackupConfigArgs();
        }

        public Builder(ClusterServicesEtcdBackupConfigS3BackupConfigArgs defaults) {
            $ = new ClusterServicesEtcdBackupConfigS3BackupConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey Access key for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey Access key for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param bucketName Bucket name for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName Bucket name for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param customCa Base64 encoded custom CA for S3 service. Use filebase64(&lt;FILE&gt;) for encoding file. Available from Rancher v2.2.5 (string)
         * 
         * @return builder
         * 
         */
        public Builder customCa(@Nullable Output<String> customCa) {
            $.customCa = customCa;
            return this;
        }

        /**
         * @param customCa Base64 encoded custom CA for S3 service. Use filebase64(&lt;FILE&gt;) for encoding file. Available from Rancher v2.2.5 (string)
         * 
         * @return builder
         * 
         */
        public Builder customCa(String customCa) {
            return customCa(Output.of(customCa));
        }

        /**
         * @param endpoint Endpoint for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Endpoint for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param folder Folder for S3 service. Available from Rancher v2.2.7 (string)
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder Folder for S3 service. Available from Rancher v2.2.7 (string)
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
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
         * @param secretKey Secret key for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey Secret key for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        public ClusterServicesEtcdBackupConfigS3BackupConfigArgs build() {
            return $;
        }
    }

}