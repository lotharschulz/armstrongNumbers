(ns info.lotharschulz.test.armstrongNumbers
  (:use midje.sweet)
  (:use [info.lotharschulz.armstrongNumbers]))

(facts "about getDigits`"
       (fact "it normally returns the first element"
             (getDigits [1 2 3] :default) => 1
             (getDigits '(1 2 3) :default) => 1)

       (fact "nil value is returned for empty sequences"
             (getDigits [] :default) => nil
             (getDigits '() :default) => nil
             (getDigits nil :default) => :default
             (getDigits (filter even? [1 3 5]) :default) => nil))
