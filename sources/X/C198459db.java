package X;

/* renamed from: X.9db  reason: invalid class name and case insensitive filesystem */
public final class C198459db {
    public final AnonymousClass9DM A00 = new AnonymousClass9DM(C200059gX.A0D);

    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0448, code lost:
        if (r7[2] != -65) goto L_0x044a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04c2 A[Catch:{ UnsupportedEncodingException -> 0x0739, UnsupportedEncodingException -> 0x0720, UnsupportedEncodingException -> 0x0711, IllegalArgumentException -> 0x076a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass9NW A00(X.C199489fO r35, java.util.Map r36) {
        /*
            r34 = this;
            r2 = r35
            X.9kw r29 = r2.A02()
            X.9jI r0 = r2.A01()
            java.lang.Integer r0 = r0.A01
            r33 = r0
            X.9jI r0 = r2.A01()
            X.9kw r5 = r2.A02()
            X.8yI[] r1 = X.C187668yI.values()
            byte r0 = r0.A00
            r3 = r1[r0]
            X.AUY r12 = r2.A03
            int r11 = r12.A00
            r2 = 0
        L_0x0023:
            if (r2 >= r11) goto L_0x0037
            r1 = 0
        L_0x0026:
            if (r1 >= r11) goto L_0x0034
            boolean r0 = r3.A00(r2, r1)
            if (r0 == 0) goto L_0x0031
            r12.A00(r1, r2)
        L_0x0031:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0037:
            int r7 = r5.A01
            int r0 = r7 * 4
            int r6 = r0 + 17
            X.AUY r10 = new X.AUY
            r10.<init>(r6, r6)
            r9 = 0
            r4 = 9
            r10.A02(r9, r9, r4, r4)
            int r1 = r6 + -8
            r0 = 8
            r10.A02(r1, r9, r0, r4)
            r10.A02(r9, r1, r4, r0)
            int[] r14 = r5.A02
            int r13 = r14.length
            r8 = 0
        L_0x0056:
            if (r8 >= r13) goto L_0x007b
            r0 = r14[r8]
            int r3 = r0 + -2
            r2 = 0
        L_0x005d:
            if (r2 >= r13) goto L_0x0078
            if (r8 != 0) goto L_0x0067
            if (r2 == 0) goto L_0x0075
            int r0 = r13 + -1
            if (r2 == r0) goto L_0x0075
        L_0x0067:
            int r0 = r13 + -1
            if (r8 != r0) goto L_0x006d
            if (r2 == 0) goto L_0x0075
        L_0x006d:
            r0 = r14[r2]
            int r1 = r0 + -2
            r0 = 5
            r10.A02(r1, r3, r0, r0)
        L_0x0075:
            int r2 = r2 + 1
            goto L_0x005d
        L_0x0078:
            int r8 = r8 + 1
            goto L_0x0056
        L_0x007b:
            int r1 = r6 + -17
            r8 = 6
            r0 = 1
            r10.A02(r8, r4, r0, r1)
            r10.A02(r4, r8, r1, r0)
            if (r7 <= r8) goto L_0x0090
            int r1 = r6 + -11
            r0 = 3
            r10.A02(r1, r9, r0, r8)
            r10.A02(r9, r1, r8, r0)
        L_0x0090:
            int r7 = r5.A00
            byte[] r6 = new byte[r7]
            int r16 = r11 + -1
            r15 = 1
            r5 = r16
            r1 = 0
            r13 = 0
        L_0x009b:
            if (r5 <= 0) goto L_0x00d6
            if (r5 != r8) goto L_0x00a0
            r5 = 5
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            if (r4 >= r11) goto L_0x00d1
            r3 = r4
            if (r15 == 0) goto L_0x00a8
            int r3 = r16 - r4
        L_0x00a8:
            r2 = 0
        L_0x00a9:
            int r14 = r5 - r2
            boolean r0 = r10.A03(r14, r3)
            if (r0 != 0) goto L_0x00c9
            int r1 = r1 + 1
            int r13 = r13 << 1
            boolean r0 = r12.A03(r14, r3)
            if (r0 == 0) goto L_0x00bd
            r13 = r13 | 1
        L_0x00bd:
            r0 = 8
            if (r1 != r0) goto L_0x00c9
            int r1 = r9 + 1
            byte r0 = (byte) r13
            r6[r9] = r0
            r9 = r1
            r1 = 0
            r13 = 0
        L_0x00c9:
            int r2 = r2 + 1
            r0 = 2
            if (r2 < r0) goto L_0x00a9
            int r4 = r4 + 1
            goto L_0x00a1
        L_0x00d1:
            r15 = r15 ^ 1
            int r5 = r5 + -2
            goto L_0x009b
        L_0x00d6:
            if (r9 != r7) goto L_0x0774
            r0 = r29
            int r0 = r0.A00
            if (r7 != r0) goto L_0x076f
            r0 = r29
            X.9H5[] r1 = r0.A03
            int r0 = r33.intValue()
            r3 = r1[r0]
            X.9H4[] r11 = r3.A01
            int r10 = r11.length
            r13 = 0
            r1 = 0
            r4 = 0
        L_0x00ee:
            if (r1 >= r10) goto L_0x00f8
            r0 = r11[r1]
            int r0 = r0.A00
            int r4 = r4 + r0
            int r1 = r1 + 1
            goto L_0x00ee
        L_0x00f8:
            r26 = r4
            X.9H3[] r0 = new X.AnonymousClass9H3[r4]
            r21 = r0
            r12 = 0
            r9 = 0
        L_0x0100:
            if (r12 >= r10) goto L_0x0120
            r8 = r11[r12]
            r7 = 0
        L_0x0105:
            int r0 = r8.A00
            if (r7 >= r0) goto L_0x011d
            int r5 = r8.A01
            int r0 = r3.A00
            int r0 = r0 + r5
            int r2 = r9 + 1
            byte[] r1 = new byte[r0]
            X.9H3 r0 = new X.9H3
            r0.<init>(r5, r1)
            r21[r9] = r0
            int r7 = r7 + 1
            r9 = r2
            goto L_0x0105
        L_0x011d:
            int r12 = r12 + 1
            goto L_0x0100
        L_0x0120:
            r0 = r21[r13]
            byte[] r0 = r0.A01
            int r8 = r0.length
        L_0x0125:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0131
            r0 = r21[r4]
            byte[] r0 = r0.A01
            int r0 = r0.length
            if (r0 == r8) goto L_0x0131
            goto L_0x0125
        L_0x0131:
            int r7 = r4 + 1
            int r0 = r3.A00
            int r5 = r8 - r0
            r3 = 0
            r4 = 0
        L_0x0139:
            r2 = r7
            if (r3 >= r5) goto L_0x014f
            r2 = 0
        L_0x013d:
            if (r2 >= r9) goto L_0x014c
            r0 = r21[r2]
            byte[] r1 = r0.A01
            int r0 = r4 + 1
            X.C165617ti.A0h(r6, r1, r4, r3)
            int r2 = r2 + 1
            r4 = r0
            goto L_0x013d
        L_0x014c:
            int r3 = r3 + 1
            goto L_0x0139
        L_0x014f:
            if (r2 >= r9) goto L_0x015e
            r0 = r21[r2]
            byte[] r1 = r0.A01
            int r0 = r4 + 1
            X.C165617ti.A0h(r6, r1, r4, r5)
            int r2 = r2 + 1
            r4 = r0
            goto L_0x014f
        L_0x015e:
            if (r5 >= r8) goto L_0x0178
            r3 = 0
        L_0x0161:
            if (r3 >= r9) goto L_0x0175
            int r2 = r5 + 1
            if (r3 >= r7) goto L_0x0168
            r2 = r5
        L_0x0168:
            r0 = r21[r3]
            byte[] r1 = r0.A01
            int r0 = r4 + 1
            X.C165617ti.A0h(r6, r1, r4, r2)
            int r3 = r3 + 1
            r4 = r0
            goto L_0x0161
        L_0x0175:
            int r5 = r5 + 1
            goto L_0x015e
        L_0x0178:
            r2 = 0
            r1 = 0
        L_0x017a:
            r0 = r26
            if (r2 >= r0) goto L_0x0186
            r0 = r21[r2]
            int r0 = r0.A00
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L_0x017a
        L_0x0186:
            byte[] r0 = new byte[r1]
            r32 = r0
            r5 = 0
            r20 = 0
        L_0x018d:
            r0 = r26
            if (r5 >= r0) goto L_0x0381
            r0 = r21[r5]
            byte[] r4 = r0.A01
            int r0 = r0.A00
            r19 = r0
            int r8 = r4.length
            int[] r7 = new int[r8]
            r6 = 0
            r1 = 0
        L_0x019e:
            if (r1 >= r8) goto L_0x01a9
            byte r0 = r4[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r7[r1] = r0
            int r1 = r1 + 1
            goto L_0x019e
        L_0x01a9:
            r0 = r34
            X.9DM r0 = r0.A00     // Catch:{ 91Y -> 0x0374 }
            int r18 = r8 - r19
            X.9gX r3 = r0.A00     // Catch:{ 91Y -> 0x0374 }
            X.9YH r10 = new X.9YH     // Catch:{ 91Y -> 0x0374 }
            r10.<init>(r3, r7)     // Catch:{ 91Y -> 0x0374 }
            r0 = r18
            int[] r11 = new int[r0]     // Catch:{ 91Y -> 0x0374 }
            r2 = 0
            r1 = 1
            r12 = 0
            r13 = 1
        L_0x01be:
            r0 = r18
            if (r12 >= r0) goto L_0x01d5
            int[] r0 = r3.A02     // Catch:{ 91Y -> 0x0374 }
            r0 = r0[r12]     // Catch:{ 91Y -> 0x0374 }
            int r9 = r10.A00(r0)     // Catch:{ 91Y -> 0x0374 }
            int r0 = r18 + -1
            int r0 = r0 - r12
            r11[r0] = r9     // Catch:{ 91Y -> 0x0374 }
            if (r9 == 0) goto L_0x01d2
            r13 = 0
        L_0x01d2:
            int r12 = r12 + 1
            goto L_0x01be
        L_0x01d5:
            if (r13 != 0) goto L_0x0348
            X.9YH r10 = new X.9YH     // Catch:{ 91Y -> 0x0374 }
            r10.<init>(r3, r11)     // Catch:{ 91Y -> 0x0374 }
            if (r18 < 0) goto L_0x036f
            int r0 = r18 + 1
            int[] r9 = new int[r0]     // Catch:{ 91Y -> 0x0374 }
            r9[r6] = r1     // Catch:{ 91Y -> 0x0374 }
            X.9YH r17 = new X.9YH     // Catch:{ 91Y -> 0x0374 }
            r0 = r17
            r0.<init>(r3, r9)     // Catch:{ 91Y -> 0x0374 }
            r9 = r10
            int[] r0 = r0.A01     // Catch:{ 91Y -> 0x0374 }
            int r0 = r0.length     // Catch:{ 91Y -> 0x0374 }
            int r11 = r0 + -1
            int[] r0 = r10.A01     // Catch:{ 91Y -> 0x0374 }
            int r0 = r0.length     // Catch:{ 91Y -> 0x0374 }
            int r0 = r0 + -1
            if (r11 >= r0) goto L_0x01fc
            r9 = r17
            r17 = r10
        L_0x01fc:
            X.9YH r0 = r3.A01     // Catch:{ 91Y -> 0x0374 }
            r25 = r0
            r24 = r0
            X.9YH r11 = r3.A00     // Catch:{ 91Y -> 0x0374 }
        L_0x0204:
            r23 = r9
            r9 = r17
            r17 = r23
            r22 = r24
            r24 = r11
            r0 = r23
            int[] r10 = r0.A01     // Catch:{ 91Y -> 0x0374 }
            int r0 = r10.length     // Catch:{ 91Y -> 0x0374 }
            int r12 = r0 + -1
            r13 = 2
            int r0 = r18 / 2
            if (r12 < r0) goto L_0x0286
            r0 = r10[r6]     // Catch:{ 91Y -> 0x0374 }
            if (r0 != 0) goto L_0x0226
            java.lang.String r0 = "r_{i-1} was zero"
            X.91Y r1 = new X.91Y     // Catch:{ 91Y -> 0x0374 }
            r1.<init>(r0)     // Catch:{ 91Y -> 0x0374 }
        L_0x0225:
            throw r1     // Catch:{ 91Y -> 0x0374 }
        L_0x0226:
            r13 = r25
            int r0 = r12 - r12
            r0 = r10[r0]     // Catch:{ 91Y -> 0x0374 }
            int r16 = r3.A00(r0)     // Catch:{ 91Y -> 0x0374 }
        L_0x0230:
            int[] r0 = r9.A01     // Catch:{ 91Y -> 0x0374 }
            int r0 = r0.length     // Catch:{ 91Y -> 0x0374 }
            int r0 = r0 + -1
            if (r0 < r12) goto L_0x026e
            int[] r0 = r9.A01     // Catch:{ 91Y -> 0x0374 }
            r0 = r0[r6]     // Catch:{ 91Y -> 0x0374 }
            if (r0 == 0) goto L_0x026e
            int[] r14 = r9.A01     // Catch:{ 91Y -> 0x0374 }
            int r0 = r14.length     // Catch:{ 91Y -> 0x0374 }
            int r0 = r0 + -1
            int r10 = r0 - r12
            int r0 = r0 - r0
            r14 = r14[r0]     // Catch:{ 91Y -> 0x0374 }
            r0 = r16
            int r14 = r3.A01(r14, r0)     // Catch:{ 91Y -> 0x0374 }
            if (r10 < 0) goto L_0x036a
            if (r14 != 0) goto L_0x0254
            r15 = r25
            goto L_0x025f
        L_0x0254:
            int r0 = r10 + 1
            int[] r0 = new int[r0]     // Catch:{ 91Y -> 0x0374 }
            r0[r6] = r14     // Catch:{ 91Y -> 0x0374 }
            X.9YH r15 = new X.9YH     // Catch:{ 91Y -> 0x0374 }
            r15.<init>(r3, r0)     // Catch:{ 91Y -> 0x0374 }
        L_0x025f:
            X.9YH r13 = r13.A03(r15)     // Catch:{ 91Y -> 0x0374 }
            r0 = r23
            X.9YH r0 = r0.A02(r10, r14)     // Catch:{ 91Y -> 0x0374 }
            X.9YH r9 = r9.A03(r0)     // Catch:{ 91Y -> 0x0374 }
            goto L_0x0230
        L_0x026e:
            X.9YH r10 = r13.A04(r11)     // Catch:{ 91Y -> 0x0374 }
            r0 = r22
            X.9YH r11 = r10.A03(r0)     // Catch:{ 91Y -> 0x0374 }
            int[] r0 = r9.A01     // Catch:{ 91Y -> 0x0374 }
            int r0 = r0.length     // Catch:{ 91Y -> 0x0374 }
            int r0 = r0 + -1
            if (r0 < r12) goto L_0x0204
            java.lang.String r0 = "Division algorithm failed to reduce polynomial?"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)     // Catch:{ 91Y -> 0x0374 }
            goto L_0x0225
        L_0x0286:
            int[] r9 = r11.A01     // Catch:{ 91Y -> 0x0374 }
            int r0 = r9.length     // Catch:{ 91Y -> 0x0374 }
            int r0 = r0 + -1
            r0 = r9[r0]     // Catch:{ 91Y -> 0x0374 }
            if (r0 == 0) goto L_0x033f
            int r9 = r3.A00(r0)     // Catch:{ 91Y -> 0x0374 }
            X.9YH r10 = r11.A01(r9)     // Catch:{ 91Y -> 0x0374 }
            r0 = r23
            X.9YH r9 = r0.A01(r9)     // Catch:{ 91Y -> 0x0374 }
            X.9YH[] r0 = new X.AnonymousClass9YH[r13]     // Catch:{ 91Y -> 0x0374 }
            r0[r6] = r10     // Catch:{ 91Y -> 0x0374 }
            r0[r1] = r9     // Catch:{ 91Y -> 0x0374 }
            r13 = r0[r6]     // Catch:{ 91Y -> 0x0374 }
            r18 = r0[r1]     // Catch:{ 91Y -> 0x0374 }
            int[] r14 = r13.A01     // Catch:{ 91Y -> 0x0374 }
            int r0 = r14.length     // Catch:{ 91Y -> 0x0374 }
            int r11 = r0 + -1
            r10 = 0
            r9 = 1
            if (r11 != r1) goto L_0x02bb
            int[] r12 = new int[r1]     // Catch:{ 91Y -> 0x0374 }
            r0 = r14[r6]     // Catch:{ 91Y -> 0x0374 }
            r12[r6] = r0     // Catch:{ 91Y -> 0x0374 }
        L_0x02b6:
            int r11 = r12.length     // Catch:{ 91Y -> 0x0374 }
            int[] r10 = new int[r11]     // Catch:{ 91Y -> 0x0374 }
            r13 = 0
            goto L_0x02d8
        L_0x02bb:
            int[] r12 = new int[r11]     // Catch:{ 91Y -> 0x0374 }
            goto L_0x02c2
        L_0x02be:
            r0 = 256(0x100, float:3.59E-43)
            if (r9 >= r0) goto L_0x02d5
        L_0x02c2:
            if (r10 >= r11) goto L_0x02d5
            int r0 = r13.A00(r9)     // Catch:{ 91Y -> 0x0374 }
            if (r0 != 0) goto L_0x02d2
            int r0 = r3.A00(r9)     // Catch:{ 91Y -> 0x0374 }
            r12[r10] = r0     // Catch:{ 91Y -> 0x0374 }
            int r10 = r10 + 1
        L_0x02d2:
            int r9 = r9 + 1
            goto L_0x02be
        L_0x02d5:
            if (r10 == r11) goto L_0x02b6
            goto L_0x0336
        L_0x02d8:
            if (r13 >= r11) goto L_0x030e
            r0 = r12[r13]     // Catch:{ 91Y -> 0x0374 }
            int r9 = r3.A00(r0)     // Catch:{ 91Y -> 0x0374 }
            r14 = 1
            r15 = 0
        L_0x02e2:
            if (r15 >= r11) goto L_0x02fb
            if (r13 == r15) goto L_0x02f8
            r0 = r12[r15]     // Catch:{ 91Y -> 0x0374 }
            int r17 = r3.A01(r0, r9)     // Catch:{ 91Y -> 0x0374 }
            r16 = r17 & 1
            r0 = r17 & -2
            if (r16 != 0) goto L_0x02f4
            r0 = r17 | 1
        L_0x02f4:
            int r14 = r3.A01(r14, r0)     // Catch:{ 91Y -> 0x0374 }
        L_0x02f8:
            int r15 = r15 + 1
            goto L_0x02e2
        L_0x02fb:
            r0 = r18
            int r9 = r0.A00(r9)     // Catch:{ 91Y -> 0x0374 }
            int r0 = r3.A00(r14)     // Catch:{ 91Y -> 0x0374 }
            int r0 = r3.A01(r9, r0)     // Catch:{ 91Y -> 0x0374 }
            r10[r13] = r0     // Catch:{ 91Y -> 0x0374 }
            int r13 = r13 + 1
            goto L_0x02d8
        L_0x030e:
            if (r2 >= r11) goto L_0x0348
            int r13 = r8 - r1
            r9 = r12[r2]     // Catch:{ 91Y -> 0x0374 }
            if (r9 == 0) goto L_0x0330
            int[] r0 = r3.A03     // Catch:{ 91Y -> 0x0374 }
            r0 = r0[r9]     // Catch:{ 91Y -> 0x0374 }
            int r13 = r13 - r0
            if (r13 < 0) goto L_0x0327
            r9 = r7[r13]     // Catch:{ 91Y -> 0x0374 }
            r0 = r10[r2]     // Catch:{ 91Y -> 0x0374 }
            r9 = r9 ^ r0
            r7[r13] = r9     // Catch:{ 91Y -> 0x0374 }
            int r2 = r2 + 1
            goto L_0x030e
        L_0x0327:
            java.lang.String r0 = "Bad error location"
            X.91Y r1 = new X.91Y     // Catch:{ 91Y -> 0x0374 }
            r1.<init>(r0)     // Catch:{ 91Y -> 0x0374 }
            goto L_0x0225
        L_0x0330:
            java.lang.IllegalArgumentException r1 = X.C165617ti.A0U()     // Catch:{ 91Y -> 0x0374 }
            goto L_0x0225
        L_0x0336:
            java.lang.String r0 = "Error locator degree does not match number of roots"
            X.91Y r1 = new X.91Y     // Catch:{ 91Y -> 0x0374 }
            r1.<init>(r0)     // Catch:{ 91Y -> 0x0374 }
            goto L_0x0225
        L_0x033f:
            java.lang.String r0 = "sigmaTilde(0) was zero"
            X.91Y r1 = new X.91Y     // Catch:{ 91Y -> 0x0374 }
            r1.<init>(r0)     // Catch:{ 91Y -> 0x0374 }
            goto L_0x0225
        L_0x0348:
            r0 = r19
            if (r6 >= r0) goto L_0x0353
            r0 = r7[r6]
            int r6 = X.C165617ti.A07(r4, r0, r6)
            goto L_0x0348
        L_0x0353:
            r3 = 0
        L_0x0354:
            r0 = r19
            if (r3 >= r0) goto L_0x0366
            int r2 = r20 + 1
            r1 = r20
            r0 = r32
            X.C165617ti.A0h(r4, r0, r3, r1)
            int r3 = r3 + 1
            r20 = r2
            goto L_0x0354
        L_0x0366:
            int r5 = r5 + 1
            goto L_0x018d
        L_0x036a:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()     // Catch:{ 91Y -> 0x0374 }
            throw r0     // Catch:{ 91Y -> 0x0374 }
        L_0x036f:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()     // Catch:{ 91Y -> 0x0374 }
            throw r0     // Catch:{ 91Y -> 0x0374 }
        L_0x0374:
            boolean r0 = X.AnonymousClass92A.A00
            if (r0 == 0) goto L_0x037e
            X.8Sm r0 = new X.8Sm
            r0.<init>()
            throw r0
        L_0x037e:
            X.8Sm r0 = X.C173648Sm.A00
            throw r0
        L_0x0381:
            X.9U9 r13 = new X.9U9
            r0 = r32
            r13.<init>(r0)
            r0 = 50
            java.lang.StringBuilder r12 = X.C90524aI.A0h(r0)
            r11 = 1
            java.util.ArrayList r28 = X.C36441kJ.A14(r11)
            r27 = 0
            r0 = r27
            r26 = 0
            r30 = -1
            r31 = -1
        L_0x039d:
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            r3 = 4
            r2 = 6
            if (r1 >= r3) goto L_0x06c7
            X.8zy r10 = X.C188638zy.A0A     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x03a7:
            int r4 = r10.ordinal()     // Catch:{ IllegalArgumentException -> 0x076a }
            switch(r4) {
                case 0: goto L_0x06c2;
                case 1: goto L_0x03ae;
                case 2: goto L_0x03ae;
                case 3: goto L_0x068f;
                case 4: goto L_0x03ae;
                case 5: goto L_0x05fc;
                case 6: goto L_0x03ae;
                case 7: goto L_0x063f;
                case 8: goto L_0x063f;
                case 9: goto L_0x0643;
                default: goto L_0x03ae;
            }     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x03ae:
            r1 = r29
            int r1 = r10.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r9 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r4 == r11) goto L_0x05b5
            r8 = 2
            if (r4 == r8) goto L_0x0550
            if (r4 == r3) goto L_0x03fe
            if (r4 != r2) goto L_0x071b
            int r2 = r9 * 13
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r2 > r1) goto L_0x0716
            int r1 = r9 * 2
            byte[] r4 = new byte[r1]     // Catch:{ IllegalArgumentException -> 0x076a }
            r5 = 0
        L_0x03ce:
            if (r9 <= 0) goto L_0x03f2
            r1 = 13
            int r2 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r2 / 192
            int r1 = r1 << 8
            int r3 = r2 % 192
            r3 = r3 | r1
            r2 = 7936(0x1f00, float:1.1121E-41)
            r1 = 49472(0xc140, float:6.9325E-41)
            if (r3 >= r2) goto L_0x03e7
            r1 = 33088(0x8140, float:4.6366E-41)
        L_0x03e7:
            int r3 = r3 + r1
            int r1 = r3 >> 8
            X.C165607th.A15(r1, r4, r5, r3)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r5 = r5 + 2
            int r9 = r9 + -1
            goto L_0x03ce
        L_0x03f2:
            java.lang.String r2 = "SJIS"
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0711 }
            r1.<init>(r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x0711 }
            r12.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0711 }
            goto L_0x06c2
        L_0x03fe:
            int r2 = r9 << 3
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r2 > r1) goto L_0x0725
            byte[] r7 = new byte[r9]     // Catch:{ IllegalArgumentException -> 0x076a }
            r2 = 0
        L_0x0409:
            if (r2 >= r9) goto L_0x0416
            r1 = 8
            int r1 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r2 = X.C165617ti.A07(r7, r1, r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0409
        L_0x0416:
            if (r0 != 0) goto L_0x053d
            boolean r1 = X.C190779Ag.A01     // Catch:{ IllegalArgumentException -> 0x076a }
            r3 = r36
            if (r36 == 0) goto L_0x0430
            X.8zT r2 = X.C188368zT.A01     // Catch:{ IllegalArgumentException -> 0x076a }
            boolean r1 = r3.containsKey(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 == 0) goto L_0x0430
            java.lang.Object r1 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            java.lang.String r2 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0541
        L_0x0430:
            r1 = 3
            r25 = 1
            r14 = 0
            if (r9 <= r1) goto L_0x044a
            byte r2 = r7[r14]     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = -17
            if (r2 != r1) goto L_0x044a
            byte r2 = r7[r11]     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = -69
            if (r2 != r1) goto L_0x044a
            byte r2 = r7[r8]     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = -65
            r24 = 1
            if (r2 == r1) goto L_0x044c
        L_0x044a:
            r24 = 0
        L_0x044c:
            r6 = 0
            r23 = 1
            r22 = 1
            r5 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r4 = 0
            r16 = 0
            r3 = 0
            r2 = 0
        L_0x0461:
            if (r5 >= r9) goto L_0x04fb
            if (r25 != 0) goto L_0x0469
            if (r23 != 0) goto L_0x0469
            if (r22 == 0) goto L_0x0507
        L_0x0469:
            byte r1 = r7[r5]     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r22 == 0) goto L_0x0477
            r15 = r1 & 128(0x80, float:1.794E-43)
            if (r21 <= 0) goto L_0x04d6
            if (r15 == 0) goto L_0x04f7
            int r21 = r21 + -1
        L_0x0477:
            r15 = 127(0x7f, float:1.78E-43)
            if (r25 == 0) goto L_0x0483
            if (r1 <= r15) goto L_0x0483
            r15 = 160(0xa0, float:2.24E-43)
            if (r1 >= r15) goto L_0x04c7
            r25 = 0
        L_0x0483:
            if (r23 == 0) goto L_0x0495
            if (r20 <= 0) goto L_0x0498
            r15 = 64
            if (r1 < r15) goto L_0x04c4
            r15 = 127(0x7f, float:1.78E-43)
            if (r1 == r15) goto L_0x04c4
            r15 = 252(0xfc, float:3.53E-43)
            if (r1 > r15) goto L_0x04c4
            r20 = 0
        L_0x0495:
            int r5 = r5 + 1
            goto L_0x0461
        L_0x0498:
            r15 = 128(0x80, float:1.794E-43)
            if (r1 == r15) goto L_0x04c4
            r15 = 160(0xa0, float:2.24E-43)
            if (r1 == r15) goto L_0x04c4
            r15 = 239(0xef, float:3.35E-43)
            if (r1 > r15) goto L_0x04c4
            r15 = 160(0xa0, float:2.24E-43)
            if (r1 <= r15) goto L_0x04b5
            r15 = 224(0xe0, float:3.14E-43)
            if (r1 >= r15) goto L_0x04bc
            int r6 = r6 + 1
            int r2 = r2 + 1
            if (r2 <= r4) goto L_0x04b3
            r4 = r2
        L_0x04b3:
            r3 = 0
            goto L_0x0495
        L_0x04b5:
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 > r2) goto L_0x04bc
            r3 = 0
        L_0x04ba:
            r2 = 0
            goto L_0x0495
        L_0x04bc:
            r20 = 1
            int r3 = r3 + 1
            if (r3 <= r14) goto L_0x04ba
            r14 = r3
            goto L_0x04ba
        L_0x04c4:
            r23 = 0
            goto L_0x0495
        L_0x04c7:
            r15 = 192(0xc0, float:2.69E-43)
            if (r1 < r15) goto L_0x04d3
            r15 = 215(0xd7, float:3.01E-43)
            if (r1 == r15) goto L_0x04d3
            r15 = 247(0xf7, float:3.46E-43)
            if (r1 != r15) goto L_0x0483
        L_0x04d3:
            int r16 = r16 + 1
            goto L_0x0483
        L_0x04d6:
            if (r15 == 0) goto L_0x0477
            r15 = r1 & 64
            if (r15 == 0) goto L_0x04f7
            int r21 = r21 + 1
            r15 = r1 & 32
            if (r15 != 0) goto L_0x04e5
            int r19 = r19 + 1
            goto L_0x0477
        L_0x04e5:
            int r21 = r21 + 1
            r15 = r1 & 16
            if (r15 != 0) goto L_0x04ee
            int r18 = r18 + 1
            goto L_0x0477
        L_0x04ee:
            int r21 = r21 + 1
            r15 = r1 & 8
            if (r15 != 0) goto L_0x04f7
            int r17 = r17 + 1
            goto L_0x0477
        L_0x04f7:
            r22 = 0
            goto L_0x0477
        L_0x04fb:
            if (r22 == 0) goto L_0x0501
            if (r21 <= 0) goto L_0x0501
            r22 = 0
        L_0x0501:
            if (r23 == 0) goto L_0x0507
            if (r20 <= 0) goto L_0x0507
            r23 = 0
        L_0x0507:
            java.lang.String r2 = "UTF8"
            if (r22 == 0) goto L_0x0514
            if (r24 != 0) goto L_0x0541
            int r19 = r19 + r18
            int r19 = r19 + r17
            if (r19 <= 0) goto L_0x0514
            goto L_0x0541
        L_0x0514:
            java.lang.String r5 = "SJIS"
            if (r23 == 0) goto L_0x051d
            boolean r1 = X.C190779Ag.A01     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 != 0) goto L_0x0536
            goto L_0x0531
        L_0x051d:
            java.lang.String r3 = "ISO8859_1"
            if (r25 == 0) goto L_0x052c
            if (r23 == 0) goto L_0x0538
            if (r4 != r8) goto L_0x0527
            if (r6 == r8) goto L_0x0536
        L_0x0527:
            int r1 = r16 * 10
            if (r1 < r9) goto L_0x0538
            goto L_0x0536
        L_0x052c:
            if (r23 != 0) goto L_0x0536
            if (r22 != 0) goto L_0x0541
            goto L_0x053a
        L_0x0531:
            r1 = 3
            if (r4 >= r1) goto L_0x0536
            if (r14 < r1) goto L_0x051d
        L_0x0536:
            r2 = r5
            goto L_0x0541
        L_0x0538:
            r2 = r3
            goto L_0x0541
        L_0x053a:
            java.lang.String r2 = X.C190779Ag.A00     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0541
        L_0x053d:
            java.lang.String r2 = r0.name()     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0541:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0720 }
            r1.<init>(r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x0720 }
            r12.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0720 }
            r1 = r28
            r1.add(r7)     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x06c2
        L_0x0550:
            int r4 = r12.length()     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0554:
            if (r9 <= r11) goto L_0x0577
            int r3 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = 11
            if (r3 < r1) goto L_0x072a
            int r3 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r3 / 45
            char r1 = X.C196669aL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r3 % 45
            char r1 = X.C196669aL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r9 = r9 + -2
            goto L_0x0554
        L_0x0577:
            if (r9 != r11) goto L_0x058a
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 < r2) goto L_0x072a
            int r1 = r13.A01(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            char r1 = X.C196669aL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x058a:
            if (r26 == 0) goto L_0x06c2
        L_0x058c:
            int r1 = r12.length()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r4 >= r1) goto L_0x06c2
            char r1 = r12.charAt(r4)     // Catch:{ IllegalArgumentException -> 0x076a }
            r3 = 37
            if (r1 != r3) goto L_0x05b2
            int r1 = r12.length()     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r1 - r11
            if (r4 >= r1) goto L_0x05ad
            int r2 = r4 + 1
            char r1 = r12.charAt(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 != r3) goto L_0x05ad
            r12.deleteCharAt(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x05b2
        L_0x05ad:
            r1 = 29
            r12.setCharAt(r4, r1)     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x05b2:
            int r4 = r4 + 1
            goto L_0x058c
        L_0x05b5:
            r1 = 3
            r4 = 10
            if (r9 < r1) goto L_0x05e7
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 < r4) goto L_0x075b
            int r2 = r13.A01(r4)     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r2 >= r1) goto L_0x075b
            int r1 = r2 / 100
            char r1 = X.C196669aL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r2 / 10
            int r1 = r1 % r4
            char r1 = X.C196669aL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r2 % 10
            char r1 = X.C196669aL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r9 = r9 + -3
            goto L_0x05b5
        L_0x05e7:
            r1 = 2
            if (r9 != r1) goto L_0x05ec
            goto L_0x06a2
        L_0x05ec:
            if (r9 != r11) goto L_0x06c2
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 < r3) goto L_0x075b
            int r2 = r13.A01(r3)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r2 >= r4) goto L_0x075b
            goto L_0x06bb
        L_0x05fc:
            r3 = 8
            int r2 = r13.A01(r3)     // Catch:{ IllegalArgumentException -> 0x076a }
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0607
            goto L_0x0628
        L_0x0607:
            r1 = r2 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 != r0) goto L_0x0616
            int r1 = r13.A01(r3)     // Catch:{ IllegalArgumentException -> 0x076a }
            r0 = r2 & 63
            int r0 = r0 << 8
            goto L_0x0626
        L_0x0616:
            r1 = r2 & 224(0xe0, float:3.14E-43)
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 != r0) goto L_0x0734
            r0 = 16
            int r1 = r13.A01(r0)     // Catch:{ IllegalArgumentException -> 0x076a }
            r0 = r2 & 31
            int r0 = r0 << 16
        L_0x0626:
            r1 = r1 | r0
            goto L_0x062a
        L_0x0628:
            r1 = r2 & 127(0x7f, float:1.78E-43)
        L_0x062a:
            if (r1 < 0) goto L_0x072f
            r0 = 900(0x384, float:1.261E-42)
            if (r1 >= r0) goto L_0x072f
            java.util.Map r0 = X.AnonymousClass903.A01     // Catch:{ IllegalArgumentException -> 0x076a }
            java.lang.Object r0 = X.C36371kC.A0r(r0, r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            X.903 r0 = (X.AnonymousClass903) r0     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r0 != 0) goto L_0x06c2
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x063f:
            r26 = 1
            goto L_0x06c2
        L_0x0643:
            int r2 = r13.A01(r3)     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = r29
            int r1 = r10.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r6 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r2 != r11) goto L_0x06c2
            int r2 = r6 * 13
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r2 > r1) goto L_0x073e
            int r1 = r6 * 2
            byte[] r4 = new byte[r1]     // Catch:{ IllegalArgumentException -> 0x076a }
            r5 = 0
        L_0x0660:
            if (r6 <= 0) goto L_0x0684
            r1 = 13
            int r2 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r2 / 96
            int r1 = r1 << 8
            int r3 = r2 % 96
            r3 = r3 | r1
            r2 = 959(0x3bf, float:1.344E-42)
            r1 = 42657(0xa6a1, float:5.9775E-41)
            if (r3 >= r2) goto L_0x0679
            r1 = 41377(0xa1a1, float:5.7982E-41)
        L_0x0679:
            int r3 = r3 + r1
            int r1 = r3 >> 8
            X.C165607th.A15(r1, r4, r5, r3)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r5 = r5 + 2
            int r6 = r6 + -1
            goto L_0x0660
        L_0x0684:
            java.lang.String r2 = "GB2312"
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0739 }
            r1.<init>(r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x0739 }
            r12.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0739 }
            goto L_0x06c2
        L_0x068f:
            int r2 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = 16
            if (r2 < r1) goto L_0x0760
            r1 = 8
            int r30 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r31 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x06c2
        L_0x06a2:
            int r2 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = 7
            if (r2 < r1) goto L_0x075b
            int r2 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = 100
            if (r2 >= r1) goto L_0x075b
            int r1 = r2 / 10
            char r1 = X.C196669aL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r2 = r2 % r4
        L_0x06bb:
            char r1 = X.C196669aL.A00(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x06c2:
            X.8zy r1 = X.C188638zy.A0A     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r10 != r1) goto L_0x039d
            goto L_0x0743
        L_0x06c7:
            int r4 = r13.A01(r3)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r4 == 0) goto L_0x070d
            if (r4 == r11) goto L_0x0709
            r1 = 2
            if (r4 == r1) goto L_0x0705
            r1 = 3
            if (r4 == r1) goto L_0x0701
            if (r4 == r3) goto L_0x06fd
            r1 = 5
            if (r4 == r1) goto L_0x06f9
            r1 = 7
            if (r4 == r1) goto L_0x06f5
            r1 = 8
            if (r4 == r1) goto L_0x06f1
            r1 = 9
            if (r4 == r1) goto L_0x06ed
            r1 = 13
            if (r4 != r1) goto L_0x0765
            X.8zy r10 = X.C188638zy.A06     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x03a7
        L_0x06ed:
            X.8zy r10 = X.C188638zy.A05     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x03a7
        L_0x06f1:
            X.8zy r10 = X.C188638zy.A07     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x03a7
        L_0x06f5:
            X.8zy r10 = X.C188638zy.A03     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x03a7
        L_0x06f9:
            X.8zy r10 = X.C188638zy.A04     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x03a7
        L_0x06fd:
            X.8zy r10 = X.C188638zy.A02     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x03a7
        L_0x0701:
            X.8zy r10 = X.C188638zy.A09     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x03a7
        L_0x0705:
            X.8zy r10 = X.C188638zy.A01     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x03a7
        L_0x0709:
            X.8zy r10 = X.C188638zy.A08     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x03a7
        L_0x070d:
            X.8zy r10 = X.C188638zy.A0A     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x03a7
        L_0x0711:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0716:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x071b:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0720:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0725:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x072a:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x072f:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0734:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0739:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x073e:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0743:
            java.lang.String r26 = r12.toString()
            boolean r0 = r28.isEmpty()
            if (r0 == 0) goto L_0x074f
            r28 = r27
        L_0x074f:
            java.lang.String r27 = X.C196679aM.A00(r33)
            X.9NW r25 = new X.9NW
            r29 = r32
            r25.<init>(r26, r27, r28, r29, r30, r31)
            return r25
        L_0x075b:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0760:
            X.8So r0 = X.C173668So.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0765:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x076a:
            X.8So r0 = X.C173668So.A00()
            throw r0
        L_0x076f:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x0774:
            X.8So r0 = X.C173668So.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198459db.A00(X.9fO, java.util.Map):X.9NW");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[Catch:{ 8Sm | 8So -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d A[Catch:{ 8Sm | 8So -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0069 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass9NW A01(X.AUY r10, java.util.Map r11) {
        /*
            r9 = this;
            X.9fO r6 = new X.9fO
            r6.<init>(r10)
            r8 = 0
            X.9NW r0 = r9.A00(r6, r11)     // Catch:{ 8So -> 0x000d, 8Sm -> 0x000b }
            return r0
        L_0x000b:
            r7 = move-exception
            goto L_0x0010
        L_0x000d:
            r0 = move-exception
            r7 = r8
            r8 = r0
        L_0x0010:
            X.9jI r0 = r6.A00     // Catch:{ 8Sm | 8So -> 0x0075 }
            if (r0 == 0) goto L_0x0038
            X.8yI[] r1 = X.C187668yI.values()     // Catch:{ 8Sm | 8So -> 0x0075 }
            X.9jI r0 = r6.A00     // Catch:{ 8Sm | 8So -> 0x0075 }
            byte r0 = r0.A00     // Catch:{ 8Sm | 8So -> 0x0075 }
            r5 = r1[r0]     // Catch:{ 8Sm | 8So -> 0x0075 }
            X.AUY r4 = r6.A03     // Catch:{ 8Sm | 8So -> 0x0075 }
            int r3 = r4.A00     // Catch:{ 8Sm | 8So -> 0x0075 }
            r2 = 0
        L_0x0023:
            r1 = 0
            if (r2 < r3) goto L_0x0027
            goto L_0x0038
        L_0x0027:
            if (r1 >= r3) goto L_0x0035
            boolean r0 = r5.A00(r2, r1)     // Catch:{ 8Sm | 8So -> 0x0075 }
            if (r0 == 0) goto L_0x0032
            r4.A00(r1, r2)     // Catch:{ 8Sm | 8So -> 0x0075 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x0027
        L_0x0035:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0038:
            r1 = 1
            r0 = 0
            r6.A01 = r0     // Catch:{ 8Sm | 8So -> 0x0075 }
            r6.A00 = r0     // Catch:{ 8Sm | 8So -> 0x0075 }
            r6.A02 = r1     // Catch:{ 8Sm | 8So -> 0x0075 }
            r6.A02()     // Catch:{ 8Sm | 8So -> 0x0075 }
            r6.A01()     // Catch:{ 8Sm | 8So -> 0x0075 }
            r5 = 0
        L_0x0047:
            X.AUY r4 = r6.A03     // Catch:{ 8Sm | 8So -> 0x0075 }
            int r0 = r4.A02     // Catch:{ 8Sm | 8So -> 0x0075 }
            if (r5 >= r0) goto L_0x0069
            int r3 = r5 + 1
            r2 = r3
        L_0x0050:
            int r0 = r4.A00     // Catch:{ 8Sm | 8So -> 0x0075 }
            if (r2 >= r0) goto L_0x0067
            boolean r1 = r4.A03(r5, r2)     // Catch:{ 8Sm | 8So -> 0x0075 }
            boolean r0 = r4.A03(r2, r5)     // Catch:{ 8Sm | 8So -> 0x0075 }
            if (r1 == r0) goto L_0x0064
            r4.A00(r2, r5)     // Catch:{ 8Sm | 8So -> 0x0075 }
            r4.A00(r5, r2)     // Catch:{ 8Sm | 8So -> 0x0075 }
        L_0x0064:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x0067:
            r5 = r3
            goto L_0x0047
        L_0x0069:
            X.9NW r1 = r9.A00(r6, r11)     // Catch:{ 8Sm | 8So -> 0x0075 }
            X.95u r0 = new X.95u     // Catch:{ 8Sm | 8So -> 0x0075 }
            r0.<init>()     // Catch:{ 8Sm | 8So -> 0x0075 }
            r1.A00 = r0     // Catch:{ 8Sm | 8So -> 0x0075 }
            return r1
        L_0x0075:
            if (r8 == 0) goto L_0x0078
            throw r8
        L_0x0078:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198459db.A01(X.AUY, java.util.Map):X.9NW");
    }
}
