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
    public sealed class ClusterCloudProviderAwsCloudProvider
    {
        public readonly Outputs.ClusterCloudProviderAwsCloudProviderGlobal? Global;
        public readonly ImmutableArray<Outputs.ClusterCloudProviderAwsCloudProviderServiceOverride> ServiceOverrides;

        [OutputConstructor]
        private ClusterCloudProviderAwsCloudProvider(
            Outputs.ClusterCloudProviderAwsCloudProviderGlobal? global,

            ImmutableArray<Outputs.ClusterCloudProviderAwsCloudProviderServiceOverride> serviceOverrides)
        {
            Global = global;
            ServiceOverrides = serviceOverrides;
        }
    }
}
