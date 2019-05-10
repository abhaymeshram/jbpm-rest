# jbpm-rest
Start jBPM process with any Unique id using Spring Boot Rest Api with Swagger


Step 1) Any available port to be add, for example 8090
java -jar jbpm-rest-1.0.0.jar --server.port=8090

Chrome:
Host: Server ip
port: Added above

http://localhost:8090/swagger-ui.html

Paramter can be set using the values in the payload.
Below Sample data can be used

{
  "dbHost": "localhost",
  "dbName": "test",
  "dbPassword": "abhay2904",
  "dbPort": "3306",
  "dbUserName": "root",
  "jBPMDeploymentID": "SampleDoc_1.0.0",
  "jBPMIP": "localhost",
  "jBPMPassword": "krisv",
  "jBPMPort": "8080",
  "jBPMProcessDefinitionID": "com.myspace.WFDocument",
  "jBPMProcessKey": "shopId",
  "jBPMUserName": "krisv",
  "sqlStatement": "SELECT USER_ID FROM user"
}
