#!/bin/sh
echo "Found protobufs:"
echo $(ls /protobuf)
cp -r /protobuf/*.proto src/main/protobuf
echo "Compiling protobufs:"
echo $(ls src/main/protobuf)
sbt publish