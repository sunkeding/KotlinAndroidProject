package com.keding.kotlinandroidapp.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.keding.kotlinandroidapp.R
import java.util.ArrayList

/**
 * @author: skd
 * @date  2019-04-29
 * @Desc  SecondActivity
 */
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        println(String.format("size=%s",getStringList().size.toString()+""))
    }

    fun getStringList(): ArrayList<Student> {
        val list = ArrayList<Student>()
        for (i in 0..4) {
            list.add(Student())
        }
        return list
    }
}