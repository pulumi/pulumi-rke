// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ClusterNetworkWeaveNetworkProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNetworkWeaveNetworkProviderArgs Empty = new ClusterNetworkWeaveNetworkProviderArgs();

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    private ClusterNetworkWeaveNetworkProviderArgs() {}

    private ClusterNetworkWeaveNetworkProviderArgs(ClusterNetworkWeaveNetworkProviderArgs $) {
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNetworkWeaveNetworkProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNetworkWeaveNetworkProviderArgs $;

        public Builder() {
            $ = new ClusterNetworkWeaveNetworkProviderArgs();
        }

        public Builder(ClusterNetworkWeaveNetworkProviderArgs defaults) {
            $ = new ClusterNetworkWeaveNetworkProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public ClusterNetworkWeaveNetworkProviderArgs build() {
            if ($.password == null) {
                throw new MissingRequiredPropertyException("ClusterNetworkWeaveNetworkProviderArgs", "password");
            }
            return $;
        }
    }

}
