;; Multiples of 3 and 5

;; Find the sum of all the multiples of 3 or 5 below 1000.

(def multiples-of-3-and-5
  (reduce +
          (filter
            (fn [n] (or (= 0 (mod n 3)) (= 0 (mod n 5))))
            (range 1 1000))))

(println multiples-of-3-and-5)
