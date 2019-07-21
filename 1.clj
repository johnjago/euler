(def multiples-of-3-and-5
  (println
    (reduce +
      (filter (fn [n] (or (= 0 (mod n 3)) (= 0 (mod n 5))))
              (range 1 1000)))))

multiples-of-3-and-5
