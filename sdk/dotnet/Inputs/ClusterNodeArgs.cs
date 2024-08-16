// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterNodeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IP or FQDN that is fully resolvable and used for SSH communication
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// Docker socket on the node that will be used in tunneling
        /// </summary>
        [Input("dockerSocket")]
        public Input<string>? DockerSocket { get; set; }

        /// <summary>
        /// Hostname override
        /// </summary>
        [Input("hostnameOverride")]
        public Input<string>? HostnameOverride { get; set; }

        /// <summary>
        /// Internal address that will be used for components communication
        /// </summary>
        [Input("internalAddress")]
        public Input<string>? InternalAddress { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Node Labels
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the host provisioned via docker machine
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        /// <summary>
        /// Port used for SSH communication
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        [Input("roles", required: true)]
        private InputList<string>? _roles;

        /// <summary>
        /// Node roles in k8s cluster [controlplane/worker/etcd])
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// Node role in kubernetes cluster [controlplane/worker/etcd], specified by a comma-separated string
        /// </summary>
        [Input("rolesDeprecated")]
        public Input<string>? RolesDeprecated { get; set; }

        /// <summary>
        /// SSH Agent Auth enable (bool)
        /// </summary>
        [Input("sshAgentAuth")]
        public Input<bool>? SshAgentAuth { get; set; }

        [Input("sshCert")]
        private Input<string>? _sshCert;

        /// <summary>
        /// SSH Certificate
        /// </summary>
        public Input<string>? SshCert
        {
            get => _sshCert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshCert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// SSH Certificate Path (string)
        /// </summary>
        [Input("sshCertPath")]
        public Input<string>? SshCertPath { get; set; }

        [Input("sshKey")]
        private Input<string>? _sshKey;

        /// <summary>
        /// SSH Private Key
        /// </summary>
        public Input<string>? SshKey
        {
            get => _sshKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// SSH Private Key Path (string)
        /// </summary>
        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        [Input("taints")]
        private InputList<Inputs.ClusterNodeTaintArgs>? _taints;

        /// <summary>
        /// Node taints
        /// </summary>
        public InputList<Inputs.ClusterNodeTaintArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.ClusterNodeTaintArgs>());
            set => _taints = value;
        }

        [Input("user", required: true)]
        private Input<string>? _user;

        /// <summary>
        /// SSH user that will be used by RKE
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

        public ClusterNodeArgs()
        {
        }
        public static new ClusterNodeArgs Empty => new ClusterNodeArgs();
    }
}
