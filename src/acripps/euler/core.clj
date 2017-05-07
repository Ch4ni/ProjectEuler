(ns acripps.euler.core)

(defn divides?
  "does x divide y with 0 remainder?"
  [x y]
  (= 0 (mod y x)))

(defn positive?
  "is x greater than or equal to 0?"
  [x]
  (>= x 0))

(def negative? (complement positive?))
