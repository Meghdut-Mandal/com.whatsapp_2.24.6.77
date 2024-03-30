package X;

/* renamed from: X.6fz  reason: invalid class name and case insensitive filesystem */
public final class C137346fz implements C161657nG {
    public AnonymousClass0G8 A00;
    public C94214hq A01 = new C94214hq();
    public AnonymousClass5RW A02;
    public final C161267mT A03;
    public final C130356Kt A04;
    public final AnonymousClass6S2 A05;

    public void B2p(boolean z, boolean z2) {
        AnonymousClass5U8 r0;
        int intValue;
        AnonymousClass6S2 r4 = this.A05;
        try {
            if (r4.A00) {
                AnonymousClass6S2.A00(r4);
            }
            r4.A00 = true;
            if (z || !((intValue = AnonymousClass6XT.A00(this.A01, 8).intValue()) == 2 || intValue == 1 || intValue == 3)) {
                C94214hq r2 = this.A01;
                AnonymousClass5U8 A0G = r2.A0G();
                if (AnonymousClass6XT.A06(r2, z, z2)) {
                    int ordinal = A0G.ordinal();
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                        r0 = AnonymousClass5U8.Active;
                    } else if (ordinal == 3) {
                        r0 = AnonymousClass5U8.Inactive;
                    } else {
                        throw C36441kJ.A18();
                    }
                    r2.A0J(r0);
                }
            }
        } finally {
            AnonymousClass6S2.A01(r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0083, code lost:
        if (r5 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0089, code lost:
        if (r0 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008b, code lost:
        r16 = r0.booleanValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BPy(int r19) {
        /*
            r18 = this;
            r6 = r18
            X.4hq r5 = r6.A01
            r17 = r5
            X.4hq r3 = X.AnonymousClass6U1.A00(r5)
            r2 = 0
            if (r3 == 0) goto L_0x002b
            X.5RW r8 = r6.A02
            if (r8 == 0) goto L_0x01dd
            X.6g0 r7 = r3.A0F()
            r0 = 1
            r4 = r19
            if (r4 != r0) goto L_0x0140
            X.6MR r0 = r7.A03
        L_0x001c:
            X.6MR r1 = X.AnonymousClass6MR.A02
            if (r0 == r1) goto L_0x002c
            X.6MR r1 = X.AnonymousClass6MR.A01
            if (r0 == r1) goto L_0x002b
            boolean r0 = r0.A00()
        L_0x0028:
            if (r0 == 0) goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            return r2
        L_0x002c:
            X.0fC r11 = new X.0fC
            r11.<init>()
            X.5RW r1 = r6.A02
            if (r1 == 0) goto L_0x01c5
            X.7V2 r12 = new X.7V2
            r12.<init>(r6, r3, r11, r4)
            r3 = r4
            r0 = 1
            if (r4 != r0) goto L_0x005c
            boolean r16 = X.AnonymousClass6VW.A03(r5, r12)
        L_0x0042:
            boolean r0 = r11.element
            if (r0 != 0) goto L_0x002b
            if (r16 != 0) goto L_0x002a
            int r3 = X.C94214hq.A00(r17)
            r1 = 1
            r0 = 2
            if (r3 == r0) goto L_0x011e
            if (r3 == r2) goto L_0x011e
            if (r3 == r1) goto L_0x011e
            r0 = 3
            if (r3 == r0) goto L_0x002b
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x005c:
            r0 = 2
            if (r4 != r0) goto L_0x0064
            boolean r16 = X.AnonymousClass6VW.A02(r5, r12)
            goto L_0x0042
        L_0x0064:
            r16 = 0
            r0 = 3
            if (r4 == r0) goto L_0x0085
            r0 = 4
            if (r4 == r0) goto L_0x0085
            r0 = 5
            if (r4 == r0) goto L_0x0085
            r0 = 6
            if (r4 == r0) goto L_0x0085
            r0 = 7
            if (r4 != r0) goto L_0x0092
            int r1 = r1.ordinal()
            if (r1 == r2) goto L_0x0090
            r0 = 1
            if (r1 != r0) goto L_0x01a3
            r3 = 3
        L_0x007f:
            X.4hq r5 = X.AnonymousClass6U1.A00(r5)
            if (r5 == 0) goto L_0x0042
        L_0x0085:
            java.lang.Boolean r0 = X.C133286Xr.A02(r5, r12, r3)
            if (r0 == 0) goto L_0x0042
        L_0x008b:
            boolean r16 = r0.booleanValue()
            goto L_0x0042
        L_0x0090:
            r3 = 4
            goto L_0x007f
        L_0x0092:
            r0 = 8
            if (r4 != r0) goto L_0x01af
            X.4hq r3 = X.AnonymousClass6U1.A00(r5)
            if (r3 == 0) goto L_0x0042
            r13 = 1024(0x400, float:1.435E-42)
            X.6gq r1 = r3.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x01a8
            X.6gq r14 = r1.A04
            X.6gp r10 = X.AnonymousClass6VZ.A02(r3)
        L_0x00aa:
            r15 = 0
            if (r10 == 0) goto L_0x0042
            int r0 = X.AnonymousClass6XQ.A00(r10, r13)
            if (r0 == 0) goto L_0x010f
        L_0x00b3:
            if (r14 == 0) goto L_0x010f
            int r0 = r14.A01
            r0 = r0 & r13
            if (r0 == 0) goto L_0x010c
            r9 = r14
            r8 = r15
        L_0x00bc:
            boolean r0 = r9 instanceof X.C94214hq
            if (r0 == 0) goto L_0x00d7
            X.4hq r9 = (X.C94214hq) r9
            X.6g0 r0 = r9.A0F()
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0102
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r12.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x008b
        L_0x00d7:
            int r0 = r9.A01
            r0 = r0 & r13
            r7 = 1
            if (r0 == 0) goto L_0x0102
            boolean r0 = r9 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0102
            r0 = r9
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r3 = r0.A00
            r1 = 0
        L_0x00e7:
            if (r3 == 0) goto L_0x0107
            int r0 = r3.A01
            r0 = r0 & r13
            if (r0 == 0) goto L_0x00f3
            int r1 = r1 + 1
            if (r1 != r7) goto L_0x00f6
            r9 = r3
        L_0x00f3:
            X.6gq r3 = r3.A02
            goto L_0x00e7
        L_0x00f6:
            X.76e r8 = X.C90464aC.A0F(r8)
            X.6gq r9 = X.C90524aI.A0D(r8, r9)
            r8.A0D(r3)
            goto L_0x00f3
        L_0x0102:
            X.6gq r9 = X.AnonymousClass6VZ.A00(r8)
            goto L_0x0109
        L_0x0107:
            if (r1 != r7) goto L_0x0102
        L_0x0109:
            if (r9 == 0) goto L_0x010c
            goto L_0x00bc
        L_0x010c:
            X.6gq r14 = r14.A04
            goto L_0x00b3
        L_0x010f:
            X.6gp r10 = r10.A0A()
            if (r10 == 0) goto L_0x0042
            X.6XQ r0 = r10.A0R
            if (r0 == 0) goto L_0x011c
            X.6gq r14 = r0.A05
            goto L_0x00aa
        L_0x011c:
            r14 = r15
            goto L_0x00aa
        L_0x011e:
            X.5U8 r0 = r17.A0G()
            boolean r0 = r0.BLs()
            if (r0 != 0) goto L_0x002b
            if (r4 == r1) goto L_0x012d
            r0 = 2
            if (r4 != r0) goto L_0x002b
        L_0x012d:
            r6.B2p(r2, r1)
            X.5U8 r0 = r17.A0G()
            boolean r0 = r0.BLs()
            if (r0 == 0) goto L_0x002b
            boolean r0 = r6.BPy(r4)
            goto L_0x0028
        L_0x0140:
            r0 = 2
            if (r4 != r0) goto L_0x0147
            X.6MR r0 = r7.A04
            goto L_0x001c
        L_0x0147:
            r0 = 5
            if (r4 != r0) goto L_0x014e
            X.6MR r0 = r7.A07
            goto L_0x001c
        L_0x014e:
            r0 = 6
            if (r4 != r0) goto L_0x0155
            X.6MR r0 = r7.A00
            goto L_0x001c
        L_0x0155:
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1S(r4, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0172
            int r0 = r8.ordinal()
            if (r0 == r2) goto L_0x016f
            if (r0 != r1) goto L_0x01cc
            X.6MR r0 = r7.A01
        L_0x0167:
            X.6MR r1 = X.AnonymousClass6MR.A02
            if (r0 != r1) goto L_0x001c
            X.6MR r0 = r7.A02
            goto L_0x001c
        L_0x016f:
            X.6MR r0 = r7.A06
            goto L_0x0167
        L_0x0172:
            r0 = 4
            if (r4 != r0) goto L_0x018a
            int r0 = r8.ordinal()
            if (r0 == r2) goto L_0x0187
            if (r0 != r1) goto L_0x01d1
            X.6MR r0 = r7.A06
        L_0x017f:
            X.6MR r1 = X.AnonymousClass6MR.A02
            if (r0 != r1) goto L_0x001c
            X.6MR r0 = r7.A05
            goto L_0x001c
        L_0x0187:
            X.6MR r0 = r7.A01
            goto L_0x017f
        L_0x018a:
            r0 = 7
            if (r4 != r0) goto L_0x019c
            X.02t r1 = r7.A08
        L_0x018f:
            X.6Of r0 = new X.6Of
            r0.<init>(r4)
            java.lang.Object r0 = r1.invoke(r0)
            X.6MR r0 = (X.AnonymousClass6MR) r0
            goto L_0x001c
        L_0x019c:
            r0 = 8
            if (r4 != r0) goto L_0x01d6
            X.02t r1 = r7.A09
            goto L_0x018f
        L_0x01a3:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x01a8:
            java.lang.String r0 = "visitAncestors called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x01af:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Focus search invoked with invalid FocusDirection "
            r1.append(r0)
            java.lang.String r0 = X.C131226Of.A00(r4)
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x01c5:
            java.lang.String r0 = "layoutDirection"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01cc:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x01d1:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x01d6:
            java.lang.String r0 = "invalid FocusDirection"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x01dd:
            java.lang.String r0 = "layoutDirection"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137346fz.BPy(int):boolean");
    }

    public C137346fz(C006302t r3) {
        this.A04 = new C130356Kt(r3);
        this.A05 = new AnonymousClass6S2();
        this.A03 = new C162447ob(this, 0);
    }
}
