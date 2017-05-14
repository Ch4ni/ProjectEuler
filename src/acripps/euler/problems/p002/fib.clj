(ns acripps.euler.problems.p002.fib)

(defn fibonacci
  ([]
   (fibonacci 1 1))
  ([a b]
   (lazy-seq (cons a (fibonacci b (+ a b))))))

(defn sum
  [filter_predicate termination_predicate]
  (->> (fibonacci) (take-while (complement termination_predicate)) (filter filter_predicate) (reduce +)))
