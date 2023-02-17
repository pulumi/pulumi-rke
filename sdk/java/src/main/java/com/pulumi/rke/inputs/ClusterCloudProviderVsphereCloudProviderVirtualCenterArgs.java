// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs Empty = new ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs();

    /**
     * (string)
     * 
     */
    @Import(name="datacenters", required=true)
    private Output<String> datacenters;

    /**
     * @return (string)
     * 
     */
    public Output<String> datacenters() {
        return this.datacenters;
    }

    /**
     * Name of virtualcenter config for Vsphere Cloud Provider config (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of virtualcenter config for Vsphere Cloud Provider config (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Registry password (string)
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Registry password (string)
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Port used for SSH communication (string)
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return Port used for SSH communication (string)
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * (int)
     * 
     */
    @Import(name="soapRoundtripCount")
    private @Nullable Output<Integer> soapRoundtripCount;

    /**
     * @return (int)
     * 
     */
    public Optional<Output<Integer>> soapRoundtripCount() {
        return Optional.ofNullable(this.soapRoundtripCount);
    }

    /**
     * Registry user (string)
     * 
     */
    @Import(name="user", required=true)
    private Output<String> user;

    /**
     * @return Registry user (string)
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    private ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs() {}

    private ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs(ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs $) {
        this.datacenters = $.datacenters;
        this.name = $.name;
        this.password = $.password;
        this.port = $.port;
        this.soapRoundtripCount = $.soapRoundtripCount;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs $;

        public Builder() {
            $ = new ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs();
        }

        public Builder(ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs defaults) {
            $ = new ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datacenters (string)
         * 
         * @return builder
         * 
         */
        public Builder datacenters(Output<String> datacenters) {
            $.datacenters = datacenters;
            return this;
        }

        /**
         * @param datacenters (string)
         * 
         * @return builder
         * 
         */
        public Builder datacenters(String datacenters) {
            return datacenters(Output.of(datacenters));
        }

        /**
         * @param name Name of virtualcenter config for Vsphere Cloud Provider config (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of virtualcenter config for Vsphere Cloud Provider config (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password Registry password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Registry password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port Port used for SSH communication (string)
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port used for SSH communication (string)
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        /**
         * @param soapRoundtripCount (int)
         * 
         * @return builder
         * 
         */
        public Builder soapRoundtripCount(@Nullable Output<Integer> soapRoundtripCount) {
            $.soapRoundtripCount = soapRoundtripCount;
            return this;
        }

        /**
         * @param soapRoundtripCount (int)
         * 
         * @return builder
         * 
         */
        public Builder soapRoundtripCount(Integer soapRoundtripCount) {
            return soapRoundtripCount(Output.of(soapRoundtripCount));
        }

        /**
         * @param user Registry user (string)
         * 
         * @return builder
         * 
         */
        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user Registry user (string)
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs build() {
            $.datacenters = Objects.requireNonNull($.datacenters, "expected parameter 'datacenters' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.user = Objects.requireNonNull($.user, "expected parameter 'user' to be non-null");
            return $;
        }
    }

}