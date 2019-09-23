start "New Window" cmd /c javaRunner.bat
start "New Window" cmd /c npmInstaller.bat
cd "JavaScript Business Logic"
PING localhost -n 30 > NUL
node index.js

java -jar files\simian\bin\simian-2.5.10.jar **\*.java
