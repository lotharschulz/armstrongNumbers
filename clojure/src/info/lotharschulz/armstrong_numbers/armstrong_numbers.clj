(ns info.lotharschulz.armstrong_numbers.armstrong_numbers
  (:import [java.Math]))

(defn getNumberOfDigits [^Integer n]
  {:pre [(not (nil? n)) (integer? n)]}
  "Returns the :getNumberOfDigits of n if n is an integer and greater than -1"
  (if (zero? n)
    1
    (if (pos? n )
      (+ (int (Math/log10 n )) 1)
      nil
      )
    )
  )

(defn getDigits [^Integer n]
  {:pre [(not (nil? n)) (integer? n)]}
  "return number of digits of given int n"
    (if (zero? n)
      '(0)
      (if (pos? n)
        (map #(Character/getNumericValue %) (str n))
        '()
        )
      )
  )

(defn isArmstrongNumber [^Integer n]
  {:pre [(not (nil? n)) (integer? n)]}
  "Returns true if the given number bigger than -1 is an armstrong number"
  n
  )

;(defn isArmstrongNumber [^Integer n]
;  "Returns true if the given number bigger than -1 is an armstrong number"
;  {:pre [(not (nil? n)) (integer? n)]}
;  ;; (= (nth n 0) ( (map Math/pow (getDigits[(nth n 0)]) (getNumberOfDigits [(nth n 0)]) )  ) )
;  n
;  )
