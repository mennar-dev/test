package com.example.firstprojectkotlin

fun main(){
    println("hola mundo")

    // VARIABLES

    val age:Int = 20

    val example:Long = 122324

    val floatExample:Float = 3.4f

    val doubleExample: Double = 444.78678678


    // VARIABLES ALFANUMERICAS
    val charExample:Char = 'q'

    val stringExample: String = "edwin burbano t.b"

    // Bolean
    val booleanExample:Boolean = true

    // Variable concatenada
    val variableCocatenadad = "Hello my name is $stringExample , am $age years ago"
    println(variableCocatenadad)
    add(3, 6)
}

fun add(num1: Int, num2: Int) {
    println(num1 + num2)

}