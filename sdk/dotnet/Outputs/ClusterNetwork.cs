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
    public sealed class ClusterNetwork
    {
        /// <summary>
        /// Calico network provider config (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterNetworkCalicoNetworkProvider? CalicoNetworkProvider;
        /// <summary>
        /// Canal network provider config (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterNetworkCanalNetworkProvider? CanalNetworkProvider;
        /// <summary>
        /// Flannel network provider config (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterNetworkFlannelNetworkProvider? FlannelNetworkProvider;
        /// <summary>
        /// Network provider MTU. Default `0` (int)
        /// </summary>
        public readonly int? Mtu;
        /// <summary>
        /// Network provider options (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Options;
        /// <summary>
        /// Network provider plugin. `calico`, `canal` (default), `flannel`, `none` and `weave` are supported. (string)
        /// </summary>
        public readonly string? Plugin;
        /// <summary>
        /// Weave network provider config (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterNetworkWeaveNetworkProvider? WeaveNetworkProvider;

        [OutputConstructor]
        private ClusterNetwork(
            Outputs.ClusterNetworkCalicoNetworkProvider? calicoNetworkProvider,

            Outputs.ClusterNetworkCanalNetworkProvider? canalNetworkProvider,

            Outputs.ClusterNetworkFlannelNetworkProvider? flannelNetworkProvider,

            int? mtu,

            ImmutableDictionary<string, object>? options,

            string? plugin,

            Outputs.ClusterNetworkWeaveNetworkProvider? weaveNetworkProvider)
        {
            CalicoNetworkProvider = calicoNetworkProvider;
            CanalNetworkProvider = canalNetworkProvider;
            FlannelNetworkProvider = flannelNetworkProvider;
            Mtu = mtu;
            Options = options;
            Plugin = plugin;
            WeaveNetworkProvider = weaveNetworkProvider;
        }
    }
}
