// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterServicesEtcdBackupConfigS3BackupConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access key for S3 service (string)
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        /// <summary>
        /// Bucket name for S3 service (string)
        /// </summary>
        [Input("bucketName")]
        public Input<string>? BucketName { get; set; }

        /// <summary>
        /// Base64 encoded custom CA for S3 service. Use filebase64(&lt;FILE&gt;) for encoding file. Available from Rancher v2.2.5 (string)
        /// </summary>
        [Input("customCa")]
        public Input<string>? CustomCa { get; set; }

        /// <summary>
        /// Endpoint for S3 service (string)
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// Folder for S3 service. Available from Rancher v2.2.7 (string)
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// Region for S3 service (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Secret key for S3 service (string)
        /// </summary>
        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        public ClusterServicesEtcdBackupConfigS3BackupConfigArgs()
        {
        }
        public static new ClusterServicesEtcdBackupConfigS3BackupConfigArgs Empty => new ClusterServicesEtcdBackupConfigS3BackupConfigArgs();
    }
}
