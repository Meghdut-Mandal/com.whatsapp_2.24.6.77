package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2tt  reason: invalid class name and case insensitive filesystem */
public abstract class C54992tt {
    public static void A00(C21010yW r5, C18950u5 r6, String str, AtomicBoolean atomicBoolean, long j) {
        if (atomicBoolean.compareAndSet(false, true)) {
            AnonymousClass135 r1 = new AnonymousClass135();
            r1.A00 = Long.valueOf(SystemClock.elapsedRealtime() - j);
            r1.A02 = str;
            r1.A01 = null;
            if (r6 == null) {
                r5.Bly(r1);
            } else {
                r5.Blx(r1, r6);
            }
        } else {
            C18740tg.A0D(false, AnonymousClass000.A0q(") already stopped", C36331k8.A0k("PerfTimer(", str)));
        }
    }
}
