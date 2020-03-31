module github.com/jaxxstorm/pulumi-rke/examples

go 1.13

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/jaxxstorm/pulumi-rke/sdk => ../sdk
)
