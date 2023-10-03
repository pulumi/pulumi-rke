// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterServicesEtcdDeprecatedGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Backup options for etcd service. Just for Rancher v2.2.x (list maxitems:1)
        /// </summary>
        [Input("backupConfig")]
        public Input<Inputs.ClusterServicesEtcdDeprecatedBackupConfigGetArgs>? BackupConfig { get; set; }

        [Input("caCert")]
        private Input<string>? _caCert;

        /// <summary>
        /// TLS CA certificate for etcd service (string)
        /// </summary>
        public Input<string>? CaCert
        {
            get => _caCert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _caCert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("cert")]
        private Input<string>? _cert;

        /// <summary>
        /// TLS certificate for etcd service (string)
        /// </summary>
        public Input<string>? Cert
        {
            get => _cert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _cert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Creation option for etcd service (string)
        /// </summary>
        [Input("creation")]
        public Input<string>? Creation { get; set; }

        [Input("externalUrls")]
        private InputList<string>? _externalUrls;

        /// <summary>
        /// External urls for etcd service (list)
        /// </summary>
        public InputList<string> ExternalUrls
        {
            get => _externalUrls ?? (_externalUrls = new InputList<string>());
            set => _externalUrls = value;
        }

        [Input("extraArgs")]
        private InputMap<object>? _extraArgs;

        /// <summary>
        /// Extra arguments for scheduler service (map)
        /// </summary>
        public InputMap<object> ExtraArgs
        {
            get => _extraArgs ?? (_extraArgs = new InputMap<object>());
            set => _extraArgs = value;
        }

        [Input("extraBinds")]
        private InputList<string>? _extraBinds;

        /// <summary>
        /// Extra binds for scheduler service (list)
        /// </summary>
        public InputList<string> ExtraBinds
        {
            get => _extraBinds ?? (_extraBinds = new InputList<string>());
            set => _extraBinds = value;
        }

        [Input("extraEnvs")]
        private InputList<string>? _extraEnvs;

        /// <summary>
        /// Extra environment for scheduler service (list)
        /// </summary>
        public InputList<string> ExtraEnvs
        {
            get => _extraEnvs ?? (_extraEnvs = new InputList<string>());
            set => _extraEnvs = value;
        }

        /// <summary>
        /// Etcd service GID. Default: `0`. For Rancher v2.3.x or above (int)
        /// </summary>
        [Input("gid")]
        public Input<int>? Gid { get; set; }

        /// <summary>
        /// Docker image for scheduler service (string)
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        [Input("key")]
        private Input<string>? _key;

        /// <summary>
        /// TLS key for etcd service (string)
        /// </summary>
        public Input<string>? Key
        {
            get => _key;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _key = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Retention for etcd backup. Default `6` (int)
        /// </summary>
        [Input("retention")]
        public Input<string>? Retention { get; set; }

        /// <summary>
        /// Snapshot option for etcd service. Default `true` (bool)
        /// </summary>
        [Input("snapshot")]
        public Input<bool>? Snapshot { get; set; }

        /// <summary>
        /// Etcd service UID. Default: `0`. For Rancher v2.3.x or above (int)
        /// </summary>
        [Input("uid")]
        public Input<int>? Uid { get; set; }

        public ClusterServicesEtcdDeprecatedGetArgs()
        {
        }
        public static new ClusterServicesEtcdDeprecatedGetArgs Empty => new ClusterServicesEtcdDeprecatedGetArgs();
    }
}
