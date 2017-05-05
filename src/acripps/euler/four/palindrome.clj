(ns acripps.euler.four.palindrome
  (:require [clojure.string :as s]))

(defn palindrome?
  "takes a string as an argument and determines whether or not it is a palindrome"
  [x]
  ;; NOTE: replacing " " is a hack, because #"\\S+" doesn't appear to work correctly
  (let [forward (s/replace x #" " "")
        backward (s/reverse forward)]
    (= forward backward)))

(defn get-multiples
  "given x and y, return a lazy sequence of products in descending order
   i.e.: 3 3 => [(*3 3) (* 3 2) (* 2 2) (* 1 3) (* 1 2) (* 1 1))] => [9 6 4 3 2 1]"
  [x y]
  )

(defn largest-palindrome-under
  "take arg x and y, and attempt to find the largest palindrome that is a
  product of both numbers"
  [x y]
  9009)
