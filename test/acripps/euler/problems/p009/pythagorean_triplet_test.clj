(ns acripps.euler.problems.p009.pythagorean-triplet-test
  (:use [midje.sweet])
  (:require [acripps.euler.problems.p009.pythagorean-triplet :as euler.problems.pythagorean-triplet]))

(facts "about pythagorean triplets"
       (fact  "3^2 + 4^2 = 5^2 => 3 + 4 + 5 = 12"
              (first (euler.problems.pythagorean-triplet/generate-pythagorean-triplets 12)) => '(3 4 5)))
