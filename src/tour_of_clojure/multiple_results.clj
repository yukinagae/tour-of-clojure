(ns tour-of-clojure.multiple-results)

(defn swap [x y] [y x])

(defn -main
  [& args]
  (println (clojure.string/join " " (swap "hello" "world"))))
