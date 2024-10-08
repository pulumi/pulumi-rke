// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterIngressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Ingress Default Backend
        /// </summary>
        [Input("defaultBackend")]
        public Input<bool>? DefaultBackend { get; set; }

        /// <summary>
        /// Ingress controller dns policy
        /// </summary>
        [Input("dnsPolicy")]
        public Input<string>? DnsPolicy { get; set; }

        [Input("extraArgs")]
        private InputMap<string>? _extraArgs;

        /// <summary>
        /// Extra arguments for the ingress controller
        /// </summary>
        public InputMap<string> ExtraArgs
        {
            get => _extraArgs ?? (_extraArgs = new InputMap<string>());
            set => _extraArgs = value;
        }

        /// <summary>
        /// Ingress controller http port
        /// </summary>
        [Input("httpPort")]
        public Input<int>? HttpPort { get; set; }

        /// <summary>
        /// Ingress controller https port
        /// </summary>
        [Input("httpsPort")]
        public Input<int>? HttpsPort { get; set; }

        /// <summary>
        /// Ingress controller network mode
        /// </summary>
        [Input("networkMode")]
        public Input<string>? NetworkMode { get; set; }

        [Input("nodeSelector")]
        private InputMap<string>? _nodeSelector;

        /// <summary>
        /// Node selector key pair
        /// </summary>
        public InputMap<string> NodeSelector
        {
            get => _nodeSelector ?? (_nodeSelector = new InputMap<string>());
            set => _nodeSelector = value;
        }

        [Input("options")]
        private InputMap<string>? _options;

        /// <summary>
        /// Ingress controller options
        /// </summary>
        public InputMap<string> Options
        {
            get => _options ?? (_options = new InputMap<string>());
            set => _options = value;
        }

        /// <summary>
        /// Ingress controller provider
        /// </summary>
        [Input("provider")]
        public Input<string>? Provider { get; set; }

        public ClusterIngressArgs()
        {
        }
        public static new ClusterIngressArgs Empty => new ClusterIngressArgs();
    }
}
