package X;

/* renamed from: X.0Bv  reason: invalid class name and case insensitive filesystem */
public class C02770Bv {
    public final C000700i A00 = new C000700i();
    public final AnonymousClass007 A01 = new AnonymousClass007(0);

    public static C06460Tr A00(AnonymousClass0D3 r4, C02770Bv r5, int i) {
        AnonymousClass0D4 r2;
        AnonymousClass007 r52 = r5.A01;
        int A012 = AnonymousClass007.A01(r52, r4, r4.hashCode());
        C06460Tr r3 = null;
        if (A012 >= 0 && (r2 = (AnonymousClass0D4) r52.A06(A012)) != null) {
            int i2 = r2.A00;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                r2.A00 = i3;
                if (i == 4) {
                    r3 = r2.A02;
                } else if (i == 8) {
                    r3 = r2.A01;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    r52.A05(A012);
                    r2.A00 = 0;
                    r2.A02 = null;
                    r2.A01 = null;
                    AnonymousClass0D4.A03.BnO(r2);
                }
            }
        }
        return r3;
    }

    public void A01(C06460Tr r4, AnonymousClass0D3 r5) {
        AnonymousClass007 r2 = this.A01;
        AnonymousClass0D4 r1 = (AnonymousClass0D4) r2.get(r5);
        if (r1 == null) {
            r1 = (AnonymousClass0D4) AnonymousClass0D4.A03.B09();
            if (r1 == null) {
                r1 = new AnonymousClass0D4();
            }
            r2.put(r5, r1);
        }
        r1.A02 = r4;
        r1.A00 |= 4;
    }

    public void A02(C06460Tr r4, AnonymousClass0D3 r5) {
        AnonymousClass007 r2 = this.A01;
        AnonymousClass0D4 r1 = (AnonymousClass0D4) r2.get(r5);
        if (r1 == null) {
            r1 = (AnonymousClass0D4) AnonymousClass0D4.A03.B09();
            if (r1 == null) {
                r1 = new AnonymousClass0D4();
            }
            r2.put(r5, r1);
        }
        r1.A01 = r4;
        r1.A00 |= 8;
    }

    public void A03(AnonymousClass0D3 r4) {
        AnonymousClass007 r2 = this.A01;
        AnonymousClass0D4 r1 = (AnonymousClass0D4) r2.get(r4);
        if (r1 == null) {
            r1 = (AnonymousClass0D4) AnonymousClass0D4.A03.B09();
            if (r1 == null) {
                r1 = new AnonymousClass0D4();
            }
            r2.put(r4, r1);
        }
        r1.A00 |= 1;
    }

    public void A04(AnonymousClass0D3 r3) {
        AnonymousClass0D4 r1 = (AnonymousClass0D4) this.A01.get(r3);
        if (r1 != null) {
            r1.A00 &= -2;
        }
    }

    public void A05(AnonymousClass0D3 r6) {
        C000700i r4 = this.A00;
        int A002 = r4.A00();
        while (true) {
            A002--;
            if (A002 < 0) {
                break;
            } else if (r6 == r4.A04(A002)) {
                Object[] objArr = r4.A03;
                Object obj = objArr[A002];
                Object obj2 = AnonymousClass045.A00;
                if (obj != obj2) {
                    objArr[A002] = obj2;
                    r4.A01 = true;
                }
            }
        }
        AnonymousClass0D4 r1 = (AnonymousClass0D4) this.A01.remove(r6);
        if (r1 != null) {
            r1.A00 = 0;
            r1.A02 = null;
            r1.A01 = null;
            AnonymousClass0D4.A03.BnO(r1);
        }
    }
}
