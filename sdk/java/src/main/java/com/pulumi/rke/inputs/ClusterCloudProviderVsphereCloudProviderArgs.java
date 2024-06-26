// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rke.inputs.ClusterCloudProviderVsphereCloudProviderDiskArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderVsphereCloudProviderGlobalArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderVsphereCloudProviderNetworkArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs;
import com.pulumi.rke.inputs.ClusterCloudProviderVsphereCloudProviderWorkspaceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderVsphereCloudProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderVsphereCloudProviderArgs Empty = new ClusterCloudProviderVsphereCloudProviderArgs();

    @Import(name="disk")
    private @Nullable Output<ClusterCloudProviderVsphereCloudProviderDiskArgs> disk;

    public Optional<Output<ClusterCloudProviderVsphereCloudProviderDiskArgs>> disk() {
        return Optional.ofNullable(this.disk);
    }

    @Import(name="global")
    private @Nullable Output<ClusterCloudProviderVsphereCloudProviderGlobalArgs> global;

    public Optional<Output<ClusterCloudProviderVsphereCloudProviderGlobalArgs>> global() {
        return Optional.ofNullable(this.global);
    }

    /**
     * RKE k8s cluster network configuration (list maxitems:1)
     * 
     */
    @Import(name="network")
    private @Nullable Output<ClusterCloudProviderVsphereCloudProviderNetworkArgs> network;

    /**
     * @return RKE k8s cluster network configuration (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterCloudProviderVsphereCloudProviderNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="virtualCenters", required=true)
    private Output<List<ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs>> virtualCenters;

    public Output<List<ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs>> virtualCenters() {
        return this.virtualCenters;
    }

    @Import(name="workspace", required=true)
    private Output<ClusterCloudProviderVsphereCloudProviderWorkspaceArgs> workspace;

    public Output<ClusterCloudProviderVsphereCloudProviderWorkspaceArgs> workspace() {
        return this.workspace;
    }

    private ClusterCloudProviderVsphereCloudProviderArgs() {}

    private ClusterCloudProviderVsphereCloudProviderArgs(ClusterCloudProviderVsphereCloudProviderArgs $) {
        this.disk = $.disk;
        this.global = $.global;
        this.network = $.network;
        this.virtualCenters = $.virtualCenters;
        this.workspace = $.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCloudProviderVsphereCloudProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderVsphereCloudProviderArgs $;

        public Builder() {
            $ = new ClusterCloudProviderVsphereCloudProviderArgs();
        }

        public Builder(ClusterCloudProviderVsphereCloudProviderArgs defaults) {
            $ = new ClusterCloudProviderVsphereCloudProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder disk(@Nullable Output<ClusterCloudProviderVsphereCloudProviderDiskArgs> disk) {
            $.disk = disk;
            return this;
        }

        public Builder disk(ClusterCloudProviderVsphereCloudProviderDiskArgs disk) {
            return disk(Output.of(disk));
        }

        public Builder global(@Nullable Output<ClusterCloudProviderVsphereCloudProviderGlobalArgs> global) {
            $.global = global;
            return this;
        }

        public Builder global(ClusterCloudProviderVsphereCloudProviderGlobalArgs global) {
            return global(Output.of(global));
        }

        /**
         * @param network RKE k8s cluster network configuration (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<ClusterCloudProviderVsphereCloudProviderNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network RKE k8s cluster network configuration (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder network(ClusterCloudProviderVsphereCloudProviderNetworkArgs network) {
            return network(Output.of(network));
        }

        public Builder virtualCenters(Output<List<ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs>> virtualCenters) {
            $.virtualCenters = virtualCenters;
            return this;
        }

        public Builder virtualCenters(List<ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs> virtualCenters) {
            return virtualCenters(Output.of(virtualCenters));
        }

        public Builder virtualCenters(ClusterCloudProviderVsphereCloudProviderVirtualCenterArgs... virtualCenters) {
            return virtualCenters(List.of(virtualCenters));
        }

        public Builder workspace(Output<ClusterCloudProviderVsphereCloudProviderWorkspaceArgs> workspace) {
            $.workspace = workspace;
            return this;
        }

        public Builder workspace(ClusterCloudProviderVsphereCloudProviderWorkspaceArgs workspace) {
            return workspace(Output.of(workspace));
        }

        public ClusterCloudProviderVsphereCloudProviderArgs build() {
            if ($.virtualCenters == null) {
                throw new MissingRequiredPropertyException("ClusterCloudProviderVsphereCloudProviderArgs", "virtualCenters");
            }
            if ($.workspace == null) {
                throw new MissingRequiredPropertyException("ClusterCloudProviderVsphereCloudProviderArgs", "workspace");
            }
            return $;
        }
    }

}
