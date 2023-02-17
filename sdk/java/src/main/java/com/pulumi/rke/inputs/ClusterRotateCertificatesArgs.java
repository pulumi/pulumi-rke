// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRotateCertificatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRotateCertificatesArgs Empty = new ClusterRotateCertificatesArgs();

    /**
     * Rotate CA Certificates. Default `false` (bool)
     * 
     */
    @Import(name="caCertificates")
    private @Nullable Output<Boolean> caCertificates;

    /**
     * @return Rotate CA Certificates. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> caCertificates() {
        return Optional.ofNullable(this.caCertificates);
    }

    /**
     * Services to rotate their certs. `etcd`, `kubelet`, `kube-apiserver`, `kube-proxy`, `kube-scheduler` and `kube-controller-manager` are supported (list)
     * 
     */
    @Import(name="services")
    private @Nullable Output<List<String>> services;

    /**
     * @return Services to rotate their certs. `etcd`, `kubelet`, `kube-apiserver`, `kube-proxy`, `kube-scheduler` and `kube-controller-manager` are supported (list)
     * 
     */
    public Optional<Output<List<String>>> services() {
        return Optional.ofNullable(this.services);
    }

    private ClusterRotateCertificatesArgs() {}

    private ClusterRotateCertificatesArgs(ClusterRotateCertificatesArgs $) {
        this.caCertificates = $.caCertificates;
        this.services = $.services;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRotateCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRotateCertificatesArgs $;

        public Builder() {
            $ = new ClusterRotateCertificatesArgs();
        }

        public Builder(ClusterRotateCertificatesArgs defaults) {
            $ = new ClusterRotateCertificatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caCertificates Rotate CA Certificates. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder caCertificates(@Nullable Output<Boolean> caCertificates) {
            $.caCertificates = caCertificates;
            return this;
        }

        /**
         * @param caCertificates Rotate CA Certificates. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder caCertificates(Boolean caCertificates) {
            return caCertificates(Output.of(caCertificates));
        }

        /**
         * @param services Services to rotate their certs. `etcd`, `kubelet`, `kube-apiserver`, `kube-proxy`, `kube-scheduler` and `kube-controller-manager` are supported (list)
         * 
         * @return builder
         * 
         */
        public Builder services(@Nullable Output<List<String>> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services Services to rotate their certs. `etcd`, `kubelet`, `kube-apiserver`, `kube-proxy`, `kube-scheduler` and `kube-controller-manager` are supported (list)
         * 
         * @return builder
         * 
         */
        public Builder services(List<String> services) {
            return services(Output.of(services));
        }

        /**
         * @param services Services to rotate their certs. `etcd`, `kubelet`, `kube-apiserver`, `kube-proxy`, `kube-scheduler` and `kube-controller-manager` are supported (list)
         * 
         * @return builder
         * 
         */
        public Builder services(String... services) {
            return services(List.of(services));
        }

        public ClusterRotateCertificatesArgs build() {
            return $;
        }
    }

}