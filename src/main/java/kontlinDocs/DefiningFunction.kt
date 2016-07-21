package kontlinDocs

/**
 * Created with IntelliJ IDEA.
 * User: Xiaoke Zhang
 * Date: 7/21/2016
 * Time: 9:02 AM
 * To change this template use File | Settings | File Templates.


 */ 
fun sum(a: Int,b:Int):Int {
    return a + b
}

fun sumNew(a : Int,b :Int) = a+b

fun printSum(a :Int ,b:Int) : Unit {
    print(a +b)
}

fun printSumNew(a : Int ,b : Int){
    print(a + b)
}

fun main(args:Array<String>){
    val a :Int = 10
    val b  = 20
    val c :Int
    c = 100
    val sum = sum(a,b)
    println(sum)
    printSum(a,b)
    println()
    printSumNew(c,a)
}