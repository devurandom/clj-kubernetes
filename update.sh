#!/bin/sh

set -e

swgversion=2.2.0

k8sversion=$1
test -n "$k8sversion"

pkgversion=$2
test -n "$pkgversion"

# Download swagger-codegen
test -f swagger-codegen-cli-$swgversion.jar || curl -O http://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/$swgversion/swagger-codegen-cli-$swgversion.jar

# Generate code
java -jar swagger-codegen-cli-$swgversion.jar generate -i https://raw.githubusercontent.com/kubernetes/kubernetes/v$k8sversion/api/swagger-spec/v1.json -l clojure --additional-properties projectName=kubernetes,projectVersion=$k8sversion-$pkgversion,projectDescription="Clojure API bindings for Kubernetes",projectUrl=https://github.com/devurandom/clj-kubernetes,projectLicenseName="Apache License, Version 2.0",projectLicenseUrl=http://www.apache.org/licenses/LICENSE-2.0.html

# Fix code
sed 's/apiv-/v1/' -i src/kubernetes/api/apiv_.clj
mv src/kubernetes/api/apiv_.clj src/kubernetes/api/v1.clj

# Deploy to GitHub
git add .
git commit
git tag v$k8sversion-$pkgversion
git push --tags

# Deploy to Clojars
lein deploy clojars
