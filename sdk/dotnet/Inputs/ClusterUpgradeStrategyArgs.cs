// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterUpgradeStrategyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// RKE drain nodes (bool)
        /// </summary>
        [Input("drain")]
        public Input<bool>? Drain { get; set; }

        /// <summary>
        /// RKE drain node input (list Maxitems: 1)
        /// </summary>
        [Input("drainInput")]
        public Input<Inputs.ClusterUpgradeStrategyDrainInputArgs>? DrainInput { get; set; }

        /// <summary>
        /// RKE max unavailable controlplane nodes (string)
        /// </summary>
        [Input("maxUnavailableControlplane")]
        public Input<string>? MaxUnavailableControlplane { get; set; }

        /// <summary>
        /// RKE max unavailable worker nodes (string)
        /// </summary>
        [Input("maxUnavailableWorker")]
        public Input<string>? MaxUnavailableWorker { get; set; }

        public ClusterUpgradeStrategyArgs()
        {
        }
    }
}
