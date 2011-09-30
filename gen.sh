rm -Rf gen-javabean src/java/net/lag/kestrel/thrift &&
mkdir -p src/java/net/lag/kestrel &&
thrift -r --gen java:beans,hashcode,nocamel src/thrift/kestrel.thrift &&
mv gen-javabean/net/lag/kestrel/thrift src/java/net/lag/kestrel &&
rm -Rf gen-javabean
