package info.lotharschulz

import scala.math.log10;
import scala.math.pow;
import scala.collection.mutable.ListBuffer

object App {
  def main(args: Array[String]) =
    println("Hello World!")
}

class ArmstrongNumbers() {
  def generateDummyArmstrongNumbers(start: Int, end: Int): List[Int] = {
    List(start+1, end+2)
  }

  def isArmstrongNumber(number: Int): Boolean = {
    require(number > -1, "number must be greater than -1")
    number == getDigits(number).map( x => pow(x, getNumberOfDigits(number)) ).sum
  }

  def getNumberOfDigits(number: Int): Int = number match {
    case 0 => 1
    case _ => (log10(number) + 1).toInt
  }

  def getDigits(number: Int): List[Int] = {
    require(number > -1, "number must be greater than -1")
    number match {
      case 0 => List(0)
      case _ => {
        var nmbr = number
        var d = new ListBuffer[Int]()
        while (nmbr > 0) {
          d += (nmbr % 10)
          nmbr = nmbr / 10
        }
        d.toList.reverse
      }
    }
  }

  def getDigitsAlt(number: Int): List[Int] = {
    require(number > -1, "number must be greater than -1")
    number.toString.toList.map(_.toString).map(_.toInt)
  }

}

