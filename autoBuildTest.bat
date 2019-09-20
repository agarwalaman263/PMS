start "New Window" cmd /c javaRunner.bat
call mvn compile
call mvn test-compile
call mvn install
start ./javalogic/pms/target/site/jacoco/index.html
call mvn spring-boot:run
start "New Window" cmd /c npmInstaller.bat
cd "JavaScript Business Logic"
PING localhost -n 15 > NUL
node index.js

java -jar files\simian\bin\simian-2.5.10.jar **\*.java
