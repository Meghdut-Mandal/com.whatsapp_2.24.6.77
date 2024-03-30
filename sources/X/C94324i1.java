package X;

/* renamed from: X.4i1  reason: invalid class name and case insensitive filesystem */
public final class C94324i1 extends C137856gq implements C161777nS {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04 = true;

    public C94324i1(float f, float f2, float f3, float f4) {
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f9, code lost:
        if (r0 != Integer.MAX_VALUE) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ff, code lost:
        if (r2 != Integer.MAX_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C160287kl BPi(X.C161687nJ r9, X.C161717nM r10, long r11) {
        /*
            r8 = this;
            float r1 = r8.A01
            boolean r0 = X.AnonymousClass72X.A01(r1)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            if (r0 != 0) goto L_0x010b
            int r4 = r10.Bor(r1)
            if (r4 >= r5) goto L_0x0013
            r4 = 0
        L_0x0013:
            float r1 = r8.A00
            boolean r0 = X.AnonymousClass72X.A01(r1)
            if (r0 != 0) goto L_0x0106
            int r3 = r10.Bor(r1)
            if (r3 >= r5) goto L_0x0022
            r3 = 0
        L_0x0022:
            float r1 = r8.A03
            boolean r0 = X.AnonymousClass72X.A01(r1)
            if (r0 != 0) goto L_0x0103
            int r2 = r10.Bor(r1)
            if (r2 <= r4) goto L_0x00fd
            r2 = r4
        L_0x0031:
            float r1 = r8.A02
            boolean r0 = X.AnonymousClass72X.A01(r1)
            if (r0 != 0) goto L_0x0041
            int r0 = r10.Bor(r1)
            if (r0 <= r3) goto L_0x00f4
            r0 = r3
        L_0x0040:
            r5 = r0
        L_0x0041:
            long r6 = X.C132746Vb.A00(r2, r4, r5, r3)
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x008f
            int r0 = androidx.compose.ui.unit.Constraints.A03(r6)
            int r2 = androidx.compose.ui.unit.Constraints.A03(r11)
            int r1 = androidx.compose.ui.unit.Constraints.A01(r11)
            int r5 = X.C15040mb.A02(r0, r2, r1)
            int r0 = androidx.compose.ui.unit.Constraints.A01(r6)
            int r4 = X.C15040mb.A02(r0, r2, r1)
            int r0 = androidx.compose.ui.unit.Constraints.A02(r6)
            int r3 = androidx.compose.ui.unit.Constraints.A02(r11)
            int r2 = androidx.compose.ui.unit.Constraints.A00(r11)
            int r1 = X.C15040mb.A02(r0, r3, r2)
            int r0 = androidx.compose.ui.unit.Constraints.A00(r6)
            int r0 = X.C15040mb.A02(r0, r3, r2)
            long r0 = X.C132746Vb.A00(r5, r4, r1, r0)
        L_0x007d:
            X.6Q4 r3 = r9.BPj(r0)
            int r2 = r3.A01
            int r1 = r3.A00
            X.7Qn r0 = new X.7Qn
            r0.<init>(r3)
            X.7kl r0 = X.C90474aD.A0M(r10, r0, r2, r1)
            return r0
        L_0x008f:
            float r0 = r8.A03
            boolean r0 = X.AnonymousClass72X.A01(r0)
            if (r0 != 0) goto L_0x00e8
            int r4 = androidx.compose.ui.unit.Constraints.A03(r6)
        L_0x009b:
            float r0 = r8.A01
            boolean r0 = X.AnonymousClass72X.A01(r0)
            if (r0 != 0) goto L_0x00dc
            int r3 = androidx.compose.ui.unit.Constraints.A01(r6)
        L_0x00a7:
            float r0 = r8.A02
            boolean r0 = X.AnonymousClass72X.A01(r0)
            if (r0 != 0) goto L_0x00d0
            int r2 = androidx.compose.ui.unit.Constraints.A02(r6)
        L_0x00b3:
            float r0 = r8.A00
            boolean r0 = X.AnonymousClass72X.A01(r0)
            if (r0 != 0) goto L_0x00c4
            int r1 = androidx.compose.ui.unit.Constraints.A00(r6)
        L_0x00bf:
            long r0 = X.C132746Vb.A00(r4, r3, r2, r1)
            goto L_0x007d
        L_0x00c4:
            int r1 = androidx.compose.ui.unit.Constraints.A00(r11)
            int r0 = androidx.compose.ui.unit.Constraints.A02(r6)
            if (r1 >= r0) goto L_0x00bf
            r1 = r0
            goto L_0x00bf
        L_0x00d0:
            int r2 = androidx.compose.ui.unit.Constraints.A02(r11)
            int r0 = androidx.compose.ui.unit.Constraints.A00(r6)
            if (r2 <= r0) goto L_0x00b3
            r2 = r0
            goto L_0x00b3
        L_0x00dc:
            int r3 = androidx.compose.ui.unit.Constraints.A01(r11)
            int r0 = androidx.compose.ui.unit.Constraints.A03(r6)
            if (r3 >= r0) goto L_0x00a7
            r3 = r0
            goto L_0x00a7
        L_0x00e8:
            int r4 = androidx.compose.ui.unit.Constraints.A03(r11)
            int r0 = androidx.compose.ui.unit.Constraints.A01(r6)
            if (r4 <= r0) goto L_0x009b
            r4 = r0
            goto L_0x009b
        L_0x00f4:
            if (r0 >= r5) goto L_0x00f9
            r0 = 0
            goto L_0x0040
        L_0x00f9:
            if (r0 == r6) goto L_0x0041
            goto L_0x0040
        L_0x00fd:
            if (r2 < r5) goto L_0x0103
            if (r2 == r6) goto L_0x0103
            goto L_0x0031
        L_0x0103:
            r2 = 0
            goto L_0x0031
        L_0x0106:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0022
        L_0x010b:
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94324i1.BPi(X.7nJ, X.7nM, long):X.7kl");
    }
}
