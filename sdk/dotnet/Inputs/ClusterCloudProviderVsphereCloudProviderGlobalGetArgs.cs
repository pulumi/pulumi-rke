// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderVsphereCloudProviderGlobalGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// (string)
        /// </summary>
        [Input("datacenter")]
        public Input<string>? Datacenter { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("datacenters")]
        public Input<string>? Datacenters { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("datastore")]
        public Input<string>? Datastore { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("insecureFlag")]
        public Input<bool>? InsecureFlag { get; set; }

        /// <summary>
        /// Registry password (string)
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Port used for SSH communication (string)
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// (int)
        /// </summary>
        [Input("soapRoundtripCount")]
        public Input<int>? SoapRoundtripCount { get; set; }

        /// <summary>
        /// Registry user (string)
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("vmName")]
        public Input<string>? VmName { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("vmUuid")]
        public Input<string>? VmUuid { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("workingDir")]
        public Input<string>? WorkingDir { get; set; }

        public ClusterCloudProviderVsphereCloudProviderGlobalGetArgs()
        {
        }
    }
}
