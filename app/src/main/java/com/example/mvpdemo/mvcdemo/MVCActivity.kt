package com.example.mvpdemo.mvcdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mvpdemo.databinding.ActivityMvcBinding
import com.safframework.log.L

/**
 * @TODO:
 * @Date: 2021/2/3 14:26
 * @User: lay
 */
// MVC - 这个实现
// 优点：将M层独立出去，可以给很多C和V使用；（V和M隔离，V换了，M没有影响）
// 缺点：所有的实现基本集中于C中；此处定义xml为V；
// 此时，C（Activity/Fragment）中耦合了非常严重的V的部分；承担了太多V的实现。

class MVCActivity : AppCompatActivity(),UserLoginModel.UserLogin {
    private lateinit var mvcBinding: ActivityMvcBinding

    private val userLoginModel by lazy {
        UserLoginModel()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mvcBinding = ActivityMvcBinding.inflate(layoutInflater)
        setContentView(mvcBinding.root)
        initUI()
    }

    private fun initUI() {
        mvcBinding.run {
            loginBtn.setOnClickListener {
                doLogin()
            }
        }
    }

    private fun doLogin() {
        val username = mvcBinding.userNameEdt.text.toString()
        val password = mvcBinding.passwordEdt.text.toString()
        //此处作为C处理了username、password
        if(username.isEmpty()){
            L.i("username的值"+username)
            return
        }
        if (password.isEmpty()){
            L.i("password的值"+password)
            return
        }
        //在此处使用Model对象
        userLoginModel.doLogin(this,username,password)
    }

    override fun loading() {
        Toast.makeText(this,"loading",Toast.LENGTH_SHORT).show()
        L.i("loading")
    }

    override fun loginSuccess() {
        Toast.makeText(this,"loginSuccess",Toast.LENGTH_SHORT).show()
        L.i("loginSuccess")
    }

    override fun loginFail() {
        Toast.makeText(this,"loginFail",Toast.LENGTH_SHORT).show()
        L.i("loginFail")
    }
}