package com.example.mvpdemo.observerDemo.opendemo

/**
 * @TODO:
 * @Date: 2021/2/23 9:40
 * @User: lay
 */
class childOpenClass : openClass() {

    override fun openMethod() {
//        super.openMethod()
        println("child-open")
    }
}