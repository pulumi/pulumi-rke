// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderAwsCloudProviderServiceOverrideArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Use service instead
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        /// <summary>
        /// (string)
        /// </summary>
        [Input("signingMethod")]
        public Input<string>? SigningMethod { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("signingName")]
        public Input<string>? SigningName { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("signingRegion")]
        public Input<string>? SigningRegion { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public ClusterCloudProviderAwsCloudProviderServiceOverrideArgs()
        {
        }
        public static new ClusterCloudProviderAwsCloudProviderServiceOverrideArgs Empty => new ClusterCloudProviderAwsCloudProviderServiceOverrideArgs();
    }
}
