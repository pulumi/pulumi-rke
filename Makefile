PROJECT_NAME := rke Package
include build/common.mk

PACK             := rke
ORG              := jaxxstorm
PACKDIR          := sdk
PROJECT          := github.com/${ORG}/pulumi-${PACK}
NODE_MODULE_NAME := @${ORG}/${PACK}
TF_NAME          := ${PACK}

TFGEN           := pulumi-tfgen-${PACK}
PROVIDER        := pulumi-resource-${PACK}
VERSION         := $(shell scripts/get-version)
PYPI_VERSION    := $(shell scripts/get-py-version)

DOTNET_PREFIX  := $(firstword $(subst -, ,${VERSION:v%=%})) # e.g. 1.5.0
DOTNET_SUFFIX  := $(word 2,$(subst -, ,${VERSION:v%=%}))    # e.g. alpha.1

ifeq ($(strip ${DOTNET_SUFFIX}),)
	DOTNET_VERSION := $(strip ${DOTNET_PREFIX})-preview
else
	DOTNET_VERSION := $(strip ${DOTNET_PREFIX})-preview-$(strip ${DOTNET_SUFFIX})
endif

TESTPARALLELISM := 4

# NOTE: Since the plugin is published using the nodejs style semver version
# We set the PLUGIN_VERSION to be the same as the version we use when building
# the provider (e.g. x.y.z-dev-... instead of x.y.zdev...)
build:: tfgen provider build_node build_python build_go build_dotnet

build_node:: tfgen provider
	${GOPATH}/bin/$(TFGEN) nodejs --overlays overlays/nodejs --out ${PACKDIR}/nodejs/
	cd ${PACKDIR}/nodejs/ && \
        yarn install && \
        yarn run tsc && \
        cp ../../README.md ../../LICENSE package.json yarn.lock ./bin/ && \
        sed -i.bak -e "s/\$${VERSION}/$(VERSION)/g" -e "s/\@pulumi\/rke/@$${ORG}\/pulumi-rke/g" ./bin/package.json

build_python:: tfgen provider
	${GOPATH}/bin/$(TFGEN) python --overlays overlays/python --out ${PACKDIR}/python/
	cd ${PACKDIR}/python/ && \
        cp ../../README.md . && \
        $(PYTHON) setup.py clean --all 2>/dev/null && \
        rm -rf ./bin/ ../python.bin/ && cp -R . ../python.bin && mv ../python.bin ./bin && \
        sed -i.bak -e "s/\$${VERSION}/$(PYPI_VERSION)/g" -e "s/\$${PLUGIN_VERSION}/$(VERSION)/g" ./bin/setup.py && \
        rm ./bin/setup.py.bak && \
        cd ./bin && $(PYTHON) setup.py build sdist

build_go:: tfgen provider
	${GOPATH}/bin/$(TFGEN) go --overlays overlays/go --out ${PACKDIR}/go/

build_dotnet:: tfgen provider
	${GOPATH}/bin/$(TFGEN) dotnet --overlays overlays/dotnet --out ${PACKDIR}/dotnet/
	cd ${PACKDIR}/dotnet/ && \
        echo "${VERSION:v%=%}" >version.txt && \
        dotnet build /p:Version=${DOTNET_VERSION}


tfgen::
	cd provider && go build -o ${GOPATH}/bin/${TFGEN} -ldflags "-X github.com/${ORG}/pulumi-${PACK}/provider/pkg/version.Version=${VERSION}" ${PROJECT}/provider/cmd/${TFGEN}

generate_schema:: tfgen
	${GOPATH}/bin/${TFGEN} schema --out ./provider/cmd/${PROVIDER}

provider:: generate_schema
	go generate ${PROJECT}/provider/cmd/${PROVIDER}

lint::
	golangci-lint run
