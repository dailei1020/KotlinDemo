package com.example.learnkotlin.data

/**
 * description:
 * Created by dailei on 2020/11/30
 *
 */
class House {
    //同时共享water变量
    var water:Int = 10;
    inner class Cat{
        fun drink(){
            water -= 1
            println("猫喝了水，剩下：$water")
        }
    }

    inner class Dog {
        fun drink(){
            water -= 4
            println("狗喝了水，剩下：$water")
        }
    }
}