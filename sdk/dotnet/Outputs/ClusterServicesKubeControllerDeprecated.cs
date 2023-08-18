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
    public sealed class ClusterServicesKubeControllerDeprecated
    {
        /// <summary>
        /// Cluster CIDR option for kube controller service (string)
        /// </summary>
        public readonly string? ClusterCidr;
        /// <summary>
        /// Extra arguments for the ingress controller (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? ExtraArgs;
        /// <summary>
        /// Extra binds for etcd service (list)
        /// </summary>
        public readonly ImmutableArray<string> ExtraBinds;
        /// <summary>
        /// Extra environment for etcd service (list)
        /// </summary>
        public readonly ImmutableArray<string> ExtraEnvs;
        /// <summary>
        /// Docker image for etcd service (string)
        /// </summary>
        public readonly string? Image;
        /// <summary>
        /// Service Cluster IP Range option for kube API service (string)
        /// </summary>
        public readonly string? ServiceClusterIpRange;

        [OutputConstructor]
        private ClusterServicesKubeControllerDeprecated(
            string? clusterCidr,

            ImmutableDictionary<string, object>? extraArgs,

            ImmutableArray<string> extraBinds,

            ImmutableArray<string> extraEnvs,

            string? image,

            string? serviceClusterIpRange)
        {
            ClusterCidr = clusterCidr;
            ExtraArgs = extraArgs;
            ExtraBinds = extraBinds;
            ExtraEnvs = extraEnvs;
            Image = image;
            ServiceClusterIpRange = serviceClusterIpRange;
        }
    }
}
