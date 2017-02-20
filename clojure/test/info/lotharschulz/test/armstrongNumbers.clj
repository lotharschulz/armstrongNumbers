(ns info.lotharschulz.test.armstrongNumbers
  (:use midje.sweet)
  (:use [info.lotharschulz.armstrongNumbers]))

(facts "about getNumberOfDigits"
       (fact "return number of digits if given number greater then -1"
             (getNumberOfDigits [100]) => 3
             (= 4 (getNumberOfDigits [10000])) => falsey
             (getNumberOfDigits [10000]) => 5
             (= 4 (getNumberOfDigits [10000])) => falsey
             (getNumberOfDigits [0]) => 1
             (= 4 (getNumberOfDigits [0])) => falsey
             (getNumberOfDigits [-1]) => nil
             (getNumberOfDigits ["a"]) => nil
             (getNumberOfDigits [1.0]) => nil
             (getNumberOfDigits [["a", 1]]) => nil
             )
       )