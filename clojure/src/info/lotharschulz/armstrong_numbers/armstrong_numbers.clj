(ns info.lotharschulz.armstrong-numbers.armstrong-numbers
  (:import [java.Math]))

(defn get-number-of-digits [^Integer n]
  {:pre [(not (nil? n)) (integer? n)]}
  "Returns the :getNumberOfDigits of n if n is an integer and greater than -1"
  (if (zero? n)
    1
    (if (pos? n )
      (inc (int (Math/log10 n )))
      nil)))

(defn get-digits-alt [^Integer n]
  {:pre [(not (nil? n)) (integer? n)]}
  "return number of digits of given int n"
    (if (zero? n)
      [0]
      (if (pos? n)
        (into [] (map #(Character/getNumericValue %) (str n)))
        [])))

(defn get-digits [^Integer n]
  {:pre [(not (nil? n)) (integer? n)]}
  "return number of digits of given int n"
  (when-not (zero? n)
    (lazy-seq (cons (rem n 10) (get-digits (quot n 10))))))

(defn is-armstrong-number [^Integer n]
  {:pre [(not (nil? n)) (integer? n)]}
  "Returns true if the given number bigger than -1 is an armstrong number"
  (if (zero? n)
    false
    (if (pos? n)
      (= n (reduce + (map #(int (Math/pow % (get-number-of-digits n))) (get-digits n))))
      false)))

(defn generate-armstrong-numbers [^Integer from, ^Integer to]
  {:pre [(not (nil? from)) (integer? from) (pos? from) (not (nil? to)) (integer? to) (pos? to) ]}
  "generate armstrong numbers for ranges of ints greater than 0 defined by from and to"
  (if (< from to)
    (into [] (for [x (range from to)
                   :when (true? (is-armstrong-number x))]
               x))
     []))