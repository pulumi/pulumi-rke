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
    public sealed class ClusterServicesKubeApiDeprecatedAuditLogConfiguration
    {
        /// <summary>
        /// Audit log format. Default: `json` (string)
        /// </summary>
        public readonly string? Format;
        /// <summary>
        /// Audit log max age. Default: `30` (int)
        /// </summary>
        public readonly int? MaxAge;
        /// <summary>
        /// Audit log max backup. Default: `10` (int)
        /// </summary>
        public readonly int? MaxBackup;
        /// <summary>
        /// Audit log max size. Default: `100` (int)
        /// </summary>
        public readonly int? MaxSize;
        /// <summary>
        /// Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// Audit policy json encoded definition. `"apiVersion"` and `"kind":"Policy","rules"` fields are required in the json. Ex. `jsonencode({"apiVersion":"audit.k8s.io/v1","kind":"Policy","rules":[{"level":"RequestResponse","resources":[{"group":"","resources":["pods"]}]}]})` [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string)
        /// </summary>
        public readonly string? Policy;

        [OutputConstructor]
        private ClusterServicesKubeApiDeprecatedAuditLogConfiguration(
            string? format,

            int? maxAge,

            int? maxBackup,

            int? maxSize,

            string? path,

            string? policy)
        {
            Format = format;
            MaxAge = maxAge;
            MaxBackup = maxBackup;
            MaxSize = maxSize;
            Path = path;
            Policy = policy;
        }
    }
}
