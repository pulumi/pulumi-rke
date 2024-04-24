// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderOpenstackCloudProviderArgs : global::Pulumi.ResourceArgs
    {
        [Input("blockStorage")]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudProviderBlockStorageArgs>? BlockStorage { get; set; }

        [Input("global", required: true)]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudProviderGlobalArgs> Global { get; set; } = null!;

        [Input("loadBalancer")]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudProviderLoadBalancerArgs>? LoadBalancer { get; set; }

        [Input("metadata")]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudProviderMetadataArgs>? Metadata { get; set; }

        [Input("route")]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudProviderRouteArgs>? Route { get; set; }

        public ClusterCloudProviderOpenstackCloudProviderArgs()
        {
        }
        public static new ClusterCloudProviderOpenstackCloudProviderArgs Empty => new ClusterCloudProviderOpenstackCloudProviderArgs();
    }
}
