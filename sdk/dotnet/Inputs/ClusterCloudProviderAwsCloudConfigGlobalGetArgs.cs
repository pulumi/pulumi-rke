// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderAwsCloudConfigGlobalGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Disables the automatic ingress creation
        /// </summary>
        [Input("disableSecurityGroupIngress")]
        public Input<bool>? DisableSecurityGroupIngress { get; set; }

        /// <summary>
        /// Setting this to true will disable the check and provide a warning that the check was skipped
        /// </summary>
        [Input("disableStrictZoneCheck")]
        public Input<bool>? DisableStrictZoneCheck { get; set; }

        /// <summary>
        /// Use these ELB security groups instead create new
        /// </summary>
        [Input("elbSecurityGroup")]
        public Input<string>? ElbSecurityGroup { get; set; }

        /// <summary>
        /// The cluster id we'll use to identify our cluster resources
        /// </summary>
        [Input("kubernetesClusterId")]
        public Input<string>? KubernetesClusterId { get; set; }

        /// <summary>
        /// Legacy cluster id we'll use to identify our cluster resources
        /// </summary>
        [Input("kubernetesClusterTag")]
        public Input<string>? KubernetesClusterTag { get; set; }

        /// <summary>
        /// IAM role to assume when interaction with AWS APIs
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        /// <summary>
        /// Enables using a specific RouteTable
        /// </summary>
        [Input("routeTableId")]
        public Input<string>? RouteTableId { get; set; }

        /// <summary>
        /// Enables using a specific subnet to use for ELB's
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        /// <summary>
        /// The AWS VPC flag enables the possibility to run the master components on a different aws account, on a different cloud provider or on-premises. If the flag is set also the KubernetesClusterTag must be provided
        /// </summary>
        [Input("vpc")]
        public Input<string>? Vpc { get; set; }

        /// <summary>
        /// The AWS zone
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public ClusterCloudProviderAwsCloudConfigGlobalGetArgs()
        {
        }
        public static new ClusterCloudProviderAwsCloudConfigGlobalGetArgs Empty => new ClusterCloudProviderAwsCloudConfigGlobalGetArgs();
    }
}
