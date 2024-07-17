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
    public sealed class ClusterWorkerHost
    {
        /// <summary>
        /// Address ip for node (string)
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// Name of the host provisioned via docker machine (string)
        /// </summary>
        public readonly string? NodeName;

        [OutputConstructor]
        private ClusterWorkerHost(
            string? address,

            string? nodeName)
        {
            Address = address;
            NodeName = nodeName;
        }
    }
}
