package com.xuanguofeng.designmode.agency.lianxi;

/**
 * description:
 * created time: 2018/2/1 18:17
 *
 * @author xuanguofeng
 */

public class MiShu implements IXwj {

    private LaoBan laoBan;

    public MiShu(LaoBan laoBan) {
        this.laoBan = laoBan;
    }

    @Override
    public void xwj(String message) {
//        System.out.println("秘书写文件" + message);
        laoBan.xwj(message);
    }
}
