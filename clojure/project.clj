(defproject armstrong_numbers "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot info.lotharschulz.armstrong-numbers.armstrong-numbers
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[midje "1.10.3"]]}
                   :plugins [[lein-midje "3.2.1"]]         
                   :uberjar {:aot :all}}
  )
