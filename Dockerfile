FROM hseeberger/scala-sbt
COPY fs2-basic .
COPY start.sh .
VOLUME /protobuf
RUN sbt compile
CMD ./start.sh