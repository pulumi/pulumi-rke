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
        /// <summary>
        /// (bool)
        /// </summary>
        [Input("createMonitor")]
        public Input<bool>? CreateMonitor { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("floatingNetworkId")]
        public Input<string>? FloatingNetworkId { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("lbMethod")]
        public Input<string>? LbMethod { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("lbProvider")]
        public Input<string>? LbProvider { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("lbVersion")]
        public Input<string>? LbVersion { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("manageSecurityGroups")]
        public Input<bool>? ManageSecurityGroups { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("monitorDelay")]
        public Input<string>? MonitorDelay { get; set; }

        /// <summary>
        /// (int)
        /// </summary>
        [Input("monitorMaxRetries")]
        public Input<int>? MonitorMaxRetries { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("monitorTimeout")]
        public Input<string>? MonitorTimeout { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("useOctavia")]
        public Input<bool>? UseOctavia { get; set; }

        public ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs()
        {
        }
        public static new ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs Empty => new ClusterCloudProviderOpenstackCloudConfigLoadBalancerArgs();
    }
}
