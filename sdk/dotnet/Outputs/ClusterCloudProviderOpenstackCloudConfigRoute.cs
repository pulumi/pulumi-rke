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
    public sealed class ClusterCloudProviderOpenstackCloudConfigRoute
    {
        public readonly string? RouterId;

        [OutputConstructor]
        private ClusterCloudProviderOpenstackCloudConfigRoute(string? routerId)
        {
            RouterId = routerId;
        }
    }
}
