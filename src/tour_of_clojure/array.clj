(ns tour-of-clojure.array)

(def a (atom []))
(def primes (atom [2 3 5 7 11 13]))

(defn -main
  [& args]
  (swap! a assoc 0 "Hello")
  (swap! a assoc 1 "World")
  (println @a)
  (println @primes))
