package com.example.mvpdemo.mvpdemo2

/**
 * @TODO:
 * @Date: 2021/3/15 13:28
 * @User: lay
 */
data class JokeBean(
    val error_code: Int,
    val reason: String,
    val result: Result
)

data class Result(
    val `data`: List<Data>
)

data class Data(
    val content: String,
    val hashId: String,
    val unixtime: Int,
    val updatetime: String
)