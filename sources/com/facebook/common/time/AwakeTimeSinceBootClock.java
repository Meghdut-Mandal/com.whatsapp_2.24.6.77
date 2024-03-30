package com.facebook.common.time;

import X.AnonymousClass5YJ;
import X.C17540ra;

public class AwakeTimeSinceBootClock implements C17540ra {
    public static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    public /* synthetic */ long now() {
        return AnonymousClass5YJ.$default$now(this);
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    public long nowNanos() {
        return System.nanoTime();
    }
}
