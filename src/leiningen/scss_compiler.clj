(ns leiningen.scss-compiler
  (:require [clojure.java.io :as io]
            [scss-compiler.core :as scss]))

(defn scss-compiler [project & args]
  (scss/initialize :gempath "resources/gems")
  (let [path-prefix "resources/private/common-html"
        css-path    (str path-prefix "/css/main.css")
        scss-path   (str path-prefix "/sass/main.scss")]
    (io/make-parents css-path)
    (with-open [out (io/writer css-path)]
      (println "Compiling CSS and writing to" css-path)
      (.write out (scss/scss->css scss-path)))))
