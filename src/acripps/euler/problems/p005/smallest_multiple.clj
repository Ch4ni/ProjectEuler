(ns acripps.euler.problems.p005.smallest-multiple
  (:require [acripps.euler.util.core :refer [divides?]]))

(defn all-divide?
  [x coll]
  (every? #(divides? % x) coll))

(defn- smallest-divisible
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
     (let [divisions (map (partial quot result) coll)
           still-divisible (filter #(all-divide? % coll) divisions)
           num-divisible (count still-divisible)]
       (condp = num-divisible
         0 x
         1  (first still-divisible)
         (recur (apply min still-divisible)))))))
