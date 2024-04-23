// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterRunningSystemImageGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("aciCniDeployContainer")]
        public Input<string>? AciCniDeployContainer { get; set; }

        [Input("aciControllerContainer")]
        public Input<string>? AciControllerContainer { get; set; }

        [Input("aciHostContainer")]
        public Input<string>? AciHostContainer { get; set; }

        [Input("aciMcastContainer")]
        public Input<string>? AciMcastContainer { get; set; }

        [Input("aciOpflexContainer")]
        public Input<string>? AciOpflexContainer { get; set; }

        [Input("aciOvsContainer")]
        public Input<string>? AciOvsContainer { get; set; }

        [Input("alpine")]
        public Input<string>? Alpine { get; set; }

        [Input("calicoCni")]
        public Input<string>? CalicoCni { get; set; }

        [Input("calicoControllers")]
        public Input<string>? CalicoControllers { get; set; }

        [Input("calicoCtl")]
        public Input<string>? CalicoCtl { get; set; }

        [Input("calicoFlexVol")]
        public Input<string>? CalicoFlexVol { get; set; }

        [Input("calicoNode")]
        public Input<string>? CalicoNode { get; set; }

        [Input("canalCni")]
        public Input<string>? CanalCni { get; set; }

        [Input("canalFlannel")]
        public Input<string>? CanalFlannel { get; set; }

        [Input("canalFlexVol")]
        public Input<string>? CanalFlexVol { get; set; }

        [Input("canalNode")]
        public Input<string>? CanalNode { get; set; }

        [Input("certDownloader")]
        public Input<string>? CertDownloader { get; set; }

        [Input("coredns")]
        public Input<string>? Coredns { get; set; }

        [Input("corednsAutoscaler")]
        public Input<string>? CorednsAutoscaler { get; set; }

        [Input("dnsmasq")]
        public Input<string>? Dnsmasq { get; set; }

        [Input("etcd")]
        public Input<string>? Etcd { get; set; }

        [Input("flannel")]
        public Input<string>? Flannel { get; set; }

        [Input("flannelCni")]
        public Input<string>? FlannelCni { get; set; }

        /// <summary>
        /// RKE k8s cluster ingress controller configuration (list maxitems:1)
        /// </summary>
        [Input("ingress")]
        public Input<string>? Ingress { get; set; }

        [Input("ingressBackend")]
        public Input<string>? IngressBackend { get; set; }

        [Input("kubeDns")]
        public Input<string>? KubeDns { get; set; }

        [Input("kubeDnsAutoscaler")]
        public Input<string>? KubeDnsAutoscaler { get; set; }

        [Input("kubeDnsSidecar")]
        public Input<string>? KubeDnsSidecar { get; set; }

        [Input("kubernetes")]
        public Input<string>? Kubernetes { get; set; }

        [Input("kubernetesServicesSidecar")]
        public Input<string>? KubernetesServicesSidecar { get; set; }

        [Input("metricsServer")]
        public Input<string>? MetricsServer { get; set; }

        [Input("nginxProxy")]
        public Input<string>? NginxProxy { get; set; }

        [Input("nodelocal")]
        public Input<string>? Nodelocal { get; set; }

        [Input("podInfraContainer")]
        public Input<string>? PodInfraContainer { get; set; }

        [Input("weaveCni")]
        public Input<string>? WeaveCni { get; set; }

        [Input("weaveNode")]
        public Input<string>? WeaveNode { get; set; }

        [Input("windowsPodInfraContainer")]
        public Input<string>? WindowsPodInfraContainer { get; set; }

        public ClusterRunningSystemImageGetArgs()
        {
        }
        public static new ClusterRunningSystemImageGetArgs Empty => new ClusterRunningSystemImageGetArgs();
    }
}
