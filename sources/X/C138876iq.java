package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.6iq  reason: invalid class name and case insensitive filesystem */
public class C138876iq implements B0S, C157167bw {
    public static final String A0C = AnonymousClass6VD.A01("DelayMetCommandHandler");
    public int A00 = 0;
    public PowerManager.WakeLock A01;
    public boolean A02 = false;
    public final int A03;
    public final Context A04;
    public final C114465hI A05;
    public final C138816ik A06;
    public final C208209xr A07;
    public final AnonymousClass69L A08;
    public final Executor A09;
    public final Executor A0A;
    public final Object A0B = C36441kJ.A11();

    public static void A00(C138876iq r6) {
        synchronized (r6.A0B) {
            r6.A07.reset();
            AnonymousClass6N1 r0 = r6.A06.A07;
            AnonymousClass69L r4 = r6.A08;
            r0.A00(r4);
            PowerManager.WakeLock wakeLock = r6.A01;
            if (wakeLock != null && wakeLock.isHeld()) {
                AnonymousClass6VD A002 = AnonymousClass6VD.A00();
                String str = A0C;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Releasing wakelock ");
                A0u.append(r6.A01);
                AnonymousClass6VD.A02(A002, r4, "for WorkSpec ", str, A0u);
                r6.A01.release();
            }
        }
    }

    public void BR3(List list) {
        this.A0A.execute(new AnonymousClass759((Object) this, 18));
    }

    public C138876iq(Context context, C114465hI r5, C138816ik r6, int i) {
        this.A04 = context;
        this.A03 = i;
        this.A06 = r6;
        this.A08 = r5.A00;
        this.A05 = r5;
        AnonymousClass9L0 r2 = r6.A05.A09;
        C138956iy r1 = (C138956iy) r6.A08;
        this.A0A = r1.A01;
        this.A09 = r1.A02;
        this.A07 = new C208209xr(this, r2);
    }

    public void BR2(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C109445Xp.A00((AnonymousClass6QA) it.next()).equals(this.A08)) {
                this.A0A.execute(new AnonymousClass759((Object) this, 17));
                return;
            }
        }
    }
}
