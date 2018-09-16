(ns tour-of-clojure.map-literals)

(defrecord Vertex [lat lng])

(def m (atom {}))

(defn -main
  [& args]
  (swap! m assoc "Bell Labs" (Vertex. 40.68433 -74.39967))
  (swap! m assoc "Google" (Vertex. 37.42202 -122.08408))
  (println @m))
