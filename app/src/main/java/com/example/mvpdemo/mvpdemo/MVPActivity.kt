package com.example.mvpdemo.mvpdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.mvpdemo.databinding.ActivityMvpBinding
import com.example.mvpdemo.utils.ToastUtils

/**
 * @TODO:   MVP 架构
 * @Date: 2021/2/7 11:09
 * @User: lay
 */
class MVPActivity : AppCompatActivity(),MVPContract.ImgDownView {
    private lateinit var mvpBinding: ActivityMvpBinding
    private val downImgPresenter by lazy {
        DownImgPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mvpBinding = ActivityMvpBinding.inflate(layoutInflater)
        setContentView(mvpBinding.root)
        initUI()
    }

    private fun initUI() {
        mvpBinding.run {
            downBtn.setOnClickListener {
               downImgPresenter.downImg(imgPath,showImg)
            }
        }
    }

    override fun loading() {
        ToastUtils.showShortMessage(this,"loading()")
    }

    override fun downFail(mes: String) {
        ToastUtils.showShortMessage(this,mes)
    }

    override fun onDestroy() {
        super.onDestroy()
        downImgPresenter.detach()
    }

    companion object{
        private val imgPath = "http://img001.dailiantong.com/Progress/20200212/zty_20200212195435294.jpg"
        private val imgPathHttps = "https://cdn.pixabay.com/photo/2017/05/28/10/34/madrid-2350687_960_720.jpg"
    }
}