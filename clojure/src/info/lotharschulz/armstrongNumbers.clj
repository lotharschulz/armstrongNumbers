(ns info.lotharschulz.armstrongNumbers
  (:import [java.Math]))

; getNumberOfDigits
(defn getNumberOfDigits [n]
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