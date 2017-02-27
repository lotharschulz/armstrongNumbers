(defproject armstrong_numbers "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot armstrong_numbers.armstrong_numbers
  :target-path "target/%s"
  ; :profiles {:uberjar {:aot :all}}
  :profiles {:dev {:dependencies [[midje "1.7.0"]]}}
  )
