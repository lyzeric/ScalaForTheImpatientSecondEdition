package WorksheetDemo.Chapter2
import java.io.IOException
import java.net.{MalformedURLException, URL}
import java.text.MessageFormat

import scala.sys._
import scala.math._
import scala.io._
import java.nio.file

import scala.util.Try
import scala.util.control.Breaks._
object d201803071857 {
  def main(args: Array[String]): Unit = {
    val n = 10
    breakable(
      for (i <- 0 to n) {
        if (true) break;
      }
    )
    for (i <- 1 to 3; j <- 1 to 3) print(f"${10 * i + j}%3d")
    println()
    for (i <- 1 to 3; j <- 1 to 3 if i != j) print(f"${10 * i + j}%3d")
    println()
    for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(f"${10 * i + j}%3d")
    println()
    for (i <- 1 to 10) yield i % 3

    for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar

    for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar

/*
    for {i <- 1 to 3
         from = 4 - i
         j <- from to 3}
*/

    decorate(left = "Hello", str =  "<<<",  right = ">>>")
    decorate("Hello", right = "]<<<")

    val s = sum(1, 4, 9, 16, 25)

    val s_s  =sum(1 to 5:_*)

    val str = MessageFormat.format("The answer to {0} is {1}",
              "everything", 42.asInstanceOf[AnyRef])

    box("Hello")

//    lazy val words = scala.io.Source.formatted("D:/1.txt").mkString

//    def words = scala.io.Source.formatted("D:/1.txt").mkString

    val words = scala.io.Source.formatted("D:/1.txt").mkString
    val x =199
    if(x >= 0){ sqrt(x)
0    } else throw new IllegalArgumentException("x should not be negative")

    /*val url = new URL("http://horstmann.com/fred-tiny.gif")
    try {
      process(url)
    }catch {
      case _: MalformedURLException => println(s"Bad URL: $url")
      case ex: IOException => ex.printStackTrace()
    }*/
    /*val in = new URL("http://horstmann.com/fred.gif").openStream()
    try{
      process(in)
    }finally {
      in.close()
    }*/
    val result =
    for(a <- Try{StdIn.readLine()("a: ".toInt)};
      b <- Try{StdIn.readLine()("a: ".toInt)})
      yield a/b
  }

  def fac(n : Int) = {
    var r =1
    for(i <- 1 to n) r = r * i
    r
  }

//  def fac(n : Int): Int = if (n <= 0) 1 else n * fac(n-1)

  def decorate(str: String, left: String = "[", right: String = "]") =
    left + str + right

  def sum(args: Int*) = {
    var result = 0
    for(arg <- args) result += arg
    result
  }

  def recursiveSum(args : Int*) : Int = {
    if(args.length == 0) 0
    else args.head + recursiveSum(args.tail : _*)
}

  def box(s :String) {
    val border = "-" * (s.length + 2)
    print(f"$border%n|$s|%n$border%n")
  }


}
