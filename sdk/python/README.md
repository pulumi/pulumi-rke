[![Actions Status](https://github.com/pulumi/pulumi-rke/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-rke/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Frke.svg)](https://www.npmjs.com/package/@pulumi/rke)
[![Python version](https://badge.fury.io/py/pulumi-rke.svg)](https://pypi.org/project/pulumi-rke)
[![NuGet version](https://badge.fury.io/nu/pulumi.rke.svg)](https://badge.fury.io/nu/pulumi.rke)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-rke/sdk/v3/go)](https://pkg.go.dev/github.com/pulumi/pulumi-rke/sdk/v3/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-rke/blob/master/LICENSE)

# Rancher RKE provider

The RKE provider is used to interact with Rancher Kubernetes Engine kubernetes clusters. To use
this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/rke

or `yarn`:

    $ yarn add @pulumi/rke

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_rke

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-rke/sdk/v3

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Rke

## Configuration

The following configuration points are available:

- `rke:debug` - (Optional) Enable RKE debug logs. It can also be sourced from the `RKE_DEBUG` 
  environment variable. Default `false` (bool)
- `rke:logFile` - (Optional) Save RKE logs to a file. It can also be sourced from the `RKE_LOG_FILE` 
  environment variable (string)

## Reference

For further information, please visit [the RKE provider docs](https://www.pulumi.com/docs/intro/cloud-providers/rke) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/rke).
