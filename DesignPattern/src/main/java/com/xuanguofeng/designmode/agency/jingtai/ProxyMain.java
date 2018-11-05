package com.xuanguofeng.designmode.agency.jingtai;

/**
 * description:
 * created time: 2018/1/3 16:30
 *
 * @author xuanguofeng
 */

public class ProxyMain {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.visit();
    }

}
