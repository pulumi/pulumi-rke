module github.com/jaxxstorm/pulumi-rke/provider/v2

go 1.15

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.23.0
	github.com/pulumi/pulumi/sdk/v2 v2.24.1
	github.com/rancher/terraform-provider-rke v1.1.6
	google.golang.org/grpc/examples v0.0.0-20201218190559-666aea1fb34c // indirect
)

replace (
	golang.org/x/sys => golang.org/x/sys v0.0.0-20190916202348-b4ddaad3f8a3
	k8s.io/client-go => k8s.io/client-go v0.18.0
)
