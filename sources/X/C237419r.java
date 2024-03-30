package X;

/* renamed from: X.19r  reason: invalid class name and case insensitive filesystem */
public class C237419r {
    public final C20000wr A00 = new C20000wr();
    public final C20000wr A01 = new C20000wr();
    public volatile boolean A02 = false;

    public static boolean A00(C20000wr r3, boolean z) {
        boolean z2;
        synchronized (r3) {
            z2 = false;
            if (r3.A00 > 3) {
                z2 = true;
            }
        }
        if (z2) {
            return false;
        }
        if (z) {
            r3.A01();
            return true;
        }
        r3.A02();
        return true;
    }

    public static boolean A01(C237419r r1) {
        if (!r1.A01.A05() || !r1.A00.A05()) {
            return false;
        }
        return true;
    }

    public static boolean A02(C237419r r4) {
        boolean z;
        boolean z2;
        C20000wr r3 = r4.A01;
        synchronized (r3) {
            z = false;
            if (r3.A00 == 5) {
                z = true;
            }
        }
        if (z) {
            C20000wr r32 = r4.A00;
            synchronized (r32) {
                z2 = false;
                if (r32.A00 == 5) {
                    z2 = true;
                }
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A03(C237419r r4) {
        boolean z;
        boolean z2;
        C20000wr r3 = r4.A01;
        synchronized (r3) {
            z = false;
            if (r3.A00 == 4) {
                z = true;
            }
        }
        if (!z) {
            C20000wr r32 = r4.A00;
            synchronized (r32) {
                z2 = false;
                if (r32.A00 == 4) {
                    z2 = true;
                }
            }
            if (z2 || A02(r4)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
