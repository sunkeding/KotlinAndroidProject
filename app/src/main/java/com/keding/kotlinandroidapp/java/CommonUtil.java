package com.keding.kotlinandroidapp.java;

import android.util.Log;
import com.keding.kotlinandroidapp.kotlin.Student;

import java.util.ArrayList;

/**
 * @author: skd
 * @date 2019-04-29
 * @Desc CommonUtil
 */
public class CommonUtil {
    public static ArrayList<Student> getStringList() {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Student());
        }
        return list;
    }

    public static void log(String tag, String msg) {
        Log.d(tag, msg);
    }
}
