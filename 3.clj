;; Largest prime factor

;; The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143?

(defn factors [n]
  (filter
    (fn [x] (= (rem n x) 0))
    (range 1 (+ n 1))))

(println (factors 100))
