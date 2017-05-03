(ns euler.two.fib_test
  (:use midje.sweet)
  (:require [acripps.euler.two.fib :as fib]))

(facts "About the fibonnaci sequence"
       (fact "the first term is 1"
             (take 1 (fib/fibonacci)) => '(1))
       (fact "the first three terms are (1 1 2)"
             (take 3 (fib/fibonacci)) => '[1 1 2])
       (fact "the first 11 terms are (1 1 2 3 5 8 13 21 34 55 89)"
             (take 11 (fib/fibonacci)) => '(1 1 2 3 5 8 13 21 34 55 89)))


(facts "About fibonacci sums"
       (fact "all the even numbers below 100 sum to 44"
             (fib/sum even? (partial <= 100)) => 44)
       (fact "all the odd numbers below 100 sum to 188"
             (fib/sum (complement even?) (partial <= 100)) => 188)
       ;; NOTE: this is the answer to the exercise
       (fact "the sum of all even numbered terms below 4 million is 4613732"
             (fib/sum even? (partial <= 4000000)) => 4613732))
