package com.qrolic.codesampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import com.qrolic.codesampleproject.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var activityLoginBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
        activityLoginBinding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        initAllControls()
    }

    private fun initAllControls()
    {
        activityLoginBinding.btnLogin.setOnClickListener({
            onLoginButtonClicked()
        })
    }

    private fun onLoginButtonClicked()
    {
        val email:String=activityLoginBinding.etLoginEmail.text.toString()
        val password=activityLoginBinding.etLoginPassword.text.toString()

        if(email.trim().isEmpty())
        {
            Snackbar.make(activityLoginBinding.btnLogin,"Please Enter Email",Snackbar.LENGTH_SHORT).show()
        }
        else if(password.trim().isEmpty())
        {
            Snackbar.make(activityLoginBinding.btnLogin,"Please Enter Password",Snackbar.LENGTH_SHORT).show()
        }
        else
        {
            Snackbar.make(activityLoginBinding.btnLogin,"Login successfully",Snackbar.LENGTH_SHORT).show()
        }
    }
}