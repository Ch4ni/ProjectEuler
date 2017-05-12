(ns euler.five.smallest-multiple-test
  (:use midje.sweet)
  (:require [acripps.euler.five.smallest-multiple :as s]))


(facts "about all-divide?"
       (fact "10 is divisible by [1 2 5]"
             (s/all-divide? 10 [1 2 5]) => true)
       (fact "2520 is divisible by (range 1 10)"
             (s/all-divide? 2520 (range 1 10)) => true)
       (fact "2500 is not divisible by (range 1 10)"
             (s/all-divide? 2500 (range 1 10)) => false))

(facts "About smallest-multiple"
       (fact "The smallest multiple of [1 2 3 4 5 6 7 8 9 10] is 2520"
             (s/smallest-multiple (range 1 11)) => 2520)
       (fact "The smallest multiple of (range 1 21) is 232792560" ;; This is the solution to the problem
             (s/smallest-multiple (range 1 21)) => 232792560))
