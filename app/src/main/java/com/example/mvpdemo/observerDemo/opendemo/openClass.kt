package com.example.mvpdemo.observerDemo.opendemo

/**
 * @TODO:
 * @Date: 2021/2/23 9:36
 * @User: lay
 */
open class openClass {
    fun finalMethod() {
        println("final")
    }

    open fun openMethod() {
        println("final-open")
    }
}