module github.com/jaxxstorm/pulumi-rke/provider/v2

go 1.15

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/jaxxstorm/pulumi-rke/provider v0.0.0-20200428064951-e46a6be7b858 // indirect
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.11.0
	github.com/pulumi/pulumi/pkg/v2 v2.12.0
	github.com/pulumi/pulumi/sdk/v2 v2.12.0
	github.com/rancher/terraform-provider-rke v1.1.3
)

replace (
	golang.org/x/sys => golang.org/x/sys v0.0.0-20190916202348-b4ddaad3f8a3
	k8s.io/client-go => k8s.io/client-go v0.18.0
)
