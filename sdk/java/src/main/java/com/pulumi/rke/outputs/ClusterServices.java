// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rke.outputs.ClusterServicesEtcd;
import com.pulumi.rke.outputs.ClusterServicesKubeApi;
import com.pulumi.rke.outputs.ClusterServicesKubeController;
import com.pulumi.rke.outputs.ClusterServicesKubelet;
import com.pulumi.rke.outputs.ClusterServicesKubeproxy;
import com.pulumi.rke.outputs.ClusterServicesScheduler;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterServices {
    private @Nullable ClusterServicesEtcd etcd;
    private @Nullable ClusterServicesKubeApi kubeApi;
    private @Nullable ClusterServicesKubeController kubeController;
    private @Nullable ClusterServicesKubelet kubelet;
    private @Nullable ClusterServicesKubeproxy kubeproxy;
    private @Nullable ClusterServicesScheduler scheduler;

    private ClusterServices() {}
    public Optional<ClusterServicesEtcd> etcd() {
        return Optional.ofNullable(this.etcd);
    }
    public Optional<ClusterServicesKubeApi> kubeApi() {
        return Optional.ofNullable(this.kubeApi);
    }
    public Optional<ClusterServicesKubeController> kubeController() {
        return Optional.ofNullable(this.kubeController);
    }
    public Optional<ClusterServicesKubelet> kubelet() {
        return Optional.ofNullable(this.kubelet);
    }
    public Optional<ClusterServicesKubeproxy> kubeproxy() {
        return Optional.ofNullable(this.kubeproxy);
    }
    public Optional<ClusterServicesScheduler> scheduler() {
        return Optional.ofNullable(this.scheduler);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterServices defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterServicesEtcd etcd;
        private @Nullable ClusterServicesKubeApi kubeApi;
        private @Nullable ClusterServicesKubeController kubeController;
        private @Nullable ClusterServicesKubelet kubelet;
        private @Nullable ClusterServicesKubeproxy kubeproxy;
        private @Nullable ClusterServicesScheduler scheduler;
        public Builder() {}
        public Builder(ClusterServices defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etcd = defaults.etcd;
    	      this.kubeApi = defaults.kubeApi;
    	      this.kubeController = defaults.kubeController;
    	      this.kubelet = defaults.kubelet;
    	      this.kubeproxy = defaults.kubeproxy;
    	      this.scheduler = defaults.scheduler;
        }

        @CustomType.Setter
        public Builder etcd(@Nullable ClusterServicesEtcd etcd) {

            this.etcd = etcd;
            return this;
        }
        @CustomType.Setter
        public Builder kubeApi(@Nullable ClusterServicesKubeApi kubeApi) {

            this.kubeApi = kubeApi;
            return this;
        }
        @CustomType.Setter
        public Builder kubeController(@Nullable ClusterServicesKubeController kubeController) {

            this.kubeController = kubeController;
            return this;
        }
        @CustomType.Setter
        public Builder kubelet(@Nullable ClusterServicesKubelet kubelet) {

            this.kubelet = kubelet;
            return this;
        }
        @CustomType.Setter
        public Builder kubeproxy(@Nullable ClusterServicesKubeproxy kubeproxy) {

            this.kubeproxy = kubeproxy;
            return this;
        }
        @CustomType.Setter
        public Builder scheduler(@Nullable ClusterServicesScheduler scheduler) {

            this.scheduler = scheduler;
            return this;
        }
        public ClusterServices build() {
            final var _resultValue = new ClusterServices();
            _resultValue.etcd = etcd;
            _resultValue.kubeApi = kubeApi;
            _resultValue.kubeController = kubeController;
            _resultValue.kubelet = kubelet;
            _resultValue.kubeproxy = kubeproxy;
            _resultValue.scheduler = scheduler;
            return _resultValue;
        }
    }
}
