(ns acripps.euler.four.palindrome
  (:require [clojure.string :as s]))

(defn palindrome?
  "takes a string as an argument and determines whether or not it is a palindrome"
  [x]
  ;; NOTE: replacing " " is a hack, because #"\\S+" doesn't appear to work correctly
  (let [forward (s/replace x #" " "")
        backward (s/reverse forward)]
    (= forward backward)))
