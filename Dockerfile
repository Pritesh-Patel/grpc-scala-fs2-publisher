FROM hseeberger/scala-sbt
COPY fs2-basic .
COPY start.sh .
VOLUME /protobuf
RUN mkdir -p src/main/protobuf
RUN sbt compile
RUN ["chmod", "+x", "start.sh"]
CMD ./start.sh
