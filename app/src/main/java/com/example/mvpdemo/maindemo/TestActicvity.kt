package com.example.mvpdemo.maindemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvpdemo.mvcdemo.MVCActivity
import java.util.*

/**
 * @TODO:
 * @Date: 2021/2/5 17:16
 * @User: lay
 */
class TestActicvity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initData()
    }

    private fun initData() {
        val mainDataEntities = ArrayList<MainDataEntity>()
        val mvcDataEntity = MainDataEntity("MVC-Kotlin", MVCActivity::class.java)
        mainDataEntities.add(mvcDataEntity)
    }
}