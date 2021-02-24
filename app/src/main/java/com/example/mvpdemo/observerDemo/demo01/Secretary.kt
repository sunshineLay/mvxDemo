package com.example.mvpdemo.observerDemo.demo01

/**
 * @TODO: 大话设计模式 之 观察者模式， 例1.
 * @Date: 2021/2/22 14:35
 * @User: lay
 */
//秘书类 ，负责通知。 被观察者 - 这部分就是负责通知观察观察者的
//demo01 的写法存在的问题是：
//1、秘书类和观察者类双向耦合；
//2、股票观察者类和秘书通知类都没有抽象；
//3、秘书类功能不全，只有添加观察者，没有移除观察者；
class Secretary{
    private val observers by lazy{
        ArrayList<StokeObserver>()
    }
    var action: String = ""

    fun attach(stokeObserver: StokeObserver){
        observers.add(stokeObserver)
    }

    fun notifyAllOb(){
        for (stokeObserver in observers){
            stokeObserver.update()
        }
    }



}