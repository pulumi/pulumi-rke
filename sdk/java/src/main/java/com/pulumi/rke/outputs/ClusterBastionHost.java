// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterBastionHost {
    /**
     * @return Address of Bastion Host
     * 
     */
    private String address;
    /**
     * @return Ignore proxy env vars at Bastion Host?
     * 
     */
    private @Nullable Boolean ignoreProxyEnvVars;
    /**
     * @return SSH Port of Bastion Host
     * 
     */
    private @Nullable String port;
    /**
     * @return SSH Agent Auth enable (bool)
     * 
     */
    private @Nullable Boolean sshAgentAuth;
    /**
     * @return SSH Certificate Key
     * 
     */
    private @Nullable String sshCert;
    /**
     * @return SSH Certificate Path (string)
     * 
     */
    private @Nullable String sshCertPath;
    /**
     * @return SSH Private Key
     * 
     */
    private @Nullable String sshKey;
    /**
     * @return SSH Private Key Path (string)
     * 
     */
    private @Nullable String sshKeyPath;
    /**
     * @return SSH User to Bastion Host
     * 
     */
    private String user;

    private ClusterBastionHost() {}
    /**
     * @return Address of Bastion Host
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Ignore proxy env vars at Bastion Host?
     * 
     */
    public Optional<Boolean> ignoreProxyEnvVars() {
        return Optional.ofNullable(this.ignoreProxyEnvVars);
    }
    /**
     * @return SSH Port of Bastion Host
     * 
     */
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return SSH Agent Auth enable (bool)
     * 
     */
    public Optional<Boolean> sshAgentAuth() {
        return Optional.ofNullable(this.sshAgentAuth);
    }
    /**
     * @return SSH Certificate Key
     * 
     */
    public Optional<String> sshCert() {
        return Optional.ofNullable(this.sshCert);
    }
    /**
     * @return SSH Certificate Path (string)
     * 
     */
    public Optional<String> sshCertPath() {
        return Optional.ofNullable(this.sshCertPath);
    }
    /**
     * @return SSH Private Key
     * 
     */
    public Optional<String> sshKey() {
        return Optional.ofNullable(this.sshKey);
    }
    /**
     * @return SSH Private Key Path (string)
     * 
     */
    public Optional<String> sshKeyPath() {
        return Optional.ofNullable(this.sshKeyPath);
    }
    /**
     * @return SSH User to Bastion Host
     * 
     */
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterBastionHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private @Nullable Boolean ignoreProxyEnvVars;
        private @Nullable String port;
        private @Nullable Boolean sshAgentAuth;
        private @Nullable String sshCert;
        private @Nullable String sshCertPath;
        private @Nullable String sshKey;
        private @Nullable String sshKeyPath;
        private String user;
        public Builder() {}
        public Builder(ClusterBastionHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.ignoreProxyEnvVars = defaults.ignoreProxyEnvVars;
    	      this.port = defaults.port;
    	      this.sshAgentAuth = defaults.sshAgentAuth;
    	      this.sshCert = defaults.sshCert;
    	      this.sshCertPath = defaults.sshCertPath;
    	      this.sshKey = defaults.sshKey;
    	      this.sshKeyPath = defaults.sshKeyPath;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("ClusterBastionHost", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreProxyEnvVars(@Nullable Boolean ignoreProxyEnvVars) {

            this.ignoreProxyEnvVars = ignoreProxyEnvVars;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder sshAgentAuth(@Nullable Boolean sshAgentAuth) {

            this.sshAgentAuth = sshAgentAuth;
            return this;
        }
        @CustomType.Setter
        public Builder sshCert(@Nullable String sshCert) {

            this.sshCert = sshCert;
            return this;
        }
        @CustomType.Setter
        public Builder sshCertPath(@Nullable String sshCertPath) {

            this.sshCertPath = sshCertPath;
            return this;
        }
        @CustomType.Setter
        public Builder sshKey(@Nullable String sshKey) {

            this.sshKey = sshKey;
            return this;
        }
        @CustomType.Setter
        public Builder sshKeyPath(@Nullable String sshKeyPath) {

            this.sshKeyPath = sshKeyPath;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("ClusterBastionHost", "user");
            }
            this.user = user;
            return this;
        }
        public ClusterBastionHost build() {
            final var _resultValue = new ClusterBastionHost();
            _resultValue.address = address;
            _resultValue.ignoreProxyEnvVars = ignoreProxyEnvVars;
            _resultValue.port = port;
            _resultValue.sshAgentAuth = sshAgentAuth;
            _resultValue.sshCert = sshCert;
            _resultValue.sshCertPath = sshCertPath;
            _resultValue.sshKey = sshKey;
            _resultValue.sshKeyPath = sshKeyPath;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
