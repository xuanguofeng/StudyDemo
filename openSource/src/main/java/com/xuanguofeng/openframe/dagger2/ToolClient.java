package com.xuanguofeng.openframe.dagger2;

import javax.inject.Inject;

public class ToolClient {

    @Inject
    Tool mTool;

    public ToolClient() {
        DaggerToolCommponent.builder()
                .toolModule(new ToolModule())
                .build()
                .inject(this);
    }

    public void userTool() {
        mTool.use();
    }

    public String testTool() {
        return "测试成功!";
    }
}
