(ns acripps.euler.problems.p008.largest-product
  (:require [clojure.edn :as e]))

(declare adjacent-products get-adjacent-digits get-adjacent-digits-inner)

(defn max-adjacent-product
  [digit-sequence num-adjacent]
  (reduce max (adjacent-products digit-sequence num-adjacent))
  )


;; Implementation

(defn- adjacent-products
  [digit-sequence num-adjacent]
  (map (fn [x]
         (reduce (fn [y z] (* y z)) x))
       (get-adjacent-digits digit-sequence num-adjacent)))

(defn-  get-adjacent-digits
  [digit-sequence num-adjacent]
  (loop [digits digit-sequence
         loops-left num-adjacent
         result (set [])]
    (if (< 0 loops-left)
      (recur (rest digits)
             (dec loops-left)
             (get-adjacent-digits-inner digits num-adjacent))
      result))
  )

(defn- get-adjacent-digits-inner
  [digit-sequence num-adjacent]
  (partition num-adjacent digit-sequence))
