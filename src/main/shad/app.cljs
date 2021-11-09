(ns shad.app
  (:require [rumext.alpha :as mf]))

(mf/defc App []
  [:h1.text-lg.text-center "hello"])

(defn ^:dev/after-load start []
  (mf/mount (mf/element App) (.getElementById js/document "app")))

(defn init []
  (js/console.log "hello")
  (start))
