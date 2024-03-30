package com.google.android.gms.tasks;

import X.AnonymousClass001;
import java.util.concurrent.Executor;

public final class zze implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzf zzb;

    public zze(zzf zzf, Task task) {
        this.zzb = zzf;
        this.zza = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.zzb.zzb.then(this.zza);
            if (task == null) {
                this.zzb.onFailure(AnonymousClass001.A0A("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.zza;
            task.addOnSuccessListener(executor, (OnSuccessListener) this.zzb);
            task.addOnFailureListener(executor, (OnFailureListener) this.zzb);
            task.addOnCanceledListener(executor, (OnCanceledListener) this.zzb);
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
