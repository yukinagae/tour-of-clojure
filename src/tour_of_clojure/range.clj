(ns tour-of-clojure.range)

(def pow [1 2 4 8 16 32 64 128])

(defn -main
  [& args]
  (map #(printf "2**%d = %d\n" (first %) (second %)) (map-indexed vector pow)))
