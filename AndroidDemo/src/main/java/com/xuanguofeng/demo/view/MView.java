package com.xuanguofeng.demo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * description:
 * created time: 2018/3/5 11:23
 *
 * @author xuanguofeng
 */

public class MView extends View {
    public MView(Context context) {
        super(context);
    }

    public MView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //事件分发，如果时间能够传递给View，此方法会被调用。
    //返回结果s受当前view的onTouchEvent和下级的dispatchTouchEvent这个影响，是否消费事件
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("MView", "dispatchTouchEvent...");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("MView", "onTouchEvent...");
        return super.onTouchEvent(event);
    }


}