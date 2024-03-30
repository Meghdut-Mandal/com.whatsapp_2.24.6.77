package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.4b4  reason: invalid class name and case insensitive filesystem */
public abstract class C90904b4 extends BroadcastReceiver {
    public static final String A00 = AnonymousClass6VD.A01("ConstraintProxy");

    public void onReceive(Context context, Intent intent) {
        AnonymousClass6VD.A02(AnonymousClass6VD.A00(), intent, "onReceive : ", A00, AnonymousClass000.A0u());
        Intent A0H = C36441kJ.A0H(context, SystemAlarmService.class);
        A0H.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(A0H);
    }
}
