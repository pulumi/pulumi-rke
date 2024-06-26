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
    public sealed class ClusterCloudProviderOpenstackCloudProviderGlobal
    {
        public readonly string AuthUrl;
        public readonly string? CaFile;
        public readonly string? DomainId;
        public readonly string? DomainName;
        public readonly string Password;
        public readonly string? Region;
        public readonly string? TenantId;
        public readonly string? TenantName;
        public readonly string? TrustId;
        public readonly string? UserId;
        public readonly string? Username;

        [OutputConstructor]
        private ClusterCloudProviderOpenstackCloudProviderGlobal(
            string authUrl,

            string? caFile,

            string? domainId,

            string? domainName,

            string password,

            string? region,

            string? tenantId,

            string? tenantName,

            string? trustId,

            string? userId,

            string? username)
        {
            AuthUrl = authUrl;
            CaFile = caFile;
            DomainId = domainId;
            DomainName = domainName;
            Password = password;
            Region = region;
            TenantId = tenantId;
            TenantName = tenantName;
            TrustId = trustId;
            UserId = userId;
            Username = username;
        }
    }
}
