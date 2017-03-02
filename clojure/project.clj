(defproject armstrong_numbers "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot info.lotharschulz.armstrong-numbers.armstrong-numbers
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[midje "1.7.0"]]} 
             :uberjar {:aot :all}}
  )
