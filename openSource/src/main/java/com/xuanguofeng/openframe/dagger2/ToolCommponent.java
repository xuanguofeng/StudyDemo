package com.xuanguofeng.openframe.dagger2;

import dagger.Component;

@Component(modules = ToolModule.class)
public interface ToolCommponent {
    void inject(ToolClient client);
}
