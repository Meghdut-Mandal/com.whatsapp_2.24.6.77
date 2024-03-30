package com.google.android.gms.tasks;

public final class zzi implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzj zzb;

    public zzi(zzj zzj, Task task) {
        this.zzb = zzj;
        this.zza = task;
    }

    public final void run() {
        synchronized (this.zzb.zzb) {
            OnCompleteListener onCompleteListener = this.zzb.zzc;
            if (onCompleteListener != null) {
                onCompleteListener.onComplete(this.zza);
            }
        }
    }
}
