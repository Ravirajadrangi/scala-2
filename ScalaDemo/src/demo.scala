object demo {

  def printHello(maxRange : Int): Unit ={
    val helloWorld : String = "Hello World"
    val numbers : Range = 1.to(maxRange)

    var oddEven : String = null

    for(i <- numbers){
      oddEven =
        if(i % 2 == 0)
          "Even"
        else
          "Odd"

      println(s"$oddEven - $helloWorld $i")
    }
  }

  def main (args: Array[String]) {
    val maxRange: Int = 20
    printHello(maxRange)
  }
}
