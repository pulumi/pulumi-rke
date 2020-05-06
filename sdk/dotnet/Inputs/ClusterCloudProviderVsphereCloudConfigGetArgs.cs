// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderVsphereCloudConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("disk")]
        public Input<Inputs.ClusterCloudProviderVsphereCloudConfigDiskGetArgs>? Disk { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("global")]
        public Input<Inputs.ClusterCloudProviderVsphereCloudConfigGlobalGetArgs>? Global { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("network")]
        public Input<Inputs.ClusterCloudProviderVsphereCloudConfigNetworkGetArgs>? Network { get; set; }

        [Input("virtualCenters", required: true)]
        private InputList<Inputs.ClusterCloudProviderVsphereCloudConfigVirtualCenterGetArgs>? _virtualCenters;

        /// <summary>
        /// (List)
        /// </summary>
        public InputList<Inputs.ClusterCloudProviderVsphereCloudConfigVirtualCenterGetArgs> VirtualCenters
        {
            get => _virtualCenters ?? (_virtualCenters = new InputList<Inputs.ClusterCloudProviderVsphereCloudConfigVirtualCenterGetArgs>());
            set => _virtualCenters = value;
        }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("workspace", required: true)]
        public Input<Inputs.ClusterCloudProviderVsphereCloudConfigWorkspaceGetArgs> Workspace { get; set; } = null!;

        public ClusterCloudProviderVsphereCloudConfigGetArgs()
        {
        }
    }
}
