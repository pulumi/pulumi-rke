// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterServicesEtcdDeprecatedBackupConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("intervalHours")]
        public Input<int>? IntervalHours { get; set; }

        [Input("retention")]
        public Input<int>? Retention { get; set; }

        [Input("s3BackupConfig")]
        public Input<Inputs.ClusterServicesEtcdDeprecatedBackupConfigS3BackupConfigGetArgs>? S3BackupConfig { get; set; }

        [Input("safeTimestamp")]
        public Input<bool>? SafeTimestamp { get; set; }

        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public ClusterServicesEtcdDeprecatedBackupConfigGetArgs()
        {
        }
        public static new ClusterServicesEtcdDeprecatedBackupConfigGetArgs Empty => new ClusterServicesEtcdDeprecatedBackupConfigGetArgs();
    }
}
