package com.example.mvpdemo.mvpdemo

import android.widget.ImageView
import androidx.core.view.isVisible

/**
 * @TODO:
 * @Date: 2021/2/7 13:48
 * @User: lay
 */
class DownImgPresenter(private var mvpView: MVPContract.ImgDownView?) : MVPContract.ImgDownPresenter {

    private val downImgModel:DownImgModel by lazy {
        DownImgModel()
    }

    fun detach(){
        this.mvpView = null
    }

    override fun downImg(url: String,showImg: ImageView) {
        mvpView?.loading()
        //对于这两个信息的判断 - 原来C层的任务
        if(url.isEmpty()){
            mvpView?.downFail("图片地址为空")
            return
        }
        if (showImg.isVisible == false){
            mvpView?.downFail("图片控件不显示")
            return
        }
        downImgModel.downImg(url,showImg)
    }

}