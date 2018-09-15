(ns tour-of-clojure.variables)

(def c false)
(def python false)
(def java false)

(defn -main
  [& args]
  (let [i 0]
    (println (clojure.string/join " " [i c python java])))
