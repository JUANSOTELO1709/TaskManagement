@echo off

REM Iniciar la aplicación Spring Boot
start /b java -jar target\taskmanagement-0.0.1-SNAPSHOT.jar

REM Esperar unos segundos para que la aplicación se inicie
timeout /t 10

REM Abrir el navegador en http://localhost:8080
start "" http://localhost:8080
