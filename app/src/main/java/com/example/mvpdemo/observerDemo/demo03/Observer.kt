package com.example.mvpdemo.observerDemo.demo03

/**
 * @TODO:
 * @Date: 2021/2/23 14:52
 * @User: lay
 */
// - 晚上的作业
// - Kotlin 相关之 函数（内置函数、lambda、扩展函数）
interface Observer {
    var subject:Subject
    fun update()
}