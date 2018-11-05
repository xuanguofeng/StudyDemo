package com.xuanguofeng.designmode.builder;

/**
 * description:
 * created time: 2017/12/1 14:00
 *
 * @author xuanguofeng
 */

public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildA();

    public abstract void buildB();

    public abstract void buildC();

    public Product getResult() {
        return product;
    }
}
