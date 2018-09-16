(ns tour-of-clojure.methods)

(defrecord Vertex [x y])

(defn abs [v]
  (let [[x y] [(:x v) (:y v)]]
    (Math/sqrt (+ (* x x) (* y y)))))

(defn -main
  [& args]
  (let [v (Vertex. 3 4)]
    (println (abs v))))
