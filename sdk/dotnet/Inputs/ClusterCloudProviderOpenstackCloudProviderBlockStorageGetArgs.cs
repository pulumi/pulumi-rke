// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderOpenstackCloudProviderBlockStorageGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("bsVersion")]
        public Input<string>? BsVersion { get; set; }

        [Input("ignoreVolumeAz")]
        public Input<bool>? IgnoreVolumeAz { get; set; }

        [Input("trustDevicePath")]
        public Input<bool>? TrustDevicePath { get; set; }

        public ClusterCloudProviderOpenstackCloudProviderBlockStorageGetArgs()
        {
        }
        public static new ClusterCloudProviderOpenstackCloudProviderBlockStorageGetArgs Empty => new ClusterCloudProviderOpenstackCloudProviderBlockStorageGetArgs();
    }
}