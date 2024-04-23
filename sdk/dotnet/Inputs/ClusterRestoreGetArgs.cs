// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterRestoreGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// RKE k8s cluster restore configuration (list maxitems:1)
        /// </summary>
        [Input("restore")]
        public Input<bool>? Restore { get; set; }

        /// <summary>
        /// Snapshot name
        /// </summary>
        [Input("snapshotName")]
        public Input<string>? SnapshotName { get; set; }

        public ClusterRestoreGetArgs()
        {
        }
        public static new ClusterRestoreGetArgs Empty => new ClusterRestoreGetArgs();
    }
}
