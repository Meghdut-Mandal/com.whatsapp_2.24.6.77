package com.google.android.gms.tasks;

public final class zzm implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzn zzb;

    public zzm(zzn zzn, Task task) {
        this.zzb = zzn;
        this.zza = task;
    }

    public final void run() {
        synchronized (this.zzb.zzb) {
            OnSuccessListener onSuccessListener = this.zzb.zzc;
            if (onSuccessListener != null) {
                onSuccessListener.onSuccess(this.zza.getResult());
            }
        }
    }
}
