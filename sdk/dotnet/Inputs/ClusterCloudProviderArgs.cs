// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Use aws_cloud_provider instead
        /// </summary>
        [Input("awsCloudConfig")]
        public Input<Inputs.ClusterCloudProviderAwsCloudConfigArgs>? AwsCloudConfig { get; set; }

        /// <summary>
        /// AWS Cloud Provider config [rke-aws-cloud-provider](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/aws/) (list maxitems:1)
        /// </summary>
        [Input("awsCloudProvider")]
        public Input<Inputs.ClusterCloudProviderAwsCloudProviderArgs>? AwsCloudProvider { get; set; }

        /// <summary>
        /// Use azure_cloud_provider instead
        /// </summary>
        [Input("azureCloudConfig")]
        public Input<Inputs.ClusterCloudProviderAzureCloudConfigArgs>? AzureCloudConfig { get; set; }

        /// <summary>
        /// Azure Cloud Provider config [rke-azure-cloud-provider](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/azure/) (list maxitems:1)
        /// </summary>
        [Input("azureCloudProvider")]
        public Input<Inputs.ClusterCloudProviderAzureCloudProviderArgs>? AzureCloudProvider { get; set; }

        /// <summary>
        /// Use custom_cloud_provider instead
        /// </summary>
        [Input("customCloudConfig")]
        public Input<string>? CustomCloudConfig { get; set; }

        /// <summary>
        /// Custom Cloud Provider config (string)
        /// </summary>
        [Input("customCloudProvider")]
        public Input<string>? CustomCloudProvider { get; set; }

        /// <summary>
        /// Name of virtualcenter config for Vsphere Cloud Provider config (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Use openstack_cloud_provider instead
        /// </summary>
        [Input("openstackCloudConfig")]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudConfigArgs>? OpenstackCloudConfig { get; set; }

        /// <summary>
        /// Openstack Cloud Provider config [rke-openstack-cloud-provider](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/openstack/) (list maxitems:1)
        /// </summary>
        [Input("openstackCloudProvider")]
        public Input<Inputs.ClusterCloudProviderOpenstackCloudProviderArgs>? OpenstackCloudProvider { get; set; }

        /// <summary>
        /// Use vsphere_cloud_provider instead
        /// </summary>
        [Input("vsphereCloudConfig")]
        public Input<Inputs.ClusterCloudProviderVsphereCloudConfigArgs>? VsphereCloudConfig { get; set; }

        /// <summary>
        /// Vsphere Cloud Provider config [rke-vsphere-cloud-provider](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/vsphere/) Extra argument `name` is required on `virtual_center` configuration. (list maxitems:1)
        /// </summary>
        [Input("vsphereCloudProvider")]
        public Input<Inputs.ClusterCloudProviderVsphereCloudProviderArgs>? VsphereCloudProvider { get; set; }

        public ClusterCloudProviderArgs()
        {
        }
    }
}
