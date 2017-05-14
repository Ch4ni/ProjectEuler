(ns acripps.euler.problems.p007.primes
  (:require [acripps.euler.util.core :as c]))

(defn get-primes
  ""
  ([] (filter c/is-prime? (drop 2 (range)))))
