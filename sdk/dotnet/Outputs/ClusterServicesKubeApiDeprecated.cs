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
    public sealed class ClusterServicesKubeApiDeprecated
    {
        /// <summary>
        /// Enable/Disable AlwaysPullImages admissions plugin
        /// </summary>
        public readonly bool? AlwaysPullImages;
        public readonly Outputs.ClusterServicesKubeApiDeprecatedAuditLog? AuditLog;
        public readonly Outputs.ClusterServicesKubeApiDeprecatedEventRateLimit? EventRateLimit;
        /// <summary>
        /// Extra arguments that are added to the kube-api services
        /// </summary>
        public readonly ImmutableDictionary<string, object>? ExtraArgs;
        /// <summary>
        /// Extra binds added to the controlplane nodes
        /// </summary>
        public readonly ImmutableArray<string> ExtraBinds;
        /// <summary>
        /// Extra env added to the controlplane nodes
        /// </summary>
        public readonly ImmutableArray<string> ExtraEnvs;
        public readonly string? Image;
        /// <summary>
        /// Built-in PodSecurityPolicy (privileged or restricted)
        /// </summary>
        public readonly string? PodSecurityConfiguration;
        /// <summary>
        /// Enabled/Disable PodSecurityPolicy
        /// </summary>
        public readonly bool? PodSecurityPolicy;
        public readonly Outputs.ClusterServicesKubeApiDeprecatedSecretsEncryptionConfig? SecretsEncryptionConfig;
        /// <summary>
        /// Virtual IP range that will be used by Kubernetes services
        /// </summary>
        public readonly string? ServiceClusterIpRange;
        /// <summary>
        /// Port range for services defined with NodePort type
        /// </summary>
        public readonly string? ServiceNodePortRange;

        [OutputConstructor]
        private ClusterServicesKubeApiDeprecated(
            bool? alwaysPullImages,

            Outputs.ClusterServicesKubeApiDeprecatedAuditLog? auditLog,

            Outputs.ClusterServicesKubeApiDeprecatedEventRateLimit? eventRateLimit,

            ImmutableDictionary<string, object>? extraArgs,

            ImmutableArray<string> extraBinds,

            ImmutableArray<string> extraEnvs,

            string? image,

            string? podSecurityConfiguration,

            bool? podSecurityPolicy,

            Outputs.ClusterServicesKubeApiDeprecatedSecretsEncryptionConfig? secretsEncryptionConfig,

            string? serviceClusterIpRange,

            string? serviceNodePortRange)
        {
            AlwaysPullImages = alwaysPullImages;
            AuditLog = auditLog;
            EventRateLimit = eventRateLimit;
            ExtraArgs = extraArgs;
            ExtraBinds = extraBinds;
            ExtraEnvs = extraEnvs;
            Image = image;
            PodSecurityConfiguration = podSecurityConfiguration;
            PodSecurityPolicy = podSecurityPolicy;
            SecretsEncryptionConfig = secretsEncryptionConfig;
            ServiceClusterIpRange = serviceClusterIpRange;
            ServiceNodePortRange = serviceNodePortRange;
        }
    }
}
