# Kubernetes_proyectofinalTPA
Proyecto final de Taller de Programación Avanzada donde estudiaremos Kubernetes, en este repositorio se irán subiendo cambios en los archivos que necesitemos para Docker, y también subiendo información respecto de códigos, y páginas web que nos sean de ayuda

## Comandos docker utilizados

**Descargas de imagenes**

docker pull mysql/mysql-server:latest
docker pull phpmyadmin/phpmyadmin:latest

**Crear una nueva red llamada net-for-tpa**

docker network create --driver bridge “net-for-tpa”

**Consultar lista de redes**

docker network ls

**Correr imagen MySQL**

docker run --name "mysql-container" --network net-for-tpa -e MYSQL_DATABASE=api-persona -e MYSQL_USER=apipersona -e MYSQL_PASSWORD=pwdapi  -e MYSQL_ROOT_PASSWORD=rootPwd -d -p 3350:3306 mysql/mysql-server:latest

**Correr imagen PhpMyAdmin**

docker run --name "my-admin-formysql" -d --network net-for-tpa --link mysql-container:db -p 8081:80 phpmyadmin/phpmyadmin:latest

**Configuración de nuestro archivo application.properties**

spring.datasource.url=jdbc:mysql://mysql-container/api-persona?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=apipersona
spring.datasource.password=pwdapi

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect

#Variable de entorno
server.port=9000


**Configuración de Dockerfile**

FROM openjdk:14
COPY ./target/persona-0.0.1-SNAPSHOT.jar /tmp/api-persona.jar
WORKDIR /tmp
CMD ["java","-jar","api-persona.jar"]

**Compilar un proyecto con Maven**

mvn clean package -DskipTests=true

**Crear imagen docker de nuestra aplicación (el punto final va incluido si no va a tirar error)**

docker build -t “image-api-persona” .

**Correr imagen de nuestra aplicación**

docker run --name "api-container" -d --network net-for-tpa --link mysql-container -p 9000:9000 image-api-persona

**Comprabar que todos los contenedores estén corriendo bajo la misma red**

docker network inspect [nombre de la red]
