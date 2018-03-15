package WorksheetDemo.Chapter2
import scala.io
import scala.io.StdIn

object d03071833 {
  def main(args: Array[String]): Unit = {
    val name = StdIn.readLine("Your name: ")
    print("Your age: ")
    val age = StdIn.readInt()
    println(s"Hello, ${name}! Next year, you will be ${age + 1}.")
    var r, n = 10
    while(n > 0){
      r = r * n
      n -= 1
    }
    for(i <- 1 to n){
      r = r * i
    }
    val s = "Hello"
    var sum = 0
    for(i <- 0 to s.length -1)
      sum += s(i)
    for(ch <- "Hello") sum += ch

  }
}
