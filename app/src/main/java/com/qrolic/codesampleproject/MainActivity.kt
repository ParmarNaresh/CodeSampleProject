package com.qrolic.codesampleproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.databinding.DataBindingUtil
import com.qrolic.codesampleproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        initAllControls()
    }
    private fun initAllControls()
    {
        Handler(Looper.myLooper()!!).postDelayed({startLoginActivity()},2000)

    }

    private fun startLoginActivity()
    {
        val intent=Intent(this,LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    
}