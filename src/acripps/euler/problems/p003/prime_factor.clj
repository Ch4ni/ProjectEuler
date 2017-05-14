(ns acripps.euler.problems.p003.prime-factor
  (:require [acripps.euler.math.core :as c]
            [acripps.euler.math.prime :as p]
            [clojure.math.numeric-tower :as math]))

(defn primes-under
  "get all primes less than x"
  [x]
  (take-while (partial < x) (p/get-primes)))


(defn get-factors
  [x]
  (loop [x x
         result []]
    (let [primes (get-primes (c/lowest-factor-max x))
          primes-above (drop-while #(if (= 1 %) true (not (c/divides? % x))) primes)
          lowest-factor (first primes-above)
          highest-factor (quot x lowest-factor)]
      (if (p/is-prime? highest-factor)
        (into result [lowest-factor highest-factor])
        (recur highest-factor (conj result lowest-factor))))))
