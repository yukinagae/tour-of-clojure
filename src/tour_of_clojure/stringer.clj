(ns tour-of-clojure.stringer)

(defrecord Person [name age]
  Object
  (toString [person] (format "%s (%d years)" (:name person) (:age person))))

(defn -main
  [& args]
  (println (str (Person. "Arthur Dent" 42)))
  (println (str (Person. "Zaphod Beeblebrox" 9001))))
