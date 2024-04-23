// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEtcdHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEtcdHostArgs Empty = new ClusterEtcdHostArgs();

    @Import(name="address")
    private @Nullable Output<String> address;

    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    private ClusterEtcdHostArgs() {}

    private ClusterEtcdHostArgs(ClusterEtcdHostArgs $) {
        this.address = $.address;
        this.nodeName = $.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEtcdHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEtcdHostArgs $;

        public Builder() {
            $ = new ClusterEtcdHostArgs();
        }

        public Builder(ClusterEtcdHostArgs defaults) {
            $ = new ClusterEtcdHostArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        public Builder address(String address) {
            return address(Output.of(address));
        }

        public Builder nodeName(@Nullable Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        public ClusterEtcdHostArgs build() {
            return $;
        }
    }

}
