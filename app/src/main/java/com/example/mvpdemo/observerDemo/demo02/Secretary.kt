package com.example.mvpdemo.observerDemo.demo02

/**
 * @TODO:
 * @Date: 2021/2/22 16:44
 * @User: lay
 */
//demo2 对 demo1的弥补
//1、抽象了观察者类；通过继承的方法具体实现了NBA观察者和看股票观察者两个具体实现类。
//2、新增了detach功能
//3、通过1，实现了对于观察者具体类的耦合。
class Secretary {
    private val observers by lazy {
        ArrayList<Observer>()
    }
    var action: String = ""

    fun attach(observer: Observer){
        observers.add(observer)
    }
    fun detach(observer: Observer){
        observers.remove(observer)
    }
    fun notifyAllOb(){
        for (obser in observers){
            obser.update()
        }
    }
}