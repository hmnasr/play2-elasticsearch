import play.PlayJava



val appName = "play2-elasticsearch"
val appVersion = "1.4-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.0"



libraryDependencies ++= Seq(
  javaCore,
  // Add your project dependencies here
  "org.elasticsearch" % "elasticsearch" % "1.4.2",
  "org.apache.commons" % "commons-lang3" % "3.1"
)




