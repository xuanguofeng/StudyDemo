package com.xuanguofeng.designmode.builder;

/**
 * description:
 * created time: 2017/12/1 14:58
 *
 * @author xuanguofeng
 */

public class Director {

    private Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getResult();
    }

}
