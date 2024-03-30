package X;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: X.0h3  reason: invalid class name and case insensitive filesystem */
public final class C11820h3 implements Runnable {
    public final /* synthetic */ LifecycleCallback A00;
    public final /* synthetic */ AnonymousClass0DW A01;
    public final /* synthetic */ String A02;

    public C11820h3(LifecycleCallback lifecycleCallback, AnonymousClass0DW r2, String str) {
        this.A01 = r2;
        this.A00 = lifecycleCallback;
        this.A02 = str;
    }

    public final void run() {
        Bundle bundle;
        AnonymousClass0DW r3 = this.A01;
        if (r3.A00 > 0) {
            LifecycleCallback lifecycleCallback = this.A00;
            Bundle bundle2 = r3.A01;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.A02);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (r3.A00 >= 2) {
            this.A00.onStart();
        }
        if (r3.A00 >= 3) {
            this.A00.onResume();
        }
        if (r3.A00 >= 4) {
            this.A00.onStop();
        }
    }
}
