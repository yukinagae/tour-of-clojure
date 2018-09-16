(ns tour-of-clojure.switch-evaluation-order)

(require '[clj-time.core :as t])
(require '[clj-time.predicates :as pr])
(require '[clj-time.local :as l])

(defn -main
  [& args]
  (println "When's Saturday?")
  (let [today (l/local-now)]
    (cond
      (pr/saturday? (t/plus today (t/days 0))) (println "Today.")
      (pr/saturday? (t/plus today (t/days 1))) (println "Tomorrow.")
      (pr/saturday? (t/plus today (t/days 2))) (println "In two days.")
      :else (println "Too far away."))))
