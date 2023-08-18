// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterServicesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Etcd options for RKE services (list maxitems:1)
        /// </summary>
        [Input("etcd")]
        public Input<Inputs.ClusterServicesEtcdArgs>? Etcd { get; set; }

        /// <summary>
        /// Kube API options for RKE services (list maxitems:1)
        /// </summary>
        [Input("kubeApi")]
        public Input<Inputs.ClusterServicesKubeApiArgs>? KubeApi { get; set; }

        /// <summary>
        /// Kube Controller options for RKE services (list maxitems:1)
        /// </summary>
        [Input("kubeController")]
        public Input<Inputs.ClusterServicesKubeControllerArgs>? KubeController { get; set; }

        /// <summary>
        /// Kubelet options for RKE services (list maxitems:1)
        /// </summary>
        [Input("kubelet")]
        public Input<Inputs.ClusterServicesKubeletArgs>? Kubelet { get; set; }

        /// <summary>
        /// Kubeproxy options for RKE services (list maxitems:1)
        /// </summary>
        [Input("kubeproxy")]
        public Input<Inputs.ClusterServicesKubeproxyArgs>? Kubeproxy { get; set; }

        /// <summary>
        /// Scheduler options for RKE services (list maxitems:1)
        /// </summary>
        [Input("scheduler")]
        public Input<Inputs.ClusterServicesSchedulerArgs>? Scheduler { get; set; }

        public ClusterServicesArgs()
        {
        }
        public static new ClusterServicesArgs Empty => new ClusterServicesArgs();
    }
}
