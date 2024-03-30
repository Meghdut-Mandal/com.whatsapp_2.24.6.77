package com.facebook.common.time;

import X.C159017ie;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class RealtimeSinceBootClock implements C159017ie {
    public static final RealtimeSinceBootClock A00 = new RealtimeSinceBootClock();

    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
