name := "Goethe"

version := "0.1.0"

scalaVersion := "2.11.11"


lazy val root = Project("goethe", file("."))
  .aggregate(types, core)

lazy val types = project

lazy val core = project
  .dependsOn(types)

