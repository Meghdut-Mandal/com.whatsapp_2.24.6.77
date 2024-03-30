package com.google.android.gms.tasks;

import X.AnonymousClass001;
import java.util.concurrent.Executor;

public final class zzf implements zzq, OnCanceledListener, OnFailureListener, OnSuccessListener {
    public final Executor zza;
    public final Continuation zzb;
    public final zzw zzc;

    public zzf(Executor executor, Continuation continuation, zzw zzw) {
        this.zza = executor;
        this.zzb = continuation;
        this.zzc = zzw;
    }

    public final void onCanceled() {
        this.zzc.zzc();
    }

    public final void onFailure(Exception exc) {
        this.zzc.zza(exc);
    }

    public final void onSuccess(Object obj) {
        this.zzc.zzb(obj);
    }

    public final void zzd(Task task) {
        this.zza.execute(new zze(this, task));
    }

    public final void zzc() {
        throw AnonymousClass001.A0D();
    }
}
