// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Aci network provider config
        /// </summary>
        [Input("aciNetworkProvider")]
        public Input<Inputs.ClusterNetworkAciNetworkProviderArgs>? AciNetworkProvider { get; set; }

        /// <summary>
        /// Calico network provider config
        /// </summary>
        [Input("calicoNetworkProvider")]
        public Input<Inputs.ClusterNetworkCalicoNetworkProviderArgs>? CalicoNetworkProvider { get; set; }

        /// <summary>
        /// Canal network provider config
        /// </summary>
        [Input("canalNetworkProvider")]
        public Input<Inputs.ClusterNetworkCanalNetworkProviderArgs>? CanalNetworkProvider { get; set; }

        /// <summary>
        /// Flannel network provider config
        /// </summary>
        [Input("flannelNetworkProvider")]
        public Input<Inputs.ClusterNetworkFlannelNetworkProviderArgs>? FlannelNetworkProvider { get; set; }

        /// <summary>
        /// Network provider MTU
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        [Input("options")]
        private InputMap<string>? _options;

        /// <summary>
        /// Network provider options
        /// </summary>
        public InputMap<string> Options
        {
            get => _options ?? (_options = new InputMap<string>());
            set => _options = value;
        }

        /// <summary>
        /// Network provider plugin
        /// </summary>
        [Input("plugin")]
        public Input<string>? Plugin { get; set; }

        /// <summary>
        /// Weave network provider config
        /// </summary>
        [Input("weaveNetworkProvider")]
        public Input<Inputs.ClusterNetworkWeaveNetworkProviderArgs>? WeaveNetworkProvider { get; set; }

        public ClusterNetworkArgs()
        {
        }
        public static new ClusterNetworkArgs Empty => new ClusterNetworkArgs();
    }
}
