package com.google.android.gms.tasks;

import X.AnonymousClass0E6;

public final /* synthetic */ class zzy implements OnCompleteListener {
    public final /* synthetic */ AnonymousClass0E6 zza;
    public final /* synthetic */ TaskCompletionSource zzb;
    public final /* synthetic */ zzb zzc;

    public /* synthetic */ zzy(AnonymousClass0E6 r1, TaskCompletionSource taskCompletionSource, zzb zzb2) {
        this.zza = r1;
        this.zzb = taskCompletionSource;
        this.zzc = zzb2;
    }

    public final void onComplete(Task task) {
        AnonymousClass0E6 r3 = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzb zzb2 = this.zzc;
        r3.removeCallbacksAndMessages((Object) null);
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (((zzw) task).zzd) {
            zzb2.zza();
        } else {
            Exception exception = task.getException();
            exception.getClass();
            taskCompletionSource.trySetException(exception);
        }
    }
}
