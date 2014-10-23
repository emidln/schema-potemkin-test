(ns schema-potemkin-test.core
  (:require [schema.core :as s])
  (:gen-class))

(defnk foo
  "foos a bar"
  [bar :- Object]
  bar)
