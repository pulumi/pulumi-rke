// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterNetworkAciNetworkProviderGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Attachment entity profile name on aci (string)
        /// </summary>
        [Input("aep", required: true)]
        public Input<string> Aep { get; set; } = null!;

        [Input("apicHosts", required: true)]
        private InputList<string>? _apicHosts;

        /// <summary>
        /// Ip address for apic hosts (list)
        /// </summary>
        public InputList<string> ApicHosts
        {
            get => _apicHosts ?? (_apicHosts = new InputList<string>());
            set => _apicHosts = value;
        }

        [Input("apicUserCrt", required: true)]
        private Input<string>? _apicUserCrt;

        /// <summary>
        /// Base64 encoded certificate for aci apic user (string)
        /// </summary>
        public Input<string>? ApicUserCrt
        {
            get => _apicUserCrt;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apicUserCrt = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("apicUserKey", required: true)]
        private Input<string>? _apicUserKey;

        /// <summary>
        /// Base64 encoded private key for aci apic user (string)
        /// </summary>
        public Input<string>? ApicUserKey
        {
            get => _apicUserKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apicUserKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// User name for aci apic (string)
        /// </summary>
        [Input("apicUserName", required: true)]
        public Input<string> ApicUserName { get; set; } = null!;

        /// <summary>
        /// One of the supported encap types for aci(vlan/vxlan) (string)
        /// </summary>
        [Input("encapType", required: true)]
        public Input<string> EncapType { get; set; } = null!;

        /// <summary>
        /// Subnet to use for dynamic external IPs on aci (string)
        /// </summary>
        [Input("externDynamic", required: true)]
        public Input<string> ExternDynamic { get; set; } = null!;

        [Input("externStatic", required: true)]
        public Input<string> ExternStatic { get; set; } = null!;

        /// <summary>
        /// Vlan for infra network on aci (string)
        /// </summary>
        [Input("infraVlan", required: true)]
        public Input<string> InfraVlan { get; set; } = null!;

        /// <summary>
        /// Vlan for node network on aci (string)
        /// </summary>
        [Input("kubeApiVlan", required: true)]
        public Input<string> KubeApiVlan { get; set; } = null!;

        /// <summary>
        /// L3Out on aci (string)
        /// </summary>
        [Input("l3out", required: true)]
        public Input<string> L3out { get; set; } = null!;

        [Input("l3outExternalNetworks", required: true)]
        private InputList<string>? _l3outExternalNetworks;

        /// <summary>
        /// L3out external networks on aci (list)
        /// </summary>
        public InputList<string> L3outExternalNetworks
        {
            get => _l3outExternalNetworks ?? (_l3outExternalNetworks = new InputList<string>());
            set => _l3outExternalNetworks = value;
        }

        /// <summary>
        /// Mcast range end address for endpoint groups on aci (string)
        /// </summary>
        [Input("mcastRangeEnd", required: true)]
        public Input<string> McastRangeEnd { get; set; } = null!;

        /// <summary>
        /// Mcast range start address for endpoint groups on aci (string)
        /// </summary>
        [Input("mcastRangeStart", required: true)]
        public Input<string> McastRangeStart { get; set; } = null!;

        /// <summary>
        /// Kubernetes node address subnet (string)
        /// </summary>
        [Input("nodeSubnet", required: true)]
        public Input<string> NodeSubnet { get; set; } = null!;

        /// <summary>
        /// Subnet to use for service graph endpoints on aci (string)
        /// </summary>
        [Input("nodeSvcSubnet", required: true)]
        public Input<string> NodeSvcSubnet { get; set; } = null!;

        /// <summary>
        /// Vlan for service graph nodes on aci (string)
        /// </summary>
        [Input("serviceVlan", required: true)]
        public Input<string> ServiceVlan { get; set; } = null!;

        /// <summary>
        /// Port end range for Source Network Address Translation on aci (string)
        /// </summary>
        [Input("snatPortRangeEnd")]
        public Input<string>? SnatPortRangeEnd { get; set; }

        /// <summary>
        /// Port start range for Source Network Address Translation on aci (string)
        /// </summary>
        [Input("snatPortRangeStart")]
        public Input<string>? SnatPortRangeStart { get; set; }

        /// <summary>
        /// Ports per node for Source Network Address Translation on aci (string)
        /// </summary>
        [Input("snatPortsPerNode")]
        public Input<string>? SnatPortsPerNode { get; set; }

        /// <summary>
        /// Unique suffix for all cluster related objects in aci (string)
        /// </summary>
        [Input("systemId", required: true)]
        public Input<string> SystemId { get; set; } = null!;

        [Input("token", required: true)]
        private Input<string>? _token;

        /// <summary>
        /// UUID for this version of the input configuration (string)
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// VRF Name on aci (string)
        /// </summary>
        [Input("vrfName", required: true)]
        public Input<string> VrfName { get; set; } = null!;

        /// <summary>
        /// Tenant for VRF on aci (string)
        /// </summary>
        [Input("vrfTenant", required: true)]
        public Input<string> VrfTenant { get; set; } = null!;

        public ClusterNetworkAciNetworkProviderGetArgs()
        {
        }
        public static new ClusterNetworkAciNetworkProviderGetArgs Empty => new ClusterNetworkAciNetworkProviderGetArgs();
    }
}
