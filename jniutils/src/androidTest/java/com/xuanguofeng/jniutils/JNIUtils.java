package com.xuanguofeng.jniutils;

public class JNIUtils {

    static {
        System.loadLibrary("jnitest");
    }

    public static native String getSign();
}
