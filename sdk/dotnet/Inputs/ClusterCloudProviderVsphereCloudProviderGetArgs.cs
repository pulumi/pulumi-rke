// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderVsphereCloudProviderGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("disk")]
        public Input<Inputs.ClusterCloudProviderVsphereCloudProviderDiskGetArgs>? Disk { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("global")]
        public Input<Inputs.ClusterCloudProviderVsphereCloudProviderGlobalGetArgs>? Global { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("network")]
        public Input<Inputs.ClusterCloudProviderVsphereCloudProviderNetworkGetArgs>? Network { get; set; }

        [Input("virtualCenters", required: true)]
        private InputList<Inputs.ClusterCloudProviderVsphereCloudProviderVirtualCenterGetArgs>? _virtualCenters;

        /// <summary>
        /// (List)
        /// </summary>
        public InputList<Inputs.ClusterCloudProviderVsphereCloudProviderVirtualCenterGetArgs> VirtualCenters
        {
            get => _virtualCenters ?? (_virtualCenters = new InputList<Inputs.ClusterCloudProviderVsphereCloudProviderVirtualCenterGetArgs>());
            set => _virtualCenters = value;
        }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("workspace", required: true)]
        public Input<Inputs.ClusterCloudProviderVsphereCloudProviderWorkspaceGetArgs> Workspace { get; set; } = null!;

        public ClusterCloudProviderVsphereCloudProviderGetArgs()
        {
        }
    }
}
