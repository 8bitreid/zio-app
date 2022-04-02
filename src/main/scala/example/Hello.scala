package example

import zio._
import zio.Console._
import example.Domain._
import zio.ZIO
import zio.json._
import zhttp.http._
import zhttp.service.Server
import zhttp.http.Method

object Hello extends ZIOAppDefault {
  def run = Server.start(8090, app)

  private val app = Http.collect[Request] {
   case req @ Method.POST -> !! / "echo" =>
   Response(data = HttpData.fromStream(req.bodyAsStream))
  }


  val myAppLogic =
    for {
      banana <- ZIO.attempt(s"""{"curvature":3.0}""".fromJson[Banana])
      _      <- printLine(banana)
    } yield ()
}
