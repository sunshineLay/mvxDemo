package com.example.mvpdemo.mvpdemo

import android.widget.ImageView
import com.bumptech.glide.Glide


/**
 * @TODO:
 * @Date: 2021/2/7 13:48
 * @User: lay
 */
class DownImgPresenter(private var mvpView: MVPContract.ImgDownView?) : MVPContract.ImgDownPresenter {

    fun detach(){
        this.mvpView = null
    }

    override fun downImg(url: String,showImg: ImageView) {
        mvpView?.loading()
        Glide.with(showImg.context)
            .load(url)
            .into(showImg)
    }
}