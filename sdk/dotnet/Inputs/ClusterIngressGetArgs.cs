// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterIngressGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Ingress controller DNS policy. `ClusterFirstWithHostNet`, `ClusterFirst`, `Default`, and `None` are supported. [K8S dns Policy](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy) (string)
        /// </summary>
        [Input("dnsPolicy")]
        public Input<string>? DnsPolicy { get; set; }

        [Input("extraArgs")]
        private InputMap<object>? _extraArgs;

        /// <summary>
        /// Extra arguments for scheduler service (map)
        /// </summary>
        public InputMap<object> ExtraArgs
        {
            get => _extraArgs ?? (_extraArgs = new InputMap<object>());
            set => _extraArgs = value;
        }

        [Input("nodeSelector")]
        private InputMap<object>? _nodeSelector;

        /// <summary>
        /// Node selector key pair (map)
        /// </summary>
        public InputMap<object> NodeSelector
        {
            get => _nodeSelector ?? (_nodeSelector = new InputMap<object>());
            set => _nodeSelector = value;
        }

        [Input("options")]
        private InputMap<object>? _options;

        /// <summary>
        /// Network provider options (map)
        /// </summary>
        public InputMap<object> Options
        {
            get => _options ?? (_options = new InputMap<object>());
            set => _options = value;
        }

        /// <summary>
        /// Monitoring provider (string)
        /// </summary>
        [Input("provider")]
        public Input<string>? Provider { get; set; }

        public ClusterIngressGetArgs()
        {
        }
    }
}
