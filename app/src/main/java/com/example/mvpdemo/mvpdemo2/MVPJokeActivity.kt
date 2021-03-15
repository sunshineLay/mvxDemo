package com.example.mvpdemo.mvpdemo2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @TODO:
 * @Date: 2021/3/15 15:27
 * @User: lay
 */
class MVPJokeActivity: AppCompatActivity(), MVPContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun showJokeList(resultList: JokeBean) {
        TODO("Not yet implemented")
    }

    override fun showSuccess() {
        TODO("Not yet implemented")
    }

    override fun showFail() {
        TODO("Not yet implemented")
    }
}