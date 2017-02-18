(ns info.lotharschulz.armstrongNumbers)

; getDigits
(defn getDigits [sequence default]
  (if (nil? sequence)
    default
    (first sequence)))
