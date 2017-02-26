(ns info.lotharschulz.armstrongNumbers
  (:import [java.Math]))

; getNumberOfDigits
(defn getNumberOfDigits [^Integer n]
  ;; {:pre [(not-nil? n) (....)]}
  "Returns the :getNumberOfDigits of n if n is an integer and greater than -1"
  (if (integer? (nth n 0) )
    (if (zero? (nth n 0))
      1
        (if (pos? (nth n 0) )
          (+ (int (Math/log10 (nth n 0) )) 1)
          nil
        )
      )
    nil
    )
  )

(defn getDigits [^Integer n]
  "Returns the digits of a given n if n is an integer and greater than -1"
  ;; {:pre [(not-nil? n) (....)]}
  (if (integer? (nth n 0) )
    (if (zero? (nth n 0))
      '(0)
        (if (pos? (nth n 0) )
          (map #(Character/getNumericValue %) (str (nth n 0) ))
          '()
        )
      )
    '()
    )
  )

(defn isArmstrongNumber [^Integer n]
  "Returns true if the given number bigger than -1 is an armstrong number"
  ;; {:pre [(not-nil? n) (....)]}
  (= (nth n 0) ( (map Math/pow (getDigits[(nth n 0)]) (getNumberOfDigits [(nth n 0)]) )  ) )
  )