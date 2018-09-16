(ns tour-of-clojure.errors)

(require '[clj-time.local :as l])

(defn run []
  (throw (ex-info "The ice cream has melted!"
                  {:causes
                   {:when (l/local-now)
                    :what "it didn't work"}})))

(defn -main
  [& args]
  (try
    (run)
    (catch Exception e
      (let [d (ex-data e)]
        (println d)))))
