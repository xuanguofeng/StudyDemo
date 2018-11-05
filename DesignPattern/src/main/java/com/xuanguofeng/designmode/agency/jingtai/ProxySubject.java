package com.xuanguofeng.designmode.agency.jingtai;

/**
 * description:
 * created time: 2018/1/3 16:29
 *
 * @author xuanguofeng
 */

public class ProxySubject implements Subject {
    RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        realSubject.visit();
    }
}
