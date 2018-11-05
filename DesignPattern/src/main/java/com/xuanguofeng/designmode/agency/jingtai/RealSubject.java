package com.xuanguofeng.designmode.agency.jingtai;

/**
 * description:
 * created time: 2018/1/3 16:27
 *
 * @author xuanguofeng
 */

public class RealSubject implements Subject {

    @Override
    public void visit() {
        System.out.println("具体的实现逻辑");
    }

}
