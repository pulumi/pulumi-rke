// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterServicesKubeletDeprecatedGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Computed) RKE k8s cluster dns server (string)
        /// </summary>
        [Input("clusterDnsServer")]
        public Input<string>? ClusterDnsServer { get; set; }

        /// <summary>
        /// (Computed) RKE k8s cluster domain (string)
        /// </summary>
        [Input("clusterDomain")]
        public Input<string>? ClusterDomain { get; set; }

        [Input("extraArgs")]
        private InputMap<object>? _extraArgs;

        /// <summary>
        /// Extra arguments that are added to the kubelet services
        /// </summary>
        public InputMap<object> ExtraArgs
        {
            get => _extraArgs ?? (_extraArgs = new InputMap<object>());
            set => _extraArgs = value;
        }

        [Input("extraBinds")]
        private InputList<string>? _extraBinds;

        /// <summary>
        /// Extra binds added to the worker nodes
        /// </summary>
        public InputList<string> ExtraBinds
        {
            get => _extraBinds ?? (_extraBinds = new InputList<string>());
            set => _extraBinds = value;
        }

        [Input("extraEnvs")]
        private InputList<string>? _extraEnvs;

        /// <summary>
        /// Extra env added to the nodes
        /// </summary>
        public InputList<string> ExtraEnvs
        {
            get => _extraEnvs ?? (_extraEnvs = new InputList<string>());
            set => _extraEnvs = value;
        }

        /// <summary>
        /// Fail if swap is enabled
        /// </summary>
        [Input("failSwapOn")]
        public Input<bool>? FailSwapOn { get; set; }

        /// <summary>
        /// [Generate a certificate signed by the kube-ca](https://rancher.com/docs/rke/latest/en/config-options/services/#kubelet-serving-certificate-requirements). Default `false` (bool)
        /// </summary>
        [Input("generateServingCertificate")]
        public Input<bool>? GenerateServingCertificate { get; set; }

        /// <summary>
        /// Docker image of the kubelet service
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// The image whose network/ipc namespaces containers in each pod will use
        /// </summary>
        [Input("infraContainerImage")]
        public Input<string>? InfraContainerImage { get; set; }

        public ClusterServicesKubeletDeprecatedGetArgs()
        {
        }
        public static new ClusterServicesKubeletDeprecatedGetArgs Empty => new ClusterServicesKubeletDeprecatedGetArgs();
    }
}
