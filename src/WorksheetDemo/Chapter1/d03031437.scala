package WorksheetDemo.Chapter1

import scala.math._

object d03031437 {
  def main(args:Array[String]): Unit = {
    sqrt(2)
    pow(2, 4)
    min(3, Pi)
    BigInt.probablePrime(100, scala.util.Random)
    val s ="Hello"
    s(4)  //s.apply(4)
    "Bonjour".sorted.apply(3)
    BigInt("1234567890") //    BigInt.apply("1234567890")
    BigInt("1234567890") * BigInt("112358111321")
    s.count(_.isUpper)
    "Bierstube".containsSlice('r'.to('u'))
    "Scala".sorted
    var q:BigInt = pow(2, 1024).toInt
    10 max 2
    s.apply(0)
    s.takeRight(1)
  }
}
