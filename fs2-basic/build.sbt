name := sys.env.get("NAME").getOrElse("NO_NAME")
version := sys.env.get("VERSION").getOrElse("0.0.0-SNAPSHOT")
bintrayVcsUrl := sys.env.get("VCS_URL")
bintrayOrganization := sys.env.get("ORGANIZATION")
bintrayPackage := sys.env.get("NAME").getOrElse("NO_NAME")



scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "io.grpc" % "grpc-netty" % "1.11.0",
  "io.grpc" % "grpc-services" % "1.11.0",
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"
)
bintrayOmitLicense := true
enablePlugins(Fs2Grpc)
