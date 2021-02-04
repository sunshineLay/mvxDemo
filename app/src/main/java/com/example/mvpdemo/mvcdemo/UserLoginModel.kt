package com.example.mvpdemo.mvcdemo

/**
 * @TODO:
 * @Date: 2021/2/3 15:51
 * @User: lay
 */
class UserLoginModel {
    fun doLogin(callback:UserLogin,
                username:String,
                userPass:String
    ){
        callback.loading()
        val randomValue = (0..1).random()
        if(randomValue == 0){
            callback.loginFail()
        }else{
            callback.loginSuccess()
        }

    }
    interface UserLogin{
        fun loading()

        fun loginSuccess()

        fun loginFail()
    }
}