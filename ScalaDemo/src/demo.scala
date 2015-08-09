import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}
import java.util
import java.util.{TimeZone, Calendar}
import java.util.stream.{StreamSpliterators, IntStream}

import scala.collection.mutable.ArrayBuffer
import scala.reflect.internal.util.StringOps
import scala.util.Sorting

import scala.util.Random

object demo {
  def printHello(maxRange : Int,
                 parity : Boolean = true,
                  value : String =  "Hello World"): Unit ={

    lazy val numbers : Range = 1.to(maxRange)

    for(i <- numbers if isEven(i) == parity){
      //println(s"$i - $helloWorld")
      box(s" $i - $value ")
    }
  }

  def box(value : String,
          symbol: String = "*"): Unit ={
      var border : String = "*" * (value.length() + 2)
      var edges : String = s"$symbol$value$symbol"

    println(border)
    println(edges)
    println(border)
  }

  def isEven(number : Int): Boolean ={
    number % 2 == 0
  }

  //Exercise from book
  def checkSignum(value : Double): Integer={
    if (value > 0){
      1
    } else  if (value == 0){
      0
    } else {
      -1
    }
  }

  def signumFromRange(min : Double = - 50,
                      max : Double = 50): Unit={

    for (i <- 1.to(max.toInt)) {
      val randomDouble = min + (max - min) * Random.nextDouble()
      val signum: Integer = checkSignum(randomDouble)
      println(s"$randomDouble - $signum")
    }
  }

  def countdown(n : Int): Unit={
    for(i <- n to 0 by - 1){
      println(i)
    }
  }

  def product (s : String): Long={
    s.codePoints().toArray.product
  }

  def power(x : Double,
            n : Integer): Double={
    val nIsEven : Boolean = n % 2 == 0
    val nIsPositive : Boolean = n > 1

    var y : Double = 0

    if (nIsEven && nIsPositive){
      y = Math.pow(x, n/2)
    } else if(!nIsEven && nIsPositive){
      y = x * Math.pow(x, n - 1)
    } else if(!nIsPositive){
      y = 1 / Math.pow(x, - n)
    } else if(n == 0) {
      y = 1
    }
    y
  }

  //Array exercises


  def setArray(n : Int,
               min : Double = 25,
               max : Double = 50): Array[Double]={

    var a: ArrayBuffer[Double] = new ArrayBuffer[Double]()

    for(i <- 0 until n) a += i

    a.toArray
  }

  def swapElements(array : Array[Double]): Array[Double]= {

    val tmp = array.clone()
    for(i: Int <- 1 until (array.length, 2)){
      tmp(i - 1) = array(i)
      tmp(i) = array(i - 1)
    }

    tmp
  }

  def sortElements(array: Array[Double]): Array[Double]={
    array.sortWith(_>_)
  }

  def main (args: Array[String]) {
    /*
        val maxRange : Int = 20
        printHello(maxRange, parity = false)
        signumFromRange(min = - 100,
                        max = 250)
        countdown(100)
        println(product("Hello"))
        println(power(10, -2))

        var a: ArrayBuffer[Int] = new ArrayBuffer[Int]()

        for(i <- 0 to maxRange)a += i

        //for(i <- (0 until (a.size, 1)).reverse)print(s"$i -> ")

        val b = for (i <- a if i % 2 != 0 && i > 0) yield (2 * i).toDouble

        println(b.reverse)
        Sorting.quickSort(b.reverse.toArray)
        println(b)

        val c = for (i <- a.indices) yield i.toDouble

        println(s"count : ${b.count(_ > 0)} - ${b.mkString(" -> ")}")
        b.appendAll(c.toTraversable)

        print(b.mkString(";"))

        val a = setArray(10)

        println(a.mkString("; "))
        println(swapElements(a).mkString("; "))

        val b = new ArrayBuffer[Double]()
        for (i <- - 30 to 50) yield  b += 10

        println(sortElements(b.toArray).mkString("; "))
        println(s"average: ${b.sum / b.length}")
        var c =  b.clone()
        //remove duplicates
        println(b.distinct.mkString(start = "distinct ->",
                                  sep = "",
                                  end = ""))

        val timeZones: Array[String] = TimeZone.getAvailableIDs
        lazy val europeTimeZones: ArrayBuffer[String] = new ArrayBuffer[String]()
        val europe: String = "Europe/"

        for (t <- timeZones if t.contains(europe)){
            europeTimeZones.append(
              t.replace(europe, "")
            )
        }
        europeTimeZones.sorted
        println(europeTimeZones.mkString(",\n"))

        val flavours = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
        var nativeFlavours: util.List[String] = flavours.getNativesForFlavor(DataFlavor.imageFlavor)

        println(nativeFlavours.toArray.mkString(",\n"))
*/


  }

}
