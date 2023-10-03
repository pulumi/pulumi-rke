// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterPrivateRegistryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set as default registry. Default `false` (bool)
        /// </summary>
        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Registry password (string)
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Registry URL (string)
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        [Input("user")]
        private Input<string>? _user;

        /// <summary>
        /// Registry user (string)
        /// </summary>
        public Input<string>? User
        {
            get => _user;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _user = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClusterPrivateRegistryArgs()
        {
        }
        public static new ClusterPrivateRegistryArgs Empty => new ClusterPrivateRegistryArgs();
    }
}
