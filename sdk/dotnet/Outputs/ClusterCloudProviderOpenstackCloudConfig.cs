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
    public sealed class ClusterCloudProviderOpenstackCloudConfig
    {
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterCloudProviderOpenstackCloudConfigBlockStorage? BlockStorage;
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterCloudProviderOpenstackCloudConfigGlobal Global;
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterCloudProviderOpenstackCloudConfigLoadBalancer? LoadBalancer;
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterCloudProviderOpenstackCloudConfigMetadata? Metadata;
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterCloudProviderOpenstackCloudConfigRoute? Route;

        [OutputConstructor]
        private ClusterCloudProviderOpenstackCloudConfig(
            Outputs.ClusterCloudProviderOpenstackCloudConfigBlockStorage? blockStorage,

            Outputs.ClusterCloudProviderOpenstackCloudConfigGlobal global,

            Outputs.ClusterCloudProviderOpenstackCloudConfigLoadBalancer? loadBalancer,

            Outputs.ClusterCloudProviderOpenstackCloudConfigMetadata? metadata,

            Outputs.ClusterCloudProviderOpenstackCloudConfigRoute? route)
        {
            BlockStorage = blockStorage;
            Global = global;
            LoadBalancer = loadBalancer;
            Metadata = metadata;
            Route = route;
        }
    }
}
