package X;

/* renamed from: X.9jr  reason: invalid class name and case insensitive filesystem */
public class C201549jr {
    public final AnonymousClass9Y1 A00;
    public final C21010yW A01;
    public final AnonymousClass1KU A02;
    public final C19770wU A03;
    public final C33191es A04;

    public void A05(Integer num, Integer num2, String str, int i, int i2, boolean z) {
        Integer num3;
        Integer num4;
        int i3 = i2;
        if (i2 == 0) {
            num3 = A00(num2);
        } else {
            num3 = null;
        }
        int i4 = 1;
        if (i3 == 1) {
            num4 = A00(num2);
        } else {
            num4 = null;
            if (i2 == 0) {
                i4 = 0;
            }
        }
        this.A03.Boy(new AW5(this, (Integer) null, num3, num4, Integer.valueOf(i4), num, str, i, true, z));
    }

    public void A06(Integer num, Integer num2, String str, int i, boolean z, boolean z2) {
        this.A03.Boy(new AW5(this, num, (Integer) null, (Integer) null, (Integer) null, num2, str, i, z, z2));
    }

    public static Integer A00(Integer num) {
        int intValue;
        int i;
        if (num == null || (intValue = num.intValue()) < 0) {
            return null;
        }
        int i2 = 1;
        if (intValue != 0) {
            if (intValue == 1) {
                i = 2;
            } else {
                i2 = 10;
                if (intValue <= 10) {
                    i = 3;
                } else if (intValue <= 50) {
                    i = 4;
                } else if (intValue <= 100) {
                    i = 5;
                } else if (intValue <= 500) {
                    i = 6;
                } else if (intValue <= 1000) {
                    i = 7;
                } else if (intValue <= 10000) {
                    i = 8;
                } else if (intValue <= 100000) {
                    i = 9;
                } else if (intValue > 1000000) {
                    i = 11;
                }
            }
            return Integer.valueOf(i);
        }
        return Integer.valueOf(i2);
    }

    private void A01(C206949uI r13, int i) {
        int i2;
        Integer valueOf;
        if (r13 != null) {
            C33191es r1 = this.A04;
            int i3 = r13.A02;
            Double d = r13.A03;
            String str = r13.A08;
            String str2 = r13.A0A;
            String str3 = r13.A0B;
            String str4 = r13.A09;
            String str5 = r13.A07;
            String str6 = r13.A06;
            switch (i) {
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 11;
                    break;
                case 5:
                    i2 = 13;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 5;
                    break;
                case 8:
                    i2 = 8;
                    break;
                case 9:
                    i2 = 12;
                    break;
                case 10:
                    i2 = 7;
                    break;
                case 12:
                    i2 = 20;
                    break;
                case 13:
                    i2 = 22;
                    break;
                case 15:
                case 17:
                    i2 = 21;
                    break;
                case 18:
                    i2 = 17;
                    break;
                case 20:
                    i2 = 15;
                    break;
                case 21:
                    i2 = 16;
                    break;
                case 23:
                    i2 = 14;
                    break;
                case 24:
                    i2 = 19;
                    break;
                case 25:
                    i2 = 18;
                    break;
                default:
                    valueOf = null;
                    break;
            }
            valueOf = Integer.valueOf(i2);
            r1.A01(d, valueOf, str, str2, str3, str4, str5, str6, i3, r13.A01);
        }
    }

    public void A02(C206949uI r3, int i) {
        if (r3 != null) {
            C176388c2 r1 = new C176388c2();
            r1.A03 = r3.A05;
            if (i == 0) {
                r1.A04 = r3.A0C;
            }
            r1.A01 = r3.A04;
            r1.A02 = Integer.valueOf(i);
            this.A01.Bly(r1);
        }
        A01(r3, i);
    }

    public void A03(C206949uI r3, int i) {
        if (r3 != null) {
            A02(r3, i);
            return;
        }
        C176388c2 r1 = new C176388c2();
        r1.A02 = Integer.valueOf(i);
        this.A01.Bly(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0.intValue() != 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C206949uI r6, int r7, boolean r8) {
        /*
            r5 = this;
            X.8c2 r4 = new X.8c2
            r4.<init>()
            if (r6 == 0) goto L_0x0019
            java.lang.String r0 = r6.A05
            r4.A03 = r0
            java.lang.String r0 = r6.A0C
            r4.A04 = r0
            java.lang.Integer r0 = r6.A04
            r4.A01 = r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x004a
        L_0x0019:
            r0 = 17
            if (r7 == r0) goto L_0x0021
            r0 = 15
            if (r7 != r0) goto L_0x004a
        L_0x0021:
            X.1es r0 = r5.A04
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x002f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r2 = r3.next()
            X.6pA r2 = (X.C142616pA) r2
            r0 = 5
            r2.A00 = r0
            X.6pD r1 = r2.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.C142616pA.A00(r2)
            goto L_0x002f
        L_0x004a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r4.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r4.A02 = r0
            X.0yW r0 = r5.A01
            r0.Bly(r4)
            r5.A01(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201549jr.A04(X.9uI, int, boolean):void");
    }

    public C201549jr(AnonymousClass9Y1 r1, C21010yW r2, AnonymousClass1KU r3, C33191es r4, C19770wU r5) {
        this.A03 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = r4;
    }
}
