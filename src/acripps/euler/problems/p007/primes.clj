(ns acripps.euler.problems.p007.primes
  (:require [acripps.euler.math.prime :as p]))

(defn nth-prime
  [n]
  (last (take n (p/get-primes))))
