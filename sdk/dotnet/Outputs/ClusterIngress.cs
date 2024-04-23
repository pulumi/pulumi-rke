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
    public sealed class ClusterIngress
    {
        /// <summary>
        /// Ingress Default Backend
        /// </summary>
        public readonly bool? DefaultBackend;
        /// <summary>
        /// Ingress controller dns policy
        /// </summary>
        public readonly string? DnsPolicy;
        /// <summary>
        /// Extra arguments for the ingress controller
        /// </summary>
        public readonly ImmutableDictionary<string, object>? ExtraArgs;
        /// <summary>
        /// Ingress controller http port
        /// </summary>
        public readonly int? HttpPort;
        /// <summary>
        /// Ingress controller https port
        /// </summary>
        public readonly int? HttpsPort;
        /// <summary>
        /// Ingress controller network mode
        /// </summary>
        public readonly string? NetworkMode;
        /// <summary>
        /// Node selector key pair
        /// </summary>
        public readonly ImmutableDictionary<string, object>? NodeSelector;
        /// <summary>
        /// Ingress controller options
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Options;
        /// <summary>
        /// Ingress controller provider
        /// </summary>
        public readonly string? Provider;

        [OutputConstructor]
        private ClusterIngress(
            bool? defaultBackend,

            string? dnsPolicy,

            ImmutableDictionary<string, object>? extraArgs,

            int? httpPort,

            int? httpsPort,

            string? networkMode,

            ImmutableDictionary<string, object>? nodeSelector,

            ImmutableDictionary<string, object>? options,

            string? provider)
        {
            DefaultBackend = defaultBackend;
            DnsPolicy = dnsPolicy;
            ExtraArgs = extraArgs;
            HttpPort = httpPort;
            HttpsPort = httpsPort;
            NetworkMode = networkMode;
            NodeSelector = nodeSelector;
            Options = options;
            Provider = provider;
        }
    }
}
