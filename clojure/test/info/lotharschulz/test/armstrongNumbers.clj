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
             (getNumberOfDigits [nil]) => nil
             (getNumberOfDigits ["a"]) => nil
             (getNumberOfDigits [1.0]) => nil
             (getNumberOfDigits [["a", 1]]) => nil
             )
       (fact "return digits of a given number"
             (getDigits [100]) => '(1 0 0)
             (getDigits [0]) => '(0)
             (getDigits [-1]) => '()
             (getDigits [nil]) => ()
             (getDigits ["foo bla fasel"]) => '()
             )
       (fact "armstrong number check for 153, 370, 371, 407"
             (isArmstrongNumber [153]) => truthy
             (isArmstrongNumber [370]) => truthy
             (isArmstrongNumber [371]) => truthy
             (isArmstrongNumber [407]) => truthy
             (isArmstrongNumber [154]) => falsey
             (isArmstrongNumber [369]) => falsey
             (isArmstrongNumber [372]) => falsey
             (isArmstrongNumber [406]) => falsey
             )
       )