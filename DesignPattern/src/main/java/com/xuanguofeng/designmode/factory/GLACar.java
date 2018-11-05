package com.xuanguofeng.designmode.factory;

/**
 * description:具体的奔驰GLA产品
 * created time: 2018/2/5 11:44
 *
 * @author xuanguofeng
 */

public class GLACar extends BenChiCar {

    @Override
    void crate() {
        System.out.println("奔驰GLA生产。。。。。。");
    }
}
