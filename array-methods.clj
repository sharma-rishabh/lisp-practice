(defn sqrt [x] (Math/sqrt x))

(def numbers (range))

(defn intermidiate-term-generator [[a b]] [(+ a b) (+ a b b)])

(defn fib
  [n]
  (take n
        (flatten (iterate intermidiate-term-generator [0 1]))))


(defn fact
  [n]
  (last (map first 
       (take n 
             (iterate (fn [[a b]] [(* a b) (+ b 1)]) [1 2])))))



(fact 5)
(take 5 (iterate inc 5))
;; => (5 6 7 8 9)


(fib 10)
(take 5 numbers)
(take 5 numbers)


((comp sqrt inc) 25)
