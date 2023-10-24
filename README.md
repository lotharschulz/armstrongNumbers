# [Armstrong Numbers](https://en.wikipedia.org/wiki/Narcissistic_number) implementations
with different programming languages.

## Why?
This repo are coding finger exercises with different languages using [narcissistic/armstrong numbers](https://en.wikipedia.org/wiki/Narcissistic_number). It is mainly about getting familiar with the different languages.
You can also discover language similarities and differences based on the use case.

## java

#### run
```sh
mvn exec:java -Dexec.mainClass="info.lotharschulz.App"
```
#### test
```sh
mvn [clean] test
```

## scala

#### run
```sh
sbt "run-main info.lotharschulz.App"
```
#### test
```sh
sbt [clean] test
```
##### triggered clean tests
```sh
~ ;clean ;test # triggered clean tests
```

## python

#### run
```sh
python armstrong/armstrong.py
```
#### test
```sh
cd test
python test_armstrong.py
```

## clojure

#### run
```sh
lein run
```
#### test
```sh
lein test
```
##### triggered test
prerequsite: [lein-midje](https://github.com/marick/lein-midje) plugin installed
```sh
lein midje :autotest
```

## typescript

#### run
```sh
tsc armstrong.ts && node armstrong.js
```
#### test
```sh
yarn test
```

#### lint
```sh
yarn lint
yarn lint:ci
```


## kotlin

#### run
```sh
./gradlew run
```
#### test
```sh
./gradlew test
```

#### lint
```sh
./gradlew ktlintCheck
```

#### static code analysis

##### detekt

```sh
./gradlew detekt
```

##### mobsfscan

```sh
# installation - pip3 install mobsfscan
mobsfscan src/
```

## golang

#### run
```sh
todo
```
#### test
```sh
go test
```
