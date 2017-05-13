(ns acripps.euler.seven.primes
  (:require [acripps.euler.three.prime-factor :as pf]))

(defn get-primes
  ""
  ([] (filter pf/is-prime? (drop 2 (range)))))
