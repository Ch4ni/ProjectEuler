(ns acripps.euler.one.multiples
  (:require [acripps.euler.core :refer [divides?]]))

(defn get-multiples
  "given a collection, return the list that are multiples of x"
  [x coll]
  (divides? x 10))
