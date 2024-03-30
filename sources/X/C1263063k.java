package X;

/* renamed from: X.63k  reason: invalid class name and case insensitive filesystem */
public final class C1263063k {
    public boolean A00;
    public final C118305nf A01;
    public final AnonymousClass5h7 A02 = new AnonymousClass5h7();
    public final AnonymousClass76X A03 = new AnonymousClass76X();
    public final C137846gp A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.C118315ng r40, X.C158847iK r41, boolean r42) {
        /*
            r39 = this;
            r2 = r39
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0008
            r11 = 0
            return r11
        L_0x0008:
            r0 = 1
            r2.A00 = r0     // Catch:{ all -> 0x01bb }
            X.5h7 r0 = r2.A02     // Catch:{ all -> 0x01bb }
            r37 = r0
            r38 = r40
            r0 = r38
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x01bb }
            r36 = r0
            int r0 = r36.size()     // Catch:{ all -> 0x01bb }
            X.00i r13 = new X.00i     // Catch:{ all -> 0x01bb }
            r13.<init>(r0)     // Catch:{ all -> 0x01bb }
            int r17 = r36.size()     // Catch:{ all -> 0x01bb }
            r10 = 0
        L_0x0025:
            r0 = r17
            if (r10 >= r0) goto L_0x00af
            r0 = r36
            java.lang.Object r7 = r0.get(r10)     // Catch:{ all -> 0x01bb }
            X.6Dw r7 = (X.C128856Dw) r7     // Catch:{ all -> 0x01bb }
            r0 = r37
            X.00i r11 = r0.A00     // Catch:{ all -> 0x01bb }
            long r0 = r7.A02     // Catch:{ all -> 0x01bb }
            java.lang.Object r1 = r11.A05(r0)     // Catch:{ all -> 0x01bb }
            X.5ru r1 = (X.C120685ru) r1     // Catch:{ all -> 0x01bb }
            if (r1 != 0) goto L_0x0084
            long r8 = r7.A07     // Catch:{ all -> 0x01bb }
            long r5 = r7.A04     // Catch:{ all -> 0x01bb }
            r16 = 0
        L_0x0045:
            long r3 = r7.A02     // Catch:{ all -> 0x01bb }
            long r0 = r7.A07     // Catch:{ all -> 0x01bb }
            r25 = r0
            long r0 = r7.A04     // Catch:{ all -> 0x01bb }
            r27 = r0
            boolean r15 = r7.A09     // Catch:{ all -> 0x01bb }
            float r0 = r7.A00     // Catch:{ all -> 0x01bb }
            r21 = r0
            int r0 = r7.A01     // Catch:{ all -> 0x01bb }
            r20 = r0
            java.util.List r12 = r7.A08     // Catch:{ all -> 0x01bb }
            long r0 = r7.A06     // Catch:{ all -> 0x01bb }
            r18 = r0
            long r0 = r7.A03     // Catch:{ all -> 0x01bb }
            r35 = 0
            X.6E5 r14 = new X.6E5     // Catch:{ all -> 0x01bb }
            r23 = r25
            r25 = r27
            r27 = r8
            r29 = r5
            r31 = r18
            r33 = r15
            r34 = r16
            r18 = r14
            r19 = r21
            r21 = r3
            r18.<init>(r19, r20, r21, r23, r25, r27, r29, r31, r33, r34, r35)     // Catch:{ all -> 0x01bb }
            r14.A02 = r12     // Catch:{ all -> 0x01bb }
            r14.A00 = r0     // Catch:{ all -> 0x01bb }
            r13.A0A(r3, r14)     // Catch:{ all -> 0x01bb }
            goto L_0x0093
        L_0x0084:
            long r8 = r1.A01     // Catch:{ all -> 0x01bb }
            boolean r0 = r1.A02     // Catch:{ all -> 0x01bb }
            r16 = r0
            long r0 = r1.A00     // Catch:{ all -> 0x01bb }
            r3 = r41
            long r5 = X.AnonymousClass5WS.A02(r3, r0)     // Catch:{ all -> 0x01bb }
            goto L_0x0045
        L_0x0093:
            if (r15 == 0) goto L_0x00a6
            long r0 = r7.A02     // Catch:{ all -> 0x01bb }
            long r5 = r7.A07     // Catch:{ all -> 0x01bb }
            long r8 = r7.A05     // Catch:{ all -> 0x01bb }
            boolean r7 = r7.A09     // Catch:{ all -> 0x01bb }
            X.5ru r4 = new X.5ru     // Catch:{ all -> 0x01bb }
            r4.<init>(r5, r7, r8)     // Catch:{ all -> 0x01bb }
            r11.A0A(r0, r4)     // Catch:{ all -> 0x01bb }
            goto L_0x00ab
        L_0x00a6:
            long r0 = r7.A02     // Catch:{ all -> 0x01bb }
            r11.A08(r0)     // Catch:{ all -> 0x01bb }
        L_0x00ab:
            int r10 = r10 + 1
            goto L_0x0025
        L_0x00af:
            X.61T r4 = new X.61T     // Catch:{ all -> 0x01bb }
            r0 = r38
            r4.<init>(r13, r0)     // Catch:{ all -> 0x01bb }
            X.00i r7 = r4.A00     // Catch:{ all -> 0x01bb }
            int r5 = r7.A00()     // Catch:{ all -> 0x01bb }
            r3 = 0
        L_0x00bd:
            if (r3 >= r5) goto L_0x00d3
            java.lang.Object r1 = r7.A04(r3)     // Catch:{ all -> 0x01bb }
            X.6E5 r1 = (X.AnonymousClass6E5) r1     // Catch:{ all -> 0x01bb }
            boolean r0 = r1.A0B     // Catch:{ all -> 0x01bb }
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r1.A0C     // Catch:{ all -> 0x01bb }
            if (r0 != 0) goto L_0x00d0
            int r3 = r3 + 1
            goto L_0x00bd
        L_0x00d0:
            r18 = 0
            goto L_0x00d5
        L_0x00d3:
            r18 = 1
        L_0x00d5:
            int r17 = r7.A00()     // Catch:{ all -> 0x01bb }
            r3 = 0
        L_0x00da:
            r0 = r17
            if (r3 >= r0) goto L_0x0170
            java.lang.Object r5 = r7.A04(r3)     // Catch:{ all -> 0x01bb }
            X.6E5 r5 = (X.AnonymousClass6E5) r5     // Catch:{ all -> 0x01bb }
            if (r18 != 0) goto L_0x00ee
            boolean r0 = r5.A0C     // Catch:{ all -> 0x01bb }
            if (r0 != 0) goto L_0x016c
            boolean r0 = r5.A0B     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x016c
        L_0x00ee:
            int r1 = r5.A04     // Catch:{ all -> 0x01bb }
            r0 = 1
            boolean r14 = X.AnonymousClass000.A1S(r1, r0)
            X.6gp r6 = r2.A04     // Catch:{ all -> 0x01bb }
            long r0 = r5.A06     // Catch:{ all -> 0x01bb }
            X.76X r8 = r2.A03     // Catch:{ all -> 0x01bb }
            X.6XQ r9 = r6.A0R     // Catch:{ all -> 0x01bb }
            X.4iy r6 = r9.A04     // Catch:{ all -> 0x01bb }
            long r12 = r6.A0J(r0)     // Catch:{ all -> 0x01bb }
            X.4iy r0 = r9.A04     // Catch:{ all -> 0x01bb }
            X.7km r11 = X.C94894iy.A0L     // Catch:{ all -> 0x01bb }
            r15 = 1
            r9 = r0
            r10 = r8
            r9.A0Z(r10, r11, r12, r14, r15)     // Catch:{ all -> 0x01bb }
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x01bb }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x016c
            X.5nf r0 = r2.A01     // Catch:{ all -> 0x01bb }
            long r5 = r5.A05     // Catch:{ all -> 0x01bb }
            X.6FE r14 = r0.A00     // Catch:{ all -> 0x01bb }
            int r11 = r8.size()     // Catch:{ all -> 0x01bb }
            r16 = 1
            r10 = 0
        L_0x0122:
            if (r10 >= r11) goto L_0x0169
            java.lang.Object r15 = r8.get(r10)     // Catch:{ all -> 0x01bb }
            X.6gq r15 = (X.C137856gq) r15     // Catch:{ all -> 0x01bb }
            if (r16 == 0) goto L_0x0156
            X.76e r0 = r14.A00     // Catch:{ all -> 0x01bb }
            int r13 = r0.A00     // Catch:{ all -> 0x01bb }
            if (r13 <= 0) goto L_0x0146
            java.lang.Object[] r12 = r0.A01     // Catch:{ all -> 0x01bb }
            r9 = 0
        L_0x0135:
            r1 = r12[r9]     // Catch:{ all -> 0x01bb }
            r0 = r1
            X.4ic r0 = (X.C94684ic) r0     // Catch:{ all -> 0x01bb }
            X.6gq r0 = r0.A06     // Catch:{ all -> 0x01bb }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r15)     // Catch:{ all -> 0x01bb }
            if (r0 != 0) goto L_0x0147
            int r9 = r9 + 1
            if (r9 < r13) goto L_0x0135
        L_0x0146:
            r1 = 0
        L_0x0147:
            X.4ic r1 = (X.C94684ic) r1     // Catch:{ all -> 0x01bb }
            if (r1 == 0) goto L_0x0154
            r0 = 1
            r1.A02 = r0     // Catch:{ all -> 0x01bb }
            X.61U r0 = r1.A07     // Catch:{ all -> 0x01bb }
            r0.A00(r5)     // Catch:{ all -> 0x01bb }
            goto L_0x0165
        L_0x0154:
            r16 = 0
        L_0x0156:
            X.4ic r1 = new X.4ic     // Catch:{ all -> 0x01bb }
            r1.<init>(r15)     // Catch:{ all -> 0x01bb }
            X.61U r0 = r1.A07     // Catch:{ all -> 0x01bb }
            r0.A00(r5)     // Catch:{ all -> 0x01bb }
            X.76e r0 = r14.A00     // Catch:{ all -> 0x01bb }
            r0.A0D(r1)     // Catch:{ all -> 0x01bb }
        L_0x0165:
            r14 = r1
            int r10 = r10 + 1
            goto L_0x0122
        L_0x0169:
            r8.clear()     // Catch:{ all -> 0x01bb }
        L_0x016c:
            int r3 = r3 + 1
            goto L_0x00da
        L_0x0170:
            X.5nf r0 = r2.A01     // Catch:{ all -> 0x01bb }
            X.6FE r3 = r0.A00     // Catch:{ all -> 0x01bb }
            r3.A01()     // Catch:{ all -> 0x01bb }
            X.7la r1 = r0.A01     // Catch:{ all -> 0x01bb }
            r5 = r42
            boolean r0 = r3.A03(r7, r4, r1, r5)     // Catch:{ all -> 0x01bb }
            r11 = 0
            if (r0 == 0) goto L_0x018f
            boolean r1 = r3.A04(r7, r4, r1, r5)     // Catch:{ all -> 0x01bb }
            boolean r0 = r3.A05(r4)     // Catch:{ all -> 0x01bb }
            if (r0 != 0) goto L_0x018e
            if (r1 == 0) goto L_0x018f
        L_0x018e:
            r11 = 1
        L_0x018f:
            int r10 = r7.A00()     // Catch:{ all -> 0x01bb }
            r9 = 0
            goto L_0x0197
        L_0x0195:
            int r9 = r9 + 1
        L_0x0197:
            if (r9 >= r10) goto L_0x01b5
            java.lang.Object r8 = r7.A04(r9)     // Catch:{ all -> 0x01bb }
            X.6E5 r8 = (X.AnonymousClass6E5) r8     // Catch:{ all -> 0x01bb }
            long r3 = r8.A07     // Catch:{ all -> 0x01bb }
            long r0 = r8.A06     // Catch:{ all -> 0x01bb }
            long r5 = X.C133206Xf.A02(r0, r3)     // Catch:{ all -> 0x01bb }
            long r3 = X.C133206Xf.A03     // Catch:{ all -> 0x01bb }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0195
            boolean r0 = r8.A00()     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0195
            r0 = 2
            goto L_0x01b6
        L_0x01b5:
            r0 = 0
        L_0x01b6:
            r11 = r11 | r0
            r0 = 0
            r2.A00 = r0
            return r11
        L_0x01bb:
            r1 = move-exception
            r0 = 0
            r2.A00 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263063k.A00(X.5ng, X.7iK, boolean):int");
    }

    public C1263063k(C137846gp r3) {
        this.A04 = r3;
        this.A01 = new C118305nf(r3.A0R.A06);
    }
}
