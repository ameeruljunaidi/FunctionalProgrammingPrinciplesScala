ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.1"

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")
libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test

lazy val root = (project in file("."))
  .settings(
    name := "SquareRoot"
  )

testFrameworks += new TestFramework("munit.Framework")
