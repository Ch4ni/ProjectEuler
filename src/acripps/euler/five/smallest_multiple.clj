(ns acripps.euler.five.smallest-multiple
  (:require [acripps.euler.core :refer [divides?]]))

(defn all-divide?
  [x coll]
  (every? #(divides? % x) coll))

(defn smallest-divisible
  [coll1 coll2]
  (let [filtered (filter #(all-divide? % coll1) coll2)]
    (if ((complement empty?) filtered)
      (apply min filtered))))

(defn smallest-multiple
  ([coll]
   (let [products (reductions *  coll)
         smallest-direct (smallest-divisible coll products)]
     (smallest-multiple smallest-direct coll)))
  ([x coll]
   (loop [result x]
     (let [divided (map (partial quot x) coll)
           smol (smallest-divisible coll divided)]
       ;; FIX: This is *NOT* correctly detecting the completion boundary ... programmer error
       (println "x: " x ", smol: " smol)
       (if (= x smol)
         smol
         (recur smol))))))
