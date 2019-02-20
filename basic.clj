; even
(filter even? (range 1 5))

; odd
(filter odd? (range 1 5))

;sum of a list of numbers
(def add (partial + 0))
(apply add (range 1 5))

;printing list in reverse order
(apply println (reverse (range 1 5)))

;select every second number from a list
(take-nth 2 (range 1 9))

;fibonacci
(defn fibo
  ([] (fibo 0N 1N))
  ([s1 s2] (cons s1 (lazy-seq (fibo s2 (+ s1 s2))))))
