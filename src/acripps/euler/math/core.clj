(ns acripps.euler.math.core
  (:require [clojure.math.numeric-tower :as math]))

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
  (-> x math/sqrt math/ceil inc))
