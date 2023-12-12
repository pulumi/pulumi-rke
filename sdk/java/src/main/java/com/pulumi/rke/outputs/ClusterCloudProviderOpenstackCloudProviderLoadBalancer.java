// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudProviderOpenstackCloudProviderLoadBalancer {
    /**
     * @return (bool)
     * 
     */
    private @Nullable Boolean createMonitor;
    /**
     * @return (string)
     * 
     */
    private @Nullable String floatingNetworkId;
    /**
     * @return (string)
     * 
     */
    private @Nullable String lbMethod;
    /**
     * @return (string)
     * 
     */
    private @Nullable String lbProvider;
    /**
     * @return (string)
     * 
     */
    private @Nullable String lbVersion;
    /**
     * @return (bool)
     * 
     */
    private @Nullable Boolean manageSecurityGroups;
    /**
     * @return (string)
     * 
     */
    private @Nullable String monitorDelay;
    /**
     * @return (int)
     * 
     */
    private @Nullable Integer monitorMaxRetries;
    /**
     * @return (string)
     * 
     */
    private @Nullable String monitorTimeout;
    /**
     * @return (string)
     * 
     */
    private @Nullable String subnetId;
    /**
     * @return (bool)
     * 
     */
    private @Nullable Boolean useOctavia;

    private ClusterCloudProviderOpenstackCloudProviderLoadBalancer() {}
    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> createMonitor() {
        return Optional.ofNullable(this.createMonitor);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> floatingNetworkId() {
        return Optional.ofNullable(this.floatingNetworkId);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> lbMethod() {
        return Optional.ofNullable(this.lbMethod);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> lbProvider() {
        return Optional.ofNullable(this.lbProvider);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> lbVersion() {
        return Optional.ofNullable(this.lbVersion);
    }
    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> manageSecurityGroups() {
        return Optional.ofNullable(this.manageSecurityGroups);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> monitorDelay() {
        return Optional.ofNullable(this.monitorDelay);
    }
    /**
     * @return (int)
     * 
     */
    public Optional<Integer> monitorMaxRetries() {
        return Optional.ofNullable(this.monitorMaxRetries);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> monitorTimeout() {
        return Optional.ofNullable(this.monitorTimeout);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> useOctavia() {
        return Optional.ofNullable(this.useOctavia);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderOpenstackCloudProviderLoadBalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean createMonitor;
        private @Nullable String floatingNetworkId;
        private @Nullable String lbMethod;
        private @Nullable String lbProvider;
        private @Nullable String lbVersion;
        private @Nullable Boolean manageSecurityGroups;
        private @Nullable String monitorDelay;
        private @Nullable Integer monitorMaxRetries;
        private @Nullable String monitorTimeout;
        private @Nullable String subnetId;
        private @Nullable Boolean useOctavia;
        public Builder() {}
        public Builder(ClusterCloudProviderOpenstackCloudProviderLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createMonitor = defaults.createMonitor;
    	      this.floatingNetworkId = defaults.floatingNetworkId;
    	      this.lbMethod = defaults.lbMethod;
    	      this.lbProvider = defaults.lbProvider;
    	      this.lbVersion = defaults.lbVersion;
    	      this.manageSecurityGroups = defaults.manageSecurityGroups;
    	      this.monitorDelay = defaults.monitorDelay;
    	      this.monitorMaxRetries = defaults.monitorMaxRetries;
    	      this.monitorTimeout = defaults.monitorTimeout;
    	      this.subnetId = defaults.subnetId;
    	      this.useOctavia = defaults.useOctavia;
        }

        @CustomType.Setter
        public Builder createMonitor(@Nullable Boolean createMonitor) {
            this.createMonitor = createMonitor;
            return this;
        }
        @CustomType.Setter
        public Builder floatingNetworkId(@Nullable String floatingNetworkId) {
            this.floatingNetworkId = floatingNetworkId;
            return this;
        }
        @CustomType.Setter
        public Builder lbMethod(@Nullable String lbMethod) {
            this.lbMethod = lbMethod;
            return this;
        }
        @CustomType.Setter
        public Builder lbProvider(@Nullable String lbProvider) {
            this.lbProvider = lbProvider;
            return this;
        }
        @CustomType.Setter
        public Builder lbVersion(@Nullable String lbVersion) {
            this.lbVersion = lbVersion;
            return this;
        }
        @CustomType.Setter
        public Builder manageSecurityGroups(@Nullable Boolean manageSecurityGroups) {
            this.manageSecurityGroups = manageSecurityGroups;
            return this;
        }
        @CustomType.Setter
        public Builder monitorDelay(@Nullable String monitorDelay) {
            this.monitorDelay = monitorDelay;
            return this;
        }
        @CustomType.Setter
        public Builder monitorMaxRetries(@Nullable Integer monitorMaxRetries) {
            this.monitorMaxRetries = monitorMaxRetries;
            return this;
        }
        @CustomType.Setter
        public Builder monitorTimeout(@Nullable String monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        @CustomType.Setter
        public Builder useOctavia(@Nullable Boolean useOctavia) {
            this.useOctavia = useOctavia;
            return this;
        }
        public ClusterCloudProviderOpenstackCloudProviderLoadBalancer build() {
            final var _resultValue = new ClusterCloudProviderOpenstackCloudProviderLoadBalancer();
            _resultValue.createMonitor = createMonitor;
            _resultValue.floatingNetworkId = floatingNetworkId;
            _resultValue.lbMethod = lbMethod;
            _resultValue.lbProvider = lbProvider;
            _resultValue.lbVersion = lbVersion;
            _resultValue.manageSecurityGroups = manageSecurityGroups;
            _resultValue.monitorDelay = monitorDelay;
            _resultValue.monitorMaxRetries = monitorMaxRetries;
            _resultValue.monitorTimeout = monitorTimeout;
            _resultValue.subnetId = subnetId;
            _resultValue.useOctavia = useOctavia;
            return _resultValue;
        }
    }
}
