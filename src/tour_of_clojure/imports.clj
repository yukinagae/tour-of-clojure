(ns tour-of-clojure.imports
  (:require [clojure.math.numeric-tower :as math]))

(defn -main
  [& args]
  (printf "Now you have %g problems." (math/sqrt 7)))
