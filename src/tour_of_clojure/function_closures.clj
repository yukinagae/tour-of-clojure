(ns tour-of-clojure.function-closures)

;; TODO: sum variable is the same in pos and neg
(def adder
  (let [sum (atom 0)]
    (fn [x] (swap! sum + x))))

(defn -main
  [& args]
  (let [[pos neg] [adder adder]]
    (for [i (range 10)]
        (println (str (pos i) " " (neg (* i -2)))))))
