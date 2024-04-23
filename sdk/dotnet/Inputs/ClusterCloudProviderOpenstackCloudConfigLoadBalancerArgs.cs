// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs : global::Pulumi.ResourceArgs
    {
        [Input("createMonitor")]
        public Input<bool>? CreateMonitor { get; set; }

        [Input("floatingNetworkId")]
        public Input<string>? FloatingNetworkId { get; set; }

        [Input("lbMethod")]
        public Input<string>? LbMethod { get; set; }

        [Input("lbProvider")]
        public Input<string>? LbProvider { get; set; }

        [Input("lbVersion")]
        public Input<string>? LbVersion { get; set; }

        [Input("manageSecurityGroups")]
        public Input<bool>? ManageSecurityGroups { get; set; }

        [Input("monitorDelay")]
        public Input<string>? MonitorDelay { get; set; }

        [Input("monitorMaxRetries")]
        public Input<int>? MonitorMaxRetries { get; set; }

        [Input("monitorTimeout")]
        public Input<string>? MonitorTimeout { get; set; }

        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        [Input("useOctavia")]
        public Input<bool>? UseOctavia { get; set; }

        public ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs()
        {
        }
        public static new ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs Empty => new ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs();
    }
}
