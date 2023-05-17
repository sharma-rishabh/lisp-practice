(defn gcd [first-number second-number] (reduce max (filter (fn [divisor] (and (zero? (mod first-number divisor)) (zero? (mod second-number divisor))))  (range (min first-number second-number) 1 -1))))


(defn gcd2 [first-number second-number]
  (let [rem (mod first-number second-number)]
    (if (zero? rem) second-number (gcd2 second-number rem))))


(defn divisible? [dividend divisor] (let [rem (mod dividend divisor)] (zero? rem)))


(defn gcd3 [first-number second-number]
  (loop [divisor first-number dividend second-number]
    (if (divisible? dividend divisor) divisor (let [rem (mod dividend divisor)] (recur rem divisor)))))

(defn lcm [first-number second-number]
  (let [gcd (gcd2 first-number second-number)]
    (/  (* first-number second-number) gcd)))

(defn simple-interest [principal rate time-period] (* principal rate time-period))

(defn pow [number exponent] (reduce * (repeat exponent number)))

(defn compound-interest [principal rate time-period]
  (-
   (* principal 1 (pow (+ 1 rate) time-period)) principal))

(defn fahrenheit->centigrade [fahrenheit-temperature] (* (- fahrenheit-temperature 32) (/ 5 9)))


(defn centigrade->fahrenheit [centigrade-temperature] (+ (* centigrade-temperature (/ 9 5)) 32.0))

(defn sum-till-n [n] (/ (+ n (* n n)) 2))

(defn greatest-of-three [a b c] (reduce (fn [x, y] (if (> x y) x y)) [a b c]))


(defn second-greatest-of-three [a b c] (if (and (> a b) (< a c)) a (if (and (> b a) (< b c)) b c)))

;; (defn fibbonacci [n] ())

(gcd 56 49)
(gcd2 49 56)
(gcd3 56 49)
(lcm 56 49)
(simple-interest 1000 0.1 2)
(compound-interest 1000 0.1 2)
(fahrenheit->centigrade 32)
(centigrade->fahrenheit 44)
(sum-till-n 99)
(greatest-of-three 10 11 10)
(second-greatest-of-three 10 9 10)