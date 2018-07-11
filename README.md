# gRPC Scala FS2 Publisher

Docker image takes `.proto` files, compiles them used fs2-grpc and then publishes them.

Mount a directory with `.proto` files for library generation and another directory which contains a `publish.sbt`.

Example use:

```
docker run -v <PROTO_DIRECTORY>:/protobuf <PUBLISHING_DIRECTORY>:/publishing grpc-scala-fs2-publisher
```