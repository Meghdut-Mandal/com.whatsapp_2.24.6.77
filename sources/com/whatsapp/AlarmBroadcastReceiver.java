package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass0DY;
import X.C36351kA;
import X.C90894b3;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;

public class AlarmBroadcastReceiver extends C90894b3 {
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Class<AlarmService> cls = AlarmService.class;
        Intent intent2 = new Intent(intent).setClass(context, cls);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AlarmBroadcastReceiver dispatching to AlarmService; intent=");
        A0u.append(intent);
        A0u.append("; elapsedRealtime=");
        C36351kA.A1S(A0u, SystemClock.elapsedRealtime());
        try {
            AnonymousClass0DY.A00(context, intent2, cls, 3);
        } catch (IllegalArgumentException e) {
            Log.e("AlarmService/start-failed-with-exception", e);
        }
    }
}
