package com.xuanguofeng.designmode.factory;

/**
 * description:
 * created time: 2018/2/5 11:45
 *
 * @author xuanguofeng
 */

public class Client {

    public static void main(String[] args) {
        Factory factory = new BCFactory();
        GLACar gla = factory.createGLA();
        gla.crate();
    }
}
