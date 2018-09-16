(ns tour-of-clojure.switch)

(defn -main
  [& args]
  (print "Clojure runs on ")
  (let [os (System/getProperty "os.name")]
    (cond
      (= os "Mac OS X") (println "OS X.")
      (= os "Linux") (println "Linux.")
      :else (println (str os ".")))))
