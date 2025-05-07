name := "scalafx.animation"
organization := "objektwerks"
version := "2.0.0"
scalaVersion := "3.6.4" // Scala 3.7.0-RC4 still breaks ScalaFx!
libraryDependencies ++= {
  Seq(
    "org.scalafx" %% "scalafx" % "24.0.0-R35"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
  // "-rewrite",
  // "-source:3.7-migration"
  // For 3.7.0-RC4 warnings: "-Wconf:msg=Implicit parameters should be provided with a `using` clause:s"
)
outputStrategy := Some(StdoutOutput)
parallelExecution := false
fork := true