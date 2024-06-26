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
    public sealed class ClusterPrivateRegistry
    {
        /// <summary>
        /// Set as default registry
        /// </summary>
        public readonly bool? IsDefault;
        /// <summary>
        /// Registry password
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// Registry URL
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// Registry user
        /// </summary>
        public readonly string? User;

        [OutputConstructor]
        private ClusterPrivateRegistry(
            bool? isDefault,

            string? password,

            string url,

            string? user)
        {
            IsDefault = isDefault;
            Password = password;
            Url = url;
            User = user;
        }
    }
}
