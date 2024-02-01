// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterIngress {
    /**
     * @return Ingress Default Backend
     * 
     */
    private @Nullable Boolean defaultBackend;
    /**
     * @return Ingress controller DNS policy. `ClusterFirstWithHostNet`, `ClusterFirst`, `Default`, and `None` are supported. [K8S dns Policy](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy) (string)
     * 
     */
    private @Nullable String dnsPolicy;
    /**
     * @return Extra arguments for scheduler service (map)
     * 
     */
    private @Nullable Map<String,Object> extraArgs;
    /**
     * @return Ingress controller http port (int)
     * 
     */
    private @Nullable Integer httpPort;
    /**
     * @return Ingress controller https port (int)
     * 
     */
    private @Nullable Integer httpsPort;
    /**
     * @return Networt mode for the ingress controller. `hostNetwork`, `hostPort` and `none` are supported (string)
     * 
     */
    private @Nullable String networkMode;
    /**
     * @return Node selector key pair (map)
     * 
     */
    private @Nullable Map<String,Object> nodeSelector;
    /**
     * @return Network provider options (map)
     * 
     */
    private @Nullable Map<String,Object> options;
    /**
     * @return Monitoring provider (string)
     * 
     */
    private @Nullable String provider;

    private ClusterIngress() {}
    /**
     * @return Ingress Default Backend
     * 
     */
    public Optional<Boolean> defaultBackend() {
        return Optional.ofNullable(this.defaultBackend);
    }
    /**
     * @return Ingress controller DNS policy. `ClusterFirstWithHostNet`, `ClusterFirst`, `Default`, and `None` are supported. [K8S dns Policy](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy) (string)
     * 
     */
    public Optional<String> dnsPolicy() {
        return Optional.ofNullable(this.dnsPolicy);
    }
    /**
     * @return Extra arguments for scheduler service (map)
     * 
     */
    public Map<String,Object> extraArgs() {
        return this.extraArgs == null ? Map.of() : this.extraArgs;
    }
    /**
     * @return Ingress controller http port (int)
     * 
     */
    public Optional<Integer> httpPort() {
        return Optional.ofNullable(this.httpPort);
    }
    /**
     * @return Ingress controller https port (int)
     * 
     */
    public Optional<Integer> httpsPort() {
        return Optional.ofNullable(this.httpsPort);
    }
    /**
     * @return Networt mode for the ingress controller. `hostNetwork`, `hostPort` and `none` are supported (string)
     * 
     */
    public Optional<String> networkMode() {
        return Optional.ofNullable(this.networkMode);
    }
    /**
     * @return Node selector key pair (map)
     * 
     */
    public Map<String,Object> nodeSelector() {
        return this.nodeSelector == null ? Map.of() : this.nodeSelector;
    }
    /**
     * @return Network provider options (map)
     * 
     */
    public Map<String,Object> options() {
        return this.options == null ? Map.of() : this.options;
    }
    /**
     * @return Monitoring provider (string)
     * 
     */
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIngress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean defaultBackend;
        private @Nullable String dnsPolicy;
        private @Nullable Map<String,Object> extraArgs;
        private @Nullable Integer httpPort;
        private @Nullable Integer httpsPort;
        private @Nullable String networkMode;
        private @Nullable Map<String,Object> nodeSelector;
        private @Nullable Map<String,Object> options;
        private @Nullable String provider;
        public Builder() {}
        public Builder(ClusterIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBackend = defaults.defaultBackend;
    	      this.dnsPolicy = defaults.dnsPolicy;
    	      this.extraArgs = defaults.extraArgs;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.networkMode = defaults.networkMode;
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.options = defaults.options;
    	      this.provider = defaults.provider;
        }

        @CustomType.Setter
        public Builder defaultBackend(@Nullable Boolean defaultBackend) {

            this.defaultBackend = defaultBackend;
            return this;
        }
        @CustomType.Setter
        public Builder dnsPolicy(@Nullable String dnsPolicy) {

            this.dnsPolicy = dnsPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder extraArgs(@Nullable Map<String,Object> extraArgs) {

            this.extraArgs = extraArgs;
            return this;
        }
        @CustomType.Setter
        public Builder httpPort(@Nullable Integer httpPort) {

            this.httpPort = httpPort;
            return this;
        }
        @CustomType.Setter
        public Builder httpsPort(@Nullable Integer httpsPort) {

            this.httpsPort = httpsPort;
            return this;
        }
        @CustomType.Setter
        public Builder networkMode(@Nullable String networkMode) {

            this.networkMode = networkMode;
            return this;
        }
        @CustomType.Setter
        public Builder nodeSelector(@Nullable Map<String,Object> nodeSelector) {

            this.nodeSelector = nodeSelector;
            return this;
        }
        @CustomType.Setter
        public Builder options(@Nullable Map<String,Object> options) {

            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {

            this.provider = provider;
            return this;
        }
        public ClusterIngress build() {
            final var _resultValue = new ClusterIngress();
            _resultValue.defaultBackend = defaultBackend;
            _resultValue.dnsPolicy = dnsPolicy;
            _resultValue.extraArgs = extraArgs;
            _resultValue.httpPort = httpPort;
            _resultValue.httpsPort = httpsPort;
            _resultValue.networkMode = networkMode;
            _resultValue.nodeSelector = nodeSelector;
            _resultValue.options = options;
            _resultValue.provider = provider;
            return _resultValue;
        }
    }
}
