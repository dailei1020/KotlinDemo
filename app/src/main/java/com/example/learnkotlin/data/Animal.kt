package com.example.learnkotlin.data

/**
 * description:
 * Created by dailei on 2020/11/30
 *
 */
abstract class Animal {
    open fun eat(){
        println("Animal eat")
    }

    open fun jump(){
        println("Animal jump")
    }

    abstract fun voice()

}