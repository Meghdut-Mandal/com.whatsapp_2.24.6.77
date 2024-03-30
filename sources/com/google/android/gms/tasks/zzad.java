package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class zzad implements zzae {
    public final CountDownLatch zza = new CountDownLatch(1);

    public final void onCanceled() {
        this.zza.countDown();
    }

    public final void onFailure(Exception exc) {
        this.zza.countDown();
    }

    public final void onSuccess(Object obj) {
        this.zza.countDown();
    }

    public final void zza() {
        this.zza.await();
    }

    public final boolean zzb(long j, TimeUnit timeUnit) {
        return this.zza.await(j, timeUnit);
    }

    public /* synthetic */ zzad(zzac zzac) {
    }

    public zzad() {
    }
}
