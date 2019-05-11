#!/bin/sh

for classFile in $(find ./ -name "*.class")
do
    rm -f ${classFile}
done