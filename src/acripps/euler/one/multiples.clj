(ns acripps.euler.one.multiples
  (:require [acripps.euler.core :refer [divides?]]))

(defn get-multiples
  "given a collection, return the collation that are multiples of x"
  [x coll]
  (filter (partial divides? x) coll))
