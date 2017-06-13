(ns acripps.euler.problems.p009.pythagorean-triplet
  (:require [acripps.euler.math.core :as euler.math.core]
            [clojure.math.combinatorics :as math.combinatorics]))

(defn pythagorean-triplet?
  [a b c]
  (= (+ (euler.math.core/square a)
        (euler.math.core/square b))
     (euler.math.core/square c)))

(defn generate-pythagorean-triplets
  "Generates a list of pythagorean triplets with a sum less than x"
  [x]
  ;; there is a faster way to do this ... one must implement selections with a filter
  ;; to take out all of the elements we don't want while the triplets are being generated
  ;; instead of post-processing the list of triplets
  ;; ... at 100 items this is slow. At 1000 items, it is *very* slow.
  (->> (math.combinatorics/selections (range 1 x) 3)
       (filter #(<= (apply + %) x))
       (filter #(apply pythagorean-triplet? %))
       (map sort)
       set))
