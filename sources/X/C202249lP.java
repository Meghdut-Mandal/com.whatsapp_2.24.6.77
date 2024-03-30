package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.9lP  reason: invalid class name and case insensitive filesystem */
public final class C202249lP {
    public final int A00;
    public final AnonymousClass9WT A01;
    public final CopyOnWriteArrayList A02;

    public void A05(C207099uY r11, int i, long j) {
        A0A(new AnonymousClass9NR(r11, (Object) null, 1, i, 0, A00(j), -9223372036854775807L));
    }

    public void A06(C191069Bl r9, AnonymousClass9NR r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass9GI r0 = (AnonymousClass9GI) it.next();
            A01(r0.A00, new C1503474x((Object) r9, (Object) this, (Object) r0.A01, (Object) r10, 3));
        }
    }

    public void A07(C191069Bl r9, AnonymousClass9NR r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass9GI r0 = (AnonymousClass9GI) it.next();
            A01(r0.A00, new C1503474x((Object) r9, (Object) this, (Object) r0.A01, (Object) r10, 2));
        }
    }

    public void A08(C191069Bl r11, AnonymousClass9NR r12, IOException iOException, boolean z) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass9GI r0 = (AnonymousClass9GI) it.next();
            A01(r0.A00, new C80743vt(this, r0.A01, r11, r12, iOException, 0, z));
        }
    }

    public void A09(C191069Bl r9, AnonymousClass9NR r10, Object obj) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass9GI r0 = (AnonymousClass9GI) it.next();
            A01(r0.A00, new AnonymousClass753(this, r9, r10, r0.A01, obj));
        }
    }

    public static long A00(long j) {
        UUID uuid = AnonymousClass9B7.A04;
        long A05 = Util.A05(j);
        if (A05 != -9223372036854775807L) {
            return 0 + A05;
        }
        return -9223372036854775807L;
    }

    public void A02() {
        C200319h9.A02(AnonymousClass000.A1V(this.A01));
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass9GI r0 = (AnonymousClass9GI) it.next();
            A01(r0.A00, new AnonymousClass75C((Object) this, (Object) r0.A01, 32));
        }
    }

    public void A03() {
        C200319h9.A02(AnonymousClass000.A1V(this.A01));
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass9GI r0 = (AnonymousClass9GI) it.next();
            A01(r0.A00, new AnonymousClass75C((Object) this, (Object) r0.A01, 33));
        }
    }

    public void A04() {
        C200319h9.A02(AnonymousClass000.A1V(this.A01));
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass9GI r0 = (AnonymousClass9GI) it.next();
            A01(r0.A00, new AnonymousClass75C((Object) this, (Object) r0.A01, 34));
        }
    }

    public void A0A(AnonymousClass9NR r6) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass9GI r0 = (AnonymousClass9GI) it.next();
            A01(r0.A00, new C1503374w(this, r0.A01, r6, 8));
        }
    }

    public C202249lP(AnonymousClass9WT r1, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = r1;
    }

    public static void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public C202249lP() {
        this((AnonymousClass9WT) null, new CopyOnWriteArrayList(), 0);
    }
}
