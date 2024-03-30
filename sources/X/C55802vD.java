package X;

/* renamed from: X.2vD  reason: invalid class name and case insensitive filesystem */
public abstract class C55802vD {
    public static final int A00(AnonymousClass1DW r4, AnonymousClass3T1 r5, AnonymousClass1AW r6, AnonymousClass1EO r7) {
        C23044B1p A00;
        C200259gz A01;
        AnonymousClass3T1 A0S;
        AnonymousClass00C.A0D(r5, 0);
        int i = 1;
        C36321k7.A16(r4, r6, r7, 1);
        if (r5 instanceof C180868mY) {
            return 34;
        }
        if (r5 instanceof AnonymousClass2bS) {
            return 37;
        }
        if (r5 instanceof C180858mX) {
            return 38;
        }
        if (r5 instanceof AnonymousClass5J2) {
            return 54;
        }
        if (r5 instanceof C46752bc) {
            if (((C46752bc) r5).A01 == 1) {
                return 40;
            }
            return 41;
        } else if (r5 instanceof AnonymousClass2c9) {
            return 51;
        } else {
            if ((r5 instanceof AnonymousClass5JA) || (r5 instanceof C46742bb)) {
                return 52;
            }
            if (r5 instanceof AnonymousClass2bT) {
                return 58;
            }
            if (r5 instanceof C46762bd) {
                return 59;
            }
            if (C54322sl.A00(r5)) {
                return 30;
            }
            if (r5.A1R(8)) {
                return 27;
            }
            if (!(r5 instanceof AnonymousClass2bV) || (A0S = r5.A0S()) == null || A0S.A1I != 54) {
                if ((r5 instanceof C23043B1o) && (A01 = r6.A01((C23043B1o) r5)) != null) {
                    return A01.A03();
                }
                if ((r5 instanceof AnonymousClass2cT) && (A00 = r7.A00((AnonymousClass2cT) r5)) != null) {
                    return A00.BDg();
                }
                i = AnonymousClass3T1.A04(r5);
                String A0b = r5.A0b();
                if (i == 9 && r5.A1F() && A0b != null) {
                    AnonymousClass1DU r1 = r4.A02;
                    if (r4.A0G(r1.A03(A0b))) {
                        return 22;
                    }
                    if (r4.A0H(r1.A03(A0b))) {
                        return 23;
                    }
                }
            }
            return i;
        }
    }
}
