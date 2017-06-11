(ns acripps.euler.problems.p008.largest-product)

(defn max-adjacent-product
  [digit-sequence num-adjacent]
  (apply max (map #(apply * %) (partition num-adjacent 1 digit-sequence))))
