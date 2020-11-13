// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterServicesKubeApiAuditLogConfigurationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Audit log format (string)
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// Audit log max age (int)
        /// </summary>
        [Input("maxAge")]
        public Input<int>? MaxAge { get; set; }

        /// <summary>
        /// Audit log max backup. Default: `10` (int)
        /// </summary>
        [Input("maxBackup")]
        public Input<int>? MaxBackup { get; set; }

        /// <summary>
        /// Audit log max size. Default: `100` (int)
        /// </summary>
        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        /// <summary>
        /// Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Audit policy json encoded definition. `"apiVersion"` and `"kind":"Policy","rules"` fields are required in the json. Ex. `jsonencode({"apiVersion":"audit.k8s.io/v1","kind":"Policy","rules":[{"level":"RequestResponse","resources":[{"group":"","resources":["pods"]}]}]})` [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string)
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        public ClusterServicesKubeApiAuditLogConfigurationGetArgs()
        {
        }
    }
}
