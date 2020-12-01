package com.example.learnkotlin.data

/**
 * description:扩展类
 * Created by dailei on 2020/12/1
 *
 */
fun String.addTag(): String {
    return this + "dl"
}

/**
 *？传入的对象有可能为空
 */
fun String?.isEmpty(): Boolean {
    if (this == null) {
        return true
    }
    return this == ""
}

/**
 * infix修饰的方法参数只能有一个
 */
infix fun String.em(content: String): String {
    return this + content
}

//打印出第一个字符串
val String.firstLatter: Char
    get() = this[0]  //相当于java中的get方法