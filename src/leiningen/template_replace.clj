(ns leiningen.template-replace)
(:require [selmer.parser :as selmer])

(defn template-replace
  "Replace templated files with given values."
  [project & args]
  (leiningen.core.main/info "Starting templating..")
  (doseq [{value-to-replace :value-to-replace
           template-text :template-text
           template-file :template-file
           output-file :output-file} (:template-replace project)]
    (selmer/set-resource-path! (:root project))
    (spit output-file (selmer/render-file template-file {(keyword template-text) value-to-replace})))
  (leiningen.core.main/info "Templating done..")
  )
