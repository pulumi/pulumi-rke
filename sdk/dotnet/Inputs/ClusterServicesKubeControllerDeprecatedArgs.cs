// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterServicesKubeControllerDeprecatedArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Computed) RKE k8s cluster cidr (string)
        /// </summary>
        [Input("clusterCidr")]
        public Input<string>? ClusterCidr { get; set; }

        [Input("extraArgs")]
        private InputMap<string>? _extraArgs;

        /// <summary>
        /// Extra arguments that are added to the kube-controller service
        /// </summary>
        public InputMap<string> ExtraArgs
        {
            get => _extraArgs ?? (_extraArgs = new InputMap<string>());
            set => _extraArgs = value;
        }

        [Input("extraBinds")]
        private InputList<string>? _extraBinds;

        /// <summary>
        /// Extra binds added to the controlplane nodes
        /// </summary>
        public InputList<string> ExtraBinds
        {
            get => _extraBinds ?? (_extraBinds = new InputList<string>());
            set => _extraBinds = value;
        }

        [Input("extraEnvs")]
        private InputList<string>? _extraEnvs;

        /// <summary>
        /// Extra env added to the controlplane nodes
        /// </summary>
        public InputList<string> ExtraEnvs
        {
            get => _extraEnvs ?? (_extraEnvs = new InputList<string>());
            set => _extraEnvs = value;
        }

        /// <summary>
        /// Docker image of the kube-controller service
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// Virtual IP range that will be used by Kubernetes services
        /// </summary>
        [Input("serviceClusterIpRange")]
        public Input<string>? ServiceClusterIpRange { get; set; }

        public ClusterServicesKubeControllerDeprecatedArgs()
        {
        }
        public static new ClusterServicesKubeControllerDeprecatedArgs Empty => new ClusterServicesKubeControllerDeprecatedArgs();
    }
}
