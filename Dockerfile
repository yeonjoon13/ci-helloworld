FROM eclipse-temurin:17-jdk-jammy AS build

ARG JAR_FILE=workspace/build/libs/ci-helloworld-1.0-SNAPSHOT.jar
RUN mkdir -p /workspace
COPY build.gradle /workspace
COPY gradlew /workspace
COPY settings.gradle /workspace
COPY gradle /workspace/gradle
COPY src /workspace/src
WORKDIR /workspace
RUN chmod a+x gradlew
RUN ./gradlew build

# Runtime image
FROM eclipse-temurin:17-jre-jammy
COPY --from=build ${JAR_FILE} app.jar
EXPOSE 6379
ENTRYPOINT ["java","-jar","app.jar"]
