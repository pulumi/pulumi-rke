// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rke.Inputs
{

    public sealed class ClusterNodeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Address of Bastion Host (string)
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// Docker socket on the node that will be used in tunneling (string)
        /// </summary>
        [Input("dockerSocket")]
        public Input<string>? DockerSocket { get; set; }

        /// <summary>
        /// Hostname override for node (string)
        /// </summary>
        [Input("hostnameOverride")]
        public Input<string>? HostnameOverride { get; set; }

        /// <summary>
        /// Internal address that will be used for components communication (string)
        /// </summary>
        [Input("internalAddress")]
        public Input<string>? InternalAddress { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Node labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the host provisioned via docker machine (string)
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        /// <summary>
        /// SSH Port of Bastion Host. Default `22` (string)
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        [Input("roles", required: true)]
        private InputList<string>? _roles;

        /// <summary>
        /// Node roles in k8s cluster. `controlplane`, `etcd` and `worker` are supported. (list)
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

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
        /// SSH Certificate Key (string)
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
        /// SSH Private Key (string)
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
        private InputList<Inputs.ClusterNodeTaintGetArgs>? _taints;

        /// <summary>
        /// Node taints (list)
        /// </summary>
        public InputList<Inputs.ClusterNodeTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.ClusterNodeTaintGetArgs>());
            set => _taints = value;
        }

        [Input("user", required: true)]
        private Input<string>? _user;

        /// <summary>
        /// SSH User to Bastion Host (string)
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

        public ClusterNodeGetArgs()
        {
        }
        public static new ClusterNodeGetArgs Empty => new ClusterNodeGetArgs();
    }
}
