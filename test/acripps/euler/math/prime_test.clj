(ns acripps.euler.math.prime-test
  (:use midje.sweet)
  (:require [acripps.euler.math.prime :as p]))

(facts "about is-prime?"
       (fact "one is not a prime number"
             (p/is-prime? 1) => false)
       (fact "two is a prime number"
             (p/is-prime? 2) => true)
       (fact "three is a prime number"
             (p/is-prime? 3) => true)
       (fact "four is not a prime number"
             (p/is-prime? 4) => false)
       (fact "five is a prime number"
             (p/is-prime? 5) => true))
