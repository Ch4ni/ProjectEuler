(ns acripps.euler.one.multiples
  (:require [acripps.euler.core :refer [divides?]]))

(defn get-multiples
  "given a collection, return the list that are multiples of x"
  [x coll]
  ;; FIXME: This does not do what the description says ... working out how to get midje to pick up the new code
  (divides? x 10))
