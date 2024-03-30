package X;

/* renamed from: X.1YD  reason: invalid class name */
public final class AnonymousClass1YD extends C19590wC {
    public final void A03(String str, int i) {
        AnonymousClass00C.A0D(str, 0);
        for (AnonymousClass31M r4 : getObservers()) {
            C70803fk r3 = r4.A00;
            if (C70803fk.A1e(r3)) {
                if (r3.A3l == null) {
                    C70803fk.A0q(r3);
                    r3.A1V.post(new C80373vI(r4, str, i, 4));
                } else {
                    C70803fk.A1K(r3, str, i, false);
                }
            }
            AnonymousClass2MC r0 = r3.A3s;
            if (r0 != null && r0.A02()) {
                r3.A3s.A01(false);
            }
            AnonymousClass2M8 r02 = r3.A3r;
            if (r02 != null) {
                r02.A0M(str);
            }
        }
    }

    public final void A00() {
        for (AnonymousClass31M r0 : getObservers()) {
            C70803fk r1 = r0.A00;
            ((C130686Ma) r1.A5q.get()).A00(r1.A2l.getActivityNullable(), C70803fk.A0I(r1), 12);
        }
    }

    public final void A01(String str) {
        for (AnonymousClass31M r0 : getObservers()) {
            C70803fk r1 = r0.A00;
            if (C70803fk.A1e(r1)) {
                if (r1.A3l == null) {
                    C70803fk.A0q(r1);
                }
                r1.A3c.A03(C54212sa.A00(r1.A45), 37, 5, 31, true);
                r1.A3l.A0I(str);
            }
        }
    }

    public final void A02(String str, int i) {
        AnonymousClass3H8 r4;
        AnonymousClass5HA r0;
        for (AnonymousClass31M r42 : getObservers()) {
            C70803fk r3 = r42.A00;
            if (C70803fk.A1e(r3)) {
                if (r3.A3l == null) {
                    C70803fk.A0q(r3);
                    r3.A1V.post(new C80373vI(r42, str, i, 3));
                } else {
                    C70803fk.A1K(r3, str, i, true);
                }
            }
            AnonymousClass2MC r02 = r3.A3s;
            if (r02 != null && r02.A02()) {
                r3.A3s.A01(false);
            }
            AnonymousClass2M8 r5 = r3.A3r;
            if (!(r5 == null || (r4 = r5.A0A) == null)) {
                if (!r5.isShowing()) {
                    r5.A0I(3, r5.A0N, r5.A0E);
                    r5.A0E();
                }
                AnonymousClass2M8.A05(r5, 3);
                if (!(str == null || (r0 = r4.A04) == null)) {
                    r0.A08(str);
                }
            }
        }
    }
}
