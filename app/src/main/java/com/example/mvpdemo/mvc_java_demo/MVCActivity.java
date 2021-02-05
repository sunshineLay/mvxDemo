package com.example.mvpdemo.mvc_java_demo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mvpdemo.databinding.ActivityMvcBinding;

/**
 * @TODO:
 * @Date: 2021/2/5 13:58
 * @User: lay
 */
public class MVCActivity extends AppCompatActivity {

    private  ActivityMvcBinding mvcBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mvcBinding = ActivityMvcBinding.inflate(getLayoutInflater());
        setContentView(mvcBinding.getRoot());
    }
}
