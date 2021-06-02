;; Largest prime factor

;; The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143?

(import java.math.BigInteger)

(defn factors [n]
  (filter
    (fn [x] (= (rem n x) 0))
    (range 1 (+ n 1))))

(def certainty 5)

(defn prime? [n]
  ;; I may be cheating a little here, but at least this is an example
  ;; of how practical Clojure can be with its Java interop.
  (.isProbablePrime (BigInteger/valueOf n) certainty))

;; It takes an absurdly long time to factor the large number. I'll have to
;; revisit this one.

(println (apply max (filter prime? (factors 600851475143))))
