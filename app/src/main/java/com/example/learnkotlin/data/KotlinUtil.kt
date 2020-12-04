package com.example.learnkotlin.data

/**
 * description:
 * Created by dailei on 2020/12/4
 *
 */
class KotlinUtil {
    /**
     * 静态方法
     */
    companion object{
        fun staticFun(str:String){
            println("static fun $str")
        }
    }

    fun callMe(str:String) {
        println("callMe $str")
    }
}