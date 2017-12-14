name := "goethe-core"

/* To massage `cats` a little bit */
scalacOptions := Seq(
  "-Ypartial-unification"
)

libraryDependencies ++= Seq(
  "org.typelevel"               %% "cats-macros"                 % "1.0.0-RC1",
  "org.typelevel"               %% "cats-kernel"                 % "1.0.0-RC1",
  "org.typelevel"               %% "cats-core"                   % "1.0.0-RC1"
)

assemblyMergeStrategy in assembly := {
  case "reference.conf" => MergeStrategy.concat
  case "application.conf" => MergeStrategy.concat
  case "META-INF/MANIFEST.MF" => MergeStrategy.discard
  case "META-INF\\MANIFEST.MF" => MergeStrategy.discard
  case "META-INF/ECLIPSEF.RSA" => MergeStrategy.discard
  case "META-INF/ECLIPSEF.SF" => MergeStrategy.discard
  case _ => MergeStrategy.first
}

