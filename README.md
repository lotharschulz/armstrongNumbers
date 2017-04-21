# Armstrong Numbers implementations
using different programming languages.

[![Build Status](https://travis-ci.org/lotharschulz/armstrongNumbers.svg?branch=master)](https://travis-ci.org/lotharschulz/armstrongNumbers)

## java
#### run
```
mvn exec:java -Dexec.mainClass="info.lotharschulz.App"
```
#### test
```
mvn [clean] test
```

## scala
#### run
```
sbt "run-main info.lotharschulz.App"
```
#### test
```
sbt [clean] test
```
##### triggered clean tests
```
~ ;clean ;test # triggered clean tests
```

## python
#### run
```
python armstrong/armstrong.py
```
#### test
```
cd test
python test_armstrong.py
```

## clojure
#### run
```
lein run
```
#### test
```
lein test
```
##### triggered test
prerequsite: [lein-midje](https://github.com/marick/lein-midje) plugin installed
```
lein midje :autotest
```
