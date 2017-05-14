(ns acripps.euler.problems.p006.square-difference
  (:require [clojure.math.numeric-tower :as math]))

(defn sum-squares
  "returns the sum of the squares of every item in the input coll"
  [coll]
  (->> coll (map #(math/expt % 2)) (reduce +)))

(defn square-sum
  "returns the square of the sum of every item in the input coll"
  [coll]
  (->> coll (reduce +) (#(math/expt % 2))))

(defn difference
  "returns the difference between the sum of squares, and the square of sums"
  [coll]
  (- (square-sum coll) (sum-squares coll)))
