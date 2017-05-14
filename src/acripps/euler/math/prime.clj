(ns acripps.euler.math.prime
  (:require [acripps.euler.math.core :as c]))

(defn is-prime?
  [x]
  (condp = x
    1 false
    2 true
    (empty? (filter #(c/divides? % x) (range 2 (c/lowest-factor-max x))))))

(defn get-primes
  "retrieve a lazy sequence of prime numbers. If given an input,"
  ([]
   (filter is-prime? (drop 2 (range)))))
