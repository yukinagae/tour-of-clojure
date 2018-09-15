(ns tour-of-clojure.variables-with-initializers)

(def c false)
(def python false)
(def java false)

(def i 1)
(def j 2)

(defn -main
  [& args]
  (let [[c python java] [true false "no!"]]
    (println (clojure.string/join " " [i j c python java])))
