(ns tour-of-clojure.type-conversions
  (:require [clojure.math.numeric-tower :as math]))

(defn -main
  [& args]
  (let [[x y] [3 4]]
    (let [f (math/sqrt (+ (* x x) (* y y)))]
      (println (clojure.string/join " " [x y f]))))
