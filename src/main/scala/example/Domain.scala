package example

import zio.json._

object Domain {
  case class Banana(curvature: Double)
  object Banana {
    implicit val decoder: JsonDecoder[Banana] = DeriveJsonDecoder.gen[Banana]
    implicit val encoder: JsonEncoder[Banana] = DeriveJsonEncoder.gen[Banana]
  }
}
