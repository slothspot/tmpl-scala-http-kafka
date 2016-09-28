name := "[STUB]"

version := "SNAPSHOT"

organization := "name.dmitrym"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.10",
  "com.typesafe.akka" %% "akka-http-jackson-experimental" % "2.4.10",
  "com.softwaremill.akka-http-session" %% "core" % "0.2.7",
  "com.softwaremill.akka-http-session" %% "jwt" % "0.2.7",
  "com.typesafe.akka" %% "akka-stream-kafka" % "0.12",
  "org.specs2" %% "specs2-core" % "3.8.5" % "test",
  "org.specs2" %% "specs2-scalacheck" % "3.8.5" % "test"
)

scalacOptions ++= Seq(
  "-deprecation", "-feature", "-unchecked", "-Xlint:_", "-Ydead-code", "-Yopt:_", "-Ywarn-dead-code",
  "-Ywarn-numeric-widen", "-Ywarn-unused", "-Ywarn-unused-import", "-Ywarn-value-discard"
  )

scalacOptions in Test ++= Seq(
  "-Yrangepos"
  )

javacOptions ++= Seq(
  "-deprecation", "-Xlint"
  )

incOptions := incOptions.value.withNameHashing(true)
