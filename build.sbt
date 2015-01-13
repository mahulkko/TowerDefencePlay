import play.Project._

name := "TowerDefence-play"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.2", 
  "org.webjars" % "bootstrap" % "2.3.1",
  "org.pac4j" % "play-pac4j_java" % "1.2.3-SNAPSHOT",
  "org.pac4j" % "pac4j-oauth" % "1.7.0-SNAPSHOT"
)

resolvers ++= Seq(
  "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

playJavaSettings

