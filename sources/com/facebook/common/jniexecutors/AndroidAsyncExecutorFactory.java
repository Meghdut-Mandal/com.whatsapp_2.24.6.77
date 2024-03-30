package com.facebook.common.jniexecutors;

import X.AnonymousClass10O;
import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;

public class AndroidAsyncExecutorFactory {
    public static final AndroidAsyncExecutorFactory $redex_init_class = null;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService);

    static {
        AnonymousClass10O.A00("jniexecutors");
    }

    public AndroidAsyncExecutorFactory(ScheduledExecutorService scheduledExecutorService) {
        this.mHybridData = initHybrid(scheduledExecutorService);
    }
}
