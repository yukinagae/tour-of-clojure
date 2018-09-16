(ns tour-of-clojure.type-interface)

(defn -main
  [& args]
  (let [v 42]
    (println (str "v is of type " (type v)))))
