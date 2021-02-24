package com.example.mvpdemo.observerDemo.demo02

/**
 * @TODO:
 * @Date: 2021/2/22 16:51
 * @User: lay
 */
class NBAObserver(name: String,secretary: Secretary) : Observer(name,secretary) {
    override fun update() {
        println("$name 别看NBA，${secretary.action}")
    }
}