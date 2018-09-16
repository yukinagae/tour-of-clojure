(ns tour-of-clojure.for-continued)

(defn -main
  [& args]
  (let [sum (atom 1)]
    (loop [i 1]
      (when (> 1000 @sum)
        (swap! sum #(+ % @sum))
        (recur (inc i))))
    (println @sum)))
