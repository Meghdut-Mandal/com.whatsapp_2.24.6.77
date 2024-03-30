package X;

/* renamed from: X.61Q  reason: invalid class name */
public final class AnonymousClass61Q {
    public int A00 = 300;
    public final AnonymousClass0G6 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006c, code lost:
        if (r12.A00 != 0) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0076, code lost:
        if (X.AnonymousClass000.A0T(r15, r3) == 254) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0078, code lost:
        r0 = X.C05860Ri.A01;
        r1 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007b, code lost:
        if (r11 == 0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        r1 = (r11 * 2) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0081, code lost:
        r24 = r12.A02;
        r23 = r12.A04;
        X.AnonymousClass0G6.A01(r12, r1);
        r22 = r12.A02;
        r21 = r12.A04;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0095, code lost:
        if (r10 >= r11) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009f, code lost:
        if (X.AnonymousClass000.A0T(r15, r10) >= 128) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a1, code lost:
        r20 = r24[r10];
        r1 = -862048943 * r20;
        r1 = r1 ^ (r1 << 16);
        r9 = X.AnonymousClass0G6.A00(r12, r1 >>> 7);
        r3 = (long) (r1 & 127);
        r2 = r12.A03;
        r19 = r9 >> 3;
        r18 = (r9 & 7) << 3;
        r2[r19] = (r2[r19] & (~(255 << r18))) | (r3 << r18);
        r0 = X.AnonymousClass001.A01(r9, r12.A00);
        r19 = r0 >> 3;
        r18 = (r0 & 7) << 3;
        r2[r19] = (r2[r19] & (~(255 << r18))) | (r3 << r18);
        r22[r9] = r20;
        r21[r9] = r23[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e8, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f2, code lost:
        r3 = X.AnonymousClass0G6.A00(r12, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f8, code lost:
        r12.A01++;
        r13 = r12.A00;
        r4 = r12.A03;
        r16 = r3 >> 3;
        r14 = r4[r16];
        r11 = (r3 & 7) << 3;
        r12.A00 = r13 - (X.AnonymousClass000.A1Q((((r14 >> r11) & 255) > 128 ? 1 : (((r14 >> r11) & 255) == 128 ? 0 : -1))) ? 1 : 0);
        r4[r16] = (r14 & (~(255 << r11))) | (r7 << r11);
        r0 = X.AnonymousClass001.A01(r3, r12.A00);
        r11 = r0 >> 3;
        r2 = (r0 & 7) << 3;
        r4[r11] = ((~(255 << r2)) & r4[r11]) | (r7 << r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0060, code lost:
        if (((((~r4) << 6) & r4) & -9187201950435737472L) == 0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        r3 = X.AnonymousClass0G6.A00(r12, r25);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C93344gP A00(java.lang.Object r29, int r30) {
        /*
            r28 = this;
            X.4gP r26 = new X.4gP
            r1 = r29
            r0 = r26
            r0.<init>(r1)
            r0 = r28
            X.0G6 r12 = r0.A01
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            r27 = r30
            int r1 = r1 * r30
            int r0 = r1 << 16
            r1 = r1 ^ r0
            int r25 = r1 >>> 7
            r9 = r1 & 127(0x7f, float:1.78E-43)
            int r11 = r12.A00
            r6 = r25 & r11
            r18 = 0
        L_0x0021:
            long[] r15 = r12.A03
            long r4 = X.AnonymousClass000.A0S(r15, r6)
            long r7 = (long) r9
            r16 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r7 * r16
            long r2 = r4 ^ r0
            long r13 = r2 - r16
            long r0 = ~r2
            long r0 = r0 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r16
        L_0x003c:
            r13 = 0
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            int r2 = java.lang.Long.numberOfTrailingZeros(r0)
            int r2 = r2 >> 3
            int r3 = r6 + r2
            r3 = r3 & r11
            int[] r2 = r12.A02
            r10 = r2[r3]
            r2 = r27
            if (r10 == r2) goto L_0x0136
            long r0 = X.AnonymousClass000.A0P(r0)
            goto L_0x003c
        L_0x0058:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r0 = r0 & r4
            long r0 = r0 & r16
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x00eb
            r0 = r25
            int r3 = X.AnonymousClass0G6.A00(r12, r0)
            int r0 = r12.A00
            r5 = 255(0xff, double:1.26E-321)
            if (r0 != 0) goto L_0x00f8
            long r9 = X.AnonymousClass000.A0T(r15, r3)
            r1 = 254(0xfe, double:1.255E-321)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f8
            X.0GA r0 = X.C05860Ri.A01
            r1 = 6
            if (r11 == 0) goto L_0x0081
            int r0 = r11 * 2
            int r1 = r0 + 1
        L_0x0081:
            int[] r0 = r12.A02
            r24 = r0
            java.lang.Object[] r0 = r12.A04
            r23 = r0
            X.AnonymousClass0G6.A01(r12, r1)
            int[] r0 = r12.A02
            r22 = r0
            java.lang.Object[] r0 = r12.A04
            r21 = r0
            r10 = 0
        L_0x0095:
            if (r10 >= r11) goto L_0x00f2
            long r3 = X.AnonymousClass000.A0T(r15, r10)
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e8
            r20 = r24[r10]
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r20
            int r0 = r1 << 16
            r1 = r1 ^ r0
            int r0 = r1 >>> 7
            int r9 = X.AnonymousClass0G6.A00(r12, r0)
            r0 = r1 & 127(0x7f, float:1.78E-43)
            long r3 = (long) r0
            long[] r2 = r12.A03
            int r19 = r9 >> 3
            r0 = r9 & 7
            int r18 = r0 << 3
            r16 = r2[r19]
            long r13 = r5 << r18
            long r0 = ~r13
            long r16 = r16 & r0
            long r0 = r3 << r18
            long r16 = r16 | r0
            r2[r19] = r16
            int r0 = r12.A00
            int r0 = X.AnonymousClass001.A01(r9, r0)
            int r19 = r0 >> 3
            r0 = r0 & 7
            int r18 = r0 << 3
            r16 = r2[r19]
            long r13 = r5 << r18
            long r0 = ~r13
            long r16 = r16 & r0
            long r3 = r3 << r18
            long r16 = r16 | r3
            r2[r19] = r16
            r22[r9] = r20
            r0 = r23[r10]
            r21[r9] = r0
        L_0x00e8:
            int r10 = r10 + 1
            goto L_0x0095
        L_0x00eb:
            int r18 = r18 + 8
            int r6 = r6 + r18
            r6 = r6 & r11
            goto L_0x0021
        L_0x00f2:
            r0 = r25
            int r3 = X.AnonymousClass0G6.A00(r12, r0)
        L_0x00f8:
            int r0 = r12.A01
            int r0 = r0 + 1
            r12.A01 = r0
            int r13 = r12.A00
            long[] r4 = r12.A03
            int r16 = r3 >> 3
            r14 = r4[r16]
            r0 = r3 & 7
            int r11 = r0 << 3
            long r9 = r14 >> r11
            long r9 = r9 & r5
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            int r13 = r13 - r0
            r12.A00 = r13
            long r9 = r5 << r11
            long r0 = ~r9
            long r14 = r14 & r0
            long r0 = r7 << r11
            long r14 = r14 | r0
            r4[r16] = r14
            int r0 = r12.A00
            int r0 = X.AnonymousClass001.A01(r3, r0)
            int r11 = r0 >> 3
            r0 = r0 & 7
            int r2 = r0 << 3
            r9 = r4[r11]
            long r5 = r5 << r2
            long r0 = ~r5
            long r0 = r0 & r9
            long r7 = r7 << r2
            long r0 = r0 | r7
            r4[r11] = r0
        L_0x0136:
            int[] r0 = r12.A02
            r0[r3] = r30
            java.lang.Object[] r0 = r12.A04
            r0[r3] = r26
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass61Q.A00(java.lang.Object, int):X.4gP");
    }

    public AnonymousClass61Q() {
        AnonymousClass0G6 r0 = AnonymousClass0R9.A00;
        this.A01 = new AnonymousClass0G6(6);
    }
}
