// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterAuthorizationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// RKE mode for authorization. `rbac` and `none` modes are available. Default `rbac` (string)
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        [Input("options")]
        private InputMap<object>? _options;

        /// <summary>
        /// Network provider options (map)
        /// </summary>
        public InputMap<object> Options
        {
            get => _options ?? (_options = new InputMap<object>());
            set => _options = value;
        }

        public ClusterAuthorizationArgs()
        {
        }
    }
}