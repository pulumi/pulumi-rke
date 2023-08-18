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
    public sealed class ClusterCloudProviderAwsCloudConfigServiceOverride
    {
        /// <summary>
        /// Use service instead
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string Service;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? SigningMethod;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? SigningName;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? SigningRegion;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? Url;

        [OutputConstructor]
        private ClusterCloudProviderAwsCloudConfigServiceOverride(
            string? key,

            string? region,

            string service,

            string? signingMethod,

            string? signingName,

            string? signingRegion,

            string? url)
        {
            Key = key;
            Region = region;
            Service = service;
            SigningMethod = signingMethod;
            SigningName = signingName;
            SigningRegion = signingRegion;
            Url = url;
        }
    }
}
