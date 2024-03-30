package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.6in  reason: invalid class name and case insensitive filesystem */
public class C138846in implements C159907k7 {
    public static final String A01 = AnonymousClass6VD.A01("SystemAlarmScheduler");
    public final Context A00;

    public boolean BJv() {
        return true;
    }

    public void BpL(AnonymousClass6QA... r8) {
        for (AnonymousClass6QA r4 : r8) {
            AnonymousClass6VD A002 = AnonymousClass6VD.A00();
            String str = A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Scheduling work with workSpecId ");
            AnonymousClass6VD.A03(A002, r4.A0J, str, A0u);
            Context context = this.A00;
            AnonymousClass69L A003 = C109445Xp.A00(r4);
            Intent A0H = C36441kJ.A0H(context, SystemAlarmService.class);
            A0H.setAction("ACTION_SCHEDULE_WORK");
            C138806ij.A00(A0H, A003);
            context.startService(A0H);
        }
    }

    public void B2R(String str) {
        Context context = this.A00;
        Intent A0H = C36441kJ.A0H(context, SystemAlarmService.class);
        A0H.setAction("ACTION_STOP_WORK");
        A0H.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(A0H);
    }

    public C138846in(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
