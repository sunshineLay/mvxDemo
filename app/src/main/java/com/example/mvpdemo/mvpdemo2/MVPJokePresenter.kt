package com.example.mvpdemo.mvpdemo2

/**
 * @TODO:
 * @Date: 2021/3/15 13:03
 * @User: lay
 */
class MVPJokePresenter:MVPContract.Presenter {
    private var mvpJokeView : MVPContract.View? = null

    private val mvpJokeModel by lazy{
        MVPJokeModel()
    }
    override fun getJokeData() {
//        val jokeListData = mvpJokeModel.getJokeListData()
//        mvpJokeView?.showJokeList(jokeListData)
    }
    private fun attach(){
        mvpJokeView = MVPJokeActivity()
    }
    private fun detach(){
        mvpJokeView = null
    }
}