package com.example.mvpdemo.utils;

import com.example.mvpdemo.mvc_java_demo.MVCActivity;

/**
 * @TODO:
 * @Date: 2021/2/7 10:21
 * @User: lay
 */
public class ActivityUtils {
    //这个方法，让Kotlin中可以使用Java的Activity的class对象
    public static Class<?> getMVCActivity(){
        return MVCActivity.class;
    }
}
