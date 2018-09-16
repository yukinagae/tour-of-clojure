(ns tour-of-clojure.function-values
  (:require [clojure.math.numeric-tower :as math]))

(defn compute [f] (f 3 4))

(defn -main
  [& args]
  (let [hypot (fn [x y] (Math/sqrt (+ (* x x) (* y y))))]
    (println (hypot 5 12))
    (println (compute hypot))
    (println (compute hypot))
    (println (compute math/expt))))
