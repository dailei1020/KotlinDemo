package com.example.learnkotlin.java;

import com.example.learnkotlin.data.KotlinUtil;

/**
 * description:
 * Created by dailei on 2020/12/4
 */
public class JavaUtil {
    public static void main(String[] args) {
        KotlinUtil kotlinUtil = new KotlinUtil();
        kotlinUtil.callMe("hello kotlin");
        KotlinUtil.Companion.staticFun("hello static kotlin");
    }
}
