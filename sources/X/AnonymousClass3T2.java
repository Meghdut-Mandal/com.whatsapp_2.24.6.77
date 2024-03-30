package X;

/* renamed from: X.3T2  reason: invalid class name */
public abstract class AnonymousClass3T2 {
    public static boolean A00(C20810yC r2, AnonymousClass1E2 r3, AnonymousClass3T1 r4) {
        C65013Qj r0;
        if (((r4 instanceof C181798o3) || (r4 instanceof C181788o2)) && (r0 = ((AnonymousClass2bU) r4).A01) != null && r3.A02(r0) && r2.A0E(3934)) {
            return true;
        }
        return false;
    }

    public static boolean A01(C20810yC r3, AnonymousClass3T1 r4) {
        if (!(r4 instanceof C46882bp)) {
            return false;
        }
        AnonymousClass2bU r1 = (AnonymousClass2bU) r4;
        if (!(r4.A1J.A00 instanceof C177528dw) || !r3.A0E(252)) {
            return false;
        }
        AnonymousClass6Q6 A1Y = r1.A1Y();
        C18740tg.A06(A1Y);
        if (A1Y.A04()) {
            return true;
        }
        return false;
    }

    public static boolean A02(C20810yC r2, AnonymousClass3T1 r3) {
        int i;
        if (r3 instanceof C46972by) {
            i = 253;
        } else if ((!(r3 instanceof C46882bp) && !(r3 instanceof C47002cZ)) || !(r3.A1J.A00 instanceof C177528dw)) {
            return true;
        } else {
            i = 252;
        }
        return !r2.A0E(i);
    }

    public static boolean A03(C20810yC r2, AnonymousClass3T1 r3, boolean z) {
        if (r3 instanceof AnonymousClass2bU) {
            if ((r3 instanceof C46972by) && r2.A0E(247)) {
                return true;
            }
            if (!r2.A0E(246) || (!(r3 instanceof C46932bu) && !(r3 instanceof C46882bp))) {
                return false;
            }
            return z;
        }
        return false;
    }

    public static boolean A04(AnonymousClass3T1 r2) {
        AnonymousClass6Q6 A1Y;
        if (!(r2 instanceof C46882bp) || (A1Y = ((AnonymousClass2bU) r2).A1Y()) == null || !A1Y.A04()) {
            return false;
        }
        return true;
    }
}
