// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterIngressArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterIngressArgs Empty = new ClusterIngressArgs();

    /**
     * Ingress Default Backend
     * 
     */
    @Import(name="defaultBackend")
    private @Nullable Output<Boolean> defaultBackend;

    /**
     * @return Ingress Default Backend
     * 
     */
    public Optional<Output<Boolean>> defaultBackend() {
        return Optional.ofNullable(this.defaultBackend);
    }

    /**
     * Ingress controller dns policy
     * 
     */
    @Import(name="dnsPolicy")
    private @Nullable Output<String> dnsPolicy;

    /**
     * @return Ingress controller dns policy
     * 
     */
    public Optional<Output<String>> dnsPolicy() {
        return Optional.ofNullable(this.dnsPolicy);
    }

    /**
     * Extra arguments for the ingress controller
     * 
     */
    @Import(name="extraArgs")
    private @Nullable Output<Map<String,String>> extraArgs;

    /**
     * @return Extra arguments for the ingress controller
     * 
     */
    public Optional<Output<Map<String,String>>> extraArgs() {
        return Optional.ofNullable(this.extraArgs);
    }

    /**
     * Ingress controller http port
     * 
     */
    @Import(name="httpPort")
    private @Nullable Output<Integer> httpPort;

    /**
     * @return Ingress controller http port
     * 
     */
    public Optional<Output<Integer>> httpPort() {
        return Optional.ofNullable(this.httpPort);
    }

    /**
     * Ingress controller https port
     * 
     */
    @Import(name="httpsPort")
    private @Nullable Output<Integer> httpsPort;

    /**
     * @return Ingress controller https port
     * 
     */
    public Optional<Output<Integer>> httpsPort() {
        return Optional.ofNullable(this.httpsPort);
    }

    /**
     * Ingress controller network mode
     * 
     */
    @Import(name="networkMode")
    private @Nullable Output<String> networkMode;

    /**
     * @return Ingress controller network mode
     * 
     */
    public Optional<Output<String>> networkMode() {
        return Optional.ofNullable(this.networkMode);
    }

    /**
     * Node selector key pair
     * 
     */
    @Import(name="nodeSelector")
    private @Nullable Output<Map<String,String>> nodeSelector;

    /**
     * @return Node selector key pair
     * 
     */
    public Optional<Output<Map<String,String>>> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }

    /**
     * Ingress controller options
     * 
     */
    @Import(name="options")
    private @Nullable Output<Map<String,String>> options;

    /**
     * @return Ingress controller options
     * 
     */
    public Optional<Output<Map<String,String>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Ingress controller provider
     * 
     */
    @Import(name="provider")
    private @Nullable Output<String> provider;

    /**
     * @return Ingress controller provider
     * 
     */
    public Optional<Output<String>> provider() {
        return Optional.ofNullable(this.provider);
    }

    private ClusterIngressArgs() {}

    private ClusterIngressArgs(ClusterIngressArgs $) {
        this.defaultBackend = $.defaultBackend;
        this.dnsPolicy = $.dnsPolicy;
        this.extraArgs = $.extraArgs;
        this.httpPort = $.httpPort;
        this.httpsPort = $.httpsPort;
        this.networkMode = $.networkMode;
        this.nodeSelector = $.nodeSelector;
        this.options = $.options;
        this.provider = $.provider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterIngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterIngressArgs $;

        public Builder() {
            $ = new ClusterIngressArgs();
        }

        public Builder(ClusterIngressArgs defaults) {
            $ = new ClusterIngressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultBackend Ingress Default Backend
         * 
         * @return builder
         * 
         */
        public Builder defaultBackend(@Nullable Output<Boolean> defaultBackend) {
            $.defaultBackend = defaultBackend;
            return this;
        }

        /**
         * @param defaultBackend Ingress Default Backend
         * 
         * @return builder
         * 
         */
        public Builder defaultBackend(Boolean defaultBackend) {
            return defaultBackend(Output.of(defaultBackend));
        }

        /**
         * @param dnsPolicy Ingress controller dns policy
         * 
         * @return builder
         * 
         */
        public Builder dnsPolicy(@Nullable Output<String> dnsPolicy) {
            $.dnsPolicy = dnsPolicy;
            return this;
        }

        /**
         * @param dnsPolicy Ingress controller dns policy
         * 
         * @return builder
         * 
         */
        public Builder dnsPolicy(String dnsPolicy) {
            return dnsPolicy(Output.of(dnsPolicy));
        }

        /**
         * @param extraArgs Extra arguments for the ingress controller
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(@Nullable Output<Map<String,String>> extraArgs) {
            $.extraArgs = extraArgs;
            return this;
        }

        /**
         * @param extraArgs Extra arguments for the ingress controller
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(Map<String,String> extraArgs) {
            return extraArgs(Output.of(extraArgs));
        }

        /**
         * @param httpPort Ingress controller http port
         * 
         * @return builder
         * 
         */
        public Builder httpPort(@Nullable Output<Integer> httpPort) {
            $.httpPort = httpPort;
            return this;
        }

        /**
         * @param httpPort Ingress controller http port
         * 
         * @return builder
         * 
         */
        public Builder httpPort(Integer httpPort) {
            return httpPort(Output.of(httpPort));
        }

        /**
         * @param httpsPort Ingress controller https port
         * 
         * @return builder
         * 
         */
        public Builder httpsPort(@Nullable Output<Integer> httpsPort) {
            $.httpsPort = httpsPort;
            return this;
        }

        /**
         * @param httpsPort Ingress controller https port
         * 
         * @return builder
         * 
         */
        public Builder httpsPort(Integer httpsPort) {
            return httpsPort(Output.of(httpsPort));
        }

        /**
         * @param networkMode Ingress controller network mode
         * 
         * @return builder
         * 
         */
        public Builder networkMode(@Nullable Output<String> networkMode) {
            $.networkMode = networkMode;
            return this;
        }

        /**
         * @param networkMode Ingress controller network mode
         * 
         * @return builder
         * 
         */
        public Builder networkMode(String networkMode) {
            return networkMode(Output.of(networkMode));
        }

        /**
         * @param nodeSelector Node selector key pair
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(@Nullable Output<Map<String,String>> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * @param nodeSelector Node selector key pair
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(Map<String,String> nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        /**
         * @param options Ingress controller options
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Map<String,String>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Ingress controller options
         * 
         * @return builder
         * 
         */
        public Builder options(Map<String,String> options) {
            return options(Output.of(options));
        }

        /**
         * @param provider Ingress controller provider
         * 
         * @return builder
         * 
         */
        public Builder provider(@Nullable Output<String> provider) {
            $.provider = provider;
            return this;
        }

        /**
         * @param provider Ingress controller provider
         * 
         * @return builder
         * 
         */
        public Builder provider(String provider) {
            return provider(Output.of(provider));
        }

        public ClusterIngressArgs build() {
            return $;
        }
    }

}
