(ns tour-of-clojure.reader)

(defn string->stream
  ([s] (string->stream s "UTF-8"))
  ([s encoding]
   (-> s
       (.getBytes encoding)
       (java.io.ByteArrayInputStream.))))

;; TODO: until EOF
(defn -main
  [& args]
  (let [r (string->stream "Hello, Reader!")]
    (println (.read r))))
