package X;

import java.util.Arrays;

/* renamed from: X.3MX  reason: invalid class name */
public abstract class AnonymousClass3MX {
    public static boolean A01(C80113ur r4, C80113ur r5) {
        int A00;
        if (r5 == null) {
            return false;
        }
        if (r4 == null) {
            A00 = 1;
        } else {
            A00 = C55052tz.A00(r4.hostStorage, r4.actualActors);
        }
        if (A00 == C55052tz.A00(r5.hostStorage, r5.actualActors)) {
            return false;
        }
        Arrays.toString(Thread.currentThread().getStackTrace());
        return true;
    }

    public static boolean A00(AnonymousClass16D r4, AnonymousClass12O r5, C20810yC r6, C20500xf r7, AnonymousClass11F r8) {
        AnonymousClass141 A08;
        if (!AnonymousClass143.A0G(r8) && !AnonymousClass3M3.A01(r7, r8) && !AnonymousClass3RR.A00(r6, r8) && ((!(r8 instanceof C223313w) || r5.A0A((C223313w) r8) != null) && ((A08 = r4.A08(r8)) == null || (A08.A0F == null && A08.A0G == null)))) {
            if (A08 == null || !A08.A0C()) {
                return r6.A0E(3962);
            }
            AnonymousClass3L0 r0 = A08.A0E;
            if ((r0 == null || !r0.A01()) && r6.A0E(5263)) {
                return true;
            }
        }
        return false;
    }
}
