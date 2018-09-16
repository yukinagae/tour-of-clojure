(ns tour-of-clojure.if-with-a-short-statement
  (:require [clojure.math.numeric-tower :as math]))

(defn pow [x n lim]
  (let [v (Math/pow x n)]
    (if (< v lim)
      v
      lim)))

(defn -main
  [& args]
  (println (pow 3 2 10))
  (println (pow 3 3 20)))
