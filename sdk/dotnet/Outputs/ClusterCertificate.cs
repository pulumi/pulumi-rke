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
    public sealed class ClusterCertificate
    {
        public readonly string? Certificate;
        public readonly string? CommonName;
        public readonly string? Config;
        public readonly string? ConfigEnvName;
        public readonly string? ConfigPath;
        public readonly string? EnvName;
        /// <summary>
        /// (Computed) The ID of the resource (string)
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Use service instead
        /// </summary>
        public readonly string? Key;
        public readonly string? KeyEnvName;
        public readonly string? KeyPath;
        /// <summary>
        /// Cloud Provider name. `aws`, `azure`, `custom`, `external`, `openstack`, `vsphere` are supported (string)
        /// </summary>
        public readonly string? Name;
        public readonly string? OuName;
        /// <summary>
        /// Path for etcd service (string)
        /// </summary>
        public readonly string? Path;

        [OutputConstructor]
        private ClusterCertificate(
            string? certificate,

            string? commonName,

            string? config,

            string? configEnvName,

            string? configPath,

            string? envName,

            string? id,

            string? key,

            string? keyEnvName,

            string? keyPath,

            string? name,

            string? ouName,

            string? path)
        {
            Certificate = certificate;
            CommonName = commonName;
            Config = config;
            ConfigEnvName = configEnvName;
            ConfigPath = configPath;
            EnvName = envName;
            Id = id;
            Key = key;
            KeyEnvName = keyEnvName;
            KeyPath = keyPath;
            Name = name;
            OuName = ouName;
            Path = path;
        }
    }
}
