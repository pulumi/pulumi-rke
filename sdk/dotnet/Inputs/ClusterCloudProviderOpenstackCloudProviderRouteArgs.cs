// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderOpenstackCloudProviderRouteArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// (string)
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        public ClusterCloudProviderOpenstackCloudProviderRouteArgs()
        {
        }
    }
}
