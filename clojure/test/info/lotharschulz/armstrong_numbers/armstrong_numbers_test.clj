(ns info.lotharschulz.armstrong_numbers.armstrong_numbers_test
  (:require [midje.sweet :refer :all]
            [info.lotharschulz.armstrong_numbers.armstrong_numbers :refer :all]))

(facts "about getNumberOfDigits"
       (fact "return number of digits if given number greater then -1"
             (getNumberOfDigits 100 ) => 3
             (= 4 (getNumberOfDigits 10000)) => falsey
             (getNumberOfDigits 10000) => 5
             (= 4 (getNumberOfDigits 10000)) => falsey
             (getNumberOfDigits 0) => 1
             (= 4 (getNumberOfDigits 0)) => falsey
             (getNumberOfDigits -1) => nil
             (getNumberOfDigits nil) => (throws AssertionError)
             (getNumberOfDigits "a") => (throws AssertionError)
             (getNumberOfDigits 1.0) => (throws AssertionError)
             (getNumberOfDigits ["a", 1]) => (throws AssertionError)
             )
       (fact "getDigits"
             (getDigits 100) => '(1 0 0)
             (getDigits 0) => '(0)
             (getDigits -1) => '()
             (getDigits nil) => (throws AssertionError)
             (getDigits "a") => (throws AssertionError)
             (getDigits 1.0) => (throws AssertionError)
             (getDigits ["a", 1]) => (throws AssertionError)
             )
       (fact "armstrong number check for 153, 370, 371, 407"
             (isArmstrongNumber nil) => (throws AssertionError)
             (isArmstrongNumber "a") => (throws AssertionError)
             (isArmstrongNumber 1.0) => (throws AssertionError)
             (isArmstrongNumber ["a", 1]) => (throws AssertionError)
             )
       (fact "armstrong number check for 153, 370, 371, 407"
             (isArmstrongNumber 153) => truthy
             (isArmstrongNumber 370) => truthy
             (isArmstrongNumber 371) => truthy
             (isArmstrongNumber 407) => truthy
             (isArmstrongNumber 154) => falsey
             (isArmstrongNumber 369) => falsey
             (isArmstrongNumber 372) => falsey
             (isArmstrongNumber 406) => falsey
             (isArmstrongNumber 0) => falsey
             (isArmstrongNumber -1) => falsey
             (isArmstrongNumber nil) => (throws AssertionError)
             (isArmstrongNumber "a") => (throws AssertionError)
             (isArmstrongNumber 1.0) => (throws AssertionError)
             (isArmstrongNumber ["a", 1]) => (throws AssertionError)
             )
       (fact "generate armstrong numbers from 100 to 1000"
             (generateArmstrongNumbers 100 1000) => '(153 370 371 407))
             (generateArmstrongNumbers 0 1000) => (throws AssertionError)
             (generateArmstrongNumbers 1000 0) => (throws AssertionError)
             (generateArmstrongNumbers 2 2) => '()
             (generateArmstrongNumbers -1 1000) => (throws AssertionError)
             (generateArmstrongNumbers 1000 -1) => (throws AssertionError)
             (generateArmstrongNumbers -2 -2) => (throws AssertionError)
             (generateArmstrongNumbers nil nil) => (throws AssertionError)
             (generateArmstrongNumbers "a" "b") => (throws AssertionError)
             (generateArmstrongNumbers 1.0 2.0) => (throws AssertionError)
             (generateArmstrongNumbers ["a", 1] ["b", 2]) => (throws AssertionError)
       )
       
