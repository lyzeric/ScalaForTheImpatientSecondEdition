package WorksheetDemo.Chapter3
import scala.collection.mutable.ArrayBuffer
import scala.collection.Searching._
import scala.collection.JavaConverters.bufferAsJavaList
import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConverters.asScalaBuffer
import scala.collection.mutable.Buffer
object d201803160751 {
  def main(args: Array[String]): Unit = {
    val nums = new Array[Int](10)
    val a = new Array[String](10)
    val s = Array("Hello", "World")
    s(0) = "Goodbye"
    for(i <-  0 to s.length - 1)
      println(s(i))
    val b = ArrayBuffer[Int]()
    b += 1
    b += (1, 2, 3, 4)
    b ++= Array(8, 13, 21)
    for(i <- 0 until b.length)
      println(s"$i: ${b(i)}")
    b.trimEnd(5)
    b.insert(2, 6)
    b.insert(2, 7, 8, 9)
    b.remove(2)
    b.remove(2, 3)
    for(i <- 0 until b.length)
      println(s"$i: ${b(i)}")
    for(i <- 0 until b.length by 2)
      println(s"$i: ${b(i)}")
    for(i <- 0 until b.length by -1)
      println(i)
    for(elme <- b)
      println(elme)
    val c = ArrayBuffer(2, 3, 5, 7,11)
    val result = for(elem <- c) yield 2 * elem
    for(elem <- c if elem % 2 == 0) yield 2 * elem
    c.filter(_ % 2 == 0).map(2 * _)
    c.filter {_ % 2 == 0} map {2 * _}
    var n = c.length
    var i = 0
    while(i < n ){
      if(c(i) >= 0) i += 1
      else { c.remove(i); n -= 1}
    }
    val result_1 = for (elem <- c if elem >= 0) yield elem
    val positionsToRemove = for (i <- c.indices if c(i) < 0 ) yield i
    for(i <- positionsToRemove.reverse) c.remove(i)
    val positionsToKeep = for(i <- c.indices if c(i) >= 0 ) yield i
    for(j <- positionsToKeep.indices) c(j)  = c(positionsToKeep(j))
    c.trimEnd(c.length - positionsToKeep.length)
    Array(1, 7, 2, 9).sum
    ArrayBuffer("Mary", "had", "a", "little", "lamb").max
    val b_1 = ArrayBuffer(1, 7, 2, 9)
    val bSorted = b_1.sorted
    val bDescending = b_1.sortWith(_>_)
    val  a_1 = Array(1, 7, 2, 9)
    scala.util.Sorting.quickSort(a_1)
    a_1.mkString(" and ")
    a_1.mkString("<", ",", ">")
    a_1.toString
    println(a_1)
    b_1.toString()
    println(b_1)
    val matrix = Array.ofDim[Double](3, 4)
    matrix(2)(3) = 42
    val triangle = new Array[Array[Int]](10)
    for(i <- triangle.indices)
      triangle(i) = new Array[Int](i + 1)
    val a_2 = Array("Mary","a","had","lamb","little")
    val result_2 = a_2.search("a")
    val result_3 = a_2.search("beef")
    println(result_2)
    println(result_3)
    /*val command = ArrayBuffer("ls", "-al", "/home/cay")
    val pb = new ProcessBuilder(command)
    val cmd : Buffer[String] = pb.command()*/
  }
}
