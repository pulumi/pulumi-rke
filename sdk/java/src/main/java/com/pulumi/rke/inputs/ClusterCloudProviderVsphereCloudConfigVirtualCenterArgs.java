// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs Empty = new ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs();

    @Import(name="datacenters", required=true)
    private Output<String> datacenters;

    public Output<String> datacenters() {
        return this.datacenters;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    @Import(name="port")
    private @Nullable Output<String> port;

    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="soapRoundtripCount")
    private @Nullable Output<Integer> soapRoundtripCount;

    public Optional<Output<Integer>> soapRoundtripCount() {
        return Optional.ofNullable(this.soapRoundtripCount);
    }

    @Import(name="user", required=true)
    private Output<String> user;

    public Output<String> user() {
        return this.user;
    }

    private ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs() {}

    private ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs(ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs $) {
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
    public static Builder builder(ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs $;

        public Builder() {
            $ = new ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs();
        }

        public Builder(ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs defaults) {
            $ = new ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs(Objects.requireNonNull(defaults));
        }

        public Builder datacenters(Output<String> datacenters) {
            $.datacenters = datacenters;
            return this;
        }

        public Builder datacenters(String datacenters) {
            return datacenters(Output.of(datacenters));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        public Builder port(String port) {
            return port(Output.of(port));
        }

        public Builder soapRoundtripCount(@Nullable Output<Integer> soapRoundtripCount) {
            $.soapRoundtripCount = soapRoundtripCount;
            return this;
        }

        public Builder soapRoundtripCount(Integer soapRoundtripCount) {
            return soapRoundtripCount(Output.of(soapRoundtripCount));
        }

        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        public Builder user(String user) {
            return user(Output.of(user));
        }

        public ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs build() {
            if ($.datacenters == null) {
                throw new MissingRequiredPropertyException("ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs", "datacenters");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs", "name");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs", "password");
            }
            if ($.user == null) {
                throw new MissingRequiredPropertyException("ClusterCloudProviderVsphereCloudConfigVirtualCenterArgs", "user");
            }
            return $;
        }
    }

}
