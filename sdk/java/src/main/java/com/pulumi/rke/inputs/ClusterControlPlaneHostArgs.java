// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterControlPlaneHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterControlPlaneHostArgs Empty = new ClusterControlPlaneHostArgs();

    /**
     * Address of Bastion Host (string)
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return Address of Bastion Host (string)
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Name of the host provisioned via docker machine (string)
     * 
     */
    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    /**
     * @return Name of the host provisioned via docker machine (string)
     * 
     */
    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    private ClusterControlPlaneHostArgs() {}

    private ClusterControlPlaneHostArgs(ClusterControlPlaneHostArgs $) {
        this.address = $.address;
        this.nodeName = $.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterControlPlaneHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterControlPlaneHostArgs $;

        public Builder() {
            $ = new ClusterControlPlaneHostArgs();
        }

        public Builder(ClusterControlPlaneHostArgs defaults) {
            $ = new ClusterControlPlaneHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address Address of Bastion Host (string)
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Address of Bastion Host (string)
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param nodeName Name of the host provisioned via docker machine (string)
         * 
         * @return builder
         * 
         */
        public Builder nodeName(@Nullable Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName Name of the host provisioned via docker machine (string)
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        public ClusterControlPlaneHostArgs build() {
            return $;
        }
    }

}
