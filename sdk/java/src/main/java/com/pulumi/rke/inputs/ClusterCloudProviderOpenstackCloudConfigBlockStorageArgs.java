// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs Empty = new ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs();

    @Import(name="bsVersion")
    private @Nullable Output<String> bsVersion;

    public Optional<Output<String>> bsVersion() {
        return Optional.ofNullable(this.bsVersion);
    }

    @Import(name="ignoreVolumeAz")
    private @Nullable Output<Boolean> ignoreVolumeAz;

    public Optional<Output<Boolean>> ignoreVolumeAz() {
        return Optional.ofNullable(this.ignoreVolumeAz);
    }

    @Import(name="trustDevicePath")
    private @Nullable Output<Boolean> trustDevicePath;

    public Optional<Output<Boolean>> trustDevicePath() {
        return Optional.ofNullable(this.trustDevicePath);
    }

    private ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs() {}

    private ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs(ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs $) {
        this.bsVersion = $.bsVersion;
        this.ignoreVolumeAz = $.ignoreVolumeAz;
        this.trustDevicePath = $.trustDevicePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs $;

        public Builder() {
            $ = new ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs();
        }

        public Builder(ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs defaults) {
            $ = new ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs(Objects.requireNonNull(defaults));
        }

        public Builder bsVersion(@Nullable Output<String> bsVersion) {
            $.bsVersion = bsVersion;
            return this;
        }

        public Builder bsVersion(String bsVersion) {
            return bsVersion(Output.of(bsVersion));
        }

        public Builder ignoreVolumeAz(@Nullable Output<Boolean> ignoreVolumeAz) {
            $.ignoreVolumeAz = ignoreVolumeAz;
            return this;
        }

        public Builder ignoreVolumeAz(Boolean ignoreVolumeAz) {
            return ignoreVolumeAz(Output.of(ignoreVolumeAz));
        }

        public Builder trustDevicePath(@Nullable Output<Boolean> trustDevicePath) {
            $.trustDevicePath = trustDevicePath;
            return this;
        }

        public Builder trustDevicePath(Boolean trustDevicePath) {
            return trustDevicePath(Output.of(trustDevicePath));
        }

        public ClusterCloudProviderOpenstackCloudConfigBlockStorageArgs build() {
            return $;
        }
    }

}
