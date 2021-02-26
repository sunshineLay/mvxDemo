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
//【由接口回调，思考面对对象语言的设计过程。】
    // 一开始，面对对象的基础是类和对象；后来在实际使用中出现了对于"模板代码"的需要，于是在类的基础上抽象出了抽象类。
    // 然后，在事件传递的过程中我们发现，A对象要传递给B对象，需要持有B对象。B对象要传递给C对象，要持有C对象。C再持有A。这就形成了最基本的MVC模型。
    // 可是，我们在MVC中只是希望M把数据传递给V而已，换句话说，只是希望使用V中的一个方法而已。那么就出现了对于行为的抽象，也就是对于方法的抽象。
    // 而不是对于一类事物的抽象的这种需求。
    // 于是，接口就出现了。
    // 于是，在A处定义，在B处实现，在C处使用的接口回调就出现了。
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
