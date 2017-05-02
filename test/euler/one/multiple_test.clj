(ns euler.one.multiple_test
  (:use midje.sweet)
  (:require [acripps.euler.one.multiples :as multiples]))

(facts "About get-multiples"
       (fact "multiples of 3 less than 10 are [3 6 9]"
             (multiples/get-multiples 3 (into [] (range 1 10))) => [3 6 9]))
