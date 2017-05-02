(ns euler.core-test
  (:use midje.sweet)
  (:require  [acripps.euler.core :as c]))

(facts "about divides?"
       (fact "returns true when one number divides another"
             (c/divides? 1 2) => true)
       (fact "returns false when one number does not divide the other"
             (c/divides? 2 1) => false))
