// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterAuthorizationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        [Input("options")]
        private InputMap<object>? _options;

        /// <summary>
        /// Authorization mode options
        /// </summary>
        public InputMap<object> Options
        {
            get => _options ?? (_options = new InputMap<object>());
            set => _options = value;
        }

        public ClusterAuthorizationGetArgs()
        {
        }
        public static new ClusterAuthorizationGetArgs Empty => new ClusterAuthorizationGetArgs();
    }
}
