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

  "getDigits" should "get digits from a number" in {
    assert(List(1,0,0) === armstrongNumbers.getDigits(100))
    assert(List(0) === armstrongNumbers.getDigits(0))
    assert(List() === armstrongNumbers.getDigits(-1))
  }

  "getDigitsAlt" should "get digits from a number" in {
    assert(List(1,0,0) === armstrongNumbers.getDigitsAlt(100))
    assert(List(0) === armstrongNumbers.getDigitsAlt(0))
    assert(List() === armstrongNumbers.getDigitsAlt(-1))
  }

  "isArmstrongNumber" should "be true for numbers: 153, 370, 371, 407 and false for other 3 digit numbers" in {
    assert(true === armstrongNumbers.isArmstrongNumber(153))
    assert(true === armstrongNumbers.isArmstrongNumber(370))
    assert(true === armstrongNumbers.isArmstrongNumber(371))
    assert(true === armstrongNumbers.isArmstrongNumber(407))
    assert(false === armstrongNumbers.isArmstrongNumber(408))
    assert(false === armstrongNumbers.isArmstrongNumber(100))
    assert(false === armstrongNumbers.isArmstrongNumber(-100))
  }

}
