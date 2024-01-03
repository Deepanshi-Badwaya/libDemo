package com.example.demolib

import android.util.Log

class HelloWorld {
    fun main(args: Array<String>) { println("Hello, World!") }
    fun printtext(tag: String ,msg: String){
        Log.d(msg, "printtext: $tag")
    }
}