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
  (if (zero? n)
    false
    (if (pos? n)
      (= n (reduce + (map #(int (Math/pow % (getNumberOfDigits n))) (getDigits n)  ) ) )
      false
      ) 
    )
  )

(defn generateArmstrongNumbers [^Integer from, ^Integer to]
  {:pre [(not (nil? from)) (integer? from) (pos? from) (not (nil? to)) (integer? to) (pos? to) ]}
  "generate armstrong numbers for ranges of ints greater than 0 defined by from and to"
  (if (< from to)
    (for [x (range from to) 
          :when (true? (isArmstrongNumber x) )]
      x)
    '()
    )
  )