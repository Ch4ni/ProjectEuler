(ns euler.six.square-difference-test
  (:use midje.sweet)
  (:require [acripps.euler.six.square-difference :as s]))


(facts "about sum-squares"
       (fact "the sum of the first ten squares is 385"
             (s/sum-squares (range 1 11)) => 385)
       (fact "the sum of the first 100 natural numbers is "
             (s/sum-squares (range 1 101)) => 338350))

(facts "about square-sum"
       (fact "the square of the sum of the first ten numbers is 3025"
             (s/square-sum (range 1 11)) => 3025)
       (fact "the square of the sum of the first 100 natural numbers is"
             (s/square-sum (range 1 101)) => 25502500))

(facts "about difference"
       (fact "the difference between sum-squares and square-sums for 1-10 is 2640"
             (s/difference (range 1 11)) => 2640)
       (fact "the difference between sum-squares and square-sums for 1-100 is ?"
             (s/difference (range 1 101)) => 25164150))
