[![Actions Status](https://github.com/pulumi/pulumi-rke/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-rke/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Frke.svg)](https://www.npmjs.com/package/@pulumi/rke)
[![Python version](https://badge.fury.io/py/pulumi-rke.svg)](https://pypi.org/project/pulumi-rke)
[![NuGet version](https://badge.fury.io/nu/pulumi.rke.svg)](https://badge.fury.io/nu/pulumi.rke)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-rke/sdk/v3/go)](https://pkg.go.dev/github.com/pulumi/pulumi-rke/sdk/v3/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-rke/blob/master/LICENSE)

# Rancher RKE provider

>[!NOTE] As of v3.6.0, this provider is DEPRECATED and will no longer be maintained by Pulumi.
> We recommend using the [Local Provider](https://www.pulumi.com/blog/any-terraform-provider/) version of this package,
> which can be generated from the RKE Terraform provider as follows:
> `pulumi package add terraform-provider registry.opentofu.org/rancher/rke <version>`
> and follow the instructions.

## Migration

The currently equivalent upstream version to pulumi-rke@v3.6.0 is search.opentofu.org/provider/rancher/rke v1.7.0.
We recommend that you migrate between these versions of each provider.
To perform the migration of existing rke resources, we recommend running `pulumi import` in a fresh stack 
which uses the local provider package.

## Reference

For further information, please visit [the RKE provider docs](https://www.pulumi.com/docs/intro/cloud-providers/rke) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/rke).
