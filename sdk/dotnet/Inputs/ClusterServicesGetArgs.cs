// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterServicesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("etcd")]
        public Input<Inputs.ClusterServicesEtcdGetArgs>? Etcd { get; set; }

        [Input("kubeApi")]
        public Input<Inputs.ClusterServicesKubeApiGetArgs>? KubeApi { get; set; }

        [Input("kubeController")]
        public Input<Inputs.ClusterServicesKubeControllerGetArgs>? KubeController { get; set; }

        [Input("kubelet")]
        public Input<Inputs.ClusterServicesKubeletGetArgs>? Kubelet { get; set; }

        [Input("kubeproxy")]
        public Input<Inputs.ClusterServicesKubeproxyGetArgs>? Kubeproxy { get; set; }

        [Input("scheduler")]
        public Input<Inputs.ClusterServicesSchedulerGetArgs>? Scheduler { get; set; }

        public ClusterServicesGetArgs()
        {
        }
        public static new ClusterServicesGetArgs Empty => new ClusterServicesGetArgs();
    }
}
