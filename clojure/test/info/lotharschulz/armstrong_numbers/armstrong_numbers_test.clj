(ns info.lotharschulz.armstrong-numbers.armstrong-numbers-test
  (:require [midje.sweet :refer :all]
            [info.lotharschulz.armstrong-numbers.armstrong-numbers :refer :all]))

(facts "about armstrong numbers"
       (fact "return number of digits if given number greater then -1"
             (get-number-of-digits 100) => 3
             (= 4 (get-number-of-digits 10000)) => falsey
             (get-number-of-digits 10000) => 5
             (= 4 (get-number-of-digits 10000)) => falsey
             (get-number-of-digits 0) => 1
             (= 4 (get-number-of-digits 0)) => falsey
             (get-number-of-digits -1) => nil
             (get-number-of-digits nil) => (throws AssertionError)
             (get-number-of-digits "a") => (throws AssertionError)
             (get-number-of-digits 1.0) => (throws AssertionError)
             (get-number-of-digits ["a", 1]) => (throws AssertionError)
             )
       (fact "list of digits for given number"
             (get-digits 100) => [1 0 0]
             (get-digits 0) => [0]
             (get-digits -1) => []
             (get-digits nil) => (throws AssertionError)
             (get-digits "a") => (throws AssertionError)
             (get-digits 1.0) => (throws AssertionError)
             (get-digits ["a", 1]) => (throws AssertionError)
             )
       (fact "list of digits for given number"
             (get-digits-alt 100) => [1 0 0]
             (get-digits-alt 0) => [0]
             (get-digits-alt -1) => []
             (get-digits-alt nil) => (throws AssertionError)
             (get-digits-alt "a") => (throws AssertionError)
             (get-digits-alt 1.0) => (throws AssertionError)
             (get-digits-alt ["a", 1]) => (throws AssertionError)
             )
       (fact "armstrong number check for 153, 370, 371, 407"
             (is-armstrong-number 153) => truthy
             (is-armstrong-number 370) => truthy
             (is-armstrong-number 371) => truthy
             (is-armstrong-number 407) => truthy
             (is-armstrong-number 154) => falsey
             (is-armstrong-number 369) => falsey
             (is-armstrong-number 372) => falsey
             (is-armstrong-number 406) => falsey
             (is-armstrong-number 0) => falsey
             (is-armstrong-number -1) => falsey
             (is-armstrong-number nil) => (throws AssertionError)
             (is-armstrong-number "a") => (throws AssertionError)
             (is-armstrong-number 1.0) => (throws AssertionError)
             (is-armstrong-number ["a", 1]) => (throws AssertionError)
             )
       (fact "generate armstrong numbers from 100 to 1000"
             (generate-armstrong-numbers 100 1000) => [153 370 371 407])
             (generate-armstrong-numbers 0 1000) => (throws AssertionError)
             (generate-armstrong-numbers 1000 0) => (throws AssertionError)
             (generate-armstrong-numbers 2 2) => []
             (generate-armstrong-numbers -1 1000) => (throws AssertionError)
             (generate-armstrong-numbers 1000 -1) => (throws AssertionError)
             (generate-armstrong-numbers -2 -2) => (throws AssertionError)
             (generate-armstrong-numbers nil nil) => (throws AssertionError)
             (generate-armstrong-numbers "a" "b") => (throws AssertionError)
             (generate-armstrong-numbers 1.0 2.0) => (throws AssertionError)
             (generate-armstrong-numbers ["a", 1] ["b", 2]) => (throws AssertionError)
       )
       
