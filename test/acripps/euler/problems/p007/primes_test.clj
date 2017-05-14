(ns acripps.euler.problems.p007.primes-test
  (:use midje.sweet)
  (:require [acripps.euler.problems.p007.primes :as p]))

(facts "about get-primes"
       (fact "the first 4 prime numbers are [2 3 5 7]"
             (take 4 (p/get-primes)) => [2 3 5 7])
       (fact "the first 6 prime numbers are [2 3 5 7 11 13]"
             (last (take 6 (p/get-primes))) => 13)
       (fact "the 10001st prime is 104743"
             (last (take 10001 (p/get-primes))) => 104743))
