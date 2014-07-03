import sbt._
import Keys._
import sbtassembly.Plugin._

object BuildSettings {
  val buildOrganization = "dropwizardseed"
  val buildVersion      = "1.0.0"
  val buildScalaVersion = "2.11.1"

  val buildSettings = Seq (
    organization := buildOrganization,
    version      := buildVersion,
    scalaVersion := buildScalaVersion,
    crossPaths := false
  )
}

object Resolvers {
}

object Dependencies {

  val scalatest = "org.specs2" %% "specs2" % "2.3.12" % "test"

  val dropwizardscala = "com.massrelevance" %% "dropwizard-scala" % "0.7.1"

}

object DropwizardScalaSeedBuild extends Build {
  import Dependencies._
  import BuildSettings._

  val serviceDependancies = Seq (
    scalatest,
    dropwizardscala
  )

  lazy val dropwizardScalaSeedProject = Project (
    "dropwizard-scala-seed",
    file ("."),
    settings = buildSettings ++ assemblySettings ++ Seq (libraryDependencies ++= serviceDependancies)
  )
}