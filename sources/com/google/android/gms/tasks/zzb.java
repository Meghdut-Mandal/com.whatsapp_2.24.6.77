package com.google.android.gms.tasks;

public final class zzb extends CancellationToken {
    public final zzw zza = new zzw();

    public final boolean isCancellationRequested() {
        return this.zza.isComplete();
    }

    public final CancellationToken onCanceledRequested(OnTokenCanceledListener onTokenCanceledListener) {
        this.zza.addOnSuccessListener(TaskExecutors.MAIN_THREAD, (OnSuccessListener) new zza(this, onTokenCanceledListener));
        return this;
    }

    public final void zza() {
        this.zza.zze((Object) null);
    }
}
