package com.google.android.recaptcha.internal;

import X.C17990sP;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzb;

public abstract class zzj {
    public static final Task zza(C17990sP r2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new zzb());
        r2.BL4(new zzi(taskCompletionSource, r2));
        return taskCompletionSource.zza;
    }
}
