(ns acripps.euler.three.prime-factor
  (:require [acripps.euler.core :refer [divides?]]
            [clojure.math.numeric-tower :as math]))

(defn- get-division-threshold
  [x]
  (-> x math/sqrt math/ceil inc))

(defn is-prime?
  [x]
  (condp = x
    1 true
    2 true
    (empty? (filter #(divides? % x) (range 2 (get-division-threshold x))))))

(defn get-primes
  "get all primes (except one) less than x"
  [x]
  (into [] (sort (cons 1 (filter is-prime? (range 2 x))))))


(defn get-factors
  [x]
  (loop [x x
         result []]
    (let [primes (get-primes (get-division-threshold x))
          primes-above (drop-while #(if (= 1 %) true (not (divides? % x))) primes)
          lowest-factor (first primes-above)
          highest-factor (quot x lowest-factor)
          ]
      (if (is-prime? highest-factor)
        (into result [lowest-factor highest-factor])
        (recur highest-factor (conj result lowest-factor))))))
