(ns tour-of-clojure.numeric-constants)

(def ^:const big (bit-shift-left 1 100))
(def ^:const small (bit-shift-right big 99))

(defn need_int [x] (-> x (* 10) (+ 1)))
(defn need_float [x] (-> x (* 0.1)))

(defn -main
  [& args]
  (println (need_int small))
  (println (need_float small))
  (println (need_float big)))
