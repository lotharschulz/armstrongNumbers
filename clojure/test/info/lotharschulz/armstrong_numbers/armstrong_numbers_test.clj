(ns info.lotharschulz.armstrong-numbers.armstrong-numbers-test
  (:require [midje.sweet :refer :all]
            [info.lotharschulz.armstrong-numbers.armstrong-numbers :refer :all]))

(facts "about armstrong numbers"
       ;; ?arrow tabs seems buggy, 4 tabulars to test function get-number-of-digits
       (tabular
         (fact "get number of digits failure case tests with not equals tab"
               (get-number-of-digits ?input) ?arrow ?expected)
         ?input     ?arrow    ?expected
         ;0          =not=>    4
         100        =not=>    4
         10000      =not=>    4)
       (tabular
         (fact "get number of digits failure case tests"
               (get-number-of-digits ?input) =not=> ?expected)
         ?input     ?expected
         0          4)
       (tabular
         (fact "get number of digits success case tests with equals tab"
               (get-number-of-digits ?input) ?arrow ?expected)
         ?input     ?arrow    ?expected
         ;nil        =>        (throws AssertionError)
         10000      =>        5
         100        =>        3)
       (tabular
         (fact "get number of digits success case tests"
               (get-number-of-digits ?input) => ?expected)
         ?input     ?expected
         0          1
         -1         nil
         nil        (throws AssertionError)
         "a"        (throws AssertionError)
         1.0        (throws AssertionError)
         ["a", 1]   (throws AssertionError))
       ;;
       (tabular
         (fact "list of digits for given number"
               (get-digits ?input) => ?expected)
         ?input   ?expected
         100      [0 0 1]
         0        nil
         -1       [-1]
         nil      (throws AssertionError)
         "a"      (throws AssertionError)
         1.0      (throws AssertionError)
         ["a", 1] (throws AssertionError))
       (tabular
         (fact "alternative list of digits for given number"
               (get-digits-alt ?input) => ?expected)
         ?input   ?expected
         100      [1 0 0]
         0        [0]
         -1       []
         nil      (throws AssertionError)
         "a"      (throws AssertionError)
         1.0      (throws AssertionError)
         ["a", 1] (throws AssertionError))
       (tabular
         (fact "alternative armstrong number check for 153, 370, 371, 407"
               (armstrong-number-alt? ?input) => ?expected)
         ?input   ?expected
         153      truthy
         370      truthy
         371      truthy
         407      truthy
         154      falsey
         369      falsey
         372      falsey
         406      falsey
         0        falsey
         -1       falsey
         nil      (throws AssertionError)
         "a"      (throws AssertionError)
         1.0      (throws AssertionError)
         ["a", 1] (throws AssertionError))
       (tabular
         (fact "armstrong number check for 153, 370, 371, 407"
               (armstrong-number? ?input) => ?expected)
         ?input   ?expected
         153      truthy
         370      truthy
         371      truthy
         407      truthy
         154      falsey
         369      falsey
         372      falsey
         406      falsey
         nil      (throws AssertionError)
         "a"      (throws AssertionError)
         1.0      (throws AssertionError)
         ["a", 1]      (throws AssertionError))
       (tabular
         (fact "generate armstrong numbers from 100 to 1000"
            (generate-armstrong-numbers ?start ?end) => ?expected)
         ?start   ?end    ?expected
         100      1000    [153 370 371 407]
         1        1000    [1 2 3 4 5 6 7 8 9 153 370 371 407]
         0        1000    [1 2 3 4 5 6 7 8 9 153 370 371 407]
         1000     0       []
         2        2       []
         -1       1000    [1 2 3 4 5 6 7 8 9 153 370 371 407]
         1000     -1      []
         -2       -2      []
         nil      nil     (throws AssertionError)
         "a"      "b"     (throws AssertionError)
         1.0      2.0     (throws AssertionError)
         ["a",1]  ["b",2] (throws AssertionError)))