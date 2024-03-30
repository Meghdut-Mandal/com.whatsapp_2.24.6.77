package androidx.work.impl.utils;

import X.AnonymousClass6VD;
import X.AnonymousClass756;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String A00 = AnonymousClass6VD.A01("ForceStopRunnable$Rcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            AnonymousClass6VD A002 = AnonymousClass6VD.A00();
            String str = A00;
            if (A002.A00 <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            AnonymousClass756.A01(context);
        }
    }
}
