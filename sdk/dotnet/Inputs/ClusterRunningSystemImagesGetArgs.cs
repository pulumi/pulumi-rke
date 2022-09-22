// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterRunningSystemImagesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Docker image for aci_cni_deploy_container (string)
        /// </summary>
        [Input("aciCniDeployContainer")]
        public Input<string>? AciCniDeployContainer { get; set; }

        /// <summary>
        /// Docker image for aci_controller_container (string)
        /// </summary>
        [Input("aciControllerContainer")]
        public Input<string>? AciControllerContainer { get; set; }

        /// <summary>
        /// Docker image for aci_host_container (string)
        /// </summary>
        [Input("aciHostContainer")]
        public Input<string>? AciHostContainer { get; set; }

        /// <summary>
        /// Docker image for aci_mcast_container (string)
        /// </summary>
        [Input("aciMcastContainer")]
        public Input<string>? AciMcastContainer { get; set; }

        /// <summary>
        /// Docker image for aci_opflex_container (string)
        /// </summary>
        [Input("aciOpflexContainer")]
        public Input<string>? AciOpflexContainer { get; set; }

        /// <summary>
        /// Docker image for aci_ovs_container (string)
        /// </summary>
        [Input("aciOvsContainer")]
        public Input<string>? AciOvsContainer { get; set; }

        /// <summary>
        /// Docker image for alpine (string)
        /// </summary>
        [Input("alpine")]
        public Input<string>? Alpine { get; set; }

        /// <summary>
        /// Docker image for calico_cni (string)
        /// </summary>
        [Input("calicoCni")]
        public Input<string>? CalicoCni { get; set; }

        /// <summary>
        /// Docker image for calico_controllers (string)
        /// </summary>
        [Input("calicoControllers")]
        public Input<string>? CalicoControllers { get; set; }

        /// <summary>
        /// Docker image for calico_ctl (string)
        /// </summary>
        [Input("calicoCtl")]
        public Input<string>? CalicoCtl { get; set; }

        /// <summary>
        /// Docker image for calico_flex_vol (string)
        /// </summary>
        [Input("calicoFlexVol")]
        public Input<string>? CalicoFlexVol { get; set; }

        /// <summary>
        /// Docker image for calico_node (string)
        /// </summary>
        [Input("calicoNode")]
        public Input<string>? CalicoNode { get; set; }

        /// <summary>
        /// Docker image for canal_cni (string)
        /// </summary>
        [Input("canalCni")]
        public Input<string>? CanalCni { get; set; }

        /// <summary>
        /// Docker image for canal_flannel (string)
        /// </summary>
        [Input("canalFlannel")]
        public Input<string>? CanalFlannel { get; set; }

        /// <summary>
        /// Docker image for canal_flex_vol (string)
        /// </summary>
        [Input("canalFlexVol")]
        public Input<string>? CanalFlexVol { get; set; }

        /// <summary>
        /// Docker image for canal_node (string)
        /// </summary>
        [Input("canalNode")]
        public Input<string>? CanalNode { get; set; }

        /// <summary>
        /// Docker image for cert_downloader (string)
        /// </summary>
        [Input("certDownloader")]
        public Input<string>? CertDownloader { get; set; }

        /// <summary>
        /// Docker image for coredns (string)
        /// </summary>
        [Input("coredns")]
        public Input<string>? Coredns { get; set; }

        /// <summary>
        /// Docker image for coredns_autoscaler (string)
        /// </summary>
        [Input("corednsAutoscaler")]
        public Input<string>? CorednsAutoscaler { get; set; }

        /// <summary>
        /// Docker image for dnsmasq (string)
        /// </summary>
        [Input("dnsmasq")]
        public Input<string>? Dnsmasq { get; set; }

        /// <summary>
        /// Docker image for etcd (string)
        /// </summary>
        [Input("etcd")]
        public Input<string>? Etcd { get; set; }

        /// <summary>
        /// Docker image for flannel (string)
        /// </summary>
        [Input("flannel")]
        public Input<string>? Flannel { get; set; }

        /// <summary>
        /// Docker image for flannel_cni (string)
        /// </summary>
        [Input("flannelCni")]
        public Input<string>? FlannelCni { get; set; }

        /// <summary>
        /// Docker image for ingress (string)
        /// </summary>
        [Input("ingress")]
        public Input<string>? Ingress { get; set; }

        /// <summary>
        /// Docker image for ingress_backend (string)
        /// </summary>
        [Input("ingressBackend")]
        public Input<string>? IngressBackend { get; set; }

        /// <summary>
        /// Docker image for kube_dns (string)
        /// </summary>
        [Input("kubeDns")]
        public Input<string>? KubeDns { get; set; }

        /// <summary>
        /// Docker image for kube_dns_autoscaler (string)
        /// </summary>
        [Input("kubeDnsAutoscaler")]
        public Input<string>? KubeDnsAutoscaler { get; set; }

        /// <summary>
        /// Docker image for kube_dns_sidecar (string)
        /// </summary>
        [Input("kubeDnsSidecar")]
        public Input<string>? KubeDnsSidecar { get; set; }

        /// <summary>
        /// Docker image for kubernetes (string)
        /// </summary>
        [Input("kubernetes")]
        public Input<string>? Kubernetes { get; set; }

        /// <summary>
        /// Docker image for kubernetes_services_sidecar (string)
        /// </summary>
        [Input("kubernetesServicesSidecar")]
        public Input<string>? KubernetesServicesSidecar { get; set; }

        /// <summary>
        /// Docker image for metrics_server (string)
        /// </summary>
        [Input("metricsServer")]
        public Input<string>? MetricsServer { get; set; }

        /// <summary>
        /// Docker image for nginx_proxy (string)
        /// </summary>
        [Input("nginxProxy")]
        public Input<string>? NginxProxy { get; set; }

        /// <summary>
        /// Docker image for nodelocal (string)
        /// </summary>
        [Input("nodelocal")]
        public Input<string>? Nodelocal { get; set; }

        /// <summary>
        /// Docker image for pod_infra_container (string)
        /// </summary>
        [Input("podInfraContainer")]
        public Input<string>? PodInfraContainer { get; set; }

        /// <summary>
        /// Docker image for weave_cni (string)
        /// </summary>
        [Input("weaveCni")]
        public Input<string>? WeaveCni { get; set; }

        /// <summary>
        /// Docker image for weave_node (string)
        /// </summary>
        [Input("weaveNode")]
        public Input<string>? WeaveNode { get; set; }

        /// <summary>
        /// Docker image for windows_pod_infra_container (string)
        /// </summary>
        [Input("windowsPodInfraContainer")]
        public Input<string>? WindowsPodInfraContainer { get; set; }

        public ClusterRunningSystemImagesGetArgs()
        {
        }
        public static new ClusterRunningSystemImagesGetArgs Empty => new ClusterRunningSystemImagesGetArgs();
    }
}
