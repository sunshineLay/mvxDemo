package com.example.mvpdemo.mvpdemo

import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * @TODO: 所有M层的打造都要思考复用问题
 * @Date: 2021/2/8 13:24
 * @User: lay
 */
class DownImgModel : MVPContract.ImgDownModel{
    override fun downImg(url: String, showImg: ImageView) {
        Glide.with(showImg.context)
            .load(url)
            .into(showImg)
    }
}