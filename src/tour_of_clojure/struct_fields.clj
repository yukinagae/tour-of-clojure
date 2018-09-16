(ns tour-of-clojure.struct-fields)

(defrecord Vertex [x y])

(def v (Vertex. 1 2))

(defn -main
  [& args]
  (println (assoc v :x 4)))
