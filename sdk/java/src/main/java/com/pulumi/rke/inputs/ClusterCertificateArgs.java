// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCertificateArgs Empty = new ClusterCertificateArgs();

    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    @Import(name="commonName")
    private @Nullable Output<String> commonName;

    public Optional<Output<String>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    @Import(name="config")
    private @Nullable Output<String> config;

    public Optional<Output<String>> config() {
        return Optional.ofNullable(this.config);
    }

    @Import(name="configEnvName")
    private @Nullable Output<String> configEnvName;

    public Optional<Output<String>> configEnvName() {
        return Optional.ofNullable(this.configEnvName);
    }

    @Import(name="configPath")
    private @Nullable Output<String> configPath;

    public Optional<Output<String>> configPath() {
        return Optional.ofNullable(this.configPath);
    }

    @Import(name="envName")
    private @Nullable Output<String> envName;

    public Optional<Output<String>> envName() {
        return Optional.ofNullable(this.envName);
    }

    /**
     * (Computed) The ID of the resource (string)
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return (Computed) The ID of the resource (string)
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="keyEnvName")
    private @Nullable Output<String> keyEnvName;

    public Optional<Output<String>> keyEnvName() {
        return Optional.ofNullable(this.keyEnvName);
    }

    @Import(name="keyPath")
    private @Nullable Output<String> keyPath;

    public Optional<Output<String>> keyPath() {
        return Optional.ofNullable(this.keyPath);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="ouName")
    private @Nullable Output<String> ouName;

    public Optional<Output<String>> ouName() {
        return Optional.ofNullable(this.ouName);
    }

    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private ClusterCertificateArgs() {}

    private ClusterCertificateArgs(ClusterCertificateArgs $) {
        this.certificate = $.certificate;
        this.commonName = $.commonName;
        this.config = $.config;
        this.configEnvName = $.configEnvName;
        this.configPath = $.configPath;
        this.envName = $.envName;
        this.id = $.id;
        this.key = $.key;
        this.keyEnvName = $.keyEnvName;
        this.keyPath = $.keyPath;
        this.name = $.name;
        this.ouName = $.ouName;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCertificateArgs $;

        public Builder() {
            $ = new ClusterCertificateArgs();
        }

        public Builder(ClusterCertificateArgs defaults) {
            $ = new ClusterCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder commonName(@Nullable Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        public Builder config(@Nullable Output<String> config) {
            $.config = config;
            return this;
        }

        public Builder config(String config) {
            return config(Output.of(config));
        }

        public Builder configEnvName(@Nullable Output<String> configEnvName) {
            $.configEnvName = configEnvName;
            return this;
        }

        public Builder configEnvName(String configEnvName) {
            return configEnvName(Output.of(configEnvName));
        }

        public Builder configPath(@Nullable Output<String> configPath) {
            $.configPath = configPath;
            return this;
        }

        public Builder configPath(String configPath) {
            return configPath(Output.of(configPath));
        }

        public Builder envName(@Nullable Output<String> envName) {
            $.envName = envName;
            return this;
        }

        public Builder envName(String envName) {
            return envName(Output.of(envName));
        }

        /**
         * @param id (Computed) The ID of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id (Computed) The ID of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder keyEnvName(@Nullable Output<String> keyEnvName) {
            $.keyEnvName = keyEnvName;
            return this;
        }

        public Builder keyEnvName(String keyEnvName) {
            return keyEnvName(Output.of(keyEnvName));
        }

        public Builder keyPath(@Nullable Output<String> keyPath) {
            $.keyPath = keyPath;
            return this;
        }

        public Builder keyPath(String keyPath) {
            return keyPath(Output.of(keyPath));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder ouName(@Nullable Output<String> ouName) {
            $.ouName = ouName;
            return this;
        }

        public Builder ouName(String ouName) {
            return ouName(Output.of(ouName));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public ClusterCertificateArgs build() {
            return $;
        }
    }

}
