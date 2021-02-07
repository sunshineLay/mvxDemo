package com.example.mvpdemo.mvc_java_demo;

import com.safframework.log.L;

import java.util.Random;

/**
 * @TODO:
 * @Date: 2021/2/7 9:27
 * @User: lay
 */
public class UserLoginModel {
    public void doLogin(UserLogin callback,String userName,String userPass){
        Random random = new Random();
        int userType = random.nextInt(2);
        //使用userName 和 userPass 来请求登录接口
        L.i("userName:"+userName);
        L.i("userPass:"+userPass);
        callback.loading();
        if(userType == 0){
            callback.loginFail();
        }else{
            callback.loginSuccess();
        }

    }
    interface UserLogin{
        void loading();

        void loginSuccess();

        void loginFail();
    }
}
