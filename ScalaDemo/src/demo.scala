object demo {
  def printHello(maxRange : Int, parity : Boolean=true): Unit ={
    val helloWorld : String = "Hello World"
    val numbers : Range = 1.to(maxRange)

    for(i <- numbers if isEven(i) == parity){
      println(s"$i - $helloWorld")
    }
  }

  def isEven(number : Int): Boolean ={
    number % 2 == 0
  }

  def main (args: Array[String]) {
    val maxRange : Int = 20
    printHello(maxRange, parity = false)
  }
}
