// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package rke

import (
	"strings"
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/rancher/terraform-provider-rke/rke"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "rke"
	// modules:
	mainMod = "index" // the y module
)

var namespaceMap = map[string]string{
	mainPkg: "Rke",
}

func makeMember(moduleTitle string, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	fn := string(unicode.ToLower(rune(mem[0]))) + mem[1:]
	token := moduleName + "/" + fn
	return tokens.ModuleMember(mainPkg + ":" + token + ":" + mem)
}

func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

func makeResource(mod string, res string) tokens.Type {
	return makeType(mod, res)
}

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
/*
func preConfigureCallback(vars resource.PropertyMap, c *terraform.ResourceConfig) error {
	return nil
}
*/

func refProviderLicense(license tfbridge.TFProviderLicense) *tfbridge.TFProviderLicense {
	return &license
}

// managedByPulumi is a default used for some managed resources, in the absence of something more meaningful.
// var managedByPulumi = &tfbridge.DefaultInfo{Value: "Managed by Pulumi"}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv1.NewProvider(rke.Provider().(*schema.Provider))

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                 p,
		Name:              "rke",
		DisplayName:       "Rancher Kubernetes Engine (RKE)",
		Description:       "A Pulumi package for creating and managing rke cloud resources.",
		Keywords:          []string{"pulumi", "rke"},
		TFProviderLicense: refProviderLicense(tfbridge.MITLicenseType),
		License:           "Apache-2.0",
		Homepage:          "https://pulumi.io",
		Repository:        "https://github.com/pulumi/pulumi-rke",
		GitHubOrg:         "rancher",
		Config: map[string]*tfbridge.SchemaInfo{
			"log_file": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"RKE_LOG_FILE"},
				},
			},
			"debug": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"RKE_DEBUG"},
					Value:   false,
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"rke_cluster": {
				Tok:  makeResource(mainMod, "Cluster"),
				Docs: &tfbridge.DocInfo{Source: "cluster.html.markdown"},
				Fields: map[string]*tfbridge.SchemaInfo{
					"nodes": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"roles": {
									Name:       "rolesDeprecated",
									CSharpName: "RolesDeprecated",
								},
							},
						},
					},
					"services_etcd": {
						Name: "servicesEtcdDeprecated",
					},
					"services_kube_api": {
						Name: "servicesKubeApiDeprecated",
					},
					"services_kube_controller": {
						Name: "servicesKubeControllerDeprecated",
					},
					"services_kubelet": {
						Name: "servicesKubeletDeprecated",
					},
					"services_kubeproxy": {
						Name: "servicesKubeProxyDeprecated",
					},
					"services_scheduler": {
						Name: "servicesKubeSchedulerDeprecated",
					},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
