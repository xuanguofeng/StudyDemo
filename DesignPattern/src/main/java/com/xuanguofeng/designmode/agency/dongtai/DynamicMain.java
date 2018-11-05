package com.xuanguofeng.designmode.agency.dongtai;

import com.xuanguofeng.designmode.agency.jingtai.RealSubject;
import com.xuanguofeng.designmode.agency.jingtai.Subject;

import java.lang.reflect.Proxy;


/**
 * description:
 * created time: 2018/1/3 16:58
 *
 * @author xuanguofeng
 */

public class DynamicMain {

    public static void main(String[] args) {

        RealSubject subject = new RealSubject();

        DynamicProxy dynamicProxy = new DynamicProxy(subject);

        ClassLoader classLoader = subject.getClass().getClassLoader();

        Subject proxySubject = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, dynamicProxy);
        proxySubject.visit();
    }
}
