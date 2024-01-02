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
public final class ClusterCloudProviderVsphereCloudProviderGlobal {
    /**
     * @return (string)
     * 
     */
    private @Nullable String datacenter;
    /**
     * @return (string)
     * 
     */
    private @Nullable String datacenters;
    /**
     * @return (string)
     * 
     */
    private @Nullable String datastore;
    /**
     * @return (bool)
     * 
     */
    private @Nullable Boolean insecureFlag;
    /**
     * @return Registry password (string)
     * 
     */
    private @Nullable String password;
    /**
     * @return Port used for SSH communication (string)
     * 
     */
    private @Nullable String port;
    /**
     * @return (int)
     * 
     */
    private @Nullable Integer soapRoundtripCount;
    /**
     * @return Registry user (string)
     * 
     */
    private @Nullable String user;
    /**
     * @return (string)
     * 
     */
    private @Nullable String vmName;
    /**
     * @return (string)
     * 
     */
    private @Nullable String vmUuid;
    /**
     * @return (string)
     * 
     */
    private @Nullable String workingDir;

    private ClusterCloudProviderVsphereCloudProviderGlobal() {}
    /**
     * @return (string)
     * 
     */
    public Optional<String> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> datacenters() {
        return Optional.ofNullable(this.datacenters);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> datastore() {
        return Optional.ofNullable(this.datastore);
    }
    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> insecureFlag() {
        return Optional.ofNullable(this.insecureFlag);
    }
    /**
     * @return Registry password (string)
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Port used for SSH communication (string)
     * 
     */
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return (int)
     * 
     */
    public Optional<Integer> soapRoundtripCount() {
        return Optional.ofNullable(this.soapRoundtripCount);
    }
    /**
     * @return Registry user (string)
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> vmName() {
        return Optional.ofNullable(this.vmName);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> vmUuid() {
        return Optional.ofNullable(this.vmUuid);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> workingDir() {
        return Optional.ofNullable(this.workingDir);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderVsphereCloudProviderGlobal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String datacenter;
        private @Nullable String datacenters;
        private @Nullable String datastore;
        private @Nullable Boolean insecureFlag;
        private @Nullable String password;
        private @Nullable String port;
        private @Nullable Integer soapRoundtripCount;
        private @Nullable String user;
        private @Nullable String vmName;
        private @Nullable String vmUuid;
        private @Nullable String workingDir;
        public Builder() {}
        public Builder(ClusterCloudProviderVsphereCloudProviderGlobal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenter = defaults.datacenter;
    	      this.datacenters = defaults.datacenters;
    	      this.datastore = defaults.datastore;
    	      this.insecureFlag = defaults.insecureFlag;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.soapRoundtripCount = defaults.soapRoundtripCount;
    	      this.user = defaults.user;
    	      this.vmName = defaults.vmName;
    	      this.vmUuid = defaults.vmUuid;
    	      this.workingDir = defaults.workingDir;
        }

        @CustomType.Setter
        public Builder datacenter(@Nullable String datacenter) {

            this.datacenter = datacenter;
            return this;
        }
        @CustomType.Setter
        public Builder datacenters(@Nullable String datacenters) {

            this.datacenters = datacenters;
            return this;
        }
        @CustomType.Setter
        public Builder datastore(@Nullable String datastore) {

            this.datastore = datastore;
            return this;
        }
        @CustomType.Setter
        public Builder insecureFlag(@Nullable Boolean insecureFlag) {

            this.insecureFlag = insecureFlag;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder soapRoundtripCount(@Nullable Integer soapRoundtripCount) {

            this.soapRoundtripCount = soapRoundtripCount;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {

            this.user = user;
            return this;
        }
        @CustomType.Setter
        public Builder vmName(@Nullable String vmName) {

            this.vmName = vmName;
            return this;
        }
        @CustomType.Setter
        public Builder vmUuid(@Nullable String vmUuid) {

            this.vmUuid = vmUuid;
            return this;
        }
        @CustomType.Setter
        public Builder workingDir(@Nullable String workingDir) {

            this.workingDir = workingDir;
            return this;
        }
        public ClusterCloudProviderVsphereCloudProviderGlobal build() {
            final var _resultValue = new ClusterCloudProviderVsphereCloudProviderGlobal();
            _resultValue.datacenter = datacenter;
            _resultValue.datacenters = datacenters;
            _resultValue.datastore = datastore;
            _resultValue.insecureFlag = insecureFlag;
            _resultValue.password = password;
            _resultValue.port = port;
            _resultValue.soapRoundtripCount = soapRoundtripCount;
            _resultValue.user = user;
            _resultValue.vmName = vmName;
            _resultValue.vmUuid = vmUuid;
            _resultValue.workingDir = workingDir;
            return _resultValue;
        }
    }
}
