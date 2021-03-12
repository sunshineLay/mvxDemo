package com.example.mvpdemo


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvpdemo.databinding.ActivityMainBinding
import com.example.mvpdemo.maindemo.MainDataEntity
import com.example.mvpdemo.maindemo.MainListAdapter
import com.example.mvpdemo.mvpdemo.MVPActivity
import com.example.mvpdemo.utils.ActivityUtils
import com.example.mvpdemo.mvcdemo.MVCActivity as MActivity
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        initRecyclerView()

    }

    private fun initRecyclerView() {
        val mainDataList = ArrayList<MainDataEntity>()
        val mvcDataEntity = MainDataEntity("MVC-Kotlin", MActivity::class.java)
        mainDataList.add(mvcDataEntity)
        val mvcJavaEntity = MainDataEntity("MVC-Java", ActivityUtils.getMVCActivity())
        //无法在Kotlin 中调用Java的class类，哪怕MVCActivity::class.java 这种写法也是javaClass 中的。 - 问题所在应该是在Kotlin中无法使用Java语法。
        mainDataList.add(mvcJavaEntity)
        mainDataList.add(MainDataEntity("MVP-Kotlin-Basic",MVPActivity::class.java))
        mainBinding.mainList.run{
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MainListAdapter(mainDataList,this@MainActivity)

        }
    }

}