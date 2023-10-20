package com.example.kotlinexercise1activity2

class AddExtentionToClassString {
}

fun main() {
    fun String.methode(): String{
        var Last:Int = this.length
        var First:Int = 0
        return this.substring(First+1,Last-1)
    }
    val name="Otmane"
    println(name)
    println(name.methode())
}