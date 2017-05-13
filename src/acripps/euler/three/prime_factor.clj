(ns acripps.euler.three.prime-factor
  (:require [acripps.euler.core :as c]
            [clojure.math.numeric-tower :as math]))

(defn get-primes
  "get all primes (except one) less than x"
  [x]
  (into [] (sort (filter c/is-prime? (drop 2 (range x))))))


(defn get-factors
  [x]
  (loop [x x
         result []]
    (let [primes (get-primes (c/lowest-factor-max x))
          primes-above (drop-while #(if (= 1 %) true (not (c/divides? % x))) primes)
          lowest-factor (first primes-above)
          highest-factor (quot x lowest-factor)
          ]
      (if (c/is-prime? highest-factor)
        (into result [lowest-factor highest-factor])
        (recur highest-factor (conj result lowest-factor))))))
