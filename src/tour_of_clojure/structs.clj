(ns tour-of-clojure.structs)

(defrecord Vertex [x y])

(defn -main
  [& args]
  (println (Vertex. 1 2)))
