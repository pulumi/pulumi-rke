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
    public sealed class ClusterServicesEtcdBackupConfig
    {
        public readonly bool? Enabled;
        public readonly int? IntervalHours;
        public readonly int? Retention;
        public readonly Outputs.ClusterServicesEtcdBackupConfigS3BackupConfig? S3BackupConfig;
        public readonly bool? SafeTimestamp;
        public readonly int? Timeout;

        [OutputConstructor]
        private ClusterServicesEtcdBackupConfig(
            bool? enabled,

            int? intervalHours,

            int? retention,

            Outputs.ClusterServicesEtcdBackupConfigS3BackupConfig? s3BackupConfig,

            bool? safeTimestamp,

            int? timeout)
        {
            Enabled = enabled;
            IntervalHours = intervalHours;
            Retention = retention;
            S3BackupConfig = s3BackupConfig;
            SafeTimestamp = safeTimestamp;
            Timeout = timeout;
        }
    }
}
