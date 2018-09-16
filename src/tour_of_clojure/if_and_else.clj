(ns tour-of-clojure.if-and-else)

(defn pow [x n lim]
  (let [v (Math/pow x n)]
    (if (< v lim)
      v
      (do
        (printf "%f >= %f\n" (float v) (float lim))
        lim))))

(defn -main
  [& args]
  (println (pow 3 2 10))
  (println (pow 3 3 20)))
