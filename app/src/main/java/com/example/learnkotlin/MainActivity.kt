package com.example.learnkotlin

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.ObsoleteCoroutinesApi
import kotlinx.coroutines.newFixedThreadPoolContext
import okhttp3.*
import java.io.IOException
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {
    //lateinit表示一会再初始化
    private lateinit var textView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById<TextView>(R.id.tv_welcome)
        findViewById<Button>(R.id.button1).setOnClickListener() { onClickButton1() }
        findViewById<Button>(R.id.button2).setOnClickListener() {
            // onClickButton2()

            pack_net(url,
                { response ->
                    textView.text = "response = $response"
                },
                { ioException ->
                    textView.text = "response = $ioException"
                })
        }
    }

    /**
     * 启动1000个协程
     * newFixedThreadPoolContext未转正
     */
    @ObsoleteCoroutinesApi
    private fun onClickButton2() {
        val pool = newFixedThreadPoolContext(10, "coroutine")
        for (x in 0..100) {
            pool.run {
                writeSp("Coroutine", x.toString(), x)
            }
        }
    }

    /**
     * 启动1000个进程
     */
    private fun onClickButton1() {
        val pool = Executors.newFixedThreadPool(10)
        for (x in 0..100) {
            pool.run {
                writeSp("thread", x.toString(), x)
            }
        }
    }

    fun writeSp(way: String, name: String, value: Int) {
        val sp = getSharedPreferences("share", Context.MODE_PRIVATE)
        sp.edit().putInt(name, value).apply()
        val count = sp.getInt(name, 0)
        println("调用方式：$way key值为：$name 取出来的值为$value")

    }

    private val url = "https//www."
    fun normal_update_ui() {
        val okhttp = OkHttpClient()
        val request = Request.Builder().url(url).build()
        okhttp.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful) {
                    textView.post {
                        textView.text = "我是通过线程更新的"
                    }
                }
            }
        })
    }

    /**
     * 通过高阶函数的写法
     */
    fun pack_net(url: String, succeed: (Response) -> Unit, error: (IOException) -> Unit) {
        val okhttp = OkHttpClient()
        val request = Request.Builder().url(url).build()
        okhttp.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                error(e)
            }

            override fun onResponse(call: Call, response: Response) {
                succeed(response)
            }
        })
    }



}