// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderAwsCloudProviderServiceOverrideGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        [Input("signingMethod")]
        public Input<string>? SigningMethod { get; set; }

        [Input("signingName")]
        public Input<string>? SigningName { get; set; }

        [Input("signingRegion")]
        public Input<string>? SigningRegion { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        public ClusterCloudProviderAwsCloudProviderServiceOverrideGetArgs()
        {
        }
        public static new ClusterCloudProviderAwsCloudProviderServiceOverrideGetArgs Empty => new ClusterCloudProviderAwsCloudProviderServiceOverrideGetArgs();
    }
}
