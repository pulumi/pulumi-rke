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
        /// Enable [AlwaysPullImages](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/#alwayspullimages) Admission controller plugin. [Rancher docs](https://rancher.com/docs/rke/latest/en/config-options/services/#kubernetes-api-server-options) Default: `false` (bool)
        /// </summary>
        public readonly bool? AlwaysPullImages;
        /// <summary>
        /// K8s audit log configuration. (list maxitem: 1)
        /// </summary>
        public readonly Outputs.ClusterServicesKubeApiDeprecatedAuditLog? AuditLog;
        /// <summary>
        /// K8s event rate limit configuration. (list maxitem: 1)
        /// </summary>
        public readonly Outputs.ClusterServicesKubeApiDeprecatedEventRateLimit? EventRateLimit;
        /// <summary>
        /// Extra arguments for scheduler service (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? ExtraArgs;
        /// <summary>
        /// Extra binds for scheduler service (list)
        /// </summary>
        public readonly ImmutableArray<string> ExtraBinds;
        /// <summary>
        /// Extra environment for scheduler service (list)
        /// </summary>
        public readonly ImmutableArray<string> ExtraEnvs;
        /// <summary>
        /// Docker image for scheduler service (string)
        /// </summary>
        public readonly string? Image;
        /// <summary>
        /// Pod Security Policy option for kube API service. Default `false` (bool)
        /// </summary>
        public readonly bool? PodSecurityPolicy;
        /// <summary>
        /// [Encrypt k8s secret data configration](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/). (list maxitem: 1)
        /// </summary>
        public readonly Outputs.ClusterServicesKubeApiDeprecatedSecretsEncryptionConfig? SecretsEncryptionConfig;
        /// <summary>
        /// Service Cluster ip Range option for kube controller service (string)
        /// </summary>
        public readonly string? ServiceClusterIpRange;
        /// <summary>
        /// Service Node Port Range option for kube API service (string)
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
            PodSecurityPolicy = podSecurityPolicy;
            SecretsEncryptionConfig = secretsEncryptionConfig;
            ServiceClusterIpRange = serviceClusterIpRange;
            ServiceNodePortRange = serviceNodePortRange;
        }
    }
}
