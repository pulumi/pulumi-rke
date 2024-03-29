// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterNetworkCalicoNetworkProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// RKE k8s cluster cloud provider configuration [rke-cloud-providers](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/) (list maxitems:1)
        /// </summary>
        [Input("cloudProvider")]
        public Input<string>? CloudProvider { get; set; }

        public ClusterNetworkCalicoNetworkProviderArgs()
        {
        }
        public static new ClusterNetworkCalicoNetworkProviderArgs Empty => new ClusterNetworkCalicoNetworkProviderArgs();
    }
}
