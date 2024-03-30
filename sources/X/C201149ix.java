package X;

/* renamed from: X.9ix  reason: invalid class name and case insensitive filesystem */
public final class C201149ix {
    public final AnonymousClass1IJ A00;
    public final C20810yC A01;
    public final AnonymousClass185 A02;
    public final C21010yW A03;

    public final void A02(C175458aW r7, int i) {
        int i2;
        C195179Su A002;
        C175448aV r2 = (C175448aV) r7;
        AnonymousClass9YF r1 = r2.A02;
        if (72 != i && 73 != i) {
            boolean z = r1.A02;
            if (z) {
                int i3 = r1.A00;
                if (i3 == 0 && !r1.A09) {
                    A00(r2, this, 0);
                    A002 = r1.A00();
                    A002.A0B = true;
                    A01(this, A002.A00(), r7);
                    return;
                } else if (r1.A09 && i3 == 0) {
                    if (this.A01.A0E(4626)) {
                        i2 = 1;
                        A00(r2, this, i2);
                    }
                    return;
                }
            }
            int i4 = r1.A00;
            if (!z) {
                if (i4 == 1) {
                    if (!r1.A06) {
                        A00(r2, this, 2);
                        A002 = r1.A00();
                        A002.A06 = true;
                        A01(this, A002.A00(), r7);
                        return;
                    }
                } else if (i4 != 1) {
                    if (i4 == 2) {
                        if (!r1.A0A) {
                            A00(r2, this, 6);
                            A002 = r1.A00();
                            A002.A0C = true;
                            A01(this, A002.A00(), r7);
                            return;
                        }
                    } else if (i4 != 2) {
                        if (i4 == 3 && !r1.A03) {
                            A00(r2, this, 10);
                            A002 = r1.A00();
                            A002.A03 = true;
                            A01(this, A002.A00(), r7);
                            return;
                        }
                        return;
                    }
                    if (r1.A0A && this.A01.A0E(4626)) {
                        i2 = 7;
                        A00(r2, this, i2);
                    }
                    return;
                }
                if (r1.A06 && this.A01.A0E(4626)) {
                    i2 = 3;
                    A00(r2, this, i2);
                }
                return;
            }
            if (i4 == 1) {
                if (!r1.A0B) {
                    A00(r2, this, 4);
                    A002 = r1.A00();
                    A002.A0D = true;
                    A01(this, A002.A00(), r7);
                    return;
                }
            } else if (i4 != 1) {
                if (i4 == 2) {
                    if (!r1.A0C) {
                        A00(r2, this, 8);
                        A002 = r1.A00();
                        A002.A0E = true;
                        A01(this, A002.A00(), r7);
                        return;
                    }
                } else if (i4 != 2) {
                    return;
                }
                if (r1.A0C && this.A01.A0E(4626)) {
                    i2 = 9;
                    A00(r2, this, i2);
                }
                return;
            }
            if (r1.A0B && this.A01.A0E(4626)) {
                i2 = 5;
                A00(r2, this, i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C175448aV r5, X.C201149ix r6, int r7) {
        /*
            X.8bt r4 = new X.8bt
            r4.<init>()
            X.8aS r1 = r5.A01
            java.lang.String r0 = r1.A02
            r4.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r4.A01 = r0
            r3 = 1
            com.whatsapp.jid.UserJid r1 = r1.A00
            X.185 r0 = r6.A02
            X.3L0 r2 = r0.A01(r1)
            if (r2 == 0) goto L_0x0028
            int r1 = r2.A01
            r0 = 2
            if (r1 != r0) goto L_0x0037
            r0 = 4
        L_0x0022:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x002c
        L_0x0028:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x002c:
            r4.A00 = r0
            X.0yW r0 = r6.A03
            r0.Bly(r4)
            r0.Bph(r3)
            return
        L_0x0037:
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x003f
            r0 = 3
            goto L_0x0022
        L_0x003f:
            boolean r0 = r2.A02()
            int r0 = X.C36371kC.A00(r0)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201149ix.A00(X.8aV, X.9ix, int):void");
    }

    public static final void A01(C201149ix r4, AnonymousClass9YF r5, C175458aW r6) {
        C175448aV r62 = (C175448aV) r6;
        r4.A00.A0B(new C175448aV(r62.A01, r5, r62.A00));
    }

    public C201149ix(AnonymousClass185 r1, AnonymousClass1IJ r2, C20810yC r3, C21010yW r4) {
        C36321k7.A18(r3, r4, r1, r2);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r1;
    }
}
