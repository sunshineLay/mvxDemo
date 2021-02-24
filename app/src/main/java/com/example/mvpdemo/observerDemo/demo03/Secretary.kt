package com.example.mvpdemo.observerDemo.demo03

/**
 * @TODO:
 * @Date: 2021/2/23 15:28
 * @User: lay
 */
class Secretary(override var action: String) : Subject {
    private val observers by lazy {
        ArrayList<Observer>()
    }
    override fun attach(observer: Observer) {
        observers.add(observer)
    }

    override fun detach(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyAllOb() {
        for (observer in observers){
            observer.update()
        }
    }
}