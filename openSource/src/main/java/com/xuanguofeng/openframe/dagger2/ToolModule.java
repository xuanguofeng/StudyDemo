package com.xuanguofeng.openframe.dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class ToolModule {

    @Provides
    Tool provideTool() {
        return new Tool();
    }
}
