class Miruna(val nume:String ,val prenume:String ,varsta:Int)
{
  println(nume+" "+prenume+" "+varsta)
  def metoda1(x:Int)={
    x
  }
}

object Main {
  def main(args:Array[String]):Unit=
  {
     val a=3
     val b=4
    println(a*b)
    val x=new Miruna("ana", prenume = "popa",varsta = 23)
    println(x.metoda1(123))
    val y= new JavaClass(12)
    println(y)
    val z=new Miruna2()





  }
}
