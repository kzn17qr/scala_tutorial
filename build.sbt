enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.11.7"

scalaJSStage in Global := FastOptStage

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.1"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.1" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

skip in packageJSDependencies := false

jsDependencies += RuntimeDOM

