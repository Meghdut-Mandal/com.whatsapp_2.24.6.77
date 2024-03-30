package X;

/* renamed from: X.3Td  reason: invalid class name and case insensitive filesystem */
public abstract class C65703Td {
    public static final boolean A00(int i) {
        return i == 3 || i == 28 || i == 62 || i == 43 || i == 81;
    }

    public static final boolean A02(C20810yC r5, C46932bu r6) {
        C36331k8.A1I(r6, r5);
        C65013Qj r3 = r6.A01;
        A01(r5, r6);
        boolean z = r6.A1J.A02;
        A04(r6);
        if (r3 == null || !A01(r5, r6)) {
            return false;
        }
        if ((!z || A04(r6)) && !r3.A0V && r3.A09 == 0) {
            return true;
        }
        return false;
    }

    public static final boolean A03(C47002cZ r5) {
        AnonymousClass00C.A0D(r5, 0);
        C65013Qj r1 = r5.A01;
        if (!A00(r5.A1I) || r1 == null || r5.A1J.A02 || r1.A0V || r1.A0E <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean A04(C46932bu r4) {
        AnonymousClass00C.A0D(r4, 0);
        C65013Qj r3 = r4.A01;
        if (r3 != null && A00(r4.A1I) && r4.A1J.A02 && AnonymousClass000.A1S(r4.A0A & 1, 1) && !r3.A0V && r4.A07 != null) {
            return true;
        }
        return false;
    }

    public static final boolean A01(C20810yC r2, AnonymousClass3T1 r3) {
        C36321k7.A0w(r3, r2);
        if (!(r3 instanceof AnonymousClass2cY) && !(r3 instanceof C181798o3)) {
            return false;
        }
        AnonymousClass2bU r32 = (AnonymousClass2bU) r3;
        AnonymousClass6Q6 A1Y = r32.A1Y();
        if (((A1Y == null || !A1Y.A04()) && !C64933Qa.A04(r32)) || !(!AnonymousClass6YG.A0C(r2.A09(2917)))) {
            return false;
        }
        return true;
    }
}
