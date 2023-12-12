// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudProviderVsphereCloudConfigWorkspace {
    /**
     * @return (string)
     * 
     */
    private String datacenter;
    /**
     * @return (string)
     * 
     */
    private @Nullable String defaultDatastore;
    /**
     * @return Folder for S3 service. Available from Rancher v2.2.7 (string)
     * 
     */
    private @Nullable String folder;
    /**
     * @return (string)
     * 
     */
    private @Nullable String resourcepoolPath;
    /**
     * @return (string)
     * 
     */
    private String server;

    private ClusterCloudProviderVsphereCloudConfigWorkspace() {}
    /**
     * @return (string)
     * 
     */
    public String datacenter() {
        return this.datacenter;
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> defaultDatastore() {
        return Optional.ofNullable(this.defaultDatastore);
    }
    /**
     * @return Folder for S3 service. Available from Rancher v2.2.7 (string)
     * 
     */
    public Optional<String> folder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> resourcepoolPath() {
        return Optional.ofNullable(this.resourcepoolPath);
    }
    /**
     * @return (string)
     * 
     */
    public String server() {
        return this.server;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderVsphereCloudConfigWorkspace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String datacenter;
        private @Nullable String defaultDatastore;
        private @Nullable String folder;
        private @Nullable String resourcepoolPath;
        private String server;
        public Builder() {}
        public Builder(ClusterCloudProviderVsphereCloudConfigWorkspace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenter = defaults.datacenter;
    	      this.defaultDatastore = defaults.defaultDatastore;
    	      this.folder = defaults.folder;
    	      this.resourcepoolPath = defaults.resourcepoolPath;
    	      this.server = defaults.server;
        }

        @CustomType.Setter
        public Builder datacenter(String datacenter) {
            this.datacenter = Objects.requireNonNull(datacenter);
            return this;
        }
        @CustomType.Setter
        public Builder defaultDatastore(@Nullable String defaultDatastore) {
            this.defaultDatastore = defaultDatastore;
            return this;
        }
        @CustomType.Setter
        public Builder folder(@Nullable String folder) {
            this.folder = folder;
            return this;
        }
        @CustomType.Setter
        public Builder resourcepoolPath(@Nullable String resourcepoolPath) {
            this.resourcepoolPath = resourcepoolPath;
            return this;
        }
        @CustomType.Setter
        public Builder server(String server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }
        public ClusterCloudProviderVsphereCloudConfigWorkspace build() {
            final var _resultValue = new ClusterCloudProviderVsphereCloudConfigWorkspace();
            _resultValue.datacenter = datacenter;
            _resultValue.defaultDatastore = defaultDatastore;
            _resultValue.folder = folder;
            _resultValue.resourcepoolPath = resourcepoolPath;
            _resultValue.server = server;
            return _resultValue;
        }
    }
}
