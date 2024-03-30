package X;

/* renamed from: X.9jg  reason: invalid class name and case insensitive filesystem */
public final class C201479jg {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C199509fQ A06;
    public final C199509fQ A07;
    public final C199509fQ A08;
    public final AnonymousClass4TS A09;
    public final C202219lH A0A;
    public final C202219lH A0B;
    public final C202219lH A0C;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0057
            r2 = 0
            if (r5 == 0) goto L_0x0061
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0061
            X.9jg r5 = (X.C201479jg) r5
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0056
            int r1 = r4.A02
            int r0 = r5.A02
            if (r1 != r0) goto L_0x0056
            int r1 = r4.A04
            int r0 = r5.A04
            if (r1 != r0) goto L_0x0056
            int r1 = r4.A05
            int r0 = r5.A05
            if (r1 != r0) goto L_0x0056
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x0056
            X.9lH r1 = r4.A0A
            X.9lH r0 = r5.A0A
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.9lH r1 = r4.A0C
            X.9lH r0 = r5.A0C
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.9lH r1 = r4.A0B
            X.9lH r0 = r5.A0B
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.9fQ r1 = r4.A06
            X.9fQ r0 = r5.A06
            if (r1 != 0) goto L_0x0058
            if (r0 == 0) goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            return r3
        L_0x0058:
            if (r0 == 0) goto L_0x0056
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            return r3
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201479jg.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C201479jg(int r12) {
        /*
            r11 = this;
            X.9lH r3 = X.C202219lH.A05
            r7 = 8
            r8 = -1
            r10 = 0
            r1 = 0
            r0 = r11
            r6 = r12
            r2 = r1
            r4 = r3
            r5 = r3
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201479jg.<init>(int):void");
    }

    public int hashCode() {
        return C36401kF.A02(this.A0B, C36351kA.A05(this.A0C, C36351kA.A05(this.A0A, (((((((this.A02 + 31) * 31) + this.A04) * 31) + this.A05) * 31) + this.A01) * 31)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentBannerConfiguration{bannerVisibility=");
        A0u.append(this.A02);
        A0u.append(", ctaButtonVisibility=");
        A0u.append(this.A04);
        A0u.append(", secondaryCtaButtonVisibility=");
        A0u.append(this.A05);
        A0u.append(", bannerType=");
        A0u.append(this.A01);
        A0u.append(", cta=");
        A0u.append(this.A0A);
        A0u.append(", title=");
        A0u.append(this.A0C);
        A0u.append(", description=");
        A0u.append(this.A0B);
        A0u.append(", bannerOnClickListener=");
        return C90464aC.A0X(this.A09, A0u);
    }

    public C201479jg(C199509fQ r1, C199509fQ r2, C199509fQ r3, AnonymousClass4TS r4, C202219lH r5, C202219lH r6, C202219lH r7, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A0A = r5;
        this.A0C = r6;
        this.A0B = r7;
        this.A01 = i6;
        this.A06 = r1;
        this.A07 = r2;
        this.A08 = r3;
        this.A00 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A05 = i4;
        this.A03 = i5;
        this.A09 = r4;
    }

    public C201479jg(C199509fQ r15, AnonymousClass4TS r16, C202219lH r17, C202219lH r18, C202219lH r19, int i, int i2, int i3, int i4, int i5) {
        this(r15, (C199509fQ) null, (C199509fQ) null, r16, r17, r18, r19, i, i2, i3, 8, i4, i5);
    }
}
