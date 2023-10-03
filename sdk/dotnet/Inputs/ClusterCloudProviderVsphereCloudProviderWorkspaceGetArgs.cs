// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderVsphereCloudProviderWorkspaceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (string)
        /// </summary>
        [Input("datacenter", required: true)]
        public Input<string> Datacenter { get; set; } = null!;

        /// <summary>
        /// (string)
        /// </summary>
        [Input("defaultDatastore")]
        public Input<string>? DefaultDatastore { get; set; }

        /// <summary>
        /// Folder for S3 service. Available from Rancher v2.2.7 (string)
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("resourcepoolPath")]
        public Input<string>? ResourcepoolPath { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("server", required: true)]
        public Input<string> Server { get; set; } = null!;

        public ClusterCloudProviderVsphereCloudProviderWorkspaceGetArgs()
        {
        }
        public static new ClusterCloudProviderVsphereCloudProviderWorkspaceGetArgs Empty => new ClusterCloudProviderVsphereCloudProviderWorkspaceGetArgs();
    }
}
