// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderOpenstackCloudConfigMetadataGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("requestTimeout")]
        public Input<int>? RequestTimeout { get; set; }

        [Input("searchOrder")]
        public Input<string>? SearchOrder { get; set; }

        public ClusterCloudProviderOpenstackCloudConfigMetadataGetArgs()
        {
        }
        public static new ClusterCloudProviderOpenstackCloudConfigMetadataGetArgs Empty => new ClusterCloudProviderOpenstackCloudConfigMetadataGetArgs();
    }
}
