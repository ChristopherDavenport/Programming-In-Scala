package ProgrammingInScala.Chapter14

import ProgrammingInScala.Chapter14.Element.elem
import org.scalatest._


/**
  * Created by davenpcm on 3/21/2016.
  */
class ElementSuite extends FunSuite{

  test("A uniform element given width 2 should have width 2"){
    val ele = elem('x', 2,3)
    assert(ele.width === 2)
  }
}

class ElementSpec extends FlatSpec with Matchers {
  "A Uniform element" should "have a width equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.width should be (2)
  }

  it should "have a height equal to the passed value" in {
    val ele = elem('x', 2,3)
    ele.height should be (3)
  }
}

