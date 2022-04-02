package example

import zio.test._
import Assertion._

object ExampleZioSpec extends DefaultRunnableSpec {
  def spec: Spec[Any, TestFailure[Nothing], TestSuccess] =
    suite("ABC payment provider tests") {
      test("Your test")(
        assert("Your value")(Assertion.isNonEmptyString)
      )
    }
}
