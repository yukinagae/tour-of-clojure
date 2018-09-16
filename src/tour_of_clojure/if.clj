(ns tour-of-clojure.if
  (:require [clojure.math.numeric-tower :as math]))

(defn sqrt [x]
  (if (< x 0)
    (str (sqrt (- x)) "i")
    (str (math/sqrt x))))

(defn -main
  [& args]
  (println (sqrt 2))
  (println (sqrt -4)))
