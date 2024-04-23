// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterDnsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("nodeSelector")]
        private InputMap<object>? _nodeSelector;

        /// <summary>
        /// NodeSelector key pair
        /// </summary>
        public InputMap<object> NodeSelector
        {
            get => _nodeSelector ?? (_nodeSelector = new InputMap<object>());
            set => _nodeSelector = value;
        }

        /// <summary>
        /// Nodelocal dns
        /// </summary>
        [Input("nodelocal")]
        public Input<Inputs.ClusterDnsNodelocalGetArgs>? Nodelocal { get; set; }

        /// <summary>
        /// DNS provider
        /// </summary>
        [Input("provider")]
        public Input<string>? Provider { get; set; }

        [Input("reverseCidrs")]
        private InputList<string>? _reverseCidrs;

        /// <summary>
        /// ReverseCIDRs
        /// </summary>
        public InputList<string> ReverseCidrs
        {
            get => _reverseCidrs ?? (_reverseCidrs = new InputList<string>());
            set => _reverseCidrs = value;
        }

        [Input("upstreamNameservers")]
        private InputList<string>? _upstreamNameservers;

        /// <summary>
        /// Upstream nameservers
        /// </summary>
        public InputList<string> UpstreamNameservers
        {
            get => _upstreamNameservers ?? (_upstreamNameservers = new InputList<string>());
            set => _upstreamNameservers = value;
        }

        public ClusterDnsGetArgs()
        {
        }
        public static new ClusterDnsGetArgs Empty => new ClusterDnsGetArgs();
    }
}
