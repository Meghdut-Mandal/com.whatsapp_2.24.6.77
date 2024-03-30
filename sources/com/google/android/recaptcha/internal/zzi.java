package com.google.android.recaptcha.internal;

import X.AnonymousClass00R;
import X.AnonymousClass0AJ;
import X.C006302t;
import X.C17990sP;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public final class zzi extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ TaskCompletionSource zza;
    public final /* synthetic */ C17990sP zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzi(TaskCompletionSource taskCompletionSource, C17990sP r3) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception exc;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable B9x = this.zzb.B9x();
            TaskCompletionSource taskCompletionSource = this.zza;
            if (B9x == null) {
                taskCompletionSource.setResult(this.zzb.B9w());
            } else {
                if (!(B9x instanceof Exception) || (exc = (Exception) B9x) == null) {
                    exc = new RuntimeExecutionException(B9x);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
