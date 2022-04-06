
class SquareRootSuite extends munit.FunSuite:

  test("random test") {
    assertEquals(1 + 1, 2)
  }

  import scala.concurrent.duration.*
  override val munitTimeout: FiniteDuration = 1.seconds
