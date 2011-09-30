rm -Rf gen-javabean src/gen-javabean
thrift -r --gen java:beans,hashcode,nocamel src/thrift/kestrel.thrift
mv gen-javabean src/
