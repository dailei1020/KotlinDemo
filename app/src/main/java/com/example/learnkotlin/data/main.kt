package com.example.learnkotlin.data

/**
 * description:
 * Created by dailei on 2020/11/30
 *
 */
fun main(args: Array<String>) {
    colorChecker(Color.RED)
}

fun colorChecker(color: Color){
    when(color) {
        Color.BLUE -> println("is blue")
        Color.YELLOW -> println("is yellow")
        Color.RED -> println("is red")
    }
}