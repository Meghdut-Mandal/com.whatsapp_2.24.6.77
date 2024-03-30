package androidx.work.impl.background.systemalarm;

import X.AnonymousClass000;
import X.AnonymousClass6VD;
import X.AnonymousClass6VR;
import X.C1503474x;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String A00 = AnonymousClass6VD.A01("ConstrntProxyUpdtRecvr");

    public void onReceive(Context context, Intent intent) {
        String str;
        Intent intent2 = intent;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            AnonymousClass6VD A002 = AnonymousClass6VD.A00();
            String str2 = A00;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Ignoring unknown action ");
            AnonymousClass6VD.A03(A002, str, str2, A0u);
            return;
        }
        AnonymousClass6VR.A00(context).A06.B74(new C1503474x((Object) intent2, (Object) this, (Object) context, (Object) goAsync(), 0));
    }
}
