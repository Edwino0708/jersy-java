#!/bin/sh
mvn clean package && docker build -t com.api/backend .
docker rm -f backend || true && docker run -d -p 9080:9080 -p 9443:9443 --name backend com.api/backend