(ns tour-of-clojure.zero)

(defn -main
  [& args]
  (let [[i f b s] [0 0.0 false ""]]
    (printf "%s %s %s \"%s\"\n" i f b s)))
