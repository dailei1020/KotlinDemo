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
    println("apple  " em ("pen"))
    println("apple".firstLatter)
    println("3+4 = " + sum(3, 4))
    cook("番茄炒蛋") { name, time ->
        println("$name 翻炒3分钟")
        println("$name 放盐")
        println("$name 放调料")
        true
    }
}

fun colorChecker(color: Color) {
    when (color) {
        Color.BLUE -> println("is blue")
        Color.YELLOW -> println("is yellow")
        Color.RED -> println("is red")
    }
}

//lambda的使用
val sum = { x: Int, y: Int -> x + y }

/**
 * 高阶函数的使用
 * Unit:表示返回值为空
 * 通常用于数据库的案例中，比如前期要连接工作，后面查询插入等等，最后关闭连接
 */
fun cook(name: String, action: (String, Int) -> Boolean) {
    println("准备食物")
    println("清洗食物")
    action(name, 3)
    println("出锅")
    println("装盘")
}