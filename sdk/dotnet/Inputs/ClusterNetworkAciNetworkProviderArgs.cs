// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterNetworkAciNetworkProviderArgs : global::Pulumi.ResourceArgs
    {
        [Input("aep", required: true)]
        public Input<string> Aep { get; set; } = null!;

        [Input("apicHosts", required: true)]
        private InputList<string>? _apicHosts;
        public InputList<string> ApicHosts
        {
            get => _apicHosts ?? (_apicHosts = new InputList<string>());
            set => _apicHosts = value;
        }

        [Input("apicUserCrt", required: true)]
        private Input<string>? _apicUserCrt;
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
        public Input<string>? ApicUserKey
        {
            get => _apicUserKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apicUserKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("apicUserName", required: true)]
        public Input<string> ApicUserName { get; set; } = null!;

        [Input("encapType", required: true)]
        public Input<string> EncapType { get; set; } = null!;

        [Input("externDynamic", required: true)]
        public Input<string> ExternDynamic { get; set; } = null!;

        [Input("externStatic", required: true)]
        public Input<string> ExternStatic { get; set; } = null!;

        [Input("infraVlan", required: true)]
        public Input<string> InfraVlan { get; set; } = null!;

        [Input("kubeApiVlan", required: true)]
        public Input<string> KubeApiVlan { get; set; } = null!;

        [Input("l3out", required: true)]
        public Input<string> L3out { get; set; } = null!;

        [Input("l3outExternalNetworks", required: true)]
        private InputList<string>? _l3outExternalNetworks;
        public InputList<string> L3outExternalNetworks
        {
            get => _l3outExternalNetworks ?? (_l3outExternalNetworks = new InputList<string>());
            set => _l3outExternalNetworks = value;
        }

        [Input("mcastRangeEnd", required: true)]
        public Input<string> McastRangeEnd { get; set; } = null!;

        [Input("mcastRangeStart", required: true)]
        public Input<string> McastRangeStart { get; set; } = null!;

        [Input("nodeSubnet", required: true)]
        public Input<string> NodeSubnet { get; set; } = null!;

        [Input("nodeSvcSubnet", required: true)]
        public Input<string> NodeSvcSubnet { get; set; } = null!;

        [Input("serviceVlan", required: true)]
        public Input<string> ServiceVlan { get; set; } = null!;

        [Input("snatPortRangeEnd")]
        public Input<string>? SnatPortRangeEnd { get; set; }

        [Input("snatPortRangeStart")]
        public Input<string>? SnatPortRangeStart { get; set; }

        [Input("snatPortsPerNode")]
        public Input<string>? SnatPortsPerNode { get; set; }

        [Input("systemId", required: true)]
        public Input<string> SystemId { get; set; } = null!;

        [Input("token", required: true)]
        private Input<string>? _token;
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("vrfName", required: true)]
        public Input<string> VrfName { get; set; } = null!;

        [Input("vrfTenant", required: true)]
        public Input<string> VrfTenant { get; set; } = null!;

        public ClusterNetworkAciNetworkProviderArgs()
        {
        }
        public static new ClusterNetworkAciNetworkProviderArgs Empty => new ClusterNetworkAciNetworkProviderArgs();
    }
}
