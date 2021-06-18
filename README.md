# [Armstrong Numbers](https://en.wikipedia.org/wiki/Narcissistic_number) implementations
using different programming languages.

![tests ](https://github.com/github/docs/actions/workflows/tests.yml/badge.svg)

## Why?
This repo are coding finger exercises with different languages using [narcissistic/armstrong numbers](https://en.wikipedia.org/wiki/Narcissistic_number). It is mainly about getting familiar with the different languages.
You can also discover language similarities and differences based on the use case.

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

## typescript
#### run
```
tsc armstrong.ts && node armstrong.js
```
#### test
```
yarn test
```
