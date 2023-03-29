package com.knoldus
/*Following code consists of surprise test assigned by Prakhar.
*                                                     -Ayush Pathak */
object Main {
  def main(args: Array[String]): Unit = {
    //List of case class
    val trueValue=true
    val falseValue=false
    val numbers = List(Num("1", isEven = falseValue), Num("2", trueValue), Num("3", falseValue), Num("4", trueValue), Num("5", falseValue))
    //Filtering even numbers from list.
    println(numbers.filter(num => num.isEven))
    //Filtering odd numbers from list.
    println(numbers.filter(num => !num.isEven))
    //Using .partition method
    val (evenNumbers,oddNumbers)= numbers.partition(num=>num.isEven)
    println("Even numbers are ="+evenNumbers)
    println("Odd numbers are ="+oddNumbers)
    //Printing only first field of case class
    val numbersOfCaseClass = numbers.map(num => num.number)
    println("First field of case class =>"+numbersOfCaseClass)
  }
}
private case class Num(number : String, isEven : Boolean)
