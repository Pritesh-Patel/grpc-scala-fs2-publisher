# gRPC Scala FS2 Publisher

Docker image takes `.proto` files, compiles them used fs2-grpc and then publishes them to bintray.

Mount a directory with `.proto` files to `/protobuf`.

Set enviroment variables:
`NAME`: Library name.
`VERSION`: Library version.
`BINTRAY_USER`: Bintray username.
`BINTRAY_PASS`: Bintray API key.
`VCS_URL`: VCS url for the library. ie http://github.com/YOUR_USER/YOUR_PROJECT
`ORGANIZATION` (Optional) Organization name.

Example use:

```
docker run -v <PROTO_DIRECTORY>:/protobuf \ 
-e NAME=<LIBRARY_NAME> \
-e VERSION=<VERSION> \
-e BINTRAY_USER=<BINTRAY_USER> \
-e BINTRAY_PASS=<BINTRAY_API_KEY> \
-e VCS_URL=<VCS_URL> \
grpc-scala-fs2-publisher 
```