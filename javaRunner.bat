rem run java code
cd "java logic/pms"
call mvn package
cd target
call java -jar pms-0.0.1-SNAPSHOT.jar

