package com.xuanguofeng.designmode.singleton;

/**
 * 恶汉
 */
public class Singleton1 {

    private static final Singleton1 single = new Singleton1();

    private Singleton1() {
        System.out.println("single is create");
    }

    public static Singleton1 getSingle() {
        return single;
    }

}
