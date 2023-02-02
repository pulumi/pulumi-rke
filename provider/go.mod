module github.com/pulumi/pulumi-rke/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.17.2
	github.com/rancher/terraform-provider-rke v1.3.4
)

replace (
	k8s.io/client-go => k8s.io/client-go v0.24.2
	sigs.k8s.io/kustomize/api => sigs.k8s.io/kustomize/api v0.11.4
	sigs.k8s.io/kustomize/kyaml => sigs.k8s.io/kustomize/kyaml v0.13.6
)

require (
	cloud.google.com/go v0.107.0 // indirect
	cloud.google.com/go/storage v1.28.0 // indirect
	github.com/Microsoft/go-winio v0.6.0 // indirect
	github.com/agext/levenshtein v1.2.3 // indirect
	github.com/aws/aws-sdk-go v1.44.144 // indirect
	github.com/containerd/containerd v1.6.10 // indirect
	github.com/coreos/go-systemd/v22 v22.5.0 // indirect
	github.com/docker/docker v20.10.21+incompatible // indirect
	github.com/docker/go-units v0.5.0 // indirect
	github.com/emicklei/go-restful/v3 v3.10.1 // indirect
	github.com/evanphx/json-patch v5.6.0+incompatible // indirect
	github.com/exponent-io/jsonpath v0.0.0-20210407135951-1de76d718b3f // indirect
	github.com/go-ini/ini v1.67.0 // indirect
	github.com/go-openapi/jsonreference v0.20.0 // indirect
	github.com/golang/snappy v0.0.4 // indirect
	github.com/google/btree v1.1.2 // indirect
	github.com/google/gnostic v0.6.9 // indirect
	github.com/gregjones/httpcache v0.0.0-20190611155906-901d90724c79 // indirect
	github.com/hashicorp/go-getter v1.6.2 // indirect
	github.com/hashicorp/go-hclog v1.3.1 // indirect
	github.com/hashicorp/go-plugin v1.4.6 // indirect
	github.com/hashicorp/go-uuid v1.0.3 // indirect
	github.com/hashicorp/go-version v1.6.0 // indirect
	github.com/hashicorp/hcl/v2 v2.15.0 // indirect
	github.com/hashicorp/terraform-plugin-test v1.4.3 // indirect
	github.com/hashicorp/yamux v0.1.1 // indirect
	github.com/huandu/xstrings v1.3.3 // indirect
	github.com/imdario/mergo v0.3.13 // indirect
	github.com/klauspost/compress v1.15.12 // indirect
	github.com/mattn/go-colorable v0.1.13 // indirect
	github.com/matttproud/golang_protobuf_extensions v1.0.4 // indirect
	github.com/mcuadros/go-version v0.0.0-20190830083331-035f6764e8d2 // indirect
	github.com/mitchellh/cli v1.1.5 // indirect
	github.com/mitchellh/go-wordwrap v1.0.1 // indirect
	github.com/mitchellh/mapstructure v1.5.0 // indirect
	github.com/moby/sys/mount v0.3.3 // indirect
	github.com/moby/term v0.0.0-20221120202655-abb19827d345 // indirect
	github.com/oklog/run v1.1.0 // indirect
	github.com/opencontainers/image-spec v1.1.0-rc2 // indirect
	github.com/opencontainers/runc v1.1.4 // indirect
	github.com/posener/complete v1.2.3 // indirect
	github.com/prometheus/client_golang v1.14.0 // indirect
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.21.0
	github.com/pulumi/pulumi/sdk/v3 v3.30.0
	github.com/rancher/lasso v0.0.0-20220628160937-749b3397db38 // indirect
	github.com/rancher/norman v0.0.0-20220719193118-e21cabdc65b9 // indirect
	github.com/rancher/rke v1.4.0 // indirect
	github.com/rancher/wrangler v1.0.0 // indirect
	github.com/shopspring/decimal v1.3.1 // indirect
	github.com/sirupsen/logrus v1.9.0 // indirect
	github.com/spf13/afero v1.9.3 // indirect
	github.com/spf13/cast v1.5.0 // indirect
	github.com/spf13/cobra v1.6.1 // indirect
	github.com/ulikunitz/xz v0.5.10 // indirect
	github.com/urfave/cli v1.22.10 // indirect
	github.com/vmihailenco/tagparser v0.1.2 // indirect
	github.com/zclconf/go-cty-yaml v1.0.3 // indirect
	go.etcd.io/etcd/client/v2 v2.305.6 // indirect
	go.etcd.io/etcd/client/v3 v3.5.6 // indirect
	go.starlark.net v0.0.0-20221028183056-acb66ad56dd2 // indirect
	go.uber.org/atomic v1.10.0 // indirect
	go.uber.org/multierr v1.8.0 // indirect
	go.uber.org/zap v1.23.0 // indirect
	golang.org/x/crypto v0.3.0 // indirect
	golang.org/x/oauth2 v0.2.0 // indirect
	golang.org/x/time v0.2.0 // indirect
	golang.org/x/tools v0.3.0 // indirect
	google.golang.org/api v0.103.0 // indirect
	google.golang.org/genproto v0.0.0-20221118155620-16455021b5e6 // indirect
	google.golang.org/grpc v1.51.0 // indirect
	k8s.io/apiserver v0.25.4 // indirect
	k8s.io/client-go v12.0.0+incompatible // indirect
	k8s.io/kube-openapi v0.0.0-20221116234839-dd070e2c4cb3 // indirect
	k8s.io/kubectl v0.25.4 // indirect
	k8s.io/utils v0.0.0-20221108210102-8e77b1f39fe2 // indirect
	sigs.k8s.io/json v0.0.0-20221116044647-bc3834ca7abd // indirect
	sigs.k8s.io/kustomize/kyaml v0.13.10 // indirect
)
