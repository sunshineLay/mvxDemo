package com.example.mvpdemo.observerDemo.demo03

/**
 * @TODO:
 * @Date: 2021/2/23 15:27
 * @User: lay
 */
class StockObserver(override var subject: Subject) : Observer {
    override fun update() {
        println("别看股票了，起来工作！${subject.action}")
    }
}