package com.xuanguofeng.openframe.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Tool {

    @Inject
    Tool() {

    }

    public void use() {
        Log.e("Tool", "工具被使用。。。。");
    }

}
