(ns acripps.euler.util.core-test
  (:use midje.sweet)
  (:require  [acripps.euler.util.core :as c]))

(facts "about divides?"
       (fact "returns true when one number divides another"
             (c/divides? 1 2) => true)
       (fact "returns false when one number does not divide the other"
             (c/divides? 2 1) => false))

(facts "about positive?"
       (fact "0 is positive"
             (c/positive? 0) => true)
       (fact "1 is positive"
             (c/positive? 1) => true)
       (fact "-1 is not positive"
             (c/positive? -1) => false))

(facts "about negative?"
       (fact "0 is not negative"
             (c/negative? 0) => false)
       (fact "1 is not negative"
             (c/negative? 1) => false)
       (fact "-1 is negative"
             (c/negative? -1) => true))

(facts "about is-prime?"
       (fact "one is not a prime number"
             (c/is-prime? 1) => false)
       (fact "two is a prime number"
             (c/is-prime? 2) => true)
       (fact "three is a prime number"
             (c/is-prime? 3) => true)
       (fact "four is not a prime number"
             (c/is-prime? 4) => false)
       (fact "five is a prime number"
             (c/is-prime? 5) => true))
