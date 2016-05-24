package info.lotharschulz

import scala.math.log10;
import scala.math.pow;
import scala.collection.mutable.ListBuffer

object App {
  def main(args: Array[String]): Unit = {
    val armstrongNumbers: ArmstrongNumbers = new ArmstrongNumbers
    Console.println(armstrongNumbers.generateArmstrongNumbers(100, 1000))
  }
}

class ArmstrongNumbers {
  def generateArmstrongNumbers(from: Int, to: Int): List[Int] = {
    require(from > -1, "from number must be greater than -1")
    require(to > from, "to number must be greater than from number")
    for (i <- List.range(from, to) if isArmstrongNumber(i)) yield i
  }

  def isArmstrongNumber(number: Int): Boolean = {
    require(number > -1, "number must be greater than -1")
    number == getDigits(number).map( x => pow(x, getNumberOfDigits(number)) ).sum
  }

  def getNumberOfDigits(number: Int): Int = {
    require(number > -1, "number must be greater than -1")
    number match {
      case 0 => 1
      case _ => (log10(number) + 1).toInt
    }
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

