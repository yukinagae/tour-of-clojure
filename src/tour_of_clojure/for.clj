(ns tour-of-clojure.for)

(defn -main
  [& args]
  (let [sum (atom 0)]
    (doseq [x (range 10)]
      (swap! sum #(+ % x)))
    (println @sum)))
