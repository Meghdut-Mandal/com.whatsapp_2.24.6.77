package androidx.work.impl.background.systemalarm;

import X.AnonymousClass000;
import X.AnonymousClass6VD;
import X.AnonymousClass6VR;
import X.C36441kJ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String A00 = AnonymousClass6VD.A01("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        AnonymousClass6VD A002 = AnonymousClass6VD.A00();
        String str = A00;
        AnonymousClass6VD.A02(A002, intent, "Received intent ", str, AnonymousClass000.A0u());
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                AnonymousClass6VR A003 = AnonymousClass6VR.A00(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                synchronized (AnonymousClass6VR.A0C) {
                    BroadcastReceiver.PendingResult pendingResult = A003.A00;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    A003.A00 = goAsync;
                    if (A003.A08) {
                        goAsync.finish();
                        A003.A00 = null;
                    }
                }
            } catch (IllegalStateException e) {
                AnonymousClass6VD.A00();
                Log.e(str, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        } else {
            Intent A0H = C36441kJ.A0H(context, SystemAlarmService.class);
            A0H.setAction("ACTION_RESCHEDULE");
            context.startService(A0H);
        }
    }
}
