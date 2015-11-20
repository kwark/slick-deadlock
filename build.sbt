name := "slick-deadlock"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.1.0",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.1.0",
//  "com.zaxxer" % "HikariCP" % "2.4.2",
  "org.slf4j" % "slf4j-simple" % "1.7.10",
  "com.h2database" % "h2" % "1.4.187"
)