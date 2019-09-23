rem run java code
cd "JavaLogic/pms"
call mvn compile
call mvn test-compile
call mvn install
start ./javalogic/pms/target/site/jacoco/index.html
call mvn spring-boot:run
call mvn package
cd target
call lsnrctl start
call java -jar pms-0.0.1-SNAPSHOT.jar

