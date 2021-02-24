package com.example.mvpdemo.observerDemo.demo02


/**
 * @TODO:
 * @Date: 2021/2/22 16:40
 * @User: lay
 */
abstract class Observer(val name: String,val secretary: Secretary) {
    abstract fun update()
}