// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterWorkerHostArgs : global::Pulumi.ResourceArgs
    {
        [Input("address")]
        public Input<string>? Address { get; set; }

        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        public ClusterWorkerHostArgs()
        {
        }
        public static new ClusterWorkerHostArgs Empty => new ClusterWorkerHostArgs();
    }
}
