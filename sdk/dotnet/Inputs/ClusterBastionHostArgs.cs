// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterBastionHostArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Address of Bastion Host (string)
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// Ignore proxy env vars at Bastion Host? Default: `false` (bool)
        /// </summary>
        [Input("ignoreProxyEnvVars")]
        public Input<bool>? IgnoreProxyEnvVars { get; set; }

        /// <summary>
        /// SSH Port of Bastion Host. Default `22` (string)
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// SSH Agent Auth enable (bool)
        /// </summary>
        [Input("sshAgentAuth")]
        public Input<bool>? SshAgentAuth { get; set; }

        [Input("sshCert")]
        private Input<string>? _sshCert;

        /// <summary>
        /// SSH Certificate Key (string)
        /// </summary>
        public Input<string>? SshCert
        {
            get => _sshCert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshCert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// SSH Certificate Path (string)
        /// </summary>
        [Input("sshCertPath")]
        public Input<string>? SshCertPath { get; set; }

        [Input("sshKey")]
        private Input<string>? _sshKey;

        /// <summary>
        /// SSH Private Key (string)
        /// </summary>
        public Input<string>? SshKey
        {
            get => _sshKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// SSH Private Key Path (string)
        /// </summary>
        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        /// <summary>
        /// SSH User to Bastion Host (string)
        /// </summary>
        [Input("user", required: true)]
        public Input<string> User { get; set; } = null!;

        public ClusterBastionHostArgs()
        {
        }
        public static new ClusterBastionHostArgs Empty => new ClusterBastionHostArgs();
    }
}
