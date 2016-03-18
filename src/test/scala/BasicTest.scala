import org.scalatest._

class BasicTest extends FlatSpec with Matchers {
  "BasicTest" should "have tests" in {
    true should === (true)
  }
}
