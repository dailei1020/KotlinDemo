package com.example.learnkotlin.data

/**
 * description:接口的定义与使用
 * Created by dailei on 2020/12/1
 *
 */
class People:Hey,Hello {
    override fun sayHello() {
        //这里继承两个相同的接口都有sayHello
        super<Hello>.sayHello()
        println("People say hello")
    }
}