FROM markhobson/maven-chrome
#Step: Copy our project
WORKDIR /googlesample
COPY src /googlesample/src
COPY pom.xml /googlesample
ADD testrunner.sh /
ENTRYPOINT ["/bin/bash", "/testrunner.sh"]