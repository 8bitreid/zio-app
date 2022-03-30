package example

import zio._
import zio.Console._
import example.Domain._
import zio.ZIO
import zio.json._

object Hello extends ZIOAppDefault {
  def run = myAppLogic

  val myAppLogic =
    for {
      _ <- putStrLn("What curve is this banana?")
      curve <- getStrLn
      curveDouble <- ZIO.effect(curve.toDouble)
      banana <- ZIO.effect(s"""{"curvature":${curveDouble}}""".fromJson[Banana])
      _ <- putStrLn(banana)
    } yield ()
}
