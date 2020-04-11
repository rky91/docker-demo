FROM openjdk

VOLUME /tmp
ADD maven/@docker.jar.name@.jar @docker.jar.name@.jar
RUN sh -c 'touch /@docker.jar.name@.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/@docker.jar.name@.jar"]