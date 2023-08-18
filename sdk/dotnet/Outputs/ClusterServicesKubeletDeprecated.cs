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
    public sealed class ClusterServicesKubeletDeprecated
    {
        /// <summary>
        /// Cluster DNS Server option for kubelet service (string)
        /// </summary>
        public readonly string? ClusterDnsServer;
        /// <summary>
        /// Cluster Domain option for kubelet service. Default `cluster.local` (string)
        /// </summary>
        public readonly string? ClusterDomain;
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
        /// Enable or disable failing when swap on is not supported (bool)
        /// </summary>
        public readonly bool? FailSwapOn;
        /// <summary>
        /// [Generate a certificate signed by the kube-ca](https://rancher.com/docs/rke/latest/en/config-options/services/#kubelet-serving-certificate-requirements). Default `false` (bool)
        /// </summary>
        public readonly bool? GenerateServingCertificate;
        /// <summary>
        /// Docker image for etcd service (string)
        /// </summary>
        public readonly string? Image;
        /// <summary>
        /// Infra container image for kubelet service (string)
        /// </summary>
        public readonly string? InfraContainerImage;

        [OutputConstructor]
        private ClusterServicesKubeletDeprecated(
            string? clusterDnsServer,

            string? clusterDomain,

            ImmutableDictionary<string, object>? extraArgs,

            ImmutableArray<string> extraBinds,

            ImmutableArray<string> extraEnvs,

            bool? failSwapOn,

            bool? generateServingCertificate,

            string? image,

            string? infraContainerImage)
        {
            ClusterDnsServer = clusterDnsServer;
            ClusterDomain = clusterDomain;
            ExtraArgs = extraArgs;
            ExtraBinds = extraBinds;
            ExtraEnvs = extraEnvs;
            FailSwapOn = failSwapOn;
            GenerateServingCertificate = generateServingCertificate;
            Image = image;
            InfraContainerImage = infraContainerImage;
        }
    }
}
