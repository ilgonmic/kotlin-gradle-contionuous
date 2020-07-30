# kotlin-gradle-contionuous

Run `./gradlew build -t`

In clean build it runs gradle build twice. Second is right after the first was ended.
Result:

```
$ ./gradlew build -t

BUILD SUCCESSFUL in 584ms
6 actionable tasks: 4 executed, 2 up-to-date

Waiting for changes to input files of tasks... (ctrl-d to exit)
new file: .../lib/build/libs/lib-1.0-SNAPSHOT.jar
new file: .../lib/build/tmp/jar/MANIFEST.MF
new file: .../app/build/tmp/jar/MANIFEST.MF
Change detected, executing build...


BUILD SUCCESSFUL in 127ms
6 actionable tasks: 6 up-to-date

Waiting for changes to input files of tasks... (ctrl-d to exit)
<=============> 100% EXECUTING [21s]
> IDLE
```
