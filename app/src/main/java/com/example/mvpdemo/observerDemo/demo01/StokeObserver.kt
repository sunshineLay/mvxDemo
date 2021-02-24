package com.example.mvpdemo.observerDemo.demo01

import com.safframework.log.L

/**
 * @TODO:
 * @Date: 2021/2/22 14:42
 * @User: lay
 */

//看股票的观察者
class StokeObserver(val name:String,val secretary: Secretary) {

    fun update(){
//        L.i("$name 看股票，${secretary.action}")
        println("$name 别看股票，${secretary.action}")
    }
}