# session4-surpriseTest
## Problem Statement
### Create a case class that has 2 fields - 
1-One representing a numerical value in String and  
another representing a boolean field denoting whether the number is even or odd.  
2-Create a list of this case class and perform following operations:  
->Filter even number  
->Filter odd numbers  
->Explore and use .partition method  
->Print only 1st field of the case class for even numbers  
##Code    
package com.knoldus
                                            
object Main {  
  def main(args: Array[String]): Unit = {  
    val trueValue=true  
    val falseValue=false  
    val numbers = List(Num("1", isEven = falseValue), Num("2", trueValue), Num("3", falseValue), Num("4", trueValue), Num("5", falseValue))  
    println(numbers.filter(num => num.isEven))  
    println(numbers.filter(num => !num.isEven))  
    val (evenNumbers,oddNumbers)= numbers.partition(num=>num.isEven)  
    println("Even numbers are ="+evenNumbers)  
    println("Odd numbers are ="+oddNumbers)  
    val numbersOfCaseClass = numbers.map(num => num.number)  
    println("First field of case class =>"+numbersOfCaseClass)  
  }  
}  
private case class Num(number : String, isEven : Boolean)  

