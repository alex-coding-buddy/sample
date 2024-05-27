Pre-requirements:
 1. set GOOGLE_APPLICATION_CREDENTIALS in your env

----------
Local run:
 1. mvn -DskipTests spring-boot:run
 2. http://localhost:8080/swagger-ui/index.html

-----------
Appengine deploy:
 1. Replace SET_VERSION and SET_PROJECT_ID with real values
 2. mvn -DskipTests clean package appengine:deploy -Dapp.deploy.version=<SET_VERSION> -Dapp.deploy.projectId=<SET_PROJECT_ID>
