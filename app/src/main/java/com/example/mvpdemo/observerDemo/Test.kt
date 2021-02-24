package com.example.mvpdemo.observerDemo

import com.example.mvpdemo.observerDemo.demo03.Boss
import com.example.mvpdemo.observerDemo.demo03.NBAObserver
import com.example.mvpdemo.observerDemo.demo03.Secretary
import com.example.mvpdemo.observerDemo.demo03.StockObserver

//import com.example.mvpdemo.observerDemo.demo02.NBAObserver
//import com.example.mvpdemo.observerDemo.demo02.Secretary
//import com.example.mvpdemo.observerDemo.demo02.StockObserver

//import com.example.mvpdemo.observerDemo.demo01.Secretary
//import com.example.mvpdemo.observerDemo.demo01.StokeObserver

/**
 * @TODO:
 * @Date: 2021/2/22 14:37
 * @User: lay
 */
//fun main(args: Array<String>) {
//
//}
fun main() {
//    demo01()
//    demo02()
    demo03()
}

fun demo03() {
    val boss = Boss("我李大嘴又杀回来了。")
    val stockObserver = StockObserver(boss)
    val nbaObserver = NBAObserver(boss)
    boss.attach(stockObserver)
    boss.attach(nbaObserver)
    boss.notifyAllOb()

    val secretary = Secretary("李老板杀回来了")
    val stockObserver01 = StockObserver(secretary)
    val nbaObserver01 = NBAObserver(secretary)
    secretary.attach(stockObserver01)
    secretary.attach(nbaObserver01)
    secretary.notifyAllOb()
}

fun demo02() {
//    val secretary = Secretary()
//    val stockObserver = StockObserver("刘一二",secretary)
//    val stockObserver02 = StockObserver("张三四",secretary)
//    val nbaObserver = NBAObserver("刘ＮＢＡＡ",secretary)
//    secretary.attach(stockObserver)
//    secretary.attach(nbaObserver)
//    secretary.attach(stockObserver02)
//    secretary.action = "老板回来了"
//    secretary.detach(stockObserver02)
//    secretary.notifyAllOb()

}

fun demo01() {
//    val secretary = Secretary()
//    val ts01 = StokeObserver("刘一二",secretary)
//    val ts02 = StokeObserver("张三四",secretary)
//    secretary.attach(ts01)
//    secretary.attach(ts02)
//    secretary.action = "老板来了"
//    secretary.notifyAllOb()
}
