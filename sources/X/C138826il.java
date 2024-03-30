package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.6il  reason: invalid class name and case insensitive filesystem */
public class C138826il implements AnonymousClass7e8, B0S {
    public static final String A0A = AnonymousClass6VD.A01("SystemFgDispatcher");
    public AnonymousClass6VR A00;
    public C158947iV A01;
    public AnonymousClass69L A02;
    public Context A03;
    public final C158937iU A04;
    public final AnonymousClass7eB A05;
    public final Object A06 = C36441kJ.A11();
    public final Map A07;
    public final Map A08;
    public final Set A09;

    public void A00() {
        this.A01 = null;
        synchronized (this.A06) {
            this.A04.reset();
        }
        this.A00.A03.A03(this);
    }

    public void BR2(List list) {
    }

    public void BX7(AnonymousClass69L r8, boolean z) {
        Map.Entry A11;
        synchronized (this.A06) {
            AnonymousClass6QA r0 = (AnonymousClass6QA) this.A08.remove(r8);
            if (r0 != null) {
                Set set = this.A09;
                if (set.remove(r0)) {
                    this.A04.BoB(set);
                }
            }
        }
        Map map = this.A07;
        C128076At r6 = (C128076At) map.remove(r8);
        if (r8.equals(this.A02) && map.size() > 0) {
            Iterator A0y = AnonymousClass000.A0y(map);
            do {
                A11 = AnonymousClass000.A11(A0y);
            } while (A0y.hasNext());
            this.A02 = (AnonymousClass69L) A11.getKey();
            if (this.A01 != null) {
                C128076At r02 = (C128076At) A11.getValue();
                C158947iV r2 = this.A01;
                int i = r02.A01;
                r2.BuV(i, r02.A02, r02.A00);
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.A01;
                systemForegroundService.A02.post(new C81283wl((Object) systemForegroundService, i, 0));
            }
        }
        C158947iV r5 = this.A01;
        if (r6 != null && r5 != null) {
            AnonymousClass6VD A002 = AnonymousClass6VD.A00();
            String str = A0A;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Removing Notification (id: ");
            int i2 = r6.A01;
            A0u.append(i2);
            A0u.append(", workSpecId: ");
            A0u.append(r8);
            A0u.append(", notificationType: ");
            A002.A04(str, C36381kD.A10(A0u, r6.A00));
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) r5;
            systemForegroundService2.A02.post(new C81283wl((Object) systemForegroundService2, i2, 0));
        }
    }

    public C138826il(Context context) {
        this.A03 = context;
        AnonymousClass6VR A002 = AnonymousClass6VR.A00(context);
        this.A00 = A002;
        this.A05 = A002.A06;
        this.A02 = null;
        this.A07 = C36431kI.A1G();
        this.A09 = C36441kJ.A16();
        this.A08 = AnonymousClass001.A0J();
        this.A04 = new C208209xr(this, A002.A09);
        this.A00.A03.A02(this);
    }

    public void A01(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            AnonymousClass6VD.A00();
            Log.i(A0A, AnonymousClass000.A0l(intent, "Started foreground service ", AnonymousClass000.A0u()));
            this.A05.B74(new AnonymousClass751(1, intent.getStringExtra("KEY_WORKSPEC_ID"), this));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                AnonymousClass6VD.A00();
                Log.i(A0A, AnonymousClass000.A0l(intent, "Stopping foreground work for ", AnonymousClass000.A0u()));
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    AnonymousClass6VR r2 = this.A00;
                    r2.A06.B74(new C97454pi(r2, UUID.fromString(stringExtra)));
                    return;
                }
                return;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                AnonymousClass6VD.A00();
                Log.i(A0A, "Stopping foreground service");
                C158947iV r0 = this.A01;
                if (r0 != null) {
                    r0.stop();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        AnonymousClass69L r22 = new AnonymousClass69L(stringExtra2, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AnonymousClass6VD A002 = AnonymousClass6VD.A00();
        String str = A0A;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Notifying with (id:");
        A0u.append(intExtra);
        A0u.append(", workSpecId: ");
        A0u.append(stringExtra2);
        A0u.append(", notificationType :");
        A0u.append(intExtra2);
        AnonymousClass6VD.A03(A002, ")", str, A0u);
        if (notification != null && this.A01 != null) {
            C128076At r02 = new C128076At(intExtra, notification, intExtra2);
            Map map = this.A07;
            map.put(r22, r02);
            if (this.A02 == null) {
                this.A02 = r22;
                this.A01.BuV(intExtra, notification, intExtra2);
                return;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.A01;
            systemForegroundService.A02.post(new C81333wq(systemForegroundService, intExtra, 5, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator A0y = AnonymousClass000.A0y(map);
                while (A0y.hasNext()) {
                    i |= ((C128076At) C36351kA.A0u(A0y)).A00;
                }
                C128076At r03 = (C128076At) map.get(this.A02);
                if (r03 != null) {
                    this.A01.BuV(r03.A01, r03.A02, i);
                }
            }
        }
    }

    public void BR3(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass6QA r5 = (AnonymousClass6QA) it.next();
                String str = r5.A0J;
                AnonymousClass6VD A002 = AnonymousClass6VD.A00();
                String str2 = A0A;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Constraints unmet for WorkSpec ");
                AnonymousClass6VD.A03(A002, str, str2, A0u);
                AnonymousClass6VR r4 = this.A00;
                r4.A06.B74(new AnonymousClass752(new C114465hI(C109445Xp.A00(r5)), r4, 1, true));
            }
        }
    }
}
