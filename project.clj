(defproject wishlistd "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.2.1"]
                           [noir "1.1.0"]
                           [postgresql/postgresql "8.4-702.jdbc4"]
                 		   [org.clojure/java.jdbc "0.1.1"]]
            :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}
            :main wishlistd.server)
