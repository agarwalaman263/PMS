rem run java code
cd "javalogic/pms"
call mvn package
cd target
call java -jar pms-0.0.1-SNAPSHOT.jar

