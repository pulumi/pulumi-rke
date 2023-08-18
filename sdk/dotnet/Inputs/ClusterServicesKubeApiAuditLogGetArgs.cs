// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterServicesKubeApiAuditLogGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Audit log configuration. (list maxtiem: 1)
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.ClusterServicesKubeApiAuditLogConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// Enable etcd backup. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ClusterServicesKubeApiAuditLogGetArgs()
        {
        }
        public static new ClusterServicesKubeApiAuditLogGetArgs Empty => new ClusterServicesKubeApiAuditLogGetArgs();
    }
}
