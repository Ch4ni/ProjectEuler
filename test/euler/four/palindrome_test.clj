(ns euler.four.palindrome-test
  (:use midje.sweet)
  (:require [acripps.euler.four.palindrome :as p]))

(comment
  "A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
  Find the largest palindrome made from the product of two 3-digit numbers.")

(comment "I think my approach should be to start at the largest 3-digit numbers, check the product, decrement one, check the product, then decrement the other and check the product. Repeat as required.")
