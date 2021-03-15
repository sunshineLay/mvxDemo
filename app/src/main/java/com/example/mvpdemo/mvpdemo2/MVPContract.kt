package com.example.mvpdemo.mvpdemo2

/**
 * @TODO:
 * @Date: 2021/3/12 10:26
 * @User: lay
 */
// 这个例子就是一个笑话列表的Demo
interface MVPContract {
    interface View{
        fun showJokeList(resultList: JokeBean)

        fun showSuccess()

        fun showFail()
    }
    interface Model{
        fun getJokeListData(): JokeBean
    }
    interface Presenter{
        fun getJokeData()
    }
}