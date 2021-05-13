module github.com/pulumi/pulumi-rke/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0
	github.com/pulumi/pulumi/sdk/v3 v3.0.0
	github.com/rancher/terraform-provider-rke v1.2.2
	google.golang.org/grpc/examples v0.0.0-20201218190559-666aea1fb34c // indirect
)

replace (
	github.com/rancher/terraform-provider-rke => github.com/pulumi/terraform-provider-rke v1.2.3-0.20210514091748-81bf6b336321
	golang.org/x/sys => golang.org/x/sys v0.0.0-20190916202348-b4ddaad3f8a3
	k8s.io/client-go => k8s.io/client-go v0.20.0
)
