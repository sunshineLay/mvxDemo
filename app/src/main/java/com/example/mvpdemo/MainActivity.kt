package com.example.mvpdemo


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvpdemo.databinding.ActivityMainBinding
import com.example.mvpdemo.maindemo.MainDataEntity
import com.example.mvpdemo.maindemo.MainListAdapter
import com.example.mvpdemo.mvcdemo.MVCActivity
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
        val mvcDataEntity = MainDataEntity("MVC-Kotlin", MVCActivity::class.java)
        mainDataList.add(mvcDataEntity)

        mainBinding.mainList.run{
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MainListAdapter(mainDataList,this@MainActivity)

        }
    }

}