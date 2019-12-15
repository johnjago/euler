;; the sequence (1 1 2 3 5 8 13 ...)
(defn fib
  ([]
    (fib 1 1))
  ([a b]
    (lazy-seq (cons a (fib b (+ a b))))))

;; filters out the even numbers from a collection
(defn evens [coll]
  (filter even? coll))

;; the problem states to only consider the terms that do not exceed four million
(def less-than-four-mil
  (fn [x] (< x 4000000)))

(println (reduce + (evens (take-while less-than-four-mil (fib)))))
