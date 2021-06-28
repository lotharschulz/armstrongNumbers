#!/bin/bash
# http://redsymbol.net/articles/unofficial-bash-strict-mode/
set -euo pipefail
IFS=$'\n\t'

cd java
echo "java maven tests"
mvn test
cd ..
cd scala
echo "scala sbt tests"
sbt test
cd ../python/test
echo "python tests"
python test_armstrong.py
cd ../../
cd clojure
echo "clojure leiningen tests"
lein test
cd ..
cd typescript
yarn install
yarn test
cd ..
cd kotlin
./gradlew ktlintCheck
./gradlew test
./gradlew run
