package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: X.5Vr  reason: invalid class name and case insensitive filesystem */
public abstract class C108965Vr {
    public static void A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter) {
        context.registerReceiver(broadcastReceiver, intentFilter, 2);
    }
}
