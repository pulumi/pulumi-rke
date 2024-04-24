// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterDnsNodelocalGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        [Input("nodeSelector")]
        private InputMap<object>? _nodeSelector;

        /// <summary>
        /// Node selector key pair
        /// </summary>
        public InputMap<object> NodeSelector
        {
            get => _nodeSelector ?? (_nodeSelector = new InputMap<object>());
            set => _nodeSelector = value;
        }

        public ClusterDnsNodelocalGetArgs()
        {
        }
        public static new ClusterDnsNodelocalGetArgs Empty => new ClusterDnsNodelocalGetArgs();
    }
}
