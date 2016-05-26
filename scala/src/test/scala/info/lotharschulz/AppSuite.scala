package info.lotharschulz

import org.scalacheck.Gen
import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.scalatest.{Matchers, FlatSpec}


class AppSuite extends FlatSpec with Matchers  with GeneratorDrivenPropertyChecks {

  val armstrongNumbers: ArmstrongNumbers = new ArmstrongNumbers

  "generateArmstrongNumbers" should "produce the number of armstrong numbers for the given parameter" in {
    assert(List(153, 370, 371, 407) === armstrongNumbers.generateArmstrongNumbers(100, 1000))
  }

  "generateArmstrongNumbers" should "produce an IllegalArgumentException" in {
    a[IllegalArgumentException] should be thrownBy {
      armstrongNumbers.generateArmstrongNumbers(-1, 100)
      armstrongNumbers.generateArmstrongNumbers(10, 9)
    }
  }

  "getNumberOfDigits" should "produce the number of digits for the given parameter" in {
    assert(3 === armstrongNumbers.getNumberOfDigits(100))
    assert(1 === armstrongNumbers.getNumberOfDigits(0))
  }

  "getNumberOfDigits" should "produce an IllegalArgumentException" in {
    a[IllegalArgumentException] should be thrownBy {
      armstrongNumbers.getNumberOfDigits(-1)
    }
  }

  "getDigits" should "get digits from a number" in {
    assert(List(1,0,0) === armstrongNumbers.getDigits(100))
    assert(List(0) === armstrongNumbers.getDigits(0))
  }

  "getDigits" should "produce an IllegalArgumentException" in {
    a[IllegalArgumentException] should be thrownBy {
      armstrongNumbers.getDigits(-1)
    }
  }

  "getDigitsAlt" should "get digits from a number" in {
    assert(List(1,0,0) === armstrongNumbers.getDigitsAlt(100))
    assert(List(0) === armstrongNumbers.getDigitsAlt(0))
  }

  "getDigitsAlt" should "produce an IllegalArgumentException" in {
    a[IllegalArgumentException] should be thrownBy {
      armstrongNumbers.getDigitsAlt(-1)
    }
  }

  "isArmstrongNumber" should "be true for numbers: 153, 370, 371, 407" in {
    assert(true === armstrongNumbers.isArmstrongNumber(153))
    assert(true === armstrongNumbers.isArmstrongNumber(370))
    assert(true === armstrongNumbers.isArmstrongNumber(371))
    assert(true === armstrongNumbers.isArmstrongNumber(407))
    assert(true === armstrongNumbers.isArmstrongNumber(0))
  }

  val nums = Gen.choose(100,1000)

  "isArmstrongNumber" should "be false for all 3 digit numbers except: 153, 370, 371, 407" in {
    forAll( (nums, "n") ) { n =>
      whenever (n != 153 && n != 370 && n != 371 && n != 407) {
        assert(false === armstrongNumbers.isArmstrongNumber(n));
      }
    }
  }

  "isArmstrongNumber" should "produce an IllegalArgumentException" in {
    a[IllegalArgumentException] should be thrownBy {
      armstrongNumbers.isArmstrongNumber(-100)
      armstrongNumbers.isArmstrongNumber(-1)
    }
  }

}
