(ns tour-of-clojure.slices)

(def primes (atom [2 3 5 7 11 13]))

(defn -main
  [& args]
  (println (subvec @primes 1 4)))
