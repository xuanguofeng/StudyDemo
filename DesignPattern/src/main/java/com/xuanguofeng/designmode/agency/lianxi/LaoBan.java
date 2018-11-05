package com.xuanguofeng.designmode.agency.lianxi;

/**
 * description:
 * created time: 2018/2/1 18:16
 *
 * @author xuanguofeng
 */

public class LaoBan implements IXwj {

    @Override
    public void xwj(String message) {
        System.out.println("老板写文件-->" + message);
    }
}
