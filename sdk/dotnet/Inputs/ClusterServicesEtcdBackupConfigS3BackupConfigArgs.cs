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
        [Input("accessKey")]
        private Input<string>? _accessKey;
        public Input<string>? AccessKey
        {
            get => _accessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("bucketName")]
        public Input<string>? BucketName { get; set; }

        [Input("customCa")]
        public Input<string>? CustomCa { get; set; }

        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        [Input("folder")]
        public Input<string>? Folder { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("secretKey")]
        private Input<string>? _secretKey;
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClusterServicesEtcdBackupConfigS3BackupConfigArgs()
        {
        }
        public static new ClusterServicesEtcdBackupConfigS3BackupConfigArgs Empty => new ClusterServicesEtcdBackupConfigS3BackupConfigArgs();
    }
}
