package com.google.android.gms.tasks;

import X.AnonymousClass006;

public final class zzk implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzl zzb;

    public zzk(zzl zzl, Task task) {
        this.zzb = zzl;
        this.zza = task;
    }

    public final void run() {
        synchronized (this.zzb.zzb) {
            OnFailureListener onFailureListener = this.zzb.zzc;
            if (onFailureListener != null) {
                Exception exception = this.zza.getException();
                AnonymousClass006.A01(exception);
                onFailureListener.onFailure(exception);
            }
        }
    }
}
