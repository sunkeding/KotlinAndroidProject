package com.keding.kotlinandroidapp.java;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;

/**
 * @author: skd
 * @date 2019-04-29
 * @Desc MyRecycleView
 */
public class MyRecycleView extends RecyclerView {
    int count;
    String age;
    public MyRecycleView(@NonNull Context context) {
        super(context);
        init();
    }

    public MyRecycleView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyRecycleView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        Log.d("MyRecycleView", "skd");
    }
}
