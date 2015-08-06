object demo {
  def main (args: Array[String]) {
    val maxRange: Int = 50
    val helloWorld : String = "Hello World"
    val numbers: Range = 1.to(maxRange)

    for(i <- numbers){
      println(s"$helloWorld $i")
    }

  }
}
