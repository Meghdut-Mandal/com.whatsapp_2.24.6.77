package com.google.android.gms.tasks;

public final class zzc implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzd zzb;

    public zzc(zzd zzd, Task task) {
        this.zzb = zzd;
        this.zza = task;
    }

    public final void run() {
        if (((zzw) this.zza).zzd) {
            this.zzb.zzc.zzc();
            return;
        }
        try {
            this.zzb.zzc.zzb(this.zzb.zzb.then(this.zza));
        } catch (RuntimeExecutionException e) {
            e = e;
            boolean z = e.getCause() instanceof Exception;
            zzw zzw = this.zzb.zzc;
            if (z) {
                e = (Exception) e.getCause();
            }
            zzw.zza(e);
        } catch (Exception e2) {
            this.zzb.zzc.zza(e2);
        }
    }
}
