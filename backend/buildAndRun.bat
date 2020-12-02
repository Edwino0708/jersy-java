@echo off
call mvn clean package
call docker build -t com.api/backend .
call docker rm -f backend
call docker run -d -p 9080:9080 -p 9443:9443 --name backend com.api/backend