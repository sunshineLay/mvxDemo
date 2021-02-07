package com.example.mvpdemo.mvc_java_demo;


import com.safframework.log.L;

/**
 * @TODO: MVC的C层
 * @Date: 2021/2/7 9:21
 * @User: lay
 */
public class MVCContract {
    private UserLoginModel userLoginModel = new UserLoginModel();
    public void doLogin(UserLoginModel.UserLogin userLogin, String username, String password){
        if(username.isEmpty()){
            L.i("username:"+username);
           return;
        }
        if(password.isEmpty()){
            L.i("password:"+password);
            return;
        }
        userLoginModel.doLogin(userLogin,username,password);
    }

}
