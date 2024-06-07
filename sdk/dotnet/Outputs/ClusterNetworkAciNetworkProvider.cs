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
    public sealed class ClusterNetworkAciNetworkProvider
    {
        public readonly string Aep;
        public readonly ImmutableArray<string> ApicHosts;
        public readonly string ApicUserCrt;
        public readonly string ApicUserKey;
        public readonly string ApicUserName;
        public readonly string EncapType;
        public readonly string ExternDynamic;
        public readonly string ExternStatic;
        public readonly string InfraVlan;
        public readonly string KubeApiVlan;
        public readonly string L3out;
        public readonly ImmutableArray<string> L3outExternalNetworks;
        public readonly string McastRangeEnd;
        public readonly string McastRangeStart;
        public readonly string NodeSubnet;
        public readonly string NodeSvcSubnet;
        public readonly string ServiceVlan;
        public readonly string? SnatPortRangeEnd;
        public readonly string? SnatPortRangeStart;
        public readonly string? SnatPortsPerNode;
        public readonly string SystemId;
        public readonly string Token;
        public readonly string VrfName;
        public readonly string VrfTenant;

        [OutputConstructor]
        private ClusterNetworkAciNetworkProvider(
            string aep,

            ImmutableArray<string> apicHosts,

            string apicUserCrt,

            string apicUserKey,

            string apicUserName,

            string encapType,

            string externDynamic,

            string externStatic,

            string infraVlan,

            string kubeApiVlan,

            string l3out,

            ImmutableArray<string> l3outExternalNetworks,

            string mcastRangeEnd,

            string mcastRangeStart,

            string nodeSubnet,

            string nodeSvcSubnet,

            string serviceVlan,

            string? snatPortRangeEnd,

            string? snatPortRangeStart,

            string? snatPortsPerNode,

            string systemId,

            string token,

            string vrfName,

            string vrfTenant)
        {
            Aep = aep;
            ApicHosts = apicHosts;
            ApicUserCrt = apicUserCrt;
            ApicUserKey = apicUserKey;
            ApicUserName = apicUserName;
            EncapType = encapType;
            ExternDynamic = externDynamic;
            ExternStatic = externStatic;
            InfraVlan = infraVlan;
            KubeApiVlan = kubeApiVlan;
            L3out = l3out;
            L3outExternalNetworks = l3outExternalNetworks;
            McastRangeEnd = mcastRangeEnd;
            McastRangeStart = mcastRangeStart;
            NodeSubnet = nodeSubnet;
            NodeSvcSubnet = nodeSvcSubnet;
            ServiceVlan = serviceVlan;
            SnatPortRangeEnd = snatPortRangeEnd;
            SnatPortRangeStart = snatPortRangeStart;
            SnatPortsPerNode = snatPortsPerNode;
            SystemId = systemId;
            Token = token;
            VrfName = vrfName;
            VrfTenant = vrfTenant;
        }
    }
}