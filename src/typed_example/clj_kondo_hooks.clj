(ns typed-example.clj-kondo-hooks
  (:require [clojure.core.typed :as ct]))

(ct/loop [a :- (inc "unexpected-failure"), 1]
  (recur (inc a)))
