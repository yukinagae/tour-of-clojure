(ns tour-of-clojure.functions)

(defn add [x y] (+ x y))

(defn -main
  [& args]
  (println (add 42 13)))
