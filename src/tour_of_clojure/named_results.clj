(ns tour-of-clojure.named-results)


(defn split [sum]
  (let [x (-> sum (* 4) (/ 9))]
    (let [y (-> sum (- x))]
    [x y])))

(defn -main
  [& args]
  (println (split 17))
