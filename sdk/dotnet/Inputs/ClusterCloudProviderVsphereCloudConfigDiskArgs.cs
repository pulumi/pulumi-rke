// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderVsphereCloudConfigDiskArgs : global::Pulumi.ResourceArgs
    {
        [Input("scsiControllerType")]
        public Input<string>? ScsiControllerType { get; set; }

        public ClusterCloudProviderVsphereCloudConfigDiskArgs()
        {
        }
        public static new ClusterCloudProviderVsphereCloudConfigDiskArgs Empty => new ClusterCloudProviderVsphereCloudConfigDiskArgs();
    }
}
