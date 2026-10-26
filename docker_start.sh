# wsl -d Ubuntu
cd /mnt/c/PSP/Projects/REST_Docker/SpringBootRestService/
cp target/*.jar .
# docker build -t spring-boot-rest-service .
# docker run --name spring-boot-rest-service -d spring-boot-rest-service
docker-compose -p springboot-rest-service up
