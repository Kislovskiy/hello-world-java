# hello-world-java

"Hello world" project with minimalistic configuration.

To run the application:
```shell
./gradlew clean build

# to see the content of the jar
jar tfv build/libs/hello-world-java.jar 

# to execute jar
java -jar build/libs/hello-world-java.jar --input "Input argument"
```

Fat `jar` produces really fat jar: from `1.8k` without dependencies to `634k` with one dependency.
```shell
ls -alh build/libs
```
