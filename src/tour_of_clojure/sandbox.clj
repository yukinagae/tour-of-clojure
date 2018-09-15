(ns tour-of-clojure.sandbox)

(require '[clj-time.core :as t])

(defn -main
  [& args]
  (do
    (println "Welcome to the playground!")
    (println (str "The time is " (t/now))))
