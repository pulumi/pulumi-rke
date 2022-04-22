module github.com/pulumi/pulumi-rke/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.21.0
	github.com/pulumi/pulumi/sdk/v3 v3.30.0
	github.com/rancher/terraform-provider-rke v1.2.2
)

replace (
	github.com/rancher/terraform-provider-rke => github.com/pulumi/terraform-provider-rke v1.2.3-0.20211203121652-e3d88620727a
	google.golang.org/grpc => google.golang.org/grpc v1.29.1
	k8s.io/client-go => k8s.io/client-go v0.20.0
)
