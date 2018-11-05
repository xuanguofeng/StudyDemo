package com.xuanguofeng.jniutils;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class JNITest {
    @Test
    public void testJni() {
        String sign = JNIUtils.getSign();
        Log.e("sign--->",sign);
    }
}
