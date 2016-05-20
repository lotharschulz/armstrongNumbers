package info.lotharschulz

import org.scalatest.FlatSpec
import org.scalatest.BeforeAndAfter

class AppSuite extends FlatSpec with BeforeAndAfter {

  var armstrongNumbers: ArmstrongNumbers = _

  before {
    armstrongNumbers = new ArmstrongNumbers
  }

  "method generateDummyArmstrongNumbers is called" should "produce a list like" in {
    assert(List(2, 4) === armstrongNumbers.generateDummyArmstrongNumbers(1, 2))
  }

  "getNumberOfDigits" should "produce the number of digits for the given parameter" in {
    assert(3 === armstrongNumbers.getNumberOfDigits(100))
    assert(1 === armstrongNumbers.getNumberOfDigits(0))
  }

}
