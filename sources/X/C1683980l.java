package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: X.80l  reason: invalid class name and case insensitive filesystem */
public abstract class C1683980l extends AnonymousClass9YC {
    public final BroadcastReceiver A00 = new C23131B6m(this, 3);

    public IntentFilter A08() {
        IntentFilter intentFilter;
        String str;
        if (this instanceof C1683780j) {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
            str = "android.intent.action.DEVICE_STORAGE_LOW";
        } else if (this instanceof C1683880k) {
            return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        } else {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_OKAY");
            str = "android.intent.action.BATTERY_LOW";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    public C1683980l(Context context, AnonymousClass7eB r4) {
        super(context, r4);
    }
}
