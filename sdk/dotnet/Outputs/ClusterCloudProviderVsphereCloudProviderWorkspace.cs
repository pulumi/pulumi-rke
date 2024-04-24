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
    public sealed class ClusterCloudProviderVsphereCloudProviderWorkspace
    {
        public readonly string Datacenter;
        public readonly string? DefaultDatastore;
        public readonly string? Folder;
        public readonly string? ResourcepoolPath;
        public readonly string Server;

        [OutputConstructor]
        private ClusterCloudProviderVsphereCloudProviderWorkspace(
            string datacenter,

            string? defaultDatastore,

            string? folder,

            string? resourcepoolPath,

            string server)
        {
            Datacenter = datacenter;
            DefaultDatastore = defaultDatastore;
            Folder = folder;
            ResourcepoolPath = resourcepoolPath;
            Server = server;
        }
    }
}
