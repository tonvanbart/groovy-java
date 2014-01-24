(ns org.vanbart.Afternoon
  (:gen-class
;    :methods [#^{:static true} [afternoon [String] String] #^{:static true} [afternoon [] String]]))
    :methods [[afternoon [String] String] [afternoon [] String]]))

(defn -afternoon
  "implements both signatures by making the argument optional, note that this implies a seq for the argument."
  [this & names]
  (if names
    (str "Good Afternoon, " (first names))
    "Good Afternoon, World!"))

