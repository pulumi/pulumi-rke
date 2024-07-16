// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAuthorizationArgs Empty = new ClusterAuthorizationArgs();

    /**
     * RKE mode for authorization. `rbac` and `none` modes are available. Default `rbac` (string)
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return RKE mode for authorization. `rbac` and `none` modes are available. Default `rbac` (string)
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Authorization mode options
     * 
     */
    @Import(name="options")
    private @Nullable Output<Map<String,Object>> options;

    /**
     * @return Authorization mode options
     * 
     */
    public Optional<Output<Map<String,Object>>> options() {
        return Optional.ofNullable(this.options);
    }

    private ClusterAuthorizationArgs() {}

    private ClusterAuthorizationArgs(ClusterAuthorizationArgs $) {
        this.mode = $.mode;
        this.options = $.options;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAuthorizationArgs $;

        public Builder() {
            $ = new ClusterAuthorizationArgs();
        }

        public Builder(ClusterAuthorizationArgs defaults) {
            $ = new ClusterAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode RKE mode for authorization. `rbac` and `none` modes are available. Default `rbac` (string)
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode RKE mode for authorization. `rbac` and `none` modes are available. Default `rbac` (string)
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param options Authorization mode options
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Map<String,Object>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Authorization mode options
         * 
         * @return builder
         * 
         */
        public Builder options(Map<String,Object> options) {
            return options(Output.of(options));
        }

        public ClusterAuthorizationArgs build() {
            return $;
        }
    }

}
