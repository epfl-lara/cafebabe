name := "Cafebabe"

version := "1.2"

scalaVersion := "2.13.6"

crossScalaVersions := Seq("2.11.12", "2.12.10", "3.0.2")

scalacOptions ++= Seq(
    "-deprecation",
    "-unchecked"
)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"