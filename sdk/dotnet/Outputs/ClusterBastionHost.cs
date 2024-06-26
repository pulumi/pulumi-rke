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
    public sealed class ClusterBastionHost
    {
        /// <summary>
        /// Address of Bastion Host
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// Ignore proxy env vars at Bastion Host?
        /// </summary>
        public readonly bool? IgnoreProxyEnvVars;
        /// <summary>
        /// SSH Port of Bastion Host
        /// </summary>
        public readonly string? Port;
        /// <summary>
        /// SSH Agent Auth enable (bool)
        /// </summary>
        public readonly bool? SshAgentAuth;
        /// <summary>
        /// SSH Certificate Key
        /// </summary>
        public readonly string? SshCert;
        /// <summary>
        /// SSH Certificate Path (string)
        /// </summary>
        public readonly string? SshCertPath;
        /// <summary>
        /// SSH Private Key
        /// </summary>
        public readonly string? SshKey;
        /// <summary>
        /// SSH Private Key Path (string)
        /// </summary>
        public readonly string? SshKeyPath;
        /// <summary>
        /// SSH User to Bastion Host
        /// </summary>
        public readonly string User;

        [OutputConstructor]
        private ClusterBastionHost(
            string address,

            bool? ignoreProxyEnvVars,

            string? port,

            bool? sshAgentAuth,

            string? sshCert,

            string? sshCertPath,

            string? sshKey,

            string? sshKeyPath,

            string user)
        {
            Address = address;
            IgnoreProxyEnvVars = ignoreProxyEnvVars;
            Port = port;
            SshAgentAuth = sshAgentAuth;
            SshCert = sshCert;
            SshCertPath = sshCertPath;
            SshKey = sshKey;
            SshKeyPath = sshKeyPath;
            User = user;
        }
    }
}
