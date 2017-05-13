(ns acripps.euler.seven.primes
  (:require [acripps.euler.core :as c]))

(defn get-primes
  ""
  ([] (filter c/is-prime? (drop 2 (range)))))
