package X;

/* renamed from: X.6gV  reason: invalid class name and case insensitive filesystem */
public final class C137656gV implements C157697dx {
    public final float A00;
    public final C158757iB A01;
    public final C158767iC A02;
    public final AnonymousClass6MA A03;
    public final Integer A04;
    public final Integer A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C137656gV) {
                C137656gV r5 = (C137656gV) obj;
                if (this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass000.A1Q(Float.compare(this.A00, r5.A00)) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0129 A[LOOP:1: B:49:0x0127->B:50:0x0129, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0103 A[EDGE_INSN: B:76:0x0103->B:45:0x0103 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C160287kl BPh(X.C161717nM r27, java.util.List r28, long r29) {
        /*
            r26 = this;
            r13 = r28
            int r0 = r13.size()
            X.6Q4[] r5 = new X.AnonymousClass6Q4[r0]
            r4 = r26
            java.lang.Integer r0 = r4.A05
            r25 = r0
            X.7iB r3 = r4.A01
            X.7iC r2 = r4.A02
            float r1 = r4.A00
            X.6MA r0 = r4.A03
            X.5y1 r8 = new X.5y1
            r9 = r3
            r10 = r2
            r11 = r0
            r12 = r25
            r14 = r5
            r15 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            int r7 = r13.size()
            r6 = 0
            java.lang.Integer r5 = r8.A04
            java.lang.Integer r4 = X.C023109s.A00
            if (r5 != r4) goto L_0x00eb
            int r3 = androidx.compose.ui.unit.Constraints.A03(r29)
        L_0x0031:
            int r2 = androidx.compose.ui.unit.Constraints.A01(r29)
        L_0x0035:
            int r1 = androidx.compose.ui.unit.Constraints.A02(r29)
        L_0x0039:
            int r0 = androidx.compose.ui.unit.Constraints.A00(r29)
        L_0x003d:
            long r20 = X.C132746Vb.A00(r3, r2, r1, r0)
            float r0 = r8.A00
            r14 = r27
            int r0 = r14.Bor(r0)
            long r0 = (long) r0
            r23 = r0
            r9 = 0
            r2 = 0
            r11 = 0
            r13 = 0
        L_0x0051:
            r15 = 2147483647(0x7fffffff, float:NaN)
            if (r9 >= r7) goto L_0x0103
            java.util.List r0 = r8.A05
            java.lang.Object r12 = r0.get(r9)
            X.7nJ r12 = (X.C161687nJ) r12
            X.6Od[] r0 = r8.A06
            r19 = r0[r9]
            int r11 = androidx.compose.ui.unit.Constraints.A01(r20)
            X.6Q4[] r0 = r8.A07
            r18 = r0
            r10 = r0[r9]
            if (r10 != 0) goto L_0x009d
            if (r11 == r15) goto L_0x007b
            long r0 = (long) r11
            long r0 = r0 - r2
            r15 = 0
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x007a
            r0 = 0
        L_0x007a:
            int r15 = (int) r0
        L_0x007b:
            int r0 = androidx.compose.ui.unit.Constraints.A00(r20)
            long r16 = X.C132746Vb.A00(r6, r15, r6, r0)
            if (r5 != r4) goto L_0x00da
            int r15 = androidx.compose.ui.unit.Constraints.A03(r16)
            int r10 = androidx.compose.ui.unit.Constraints.A01(r16)
            int r1 = androidx.compose.ui.unit.Constraints.A02(r16)
            int r0 = androidx.compose.ui.unit.Constraints.A00(r16)
        L_0x0095:
            long r0 = X.C132746Vb.A00(r15, r10, r1, r0)
            X.6Q4 r10 = r12.BPj(r0)
        L_0x009d:
            r0 = r23
            int r12 = (int) r0
            r22 = r12
            long r0 = (long) r11
            long r0 = r0 - r2
            if (r5 != r4) goto L_0x00d7
            int r15 = r10.A01
        L_0x00a8:
            long r11 = (long) r15
            long r0 = r0 - r11
            r16 = 0
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 >= 0) goto L_0x00b2
            r0 = 0
        L_0x00b2:
            int r11 = (int) r0
            r0 = r22
            int r11 = java.lang.Math.min(r0, r11)
            int r15 = r15 + r11
            long r0 = (long) r15
            long r2 = r2 + r0
            if (r5 != r4) goto L_0x00d4
            int r0 = r10.A00
        L_0x00c0:
            int r13 = java.lang.Math.max(r13, r0)
            if (r19 == 0) goto L_0x00ce
            r0 = r19
            X.6MA r0 = r0.A00
            if (r0 == 0) goto L_0x00ce
            X.6MA r0 = X.AnonymousClass6MA.A02
        L_0x00ce:
            r18[r9] = r10
            int r9 = r9 + 1
            goto L_0x0051
        L_0x00d4:
            int r0 = r10.A01
            goto L_0x00c0
        L_0x00d7:
            int r15 = r10.A00
            goto L_0x00a8
        L_0x00da:
            int r15 = androidx.compose.ui.unit.Constraints.A02(r16)
            int r10 = androidx.compose.ui.unit.Constraints.A00(r16)
            int r1 = androidx.compose.ui.unit.Constraints.A03(r16)
            int r0 = androidx.compose.ui.unit.Constraints.A01(r16)
            goto L_0x0095
        L_0x00eb:
            int r3 = androidx.compose.ui.unit.Constraints.A02(r29)
            if (r5 == r4) goto L_0x0031
            int r2 = androidx.compose.ui.unit.Constraints.A00(r29)
            if (r5 == r4) goto L_0x0035
            int r1 = androidx.compose.ui.unit.Constraints.A03(r29)
            if (r5 == r4) goto L_0x0039
            int r0 = androidx.compose.ui.unit.Constraints.A01(r29)
            goto L_0x003d
        L_0x0103:
            long r0 = (long) r11
            long r2 = r2 - r0
            long r0 = (long) r6
            long r2 = r2 + r0
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x010f
            r2 = 0
        L_0x010f:
            int r1 = (int) r2
            int r0 = androidx.compose.ui.unit.Constraints.A03(r20)
            int r2 = java.lang.Math.max(r1, r0)
            int r0 = androidx.compose.ui.unit.Constraints.A02(r20)
            int r0 = java.lang.Math.max(r0, r6)
            int r9 = java.lang.Math.max(r13, r0)
            int[] r1 = new int[r7]
            r0 = 0
        L_0x0127:
            if (r0 >= r7) goto L_0x012e
            r1[r0] = r6
            int r0 = r0 + 1
            goto L_0x0127
        L_0x012e:
            int[] r3 = new int[r7]
        L_0x0130:
            if (r6 >= r7) goto L_0x0145
            X.6Q4[] r0 = r8.A07
            r0 = r0[r6]
            X.AnonymousClass00C.A0B(r0)
            if (r5 != r4) goto L_0x0142
            int r0 = r0.A01
        L_0x013d:
            r3[r6] = r0
            int r6 = r6 + 1
            goto L_0x0130
        L_0x0142:
            int r0 = r0.A00
            goto L_0x013d
        L_0x0145:
            java.lang.Integer r0 = X.C023109s.A01
            if (r5 != r0) goto L_0x016c
            X.7iC r0 = r8.A02
            if (r0 == 0) goto L_0x017f
            r0.B1P(r14, r3, r1, r2)
        L_0x0150:
            X.5u9 r3 = new X.5u9
            r3.<init>(r1, r9, r2, r7)
            r0 = r25
            if (r0 != r4) goto L_0x0167
            int r2 = r3.A02
            int r1 = r3.A00
        L_0x015d:
            X.7UY r0 = new X.7UY
            r0.<init>(r3, r8, r14)
            X.7kl r0 = X.C90474aD.A0M(r14, r0, r2, r1)
            return r0
        L_0x0167:
            int r2 = r3.A00
            int r1 = r3.A02
            goto L_0x015d
        L_0x016c:
            X.7iB r0 = r8.A01
            if (r0 == 0) goto L_0x0186
            X.5RW r15 = r14.getLayoutDirection()
            r13 = r0
            r16 = r3
            r17 = r1
            r18 = r2
            r13.B1Q(r14, r15, r16, r17, r18)
            goto L_0x0150
        L_0x017f:
            java.lang.String r0 = "null verticalArrangement in Column"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0186:
            java.lang.String r0 = "null horizontalArrangement in Row"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137656gV.BPh(X.7nM, java.util.List, long):X.7kl");
    }

    public int hashCode() {
        String str;
        int intValue = this.A05.intValue();
        if (intValue != 0) {
            str = "Vertical";
        } else {
            str = "Horizontal";
        }
        return C36401kF.A02(this.A03, (C90474aD.A02((((((str.hashCode() + intValue) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A02)) * 31, this.A00) + 2704490) * 31);
    }

    public C137656gV(C158757iB r1, C158767iC r2, AnonymousClass6MA r3, Integer num, Integer num2, float f) {
        this.A05 = num;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = f;
        this.A04 = num2;
        this.A03 = r3;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RowColumnMeasurePolicy(orientation=");
        if (this.A05.intValue() != 0) {
            str = "Vertical";
        } else {
            str = "Horizontal";
        }
        A0u.append(str);
        A0u.append(", horizontalArrangement=");
        A0u.append(this.A01);
        A0u.append(", verticalArrangement=");
        A0u.append(this.A02);
        A0u.append(", arrangementSpacing=");
        A0u.append(AnonymousClass72X.A00(this.A00));
        A0u.append(", crossAxisSize=");
        A0u.append("Wrap");
        A0u.append(", crossAxisAlignment=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
