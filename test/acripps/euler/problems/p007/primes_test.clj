(ns acripps.euler.problems.p007.primes-test
  (:use midje.sweet)
  (:require [acripps.euler.problems.p007.primes :as p]))

(facts "about get-primes"
       (fact "the 4th prime number is 7"
             (p/nth-prime 4) => 7)
       (fact "the 6th prime number is 13"
             (p/nth-prime 6) => 13)
       (fact "the 10001st prime is 104743"
             (p/nth-prime 10001) => 104743))
