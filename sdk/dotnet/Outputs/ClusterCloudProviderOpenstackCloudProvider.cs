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
    public sealed class ClusterCloudProviderOpenstackCloudProvider
    {
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterCloudProviderOpenstackCloudProviderBlockStorage? BlockStorage;
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterCloudProviderOpenstackCloudProviderGlobal Global;
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterCloudProviderOpenstackCloudProviderLoadBalancer? LoadBalancer;
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterCloudProviderOpenstackCloudProviderMetadata? Metadata;
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterCloudProviderOpenstackCloudProviderRoute? Route;

        [OutputConstructor]
        private ClusterCloudProviderOpenstackCloudProvider(
            Outputs.ClusterCloudProviderOpenstackCloudProviderBlockStorage? blockStorage,

            Outputs.ClusterCloudProviderOpenstackCloudProviderGlobal global,

            Outputs.ClusterCloudProviderOpenstackCloudProviderLoadBalancer? loadBalancer,

            Outputs.ClusterCloudProviderOpenstackCloudProviderMetadata? metadata,

            Outputs.ClusterCloudProviderOpenstackCloudProviderRoute? route)
        {
            BlockStorage = blockStorage;
            Global = global;
            LoadBalancer = loadBalancer;
            Metadata = metadata;
            Route = route;
        }
    }
}
