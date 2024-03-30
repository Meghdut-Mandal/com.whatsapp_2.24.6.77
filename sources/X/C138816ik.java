package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.6ik  reason: invalid class name and case insensitive filesystem */
public class C138816ik implements AnonymousClass7e8 {
    public static final String A0A = AnonymousClass6VD.A01("SystemAlarmDispatcher");
    public Intent A00 = null;
    public AnonymousClass6EO A01;
    public C157117br A02;
    public final Context A03;
    public final C138836im A04;
    public final AnonymousClass6VR A05;
    public final C138806ij A06;
    public final AnonymousClass6N1 A07;
    public final AnonymousClass7eB A08;
    public final List A09 = AnonymousClass001.A0I();

    public C138816ik(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A03 = applicationContext;
        AnonymousClass6EO r1 = new AnonymousClass6EO();
        this.A01 = r1;
        this.A06 = new C138806ij(applicationContext, r1);
        AnonymousClass6VR A002 = AnonymousClass6VR.A00(context);
        this.A05 = A002;
        this.A07 = new AnonymousClass6N1(A002.A02.A03);
        C138836im r12 = A002.A03;
        this.A04 = r12;
        this.A08 = A002.A06;
        r12.A02(this);
    }

    public void BX7(AnonymousClass69L r4, boolean z) {
        Executor executor = ((C138956iy) this.A08).A02;
        Intent A0H = C36441kJ.A0H(this.A03, SystemAlarmService.class);
        A0H.setAction("ACTION_EXECUTION_COMPLETED");
        A0H.putExtra("KEY_NEEDS_RESCHEDULE", z);
        C138806ij.A00(A0H, r4);
        C90504aG.A1I(this, A0H, executor, 0);
    }

    public static void A00() {
        if (C90514aH.A11() != Thread.currentThread()) {
            throw AnonymousClass001.A09("Needs to be invoked on the main thread.");
        }
    }

    public static void A01(C138816ik r4) {
        A00();
        PowerManager.WakeLock A002 = AnonymousClass6I2.A00(r4.A03, "ProcessCommand");
        try {
            A002.acquire();
            r4.A05.A06.B74(new AnonymousClass759(r4, 19));
        } finally {
            A002.release();
        }
    }

    public void A02(Intent intent, int i) {
        boolean z;
        AnonymousClass6VD A002 = AnonymousClass6VD.A00();
        String str = A0A;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Adding command ");
        A0u.append(intent);
        C90494aF.A1K(A0u, i);
        AnonymousClass6VD.A03(A002, ")", str, A0u);
        A00();
        String action = intent.getAction();
        boolean z2 = false;
        if (TextUtils.isEmpty(action)) {
            AnonymousClass6VD.A00();
            Log.w(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            A00();
            List list = this.A09;
            synchronized (list) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C90514aH.A1W((Intent) it.next(), "ACTION_CONSTRAINTS_CHANGED")) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        List list2 = this.A09;
        synchronized (list2) {
            if (!list2.isEmpty()) {
                z2 = true;
            }
            list2.add(intent);
            if (!z2) {
                A01(this);
            }
        }
    }
}
