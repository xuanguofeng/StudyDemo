package com.xuanguofeng.designmode.singleton;

/**
 * 静态内部类格式单例
 */

public class Singleton2 {

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return Holder.single;
    }


    private static class Holder {
        private static final Singleton2 single = new Singleton2();
    }

}
