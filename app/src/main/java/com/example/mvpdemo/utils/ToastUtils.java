package com.example.mvpdemo.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * @TODO: 单例写法，作用：1、保证全局只有一个Toast对象；2、保证后面触发的Toast不需要等前面的Toast执行完毕。
 * @Date: 2021/2/7 9:42
 * @User: lay
 */
public class ToastUtils {
    private static ToastUtils instance = new ToastUtils();
    private ToastUtils(){

    }
    public static ToastUtils getInstance(){
        return instance;
    }
    public static void showShortMessage(Context mContext,String message){
        Toast.makeText(mContext,message,Toast.LENGTH_SHORT).show();
    }
    public static void showLongMessage(Context mContext,String message){
        Toast.makeText(mContext,message,Toast.LENGTH_LONG).show();
    }
}
