name := "flink-test"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.flink" %% "flink-scala" % "1.6.0"

libraryDependencies += "org.apache.flink" %% "flink-streaming-scala" % "1.6.0"




test in assembly := {}
assemblyJarName in assembly := "flink-test.jar"
assemblyOption in assembly := (assemblyOption in assembly).value.copy(cacheUnzip = false)