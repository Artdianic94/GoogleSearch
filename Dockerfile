FROM markhobson/maven-chrome
#Step: Copy our project
WORKDIR /googlesample
COPY src /googlesample/src
COPY pom.xml /googlesample
