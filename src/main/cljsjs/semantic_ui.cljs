(ns main.cljsjs.semantic-ui
  (:require ["semantic-ui-react" :as semantic-ui-react]))

(js/goog.exportSymbol "se" semantic-ui-react)
