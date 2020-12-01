package com.example.learnkotlin.data

/**
 * description:
 * Created by dailei on 2020/11/30
 *
 */
fun main(args: Array<String>) {
    colorChecker(Color.RED)
    val hey = People()
    hey.sayHello()
    println("hello ".addTag())
    //下面这两种都可以
    println("apple  " em "pen")
    println("apple  " em("pen"))
    println("apple".firstLatter)
}

fun colorChecker(color: Color){
    when(color) {
        Color.BLUE -> println("is blue")
        Color.YELLOW -> println("is yellow")
        Color.RED -> println("is red")
    }
}