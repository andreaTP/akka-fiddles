import sbtcrossproject.CrossPlugin.autoImport.{crossProject, CrossType}

lazy val root =
  crossProject(JSPlatform)
    .crossType(CrossType.Pure)
    .settings(
      name := "akka-fiddles",
      scalaVersion := "2.12.10"
    )
    .jsSettings(
      resolvers += Resolver.sonatypeRepo("snapshots"),
      libraryDependencies ++= Seq(
        "org.akka-js" %%% "akkajsactor" % "1.2.6.1-RC1-SNAPSHOT",
        "org.akka-js" %%% "akkajsactorstream" % "1.2.6.1-RC1-SNAPSHOT",
        "org.akka-js" %%% "akkajsactortyped" % "1.2.6.1-RC1-SNAPSHOT"
      ),
      scalaJSUseMainModuleInitializer := true
    )
