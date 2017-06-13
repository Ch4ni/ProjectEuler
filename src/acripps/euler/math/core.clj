(ns acripps.euler.math.core
  (:require [clojure.math.numeric-tower :as math.numeric-tower]))

(defn divides?
  "does x divide y with 0 remainder?"
  [x y]
  (= 0 (mod y x)))

(defn positive?
  "is x greater than or equal to 0?"
  [x]
  (>= x 0))

(def negative? (complement positive?))

(defn lowest-factor-max
  [x]
  (-> x math.numeric-tower/sqrt math.numeric-tower/ceil inc))

(defn square
  [x]
  (* x x))
