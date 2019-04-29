package com.keding.kotlinandroidapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import com.keding.kotlinandroidapp.java.CommonUtil
import com.keding.kotlinandroidapp.kotlin.SecondActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initClick()
        CommonUtil.log("MainActivity", CommonUtil.getStringList().size.toString())
        showToast(this, String.format("当前时间戳：%s", getCurrentTime()))
    }

    private fun initClick() {
        findViewById<TextView>(R.id.tv).setOnClickListener { startActivity(Intent(this, SecondActivity().javaClass)) }
    }

    private fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()

    }

    private fun getCurrentTime(): Long {
        return System.currentTimeMillis()
    }
}
