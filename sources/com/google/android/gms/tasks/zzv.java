package com.google.android.gms.tasks;

import X.AnonymousClass001;
import X.C17270r0;
import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.List;

public final class zzv extends LifecycleCallback {
    public final List zza = AnonymousClass001.A0I();

    public final void onStop() {
        synchronized (this.zza) {
            for (WeakReference weakReference : this.zza) {
                zzq zzq = (zzq) weakReference.get();
                if (zzq != null) {
                    zzq.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final void zzb(zzq zzq) {
        synchronized (this.zza) {
            this.zza.add(AnonymousClass001.A0F(zzq));
        }
    }

    public zzv(C17270r0 r3) {
        super(r3);
        this.mLifecycleFragment.B0J(this, "TaskOnStopCallback");
    }

    public static zzv zza(Activity activity) {
        C17270r0 fragment = LifecycleCallback.getFragment(activity);
        zzv zzv = (zzv) fragment.B9H(zzv.class, "TaskOnStopCallback");
        if (zzv == null) {
            return new zzv(fragment);
        }
        return zzv;
    }
}
