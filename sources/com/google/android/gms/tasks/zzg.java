package com.google.android.gms.tasks;

public final class zzg implements Runnable {
    public final /* synthetic */ zzh zza;

    public zzg(zzh zzh) {
        this.zza = zzh;
    }

    public final void run() {
        synchronized (this.zza.zzb) {
            OnCanceledListener onCanceledListener = this.zza.zzc;
            if (onCanceledListener != null) {
                onCanceledListener.onCanceled();
            }
        }
    }
}
