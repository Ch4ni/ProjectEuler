(ns acripps.euler.problems.p003.prime-factor-test
  (:use midje.sweet)
  (:require [acripps.euler.problems.p003.prime-factor :as p]))

(facts "about get-factors"
       (fact "4 has factors [2 2]"
             (p/get-factors 4) => [2 2])
       (fact "6 has factors [2 3]"
             (p/get-factors 6) => [2 3])
       (fact "12 has factors [2 2 3]"
             (p/get-factors 12) => [2 2 3])
       (fact "13195 has factors [5 7 13 29]"
             (p/get-factors 13195) => [5 7 13 29]))
