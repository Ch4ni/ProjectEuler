(ns acripps.euler.four.palindrome
  (:require [clojure.string :as s]
            [acripps.euler.core :as c]))

(defn palindrome?
  "takes a string as an argument and determines whether or not it is a palindrome"
  [x]
  ;; NOTE: replacing " " is a hack, because #"\\S+" doesn't appear to work correctly
  (let [forward (s/replace x #" " "")
        backward (s/reverse forward)]
    (= forward backward)))

(defn next-product
  [x y]
  (lazy-seq (concat (map #(* x %) (range y 0 -1)) (next-product (dec x) y))))

(defn largest-palindrome-under
  "take arg x and y, and attempt to find the largest palindrome that is a
  product of both numbers"
  [x y]
  (->> (take-while c/positive? (next-product x y))
       (filter palindrome?)
       (reduce max)))
