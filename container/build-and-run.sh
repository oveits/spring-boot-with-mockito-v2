mvn install
JAR_FILE=${JAR_FILE:="$(ls -ltr ../target/*.jar | tail -1 | awk -F '../target/' '{print $2}')"}
IMAGE=${IMAGE:=vocon/spring-boot-with-mockito-v2:latest}
HOST_PORT=${HOST_PORT:=8080}
sudo docker login \
  && sudo docker build --build-arg JAR_FILE=${JAR_FILE -t ${IMAGE} . \
  && sudo docker push ${IMAGE} \
  && sudo docker run -it --rm -p ${HOST_PORT}:8080 ${IMAGE}