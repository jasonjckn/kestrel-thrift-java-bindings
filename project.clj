(defproject kestrel-thrift-java-bindings "1.0.0-SNAPSHOT"
  :java-source-path "src/java"
  :javac-options {:debug "true" :fork "true"}
  :aot :all
  :dependencies [[backtype/thriftjava "1.0.0"]])
