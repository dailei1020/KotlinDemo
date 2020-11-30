package com.example.learnkotlin.data

/**
 * description:
 * Created by dailei on 2020/11/30
 *
 */
class Dog(private val name:String):Animal() {

    init {
        println("$name init")
    }

    constructor(name:String, age:Int) : this(name) {
        println("$name , $age init")
    }

    override fun eat() {
        super.eat()
        println("$name dog eat")
    }

    override fun voice() {
        println("$name wang wang")
    }
}