// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterEtcdHostArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Address ip for node (string)
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// Name of the host provisioned via docker machine (string)
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        public ClusterEtcdHostArgs()
        {
        }
    }
}
