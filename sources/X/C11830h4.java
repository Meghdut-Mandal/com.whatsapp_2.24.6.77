package X;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzd;

/* renamed from: X.0h4  reason: invalid class name and case insensitive filesystem */
public final class C11830h4 implements Runnable {
    public final /* synthetic */ LifecycleCallback A00;
    public final /* synthetic */ zzd A01;
    public final /* synthetic */ String A02;

    public C11830h4(LifecycleCallback lifecycleCallback, zzd zzd, String str) {
        this.A01 = zzd;
        this.A00 = lifecycleCallback;
        this.A02 = str;
    }

    public final void run() {
        Bundle bundle;
        zzd zzd = this.A01;
        if (zzd.A00 > 0) {
            LifecycleCallback lifecycleCallback = this.A00;
            Bundle bundle2 = zzd.A01;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.A02);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (zzd.A00 >= 2) {
            this.A00.onStart();
        }
        if (zzd.A00 >= 3) {
            this.A00.onResume();
        }
        if (zzd.A00 >= 4) {
            this.A00.onStop();
        }
    }
}
