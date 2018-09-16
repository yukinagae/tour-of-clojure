(ns tour-of-clojure.constants)

(def ^:const pi 3.14)
(def ^:const world "世界")
(def ^:const truth true)

(defn -main
  [& args]
  (println (str "Hello " world))
  (println (str "Happy " pi " Day"))
  (println (str "Go rules? " truth)))
