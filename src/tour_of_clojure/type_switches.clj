(ns tour-of-clojure.type-switches)

(defn do-dynamic
  [i]
  (cond
    (instance? Long i) (printf "Twice %d is %d\n" i (* i 2))
    (instance? String i) (printf "%s is %d bytes long\n" i (count i))
    :else (printf "I don't know about type %s!\n" (type i))))

(defn -main
  [& args]
  (do-dynamic 21)
  (do-dynamic "hello")
  (do-dynamic true))
