#SpringBoot demo

##How to run 
**dev run**  
use idea run "DemoApplication.java"

**prod run**  
java -jar demo-service/target/demo-service-0.0.1-SNAPSHOT.jar


###modules  
**demo-parent**  
common parent module of other modules, manage all dependencies of the springboot project  
**demo-api**  
all api interfaces define here  
**demo-service**  
all released rest-api, implement api interfaces of **demo-api** module. Project bootstrap entry  
**demo-core**  
core business logic here