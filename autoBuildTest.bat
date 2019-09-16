start "New Window" cmd /c javaRunner.bat
start "New Window" cmd /c npmInstaller.bat
cd "JavaScript Business Logic"
PING localhost -n 15 > NUL
node index.js