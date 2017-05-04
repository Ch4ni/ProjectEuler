(ns acripps.euler.four.palindrome
  (:require [clojure.string :as s]))

(defn palindrome?
  "takes a string as an argument and determines whether or not it is a palindrome"
  [x]
  (let [forward (s/replace x #" " "")
        backward (s/reverse forward)]
    (= forward backward)))
