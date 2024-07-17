// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudProviderOpenstackCloudConfigBlockStorage {
    /**
     * @return (string)
     * 
     */
    private @Nullable String bsVersion;
    /**
     * @return (string)
     * 
     */
    private @Nullable Boolean ignoreVolumeAz;
    /**
     * @return (string)
     * 
     */
    private @Nullable Boolean trustDevicePath;

    private ClusterCloudProviderOpenstackCloudConfigBlockStorage() {}
    /**
     * @return (string)
     * 
     */
    public Optional<String> bsVersion() {
        return Optional.ofNullable(this.bsVersion);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<Boolean> ignoreVolumeAz() {
        return Optional.ofNullable(this.ignoreVolumeAz);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<Boolean> trustDevicePath() {
        return Optional.ofNullable(this.trustDevicePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderOpenstackCloudConfigBlockStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bsVersion;
        private @Nullable Boolean ignoreVolumeAz;
        private @Nullable Boolean trustDevicePath;
        public Builder() {}
        public Builder(ClusterCloudProviderOpenstackCloudConfigBlockStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bsVersion = defaults.bsVersion;
    	      this.ignoreVolumeAz = defaults.ignoreVolumeAz;
    	      this.trustDevicePath = defaults.trustDevicePath;
        }

        @CustomType.Setter
        public Builder bsVersion(@Nullable String bsVersion) {

            this.bsVersion = bsVersion;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreVolumeAz(@Nullable Boolean ignoreVolumeAz) {

            this.ignoreVolumeAz = ignoreVolumeAz;
            return this;
        }
        @CustomType.Setter
        public Builder trustDevicePath(@Nullable Boolean trustDevicePath) {

            this.trustDevicePath = trustDevicePath;
            return this;
        }
        public ClusterCloudProviderOpenstackCloudConfigBlockStorage build() {
            final var _resultValue = new ClusterCloudProviderOpenstackCloudConfigBlockStorage();
            _resultValue.bsVersion = bsVersion;
            _resultValue.ignoreVolumeAz = ignoreVolumeAz;
            _resultValue.trustDevicePath = trustDevicePath;
            return _resultValue;
        }
    }
}
