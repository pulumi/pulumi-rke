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
    public sealed class ClusterServicesKubeApiDeprecatedEventRateLimit
    {
        /// <summary>
        /// Event rate limit yaml encoded configuration. `"apiVersion"` and `"kind":"Configuration"` fields are required in the yaml. Ex. `apiVersion: eventratelimit.admission.k8s.io/v1alpha1\nkind: Configuration\nlimits:\n- type: Server\n  burst: 30000\n  qps: 6000\n` [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string)
        /// </summary>
        public readonly string? Configuration;
        /// <summary>
        /// Enable secrets encryption (bool)
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private ClusterServicesKubeApiDeprecatedEventRateLimit(
            string? configuration,

            bool? enabled)
        {
            Configuration = configuration;
            Enabled = enabled;
        }
    }
}
