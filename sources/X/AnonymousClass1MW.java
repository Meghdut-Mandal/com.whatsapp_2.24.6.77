package X;

import android.content.BroadcastReceiver;
import android.content.Context;

/* renamed from: X.1MW  reason: invalid class name */
public abstract class AnonymousClass1MW extends BroadcastReceiver {
    public final Object A00 = new Object();
    public volatile boolean A01 = false;

    public void A00(Context context) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    C56042vd.A01(context);
                    this.A01 = true;
                }
            }
        }
    }
}
