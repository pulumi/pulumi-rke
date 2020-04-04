using Pulumi;
using Pulumi.Rke;
using Pulumi.Rke.Inputs;

class MyStack : Stack
{
  [Output]
  public Output<string> RkeKubeConfigYaml { get; set; }
  [Output]
  public Output<string> RkeCaCrt { get; set; }
  [Output]
  public Output<string> RkeClientCert { get; set; }
  [Output]
  public Output<string> RkeClientKey { get; set; }

  public MyStack()
  {
    // Rke Cluster Full Example
    // Not all fields are required to successfully build a cluster.
    var rkeCluster = new Cluster("rkeCluster",
      new ClusterArgs
      {
        //  Disable port check validation between nodes
        DisablePortCheck = false,

        // Kubernetes Nodes in RKE Cluster
        Nodes = new InputList<ClusterNodesArgs>
        {
          new ClusterNodesArgs
          {
            Address = "1.1.1.1",
            User = "ubuntu",
            Roles = {"controlplane", "etcd"},
            SshKeyPath = "~/.ssh/id_rsa",
            Port   = "2222"
          },
          new ClusterNodesArgs
          {
            Address = "2.2.2.2",
            User = "ubuntu",
            Roles = {"worker"},
            SshKey = @"
-----BEGIN RSA PRIVATE KEY-----
-----END RSA PRIVATE KEY-----",
            // or
            // SshKeyPath = "~/.ssh/id_rsa"
          },
          new ClusterNodesArgs
          {
            Address = "example.com",
            User = "ubuntu",
            Roles = {"controlplane", "etcd", "worker"},
            HostnameOverride = "node3",
            InternalAddress = "192.168.1.6",
            Labels =
            {
              {"app","nginx"}
            }
          }
        },

        // If set to true, RKE will not fail when unsupported Docker version are found
        IgnoreDockerVersion = true,

        // Cluster level SSH private key
        // Used if no ssh information is set for the node
        SshKeyPath = "~/.ssh/test",

        // Enable use of SSH agent to use SSH private keys with passphrase
        // This requires the environment `SSH_AUTH_SOCK` configured pointing to your SSH agent which has the private key added
        SshAgentAuth = false,

        // Bastion/Jump host configuration
        //BastionHost = new ClusterBastionHostArgs
        //{
        //  Address = "1.1.1.1",
        //  User = "ubuntu",
        //  SshKeyPath = "~/.ssh/id_rsa",
        //  // or
        //  SshKey = @"
//-----BEGIN RSA PRIVATE KEY-----
//-----END RSA PRIVATE KEY-----",
        //  Port = "2222"
        //},

        // List of registry credentials, if you are using a Docker Hub registry, you can omit the `url` or set it to `docker.io`
        // PrivateRegistries = new InputList<ClusterPrivateRegistriesArgs>
        // {
        //   new ClusterPrivateRegistriesArgs
        //   {
        //     Url = "registry1.com",
        //     User = "Username",
        //     Password = "password1"
        //   },
        //   new ClusterPrivateRegistriesArgs
        //   {
        //     Url = "registry2.com",
        //     User = "Username",
        //     Password = "password2"
        //   }
        // },

        // Set the name of the Kubernetes cluster
        ClusterName = "",

        // Supported versions are determined by the versions supported by the terraform rke provider that this Pulumi privder is generated from.
        // In case the kubernetes_version and kubernetes image in system_images are defined, the system_images configuration will take precedence over kubernetes_version.
        KubernetesVersion = "v1.17.2-rancher1-2",

        // System Image Tags are defaulted to a tag tied with specific kubernetes Versions
        // SystemImages = new ClusterSystemImagesArgs
        // {
        //   Kubernetes = "rancher/hyperkube:v1.10.3-rancher2",
        //   Etcd = "rancher/coreos-etcd:v3.1.12",
        //   Alpine = "rancher/rke-tools:v0.1.9",
        //   NginxProxy = "rancher/rke-tools:v0.1.9",
        //   CertDownloader = "rancher/rke-tools:v0.1.9",
        //   KubernetesServicesSidecar = "rancher/rke-tools:v0.1.9",
        //   KubeDns = "rancher/k8s-dns-kube-dns-amd64:1.14.8",
        //   Dnsmasq = "rancher/k8s-dns-dnsmasq-nanny-amd64:1.14.8",
        //   KubeDnsSidecar = "rancher/k8s-dns-sidecar-amd64:1.14.8",
        //   KubeDnsAutoscaler = "rancher/cluster-proportional-autoscaler-amd64:1.0.0",
        //   PodInfraContainer = "rancher/pause-amd64:3.1"
        // },

        // Path to save all kubernetes/rancher files (pki, etc.). This is also where the kubelet and other services mount such as etcd, kubelet, etc.
        // defaults to /opt/rke
        // PrefixPath = "/srv/rke"

        // Kubernetes services
        Services = new ClusterServicesArgs
        {
          Etcd = new ClusterServicesEtcdArgs
          {
            // if external etcd used
            // Path = "/etcdcluster",
            // CaCert = "ca_cert",
            // Cert = "cert",
            // Key = "key",

            // // for etcd snapshots
            // BackupConfig = new ClusterServicesEtcdBackupConfigArgs
            // {
            //   IntervalHours = 12,
            //   Retention = 6,
            //   // //s3 specific parameters
            //   // S3BackupConfig = new ClusterServicesEtcdBackupConfigS3BackupConfigArgs
            //   // {
            //   //     AccessKey = "",
            //   //     SecretKey = "",
            //   //     BucketName = "",
            //   //     Region = "",
            //   //     Endpoint = ""
            //   // }
            // }
          },
          KubeApi = new ClusterServicesKubeApiArgs
          {
            // IP range for any services created on Kubernetes
            // This must match the service_cluster_ip_range in kube-controller
            ServiceClusterIpRange = "10.43.0.0/16",

            // Expose a different port range for NodePort services
            ServiceNodePortRange = "30000-32767",

            PodSecurityPolicy = false,

            AlwaysPullImages = false,

            // Add additional arguments to the kubernetes API server
            // This WILL OVERRIDE any existing defaults
            // ExtraArgs =
            // {
            //   { "audit-log-path", "-" },
            //   {"delete-collection-workers","3"},
            //   {"v","4"}
            // },
          },
          KubeController = new ClusterServicesKubeControllerArgs
          {
              // CIDR pool used to assign IP addresses to pods in the cluster
              ClusterCidr = "10.42.0.0/16",

              // IP range for any services created on Kubernetes
              // This must match the ServiceClusterIpRange in KubeApi
              ServiceClusterIpRange = "10.43.0.0/16"
          },
          Kubelet = new ClusterServicesKubeletArgs
          {
              // Base domain for the cluster
              ClusterDomain = "cluster.local",

              // IP address for the DNS service endpoint
              // The default value for this option is 10.43.0.10
              ClusterDnsServer = "10.43.0.10",

              // Fail if swap is on
              FailSwapOn = false,

              // Optionally define additional volume binds to a service
              // ExtraBinds =
              // {
              //   "/usr/libexec/kubernetes/kubelet-plugins:/usr/libexec/kubernetes/kubelet-plugins"
              // }
          },
          // Kubeproxy = new ClusterServicesKubeproxyArgs{}
        },

        // Currently, only authentication strategy supported is x509.
        // You can optionally create additional SANs (hostnames or IPs) to add to the API server PKI certificate.
        // This is useful if you want to use a load balancer for the control plane servers.
        Authentication = new ClusterAuthenticationArgs
        {
          Strategy = "x509",
          Sans =
            {
              "10.18.160.10",
              "my-loadbalancer-1234567890.us-west-2.elb.amazonaws.com",
            }
        },

        // If you want to set a Kubernetes cloud provider, you specify the name and configuration
        // CloudProvider = new ClusterCloudProviderArgs
        // {
        //   Name = "aws"
        // },

        // Add-ons are deployed using kubernetes jobs. RKE will give up on trying to get the job status after this timeout in seconds.
        // AddonJobTimeout = 30,

        // Network(CNI) - supported: flannel/calico/canal/weave
        // Defaults to canal
        // Network = new ClusterNetworkArgs
        // {
        //   Plugin = "canal"
        // },

        // Ingress
        // Currently only nginx ingress provider is supported and is enabled by default.
        // To disable ingress controller, set Provider to "none"
        // Ingress = new ClusterIngressArgs
        // {
        //   Provider = "nginx",
        //   NodeSelector =
        //   {
        //     {"app","nginx"}
        //   }
        // },

        // all addon manifests MUST specify a namespace
        Addons = @"
---
apiVersion: v1
kind: Pod
metadata:
  name: my-nginx
  namespace: default
spec:
  containers:
  - name: my-nginx
    image: nginx
    ports:
    - containerPort: 80
",
        AddonsIncludes =
        {
          "https://raw.githubusercontent.com/rook/rook/master/cluster/examples/kubernetes/rook-operator.yaml",
          "https://raw.githubusercontent.com/rook/rook/master/cluster/examples/kubernetes/rook-cluster.yaml",
          "/path/to/manifest"
        }

    });

    // Set the KubeConfig to an output
    this.RkeKubeConfigYaml = rkeCluster.KubeConfigYaml;

    // Set the CaCrt, ClientCert, and ClientKey to outputs
    this.RkeCaCrt = rkeCluster.CaCrt;
    this.RkeClientCert = rkeCluster.ClientCert;
    this.RkeClientKey = rkeCluster.ClientKey;
  }
}
