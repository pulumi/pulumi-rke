// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterRotateCertificatesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Rotate CA Certificates. Default `false` (bool)
        /// </summary>
        [Input("caCertificates")]
        public Input<bool>? CaCertificates { get; set; }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// RKE k8s cluster services (list maxitems:1)
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        public ClusterRotateCertificatesGetArgs()
        {
        }
        public static new ClusterRotateCertificatesGetArgs Empty => new ClusterRotateCertificatesGetArgs();
    }
}
