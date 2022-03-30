import sbt._

object Dependencies {
  val zioVersion = "2.0.0-RC3"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.11"
  lazy val zio = "dev.zio" %% "zio" % zioVersion
  lazy val zioStreams = "dev.zio" %% "zio-streams" % zioVersion
  lazy val zioJson = "dev.zio" %% "zio-json" % "0.3.0-RC5"
  lazy val zioTest = "dev.zio" %% "zio-test" % zioVersion
}
