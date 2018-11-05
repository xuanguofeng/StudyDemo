package com.xuanguofeng.designmode.factory;

/**
 * description:
 * created time: 2018/2/5 11:45
 *
 * @author xuanguofeng
 */
public abstract class Factory {

    abstract GLACar createGLA();

    abstract <T extends BenChiCar> T createCar(Class<T> clazz);
}
