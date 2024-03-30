package com.google.android.gms.tasks;

import X.AnonymousClass001;
import java.util.concurrent.Executor;

public final class zzd implements zzq {
    public final Executor zza;
    public final Continuation zzb;
    public final zzw zzc;

    public zzd(Executor executor, Continuation continuation, zzw zzw) {
        this.zza = executor;
        this.zzb = continuation;
        this.zzc = zzw;
    }

    public final void zzd(Task task) {
        this.zza.execute(new zzc(this, task));
    }

    public final void zzc() {
        throw AnonymousClass001.A0D();
    }
}
