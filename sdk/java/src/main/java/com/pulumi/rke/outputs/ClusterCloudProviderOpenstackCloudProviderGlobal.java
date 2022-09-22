// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudProviderOpenstackCloudProviderGlobal {
    /**
     * @return (string)
     * 
     */
    private String authUrl;
    /**
     * @return (string)
     * 
     */
    private @Nullable String caFile;
    /**
     * @return Required if `domain_name` not provided. (string)
     * 
     */
    private @Nullable String domainId;
    /**
     * @return Required if `domain_id` not provided. (string)
     * 
     */
    private @Nullable String domainName;
    /**
     * @return Registry password (string)
     * 
     */
    private String password;
    /**
     * @return Region for S3 service (string)
     * 
     */
    private @Nullable String region;
    /**
     * @return Required if `tenant_name` not provided. (string)
     * 
     */
    private @Nullable String tenantId;
    /**
     * @return Required if `tenant_id` not provided. (string)
     * 
     */
    private @Nullable String tenantName;
    /**
     * @return (string)
     * 
     */
    private @Nullable String trustId;
    /**
     * @return Required if `username` not provided. (string)
     * 
     */
    private @Nullable String userId;
    /**
     * @return Required if `user_id` not provided. (string)
     * 
     */
    private @Nullable String username;

    private ClusterCloudProviderOpenstackCloudProviderGlobal() {}
    /**
     * @return (string)
     * 
     */
    public String authUrl() {
        return this.authUrl;
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> caFile() {
        return Optional.ofNullable(this.caFile);
    }
    /**
     * @return Required if `domain_name` not provided. (string)
     * 
     */
    public Optional<String> domainId() {
        return Optional.ofNullable(this.domainId);
    }
    /**
     * @return Required if `domain_id` not provided. (string)
     * 
     */
    public Optional<String> domainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * @return Registry password (string)
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return Region for S3 service (string)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Required if `tenant_name` not provided. (string)
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return Required if `tenant_id` not provided. (string)
     * 
     */
    public Optional<String> tenantName() {
        return Optional.ofNullable(this.tenantName);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> trustId() {
        return Optional.ofNullable(this.trustId);
    }
    /**
     * @return Required if `username` not provided. (string)
     * 
     */
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }
    /**
     * @return Required if `user_id` not provided. (string)
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderOpenstackCloudProviderGlobal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authUrl;
        private @Nullable String caFile;
        private @Nullable String domainId;
        private @Nullable String domainName;
        private String password;
        private @Nullable String region;
        private @Nullable String tenantId;
        private @Nullable String tenantName;
        private @Nullable String trustId;
        private @Nullable String userId;
        private @Nullable String username;
        public Builder() {}
        public Builder(ClusterCloudProviderOpenstackCloudProviderGlobal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authUrl = defaults.authUrl;
    	      this.caFile = defaults.caFile;
    	      this.domainId = defaults.domainId;
    	      this.domainName = defaults.domainName;
    	      this.password = defaults.password;
    	      this.region = defaults.region;
    	      this.tenantId = defaults.tenantId;
    	      this.tenantName = defaults.tenantName;
    	      this.trustId = defaults.trustId;
    	      this.userId = defaults.userId;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder authUrl(String authUrl) {
            this.authUrl = Objects.requireNonNull(authUrl);
            return this;
        }
        @CustomType.Setter
        public Builder caFile(@Nullable String caFile) {
            this.caFile = caFile;
            return this;
        }
        @CustomType.Setter
        public Builder domainId(@Nullable String domainId) {
            this.domainId = domainId;
            return this;
        }
        @CustomType.Setter
        public Builder domainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantName(@Nullable String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        @CustomType.Setter
        public Builder trustId(@Nullable String trustId) {
            this.trustId = trustId;
            return this;
        }
        @CustomType.Setter
        public Builder userId(@Nullable String userId) {
            this.userId = userId;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public ClusterCloudProviderOpenstackCloudProviderGlobal build() {
            final var o = new ClusterCloudProviderOpenstackCloudProviderGlobal();
            o.authUrl = authUrl;
            o.caFile = caFile;
            o.domainId = domainId;
            o.domainName = domainName;
            o.password = password;
            o.region = region;
            o.tenantId = tenantId;
            o.tenantName = tenantName;
            o.trustId = trustId;
            o.userId = userId;
            o.username = username;
            return o;
        }
    }
}
