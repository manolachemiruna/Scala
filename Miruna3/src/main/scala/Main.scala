object Main {

  def a = {
    println("a")
    2
  }

  val b = {
    println("b")
    a + 1
  }

  def c = {
    println("c")
    a
    b + "c"
  }

  def main(args:Array[String]):Unit={
    //println(Main.c + Main.b + Main.a)
    val x = if (true) "1" else 2
  }
}
