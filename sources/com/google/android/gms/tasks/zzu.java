package com.google.android.gms.tasks;

import X.AnonymousClass0E6;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class zzu implements Executor {
    public final Handler zza = new AnonymousClass0E6(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
