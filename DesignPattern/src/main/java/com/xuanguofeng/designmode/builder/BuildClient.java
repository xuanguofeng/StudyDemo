package com.xuanguofeng.designmode.builder;

/**
 * description:
 * created time: 2017/12/1 15:02
 *
 * @author xuanguofeng
 */

public class BuildClient {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
    }
}
