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
public final class ClusterServicesKubeApiSecretsEncryptionConfig {
    /**
     * @return Secrets encryption yaml encoded custom configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;EncryptionConfiguration&#34;` fields are required in the yaml. Ex. `apiVersion: apiserver.config.k8s.io/v1\nkind: EncryptionConfiguration\nresources:\n- resources:\n  - secrets\n  providers:\n  - aescbc:\n      keys:\n      - name: k-fw5hn\n        secret: RTczRjFDODMwQzAyMDVBREU4NDJBMUZFNDhCNzM5N0I=\n    identity: {}\n` [More info](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/) (string)
     * 
     */
    private @Nullable String customConfig;
    /**
     * @return Enable secrets encryption (bool)
     * 
     */
    private @Nullable Boolean enabled;

    private ClusterServicesKubeApiSecretsEncryptionConfig() {}
    /**
     * @return Secrets encryption yaml encoded custom configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;EncryptionConfiguration&#34;` fields are required in the yaml. Ex. `apiVersion: apiserver.config.k8s.io/v1\nkind: EncryptionConfiguration\nresources:\n- resources:\n  - secrets\n  providers:\n  - aescbc:\n      keys:\n      - name: k-fw5hn\n        secret: RTczRjFDODMwQzAyMDVBREU4NDJBMUZFNDhCNzM5N0I=\n    identity: {}\n` [More info](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/) (string)
     * 
     */
    public Optional<String> customConfig() {
        return Optional.ofNullable(this.customConfig);
    }
    /**
     * @return Enable secrets encryption (bool)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterServicesKubeApiSecretsEncryptionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customConfig;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ClusterServicesKubeApiSecretsEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customConfig = defaults.customConfig;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder customConfig(@Nullable String customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public ClusterServicesKubeApiSecretsEncryptionConfig build() {
            final var o = new ClusterServicesKubeApiSecretsEncryptionConfig();
            o.customConfig = customConfig;
            o.enabled = enabled;
            return o;
        }
    }
}
