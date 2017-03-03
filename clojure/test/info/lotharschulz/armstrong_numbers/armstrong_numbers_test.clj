(ns info.lotharschulz.armstrong-numbers.armstrong-numbers-test
  (:require [midje.sweet :refer :all]
            [info.lotharschulz.armstrong-numbers.armstrong-numbers :refer :all]))

(facts "about armstrong numbers"
       (fact "return number of digits if given number greater then -1"
             (get-number-of-digits 100) => 3
             (get-number-of-digits 10000) =not=> 4
             (get-number-of-digits 10000) => 5
             (get-number-of-digits 10000) =not=> 4
             (get-number-of-digits 0) => 1
             (get-number-of-digits 0) =not=> 4
             (get-number-of-digits -1) => nil
             (get-number-of-digits nil) => (throws AssertionError)
             (get-number-of-digits "a") => (throws AssertionError)
             (get-number-of-digits 1.0) => (throws AssertionError)
             (get-number-of-digits ["a", 1]) => (throws AssertionError)
             )
       (fact "list of digits for given number"
             (get-digits 100) => [0 0 1]
             (get-digits 0) => nil
             (get-digits -1) => [-1]
             (get-digits nil) => (throws AssertionError)
             (get-digits "a") => (throws AssertionError)
             (get-digits 1.0) => (throws AssertionError)
             (get-digits ["a", 1]) => (throws AssertionError)
             )
       (fact "list of digits for given number (alt)"
             (get-digits-alt 100) => [1 0 0]
             (get-digits-alt 0) => [0]
             (get-digits-alt -1) => []
             (get-digits-alt nil) => (throws AssertionError)
             (get-digits-alt "a") => (throws AssertionError)
             (get-digits-alt 1.0) => (throws AssertionError)
             (get-digits-alt ["a", 1]) => (throws AssertionError)
             )
       (fact "armstrong number check for 153, 370, 371, 407"
             (armstrong-number-alt? 153) => truthy
             (armstrong-number-alt? 370) => truthy
             (armstrong-number-alt? 371) => truthy
             (armstrong-number-alt? 407) => truthy
             (armstrong-number-alt? 154) => falsey
             (armstrong-number-alt? 369) => falsey
             (armstrong-number-alt? 372) => falsey
             (armstrong-number-alt? 406) => falsey
             (armstrong-number-alt? 0) => falsey
             (armstrong-number-alt? -1) => falsey
             (armstrong-number-alt? nil) => (throws AssertionError)
             (armstrong-number-alt? "a") => (throws AssertionError)
             (armstrong-number-alt? 1.0) => (throws AssertionError)
             (armstrong-number-alt? ["a", 1]) => (throws AssertionError)
             )
       (fact "armstrong number check (?) for 153, 370, 371, 407"
             (armstrong-number? 153) => truthy
             (armstrong-number? 370) => truthy
             (armstrong-number? 371) => truthy
             (armstrong-number? 407) => truthy
             (armstrong-number? 154) => falsey
             (armstrong-number? 369) => falsey
             (armstrong-number? 372) => falsey
             (armstrong-number? 406) => falsey
             (armstrong-number? 0) => falsey
             (armstrong-number? -1) => falsey
             (armstrong-number? nil) => (throws AssertionError)
             (armstrong-number? "a") => (throws AssertionError)
             (armstrong-number? 1.0) => (throws AssertionError)
             (armstrong-number? ["a", 1]) => (throws AssertionError)
             )
       (fact "generate armstrong numbers from 100 to 1000"
             (generate-armstrong-numbers 100 1000) => [153 370 371 407]
             (generate-armstrong-numbers 1 1000) => [1 2 3 4 5 6 7 8 9 153 370 371 407]
             (generate-armstrong-numbers 0 1000) => [1 2 3 4 5 6 7 8 9 153 370 371 407]
             (generate-armstrong-numbers 1000 0) => []
             (generate-armstrong-numbers 2 2) => []
             (generate-armstrong-numbers -1 1000) => [1 2 3 4 5 6 7 8 9 153 370 371 407]
             (generate-armstrong-numbers 1000 -1) => []
             (generate-armstrong-numbers -2 -2) => []
             (generate-armstrong-numbers nil nil) => (throws AssertionError)
             (generate-armstrong-numbers "a" "b") => (throws AssertionError)
             (generate-armstrong-numbers 1.0 2.0) => (throws AssertionError)
             (generate-armstrong-numbers ["a", 1] ["b", 2]) => (throws AssertionError))

)
