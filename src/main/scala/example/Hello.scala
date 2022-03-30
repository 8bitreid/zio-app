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
      banana <- ZIO.attempt(s"""{"curvature":3.0}""".fromJson[Banana])
      _ <- putStrLn(banana)
    } yield ()
}
