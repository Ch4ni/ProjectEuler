(ns acripps.euler.problems.p001.multiples
  (:require [acripps.euler.util.core :refer [divides?]]))

(defn get-multiples
  "given a collection, return the collation that are multiples of x"
  ([x coll]
   (filter (partial divides? x) coll))
  ([x y coll]
   (into [] (sort (into (into #{} (get-multiples x coll)) (get-multiples y coll))))))


(defn sum-multiples
  ([x max]
   (reduce + (get-multiples x (range 1 max))))
  ([x y max]
   (reduce + (get-multiples x y (range 1 max)))))
