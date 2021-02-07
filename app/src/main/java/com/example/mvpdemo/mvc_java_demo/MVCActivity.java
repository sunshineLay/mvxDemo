package com.example.mvpdemo.mvc_java_demo;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mvpdemo.databinding.ActivityMvcBinding;
import com.example.mvpdemo.utils.ToastUtils;

/**
 * @TODO:   MVC 架构
 * @Date: 2021/2/5 13:58
 * @User: lay
 */
public class MVCActivity extends AppCompatActivity implements UserLoginModel.UserLogin {

    private  ActivityMvcBinding mvcBinding;
    private MVCContract mvcContract = new MVCContract();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mvcBinding = ActivityMvcBinding.inflate(getLayoutInflater());
        setContentView(mvcBinding.getRoot());
        initUI();
    }


    private void initUI() {
        mvcBinding.loginBtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String username = mvcBinding.userNameEdt.getText().toString();
              String password = mvcBinding.passwordEdt.getText().toString();
              mvcContract.doLogin(MVCActivity.this,username,password);
          }
      });
    }


    @Override
    public void loading() {
        ToastUtils.showShortMessage(this,"loading()");
    }

    @Override
    public void loginSuccess() {
        ToastUtils.showShortMessage(this,"loginSuccess()");
    }

    @Override
    public void loginFail() {
        ToastUtils.showShortMessage(this,"loginFail()");
    }
}
