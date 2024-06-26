// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Outputs
{

    [OutputType]
    public sealed class ClusterCloudProviderVsphereCloudProvider
    {
        public readonly Outputs.ClusterCloudProviderVsphereCloudProviderDisk? Disk;
        public readonly Outputs.ClusterCloudProviderVsphereCloudProviderGlobal? Global;
        /// <summary>
        /// RKE k8s cluster network configuration (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterCloudProviderVsphereCloudProviderNetwork? Network;
        public readonly ImmutableArray<Outputs.ClusterCloudProviderVsphereCloudProviderVirtualCenter> VirtualCenters;
        public readonly Outputs.ClusterCloudProviderVsphereCloudProviderWorkspace Workspace;

        [OutputConstructor]
        private ClusterCloudProviderVsphereCloudProvider(
            Outputs.ClusterCloudProviderVsphereCloudProviderDisk? disk,

            Outputs.ClusterCloudProviderVsphereCloudProviderGlobal? global,

            Outputs.ClusterCloudProviderVsphereCloudProviderNetwork? network,

            ImmutableArray<Outputs.ClusterCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters,

            Outputs.ClusterCloudProviderVsphereCloudProviderWorkspace workspace)
        {
            Disk = disk;
            Global = global;
            Network = network;
            VirtualCenters = virtualCenters;
            Workspace = workspace;
        }
    }
}
