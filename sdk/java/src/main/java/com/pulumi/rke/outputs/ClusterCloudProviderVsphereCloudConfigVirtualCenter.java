// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudProviderVsphereCloudConfigVirtualCenter {
    /**
     * @return (string)
     * 
     */
    private String datacenters;
    /**
     * @return Name of virtualcenter config for Vsphere Cloud Provider config (string)
     * 
     */
    private String name;
    /**
     * @return Registry password (string)
     * 
     */
    private String password;
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
    private String user;

    private ClusterCloudProviderVsphereCloudConfigVirtualCenter() {}
    /**
     * @return (string)
     * 
     */
    public String datacenters() {
        return this.datacenters;
    }
    /**
     * @return Name of virtualcenter config for Vsphere Cloud Provider config (string)
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Registry password (string)
     * 
     */
    public String password() {
        return this.password;
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
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderVsphereCloudConfigVirtualCenter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String datacenters;
        private String name;
        private String password;
        private @Nullable String port;
        private @Nullable Integer soapRoundtripCount;
        private String user;
        public Builder() {}
        public Builder(ClusterCloudProviderVsphereCloudConfigVirtualCenter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenters = defaults.datacenters;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.soapRoundtripCount = defaults.soapRoundtripCount;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder datacenters(String datacenters) {
            this.datacenters = Objects.requireNonNull(datacenters);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
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
        public Builder user(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }
        public ClusterCloudProviderVsphereCloudConfigVirtualCenter build() {
            final var o = new ClusterCloudProviderVsphereCloudConfigVirtualCenter();
            o.datacenters = datacenters;
            o.name = name;
            o.password = password;
            o.port = port;
            o.soapRoundtripCount = soapRoundtripCount;
            o.user = user;
            return o;
        }
    }
}