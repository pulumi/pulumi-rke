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


public final class ClusterServicesKubeApiSecretsEncryptionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServicesKubeApiSecretsEncryptionConfigArgs Empty = new ClusterServicesKubeApiSecretsEncryptionConfigArgs();

    @Import(name="customConfig")
    private @Nullable Output<String> customConfig;

    public Optional<Output<String>> customConfig() {
        return Optional.ofNullable(this.customConfig);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ClusterServicesKubeApiSecretsEncryptionConfigArgs() {}

    private ClusterServicesKubeApiSecretsEncryptionConfigArgs(ClusterServicesKubeApiSecretsEncryptionConfigArgs $) {
        this.customConfig = $.customConfig;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterServicesKubeApiSecretsEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServicesKubeApiSecretsEncryptionConfigArgs $;

        public Builder() {
            $ = new ClusterServicesKubeApiSecretsEncryptionConfigArgs();
        }

        public Builder(ClusterServicesKubeApiSecretsEncryptionConfigArgs defaults) {
            $ = new ClusterServicesKubeApiSecretsEncryptionConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder customConfig(@Nullable Output<String> customConfig) {
            $.customConfig = customConfig;
            return this;
        }

        public Builder customConfig(String customConfig) {
            return customConfig(Output.of(customConfig));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterServicesKubeApiSecretsEncryptionConfigArgs build() {
            return $;
        }
    }

}
