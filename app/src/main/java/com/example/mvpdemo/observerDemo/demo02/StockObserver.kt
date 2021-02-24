package com.example.mvpdemo.observerDemo.demo02

/**
 * @TODO:
 * @Date: 2021/2/22 16:40
 * @User: lay
 */
class StockObserver(name: String,secretary: Secretary) : Observer(name,secretary) {
    override fun update() {
        println("$name 别看股票，${secretary.action}")
    }
}