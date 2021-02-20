package com.example.mvpdemo.mvpdemo

import android.content.Context
import android.widget.ImageView

/**
 * @TODO: MVP 抽象层
 * @Date: 2021/2/7 11:57
 * @User: lay
 */
interface MVPContract {
    interface ImgDownView{
        fun loading()

        fun downFail(mes: String)
    }
    interface ImgDownPresenter{
        fun downImg(url: String,showImg: ImageView)
    }
    //通常情况下有三层，但是当我们的M层是专属M的时候，其实就可以将M的实现单独写在P层里面。M层和P层的尺度，灵活运用即可。
    interface ImgDownModel{
        fun downImg(url: String,showImg: ImageView)
    }
}