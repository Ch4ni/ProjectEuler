(ns acripps.euler.core)

(defn divides?
  "does x divide y with 0 remainder?"
  [x y]
  (= 0 (mod y x)))
