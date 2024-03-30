package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;

/* renamed from: X.80h  reason: invalid class name and case insensitive filesystem */
public final class C1683580h extends C1683980l {
    public /* bridge */ /* synthetic */ Object A05() {
        boolean z;
        Intent registerReceiver = this.A01.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            AnonymousClass6VD.A00();
            Log.e(AnonymousClass98I.A00, "getInitialState - null intent received");
        } else {
            z = true;
            if (Build.VERSION.SDK_INT >= 23) {
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public IntentFilter A08() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    public C1683580h(Context context, AnonymousClass7eB r2) {
        super(context, r2);
    }
}
