(ns tour-of-clojure.maps)

(defrecord Vertex [lat lng])

(def m (atom {}))

(defn -main
  [& args]
  (swap! m assoc "Bell Labs" (Vertex. 40.68433 -74.39967))
  (println (get @m "Bell Labs")))
