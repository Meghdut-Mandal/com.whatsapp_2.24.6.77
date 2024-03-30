package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.4b3  reason: invalid class name and case insensitive filesystem */
public abstract class C90894b3 extends BroadcastReceiver {
    public final Object A00 = C36441kJ.A11();
    public volatile boolean A01 = false;

    public void onReceive(Context context, Intent intent) {
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
