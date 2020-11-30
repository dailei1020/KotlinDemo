package com.example.learnkotlin.data

/**
 * description:
 * Created by dailei on 2020/11/30
 *
 */
class DemoData {

    //属性值可以改变
    var a: Int = 1

    //属性值不可以改变，类似于final修饰
    val b: Int = 2

    var success: Boolean = false

    //简写方法
    fun add(a: Int, b: Int): Int = a + b

    fun whenNormal(a: Int) {
        when (a) {
            1 -> println("a==1")
            2 -> println("a==2")
            else -> print("others")
        }
    }

    fun whenRange(a: Int) {
        when (a) {
            in 1..10 -> println("1到10之间")
            else -> println("不在1到10之间")
        }
    }

    fun forLoop() {
        val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
        for (x in array) {
            println("x = $x")
        }
    }

    fun forLoopIndex() {
        val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
        for ((index, value) in array.withIndex()) {
            println("index is index $index")
            println("index is index $value")
        }
    }

    fun forBreak() {
        for (x in 1..10) {
            if (x == 8) {
                break
            }
            println("x = $x")
        }
    }

    fun forBreak2() {
        for (x in 1..5) {
            println("x = $x")
            for (y in 1..10) {
                println("y = $y")
                if (y == 3) {
                    //只会停止内部（y）的循环
                    break;
                }
            }
        }

        top@ for (x in 1..5) {
            println("x = $x")
            for (y in 1..10) {
                println("y = $y")
                if (y == 3) {
                    //跳出x的循环
                    break@top;
                }
            }
        }
    }

    fun forContinue() {
        for (x in 1..5) {
            println("start")
            if(x ==2) {
                continue; //相当于不会打印2
            }
            println("i value is $x")
        }
    }

}