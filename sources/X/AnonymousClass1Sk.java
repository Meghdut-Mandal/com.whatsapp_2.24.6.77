package X;

/* renamed from: X.1Sk  reason: invalid class name */
public final class AnonymousClass1Sk {
    public final AnonymousClass1NX A00;
    public final C28391Sm A01;
    public final C28421Sp A02;
    public final C220412q A03;
    public final AnonymousClass17X A04;
    public final C21010yW A05;
    public final C28381Sl A06;

    public AnonymousClass1Sk(AnonymousClass1NX r2, C28391Sm r3, C28421Sp r4, C220412q r5, AnonymousClass17X r6, C21010yW r7, C28381Sl r8) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r4, 6);
        AnonymousClass00C.A0D(r6, 7);
        this.A03 = r5;
        this.A05 = r7;
        this.A00 = r2;
        this.A06 = r8;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
    }

    public static final Integer A00(int i) {
        int i2;
        if (i != 1) {
            if (i == 3) {
                return 4;
            }
            i2 = 5;
            if (i != 4) {
                if (i != 5) {
                    i2 = 6;
                    if (i != 6) {
                        if (i == 9) {
                            return 1;
                        }
                        if (i != 10) {
                            return null;
                        }
                    }
                } else {
                    i2 = 7;
                }
            }
            return Integer.valueOf(i2);
        }
        i2 = 2;
        return Integer.valueOf(i2);
    }

    public static final Integer A01(int i) {
        int i2 = 0;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return null;
                }
            }
        }
        return Integer.valueOf(i2);
    }

    public final void A04() {
        C28421Sp r0 = this.A02;
        A08(r0.A00, (Long) null, r0.A00(), (String) null, 11, 4);
    }

    public final void A08(Integer num, Long l, String str, String str2, int i, int i2) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass2RH r1 = new AnonymousClass2RH();
        r1.A04 = str;
        r1.A01 = Integer.valueOf(i2);
        r1.A02 = num;
        r1.A00 = Integer.valueOf(i);
        r1.A03 = l;
        r1.A05 = str2;
        this.A05.Blv(r1);
    }

    public final void A09(Integer num, String str, int i, int i2) {
        AnonymousClass00C.A0D(str, 0);
        A08(num, (Long) null, str, (String) null, i, i2);
    }

    private final void A02(int i, int i2, long j, int i3) {
        AnonymousClass2RK r1 = new AnonymousClass2RK();
        r1.A05 = (String) this.A00.A00.getValue();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(i2);
        r1.A03 = Integer.valueOf(i3);
        r1.A04 = Long.valueOf(j);
        this.A05.Bly(r1);
    }

    public static final void A03(AnonymousClass1Sk r2, int i, int i2, int i3) {
        AnonymousClass2RK r1 = new AnonymousClass2RK();
        r1.A05 = (String) r2.A00.A00.getValue();
        r1.A00 = Integer.valueOf(i);
        r1.A03 = Integer.valueOf(i3);
        r1.A01 = Integer.valueOf(i2);
        r2.A05.Bly(r1);
    }

    public final void A05(int i, long j, int i2) {
        Integer A002 = A00(i);
        Integer A012 = A01(i2);
        if (A002 != null && A012 != null) {
            A02(11, A002.intValue(), j, A012.intValue());
        }
    }

    public final void A06(int i, long j, int i2) {
        Integer A002 = A00(i);
        Integer A012 = A01(i2);
        if (A002 != null && A012 != null) {
            A02(10, A002.intValue(), j, A012.intValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        if (r1 == 6) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass2bI r6, int r7) {
        /*
            r5 = this;
            java.lang.Integer r0 = A01(r7)
            if (r0 == 0) goto L_0x0010
            r2 = 15
            r1 = 1
            int r0 = r0.intValue()
            A03(r5, r2, r1, r0)
        L_0x0010:
            if (r6 == 0) goto L_0x0023
            X.3Qa r0 = r6.A1J
            if (r0 == 0) goto L_0x0023
            X.11F r2 = r0.A00
            if (r2 == 0) goto L_0x0023
            int r1 = r6.A00
            r0 = 144(0x90, float:2.02E-43)
            if (r1 == r0) goto L_0x002c
            switch(r1) {
                case 122: goto L_0x0024;
                case 123: goto L_0x0026;
                case 124: goto L_0x002c;
                case 125: goto L_0x0028;
                case 126: goto L_0x0028;
                case 127: goto L_0x002a;
                case 128: goto L_0x002e;
                default: goto L_0x0023;
            }
        L_0x0023:
            return
        L_0x0024:
            r0 = 1
            goto L_0x002f
        L_0x0026:
            r0 = 4
            goto L_0x002f
        L_0x0028:
            r0 = 5
            goto L_0x002f
        L_0x002a:
            r0 = 3
            goto L_0x002f
        L_0x002c:
            r0 = 2
            goto L_0x002f
        L_0x002e:
            r0 = 6
        L_0x002f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r4 == 0) goto L_0x0023
            r3 = 2
            r0 = 1
            if (r7 == r0) goto L_0x006b
            if (r7 == r3) goto L_0x006b
        L_0x003b:
            X.12q r1 = r5.A03
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass6SZ.A00(r2)
            int r1 = r1.A05(r0)
            r2 = 3
            r0 = 2
            if (r1 == r0) goto L_0x0051
            if (r1 == r2) goto L_0x0052
            r0 = 6
            r2 = 1
            if (r1 != r0) goto L_0x0052
        L_0x0051:
            r2 = 2
        L_0x0052:
            X.2PQ r1 = new X.2PQ
            r1.<init>()
            r1.A01 = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A00 = r0
            X.0yW r0 = r5.A05
            r0.Bly(r1)
            return
        L_0x006b:
            r3 = 1
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Sk.A07(X.2bI, int):void");
    }
}
