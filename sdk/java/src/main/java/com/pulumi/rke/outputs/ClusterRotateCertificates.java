// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRotateCertificates {
    /**
     * @return Rotate CA Certificates. Default `false` (bool)
     * 
     */
    private @Nullable Boolean caCertificates;
    /**
     * @return Services to rotate their certs. `etcd`, `kubelet`, `kube-apiserver`, `kube-proxy`, `kube-scheduler` and `kube-controller-manager` are supported (list)
     * 
     */
    private @Nullable List<String> services;

    private ClusterRotateCertificates() {}
    /**
     * @return Rotate CA Certificates. Default `false` (bool)
     * 
     */
    public Optional<Boolean> caCertificates() {
        return Optional.ofNullable(this.caCertificates);
    }
    /**
     * @return Services to rotate their certs. `etcd`, `kubelet`, `kube-apiserver`, `kube-proxy`, `kube-scheduler` and `kube-controller-manager` are supported (list)
     * 
     */
    public List<String> services() {
        return this.services == null ? List.of() : this.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRotateCertificates defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean caCertificates;
        private @Nullable List<String> services;
        public Builder() {}
        public Builder(ClusterRotateCertificates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificates = defaults.caCertificates;
    	      this.services = defaults.services;
        }

        @CustomType.Setter
        public Builder caCertificates(@Nullable Boolean caCertificates) {
            this.caCertificates = caCertificates;
            return this;
        }
        @CustomType.Setter
        public Builder services(@Nullable List<String> services) {
            this.services = services;
            return this;
        }
        public Builder services(String... services) {
            return services(List.of(services));
        }
        public ClusterRotateCertificates build() {
            final var o = new ClusterRotateCertificates();
            o.caCertificates = caCertificates;
            o.services = services;
            return o;
        }
    }
}
