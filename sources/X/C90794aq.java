package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.4aq  reason: invalid class name and case insensitive filesystem */
public class C90794aq extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            AnonymousClass6UZ.A00();
        }
    }
}
