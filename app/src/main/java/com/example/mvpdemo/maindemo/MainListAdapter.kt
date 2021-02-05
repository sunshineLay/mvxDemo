package com.example.mvpdemo.maindemo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.mvpdemo.R

/**
 * @TODO:
 * @Date: 2021/2/5 15:36
 * @User: lay
 */
class MainListAdapter(private val itemList : ArrayList<MainDataEntity>,private val mContext: Context) : RecyclerView.Adapter<MainListAdapter.MyViewHolder>() {
    class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val itemBtn : Button
        init {
            itemBtn = view.findViewById(R.id.item_btn)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemBtn.setText(itemList[position].titleActivity)
        holder.itemBtn.setOnClickListener {
            val intent = Intent(mContext,itemList[position].activityName)
            mContext.startActivity(intent)
        }
    }

    override fun getItemCount()= itemList.size
}