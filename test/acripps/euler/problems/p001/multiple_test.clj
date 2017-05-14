(ns acripps.euler.problems.p001.multiple_test
  (:use midje.sweet)
  (:require [acripps.euler.problems.p001.multiples :as multiples]))

(facts "About get-multiples"
       (fact "multiples of 3 less than 10 are [3 6 9]"
             (multiples/get-multiples 3 (into [] (range 1 10))) => [3 6 9])
       (fact "multiples of 5 less than 10 are [5]"
             (multiples/get-multiples 5 (into [] (range 1 10))) => [5])
       (fact "multiples of 3 and 5 less than 10 are [3 5 6 9]"
             (multiples/get-multiples 3 5 (range 1 10)) => [3 5 6 9]))

(facts "About sum-multiples"
       (fact "the sum of multiples of 3 less than 10 is 18"
             (multiples/sum-multiples 3 10) => 18)
       (fact "the sum of multiples of 3 or 5 less than 10 is 23"
             (multiples/sum-multiples 3 5 10) => 23)
       (fact "the sum of multiples of 3 or 5 less than 1000 is 233168" ;; Problem answer
             (multiples/sum-multiples 3 5 1000) => 233168))
