// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterCloudProviderAwsCloudProviderGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("global")]
        public Input<Inputs.ClusterCloudProviderAwsCloudProviderGlobalGetArgs>? Global { get; set; }

        [Input("serviceOverrides")]
        private InputList<Inputs.ClusterCloudProviderAwsCloudProviderServiceOverrideGetArgs>? _serviceOverrides;
        public InputList<Inputs.ClusterCloudProviderAwsCloudProviderServiceOverrideGetArgs> ServiceOverrides
        {
            get => _serviceOverrides ?? (_serviceOverrides = new InputList<Inputs.ClusterCloudProviderAwsCloudProviderServiceOverrideGetArgs>());
            set => _serviceOverrides = value;
        }

        public ClusterCloudProviderAwsCloudProviderGetArgs()
        {
        }
        public static new ClusterCloudProviderAwsCloudProviderGetArgs Empty => new ClusterCloudProviderAwsCloudProviderGetArgs();
    }
}
