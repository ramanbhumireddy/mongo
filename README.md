spring boot-deploy in docker
================================
git clone https://github.com/spring-guides/gs-consuming-web-service.git
https://github.com/ramanbhumireddy/test.git
https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.3.9/apache-maven-3.3.9-bin.tar.gz
https://www.liquidweb.com/kb/install-java-8-on-centos-7/
https://www.virtono.com/community/tutorial-how-to/how-to-install-apache-maven-on-centos-7/
https://phoenixnap.com/kb/how-to-install-apache-maven-on-centos-7
https://anywhere.epam.com/en/blog/how-to-dockerize-spring-boot-application
ip addr

http://192.168.0.117:8080/

appdocker>docker build -t bhavyansh/stage:latest . 
terminal>docker push bhavyansh/stage:latest
terminal>docker run -d -p 8080:8080 bhavyansh/stage:latest
terminal>docker image list 
terminal>docmer rmi -f img_id
terminal>docker container ls    // docker ps
terminal>docker stop container-id
terminal>docker run -d --name xapp -h xapp  -p 8082:8080 (image-name) 
terminal>docker logs -f container-name              // to exit Ctrl+Z
terminal>docker exec -it continer-name /bin/bash    // to exit Ctrl+D
Here’s a command that will stop and remove all of the containers on your system, assuming the user running it is root or a member of the docker group.
terminal>docker ps -aq | xargs docker stop | xargs docker rm   // all container stop and remove
terminal>docker rm container_id   // single continer remove 
terminal/vmongo>docker run -d -p 2717:27017 -v ~/vmongo:/data/db --name mymongox mongo:latest
terminal>docker run -d -p 8081:8080 --link mymongox:mongo --name mongoapper mongoapp:v0.1      // spring boot mongdb connect# mongo
