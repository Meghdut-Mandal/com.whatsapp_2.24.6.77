package com.google.android.gms.tasks;

import X.AnonymousClass001;
import java.util.concurrent.Executor;

public final class zzp implements zzq, OnCanceledListener, OnFailureListener, OnSuccessListener {
    public final Executor zza;
    public final SuccessContinuation zzb;
    public final zzw zzc;

    public zzp(Executor executor, SuccessContinuation successContinuation, zzw zzw) {
        this.zza = executor;
        this.zzb = successContinuation;
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
        this.zza.execute(new zzo(this, task));
    }

    public final void zzc() {
        throw AnonymousClass001.A0D();
    }
}
