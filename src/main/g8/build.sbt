val sharedSettings = Seq(
  version := "0.1.0-SNAPSHOT",
  organization := "$candidate_user;format="lower,dotReverse"$.sparkbeyond.exercise",
  scalaVersion := "2.13.8")

lazy val logic = (project in file("logic"))
  .settings(
    sharedSettings,
    name := "logic",
    libraryDependencies ++= Seq(
      "org.bouncycastle" % "bcpkix-jdk15on" % "1.70",
      "org.lz4"          % "lz4-java"       % "1.8.0",
      "org.scalacheck"  %% "scalacheck"     % "1.15.4" % Test,
      "org.scalatest"   %% "scalatest"      % "3.2.11"  % Test
    )
  )

lazy val server = (project in file("server"))
  .dependsOn(logic)
  .settings(
    sharedSettings,
    name := "server",
    libraryDependencies += "com.lihaoyi" %% "cask" % "0.8.0"
  )

lazy val root = (project in file("."))
  .aggregate(logic, server)
  .settings(
    name := "junior-backend-exercise"
  )
