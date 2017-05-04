(ns euler.four.palindrome-test
  (:use midje.sweet)
  (:require [acripps.euler.four.palindrome :as p]))

(comment
  "A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
  Find the largest palindrome made from the product of two 3-digit numbers.")

(comment "I think my approach should be to start at the largest 3-digit numbers, check the product, decrement one, check the product, then decrement the other and check the product. Repeat as required.")

(facts "About palindrome?"
       (fact "the empty string is a palindrome"
             (p/palindrome? "") => true)
       (fact "the string \" \" is a palindrome"
             (p/palindrome? " ") => true)
       (fact "the string \"aoa\" is a palindrome"
             (p/palindrome? "aoa") => true)
       (fact "the string \"ao\" is not a palindrome"
             (p/palindrome? "ao") => false)
       (fact "the string \"a man a plan a canal panama\" is a palindrome"
             (p/palindrome? "a man a plan a canal panama") => true))
