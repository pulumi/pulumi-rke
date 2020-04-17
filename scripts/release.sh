#!/bin/bash

set -eu -o pipefail

TAG=$1

if [ -z $TAG ];
then
    echo "Must specify a tag!"
    exit 1
fi

echo "Generating chglog"
git-chglog --next-tag $TAG -o CHANGELOG.md
git commit -am "release $TAG"
echo "Creating tags"
git tag $TAG
git tag sdk/$TAG
git push origin $TAG
git push origin sdk/$TAG



