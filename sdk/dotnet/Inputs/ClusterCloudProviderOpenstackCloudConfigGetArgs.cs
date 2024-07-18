// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderOpenstackCloudConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("blockStorage")]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudConfigBlockStorageGetArgs>? BlockStorage { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("global", required: true)]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudConfigGlobalGetArgs> Global { get; set; } = null!;

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("loadBalancer")]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudConfigLoadBalancerGetArgs>? LoadBalancer { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("metadata")]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudConfigMetadataGetArgs>? Metadata { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("route")]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudConfigRouteGetArgs>? Route { get; set; }

        public ClusterCloudProviderOpenstackCloudConfigGetArgs()
        {
        }
        public static new ClusterCloudProviderOpenstackCloudConfigGetArgs Empty => new ClusterCloudProviderOpenstackCloudConfigGetArgs();
    }
}
