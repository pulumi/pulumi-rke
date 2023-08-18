// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterServicesKubeApiDeprecatedGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable [AlwaysPullImages](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/#alwayspullimages) Admission controller plugin. [Rancher docs](https://rancher.com/docs/rke/latest/en/config-options/services/#kubernetes-api-server-options) (bool)
        /// </summary>
        [Input("alwaysPullImages")]
        public Input<bool>? AlwaysPullImages { get; set; }

        /// <summary>
        /// K8s audit log configuration. (list maxitem: 1)
        /// </summary>
        [Input("auditLog")]
        public Input<Inputs.ClusterServicesKubeApiDeprecatedAuditLogGetArgs>? AuditLog { get; set; }

        /// <summary>
        /// K8s event rate limit configuration. (list maxitem: 1)
        /// </summary>
        [Input("eventRateLimit")]
        public Input<Inputs.ClusterServicesKubeApiDeprecatedEventRateLimitGetArgs>? EventRateLimit { get; set; }

        [Input("extraArgs")]
        private InputMap<object>? _extraArgs;

        /// <summary>
        /// Extra arguments for the ingress controller (map)
        /// </summary>
        public InputMap<object> ExtraArgs
        {
            get => _extraArgs ?? (_extraArgs = new InputMap<object>());
            set => _extraArgs = value;
        }

        [Input("extraBinds")]
        private InputList<string>? _extraBinds;

        /// <summary>
        /// Extra binds for etcd service (list)
        /// </summary>
        public InputList<string> ExtraBinds
        {
            get => _extraBinds ?? (_extraBinds = new InputList<string>());
            set => _extraBinds = value;
        }

        [Input("extraEnvs")]
        private InputList<string>? _extraEnvs;

        /// <summary>
        /// Extra environment for etcd service (list)
        /// </summary>
        public InputList<string> ExtraEnvs
        {
            get => _extraEnvs ?? (_extraEnvs = new InputList<string>());
            set => _extraEnvs = value;
        }

        /// <summary>
        /// Docker image for etcd service (string)
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// Pod Security Policy option for kube API service (bool)
        /// </summary>
        [Input("podSecurityPolicy")]
        public Input<bool>? PodSecurityPolicy { get; set; }

        /// <summary>
        /// [Encrypt k8s secret data configration](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/). (list maxitem: 1)
        /// </summary>
        [Input("secretsEncryptionConfig")]
        public Input<Inputs.ClusterServicesKubeApiDeprecatedSecretsEncryptionConfigGetArgs>? SecretsEncryptionConfig { get; set; }

        /// <summary>
        /// Service Cluster IP Range option for kube API service (string)
        /// </summary>
        [Input("serviceClusterIpRange")]
        public Input<string>? ServiceClusterIpRange { get; set; }

        /// <summary>
        /// Service Node Port Range option for kube API service (string)
        /// </summary>
        [Input("serviceNodePortRange")]
        public Input<string>? ServiceNodePortRange { get; set; }

        public ClusterServicesKubeApiDeprecatedGetArgs()
        {
        }
        public static new ClusterServicesKubeApiDeprecatedGetArgs Empty => new ClusterServicesKubeApiDeprecatedGetArgs();
    }
}
