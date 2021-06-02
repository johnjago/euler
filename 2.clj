;; Even Fibonacci numbers

;; By considering the terms in the Fibonacci sequence whose values do not exceed
;; four million, find the sum of the even-valued terms.

(defn fib
  "Produces the sequence (1 1 2 3 5 8 13 ...)"
  ([] (fib 1 1))
  ([a b] (lazy-seq (cons a (fib b (+ a b))))))

(defn evens
  "Filters out the even numbers from a collection."
  [coll] (filter even? coll))

(defn less-than-four-million
  "Checks if the given number is less than 4 million."
  [x] (< x 4000000))

(println (reduce + (evens (take-while less-than-four-million (fib)))))
