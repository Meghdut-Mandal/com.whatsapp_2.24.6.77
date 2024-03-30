package X;

/* renamed from: X.9ht  reason: invalid class name and case insensitive filesystem */
public abstract class C200649ht {
    public static final int[] A00 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX WARNING: Code restructure failed: missing block: B:385:0x06e5, code lost:
        r17 = r17 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0275 A[LOOP:8: B:145:0x0273->B:146:0x0275, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x077a  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0070 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0232 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024 A[SYNTHETIC, Splitter:B:8:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9S4 A00(java.lang.Integer r30, java.lang.String r31, java.util.Map r32) {
        /*
            r6 = r32
            if (r32 == 0) goto L_0x0020
            X.8yY r1 = X.C187798yY.CHARACTER_SET
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x0020
            r7 = 1
            java.lang.Object r0 = r6.get(r1)
            java.lang.String r9 = r0.toString()
        L_0x0015:
            java.lang.String r3 = "Shift_JIS"
            boolean r0 = r3.equals(r9)
            r8 = r31
            if (r0 == 0) goto L_0x0044
            goto L_0x0024
        L_0x0020:
            r7 = 0
            java.lang.String r9 = "ISO-8859-1"
            goto L_0x0015
        L_0x0024:
            byte[] r5 = r8.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            int r4 = r5.length
            int r0 = r4 % 2
            if (r0 != 0) goto L_0x0044
            r2 = 0
        L_0x002e:
            if (r2 >= r4) goto L_0x006d
            byte r0 = r5[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 129(0x81, float:1.81E-43)
            if (r1 < r0) goto L_0x0044
            r0 = 159(0x9f, float:2.23E-43)
            if (r1 <= r0) goto L_0x006a
            r0 = 224(0xe0, float:3.14E-43)
            if (r1 < r0) goto L_0x0044
            r0 = 235(0xeb, float:3.3E-43)
            if (r1 <= r0) goto L_0x006a
        L_0x0044:
            r5 = 0
            r1 = 0
            r4 = 0
        L_0x0047:
            int r0 = r8.length()
            if (r5 >= r0) goto L_0x0070
            char r2 = r8.charAt(r5)
            r0 = 48
            if (r2 < r0) goto L_0x005d
            r0 = 57
            if (r2 > r0) goto L_0x005d
            r4 = 1
        L_0x005a:
            int r5 = r5 + 1
            goto L_0x0047
        L_0x005d:
            int[] r1 = A00
            r0 = 96
            if (r2 >= r0) goto L_0x00e0
            r1 = r1[r2]
            r0 = -1
            if (r1 == r0) goto L_0x00e0
            r1 = 1
            goto L_0x005a
        L_0x006a:
            int r2 = r2 + 2
            goto L_0x002e
        L_0x006d:
            X.8zy r1 = X.C188638zy.A07
            goto L_0x0074
        L_0x0070:
            if (r1 == 0) goto L_0x00db
            X.8zy r1 = X.C188638zy.A01
        L_0x0074:
            X.AUZ r5 = new X.AUZ
            r5.<init>()
            X.8zy r4 = X.C188638zy.A02
            if (r1 != r4) goto L_0x009b
            if (r7 == 0) goto L_0x009b
            java.util.Map r0 = X.AnonymousClass903.A00
            java.lang.Object r7 = r0.get(r9)
            X.903 r7 = (X.AnonymousClass903) r7
            if (r7 == 0) goto L_0x009b
            X.8zy r0 = X.C188638zy.A03
            int r2 = r0.bits
            r0 = 4
            r5.A01(r2, r0)
            int[] r2 = r7.values
            r0 = 0
            r2 = r2[r0]
            r0 = 8
            r5.A01(r2, r0)
        L_0x009b:
            if (r32 == 0) goto L_0x00bf
            X.8yY r2 = X.C187798yY.GS1_FORMAT
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r6.get(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bf
            X.8zy r0 = X.C188638zy.A04
            int r2 = r0.bits
            r0 = 4
            r5.A01(r2, r0)
        L_0x00bf:
            int r2 = r1.bits
            r0 = 4
            r5.A01(r2, r0)
            X.AUZ r7 = new X.AUZ
            r7.<init>()
            int r2 = r1.ordinal()
            r0 = 1
            if (r2 == r0) goto L_0x019b
            r0 = 2
            if (r2 == r0) goto L_0x015a
            r0 = 4
            if (r2 == r0) goto L_0x0141
            r0 = 6
            if (r2 != r0) goto L_0x0131
            goto L_0x00e3
        L_0x00db:
            if (r4 == 0) goto L_0x00e0
            X.8zy r1 = X.C188638zy.A08
            goto L_0x0074
        L_0x00e0:
            X.8zy r1 = X.C188638zy.A02
            goto L_0x0074
        L_0x00e3:
            byte[] r10 = r8.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x012a }
            int r9 = r10.length
            r3 = 0
        L_0x00e9:
            if (r3 >= r9) goto L_0x01e0
            byte r0 = r10[r3]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r3 + 1
            byte r0 = r10[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r11 = r2 << 8
            r11 = r11 | r0
            r12 = 33088(0x8140, float:4.6366E-41)
            r2 = -1
            if (r11 < r12) goto L_0x0122
            r0 = 40956(0x9ffc, float:5.7392E-41)
            if (r11 <= r0) goto L_0x0110
            r0 = 57408(0xe040, float:8.0446E-41)
            if (r11 < r0) goto L_0x0122
            r0 = 60351(0xebbf, float:8.457E-41)
            if (r11 > r0) goto L_0x0122
            r12 = 49472(0xc140, float:6.9325E-41)
        L_0x0110:
            int r11 = r11 - r12
            if (r11 == r2) goto L_0x0122
            int r0 = r11 >> 8
            int r2 = r0 * 192
            r0 = r11 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r0
            r0 = 13
            r7.A01(r2, r0)
            int r3 = r3 + 2
            goto L_0x00e9
        L_0x0122:
            java.lang.String r1 = "Invalid byte sequence"
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x012a:
            r1 = move-exception
            X.92E r0 = new X.92E
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0131:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Invalid mode: "
            java.lang.String r1 = r0.concat(r1)
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0141:
            byte[] r10 = r8.getBytes(r9)     // Catch:{ UnsupportedEncodingException -> 0x0153 }
            int r9 = r10.length
            r3 = 0
        L_0x0147:
            if (r3 >= r9) goto L_0x01e0
            byte r2 = r10[r3]
            r0 = 8
            r7.A01(r2, r0)
            int r3 = r3 + 1
            goto L_0x0147
        L_0x0153:
            r1 = move-exception
            X.92E r0 = new X.92E
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x015a:
            int r11 = r8.length()
            r12 = 0
        L_0x015f:
            if (r12 >= r11) goto L_0x01e0
            char r0 = r8.charAt(r12)
            int[] r13 = A00
            r10 = 96
            if (r0 >= r10) goto L_0x0195
            r9 = r13[r0]
            r3 = -1
            if (r9 == r3) goto L_0x0195
            int r2 = r12 + 1
            if (r2 >= r11) goto L_0x0189
            char r0 = r8.charAt(r2)
            if (r0 >= r10) goto L_0x018f
            r0 = r13[r0]
            if (r0 == r3) goto L_0x018f
            int r2 = r9 * 45
            int r2 = r2 + r0
            r0 = 11
            r7.A01(r2, r0)
            int r12 = r12 + 2
            goto L_0x015f
        L_0x0189:
            r0 = 6
            r7.A01(r9, r0)
            r12 = r2
            goto L_0x015f
        L_0x018f:
            X.92E r0 = new X.92E
            r0.<init>()
            throw r0
        L_0x0195:
            X.92E r0 = new X.92E
            r0.<init>()
            throw r0
        L_0x019b:
            int r10 = r8.length()
            r12 = 0
        L_0x01a0:
            if (r12 >= r10) goto L_0x01e0
            char r0 = r8.charAt(r12)
            int r2 = r0 + -48
            int r3 = r12 + 2
            if (r3 >= r10) goto L_0x01c8
            int r0 = r12 + 1
            char r0 = r8.charAt(r0)
            int r11 = r0 + -48
            char r0 = r8.charAt(r3)
            int r9 = r0 + -48
            int r3 = r2 * 100
            r2 = 10
            int r0 = r11 * 10
            int r3 = r3 + r0
            int r3 = r3 + r9
            r7.A01(r3, r2)
            int r12 = r12 + 3
            goto L_0x01a0
        L_0x01c8:
            int r12 = r12 + 1
            if (r12 >= r10) goto L_0x01db
            char r0 = r8.charAt(r12)
            int r0 = r0 + -48
            int r2 = r2 * 10
            int r2 = r2 + r0
            r0 = 7
            r7.A01(r2, r0)
            r12 = r3
            goto L_0x01a0
        L_0x01db:
            r0 = 4
            r7.A01(r2, r0)
            goto L_0x01a0
        L_0x01e0:
            r32 = r30
            if (r6 == 0) goto L_0x0216
            X.8yY r2 = X.C187798yY.QR_VERSION
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L_0x0216
            java.lang.Object r0 = r6.get(r2)
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            X.9kw r2 = X.C202039kw.A02(r0)
            int r3 = r5.A00
            int r0 = r1.A00(r2)
            int r3 = r3 + r0
            int r0 = r7.A00
            int r3 = r3 + r0
            r0 = r32
            boolean r0 = A01(r2, r0, r3)
            if (r0 != 0) goto L_0x0265
            java.lang.String r1 = "Data too big for requested version"
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0216:
            X.9kw[] r2 = X.C202039kw.A04
            r0 = 0
            r0 = r2[r0]
            int r6 = r5.A00
            int r0 = r1.A00(r0)
            int r6 = r6 + r0
            int r0 = r7.A00
            int r6 = r6 + r0
            r3 = 1
        L_0x0226:
            X.9kw r2 = X.C202039kw.A02(r3)
            r0 = r32
            boolean r0 = A01(r2, r0, r6)
            if (r0 == 0) goto L_0x0257
            int r6 = r5.A00
            int r0 = r1.A00(r2)
            int r6 = r6 + r0
            int r0 = r7.A00
            int r6 = r6 + r0
            r3 = 1
        L_0x023d:
            X.9kw r2 = X.C202039kw.A02(r3)
            r0 = r32
            boolean r0 = A01(r2, r0, r6)
            if (r0 != 0) goto L_0x0265
            int r3 = r3 + 1
            r0 = 40
            if (r3 <= r0) goto L_0x023d
            java.lang.String r1 = "Data too big"
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0257:
            int r3 = r3 + 1
            r0 = 40
            if (r3 <= r0) goto L_0x0226
            java.lang.String r1 = "Data too big"
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0265:
            X.AUZ r6 = new X.AUZ
            r6.<init>()
            int r9 = r5.A00
            int r0 = r6.A00
            int r0 = r0 + r9
            X.AUZ.A00(r6, r0)
            r3 = 0
        L_0x0273:
            if (r3 >= r9) goto L_0x027f
            boolean r0 = r5.A03(r3)
            r6.A02(r0)
            int r3 = r3 + 1
            goto L_0x0273
        L_0x027f:
            if (r1 != r4) goto L_0x02a8
            int r0 = r7.A00
            int r0 = r0 + 7
            int r5 = r0 / 8
        L_0x0287:
            int r0 = r1.A00(r2)
            r4 = 1
            int r3 = r4 << r0
            if (r5 >= r3) goto L_0x077a
            r6.A01(r5, r0)
            int r4 = r7.A00
            int r0 = r6.A00
            int r0 = r0 + r4
            X.AUZ.A00(r6, r0)
            r3 = 0
        L_0x029c:
            if (r3 >= r4) goto L_0x02ad
            boolean r0 = r7.A03(r3)
            r6.A02(r0)
            int r3 = r3 + 1
            goto L_0x029c
        L_0x02a8:
            int r5 = r8.length()
            goto L_0x0287
        L_0x02ad:
            X.9H5[] r3 = r2.A03
            int r0 = r32.intValue()
            r10 = r3[r0]
            int r4 = r2.A00
            int r9 = r10.A00
            X.9H4[] r8 = r10.A01
            int r7 = r8.length
            r5 = 0
            r3 = 0
        L_0x02be:
            if (r5 >= r7) goto L_0x02c8
            r0 = r8[r5]
            int r0 = r0.A00
            int r3 = r3 + r0
            int r5 = r5 + 1
            goto L_0x02be
        L_0x02c8:
            int r9 = r9 * r3
            int r30 = r4 - r9
            int r8 = r30 << 3
            int r3 = r6.A00
            if (r3 > r8) goto L_0x0765
            r9 = 0
            r3 = 0
        L_0x02d3:
            int r0 = r6.A00
            if (r0 >= r8) goto L_0x02e0
            r6.A02(r9)
            int r3 = r3 + 1
            r0 = 4
            if (r3 >= r0) goto L_0x02e0
            goto L_0x02d3
        L_0x02e0:
            int r0 = r6.A00
            r0 = r0 & 7
            r7 = 8
            if (r0 <= 0) goto L_0x02f0
        L_0x02e8:
            if (r0 >= r7) goto L_0x02f0
            r6.A02(r9)
            int r0 = r0 + 1
            goto L_0x02e8
        L_0x02f0:
            int r0 = r6.A00
            int r0 = r0 + 7
            int r0 = r0 / 8
            int r5 = r30 - r0
        L_0x02f8:
            if (r9 >= r5) goto L_0x0308
            r3 = r9 & 1
            r0 = 17
            if (r3 != 0) goto L_0x0302
            r0 = 236(0xec, float:3.31E-43)
        L_0x0302:
            r6.A01(r0, r7)
            int r9 = r9 + 1
            goto L_0x02f8
        L_0x0308:
            int r9 = r6.A00
            if (r9 != r8) goto L_0x075d
            X.9H4[] r8 = r10.A01
            int r7 = r8.length
            r5 = 0
            r3 = 0
        L_0x0311:
            if (r5 >= r7) goto L_0x031b
            r0 = r8[r5]
            int r0 = r0.A00
            int r3 = r3 + r0
            int r5 = r5 + 1
            goto L_0x0311
        L_0x031b:
            int r0 = r9 + 7
            int r5 = r0 / 8
            r0 = r30
            if (r5 != r0) goto L_0x0755
            java.util.ArrayList r29 = X.C36441kJ.A14(r3)
            r5 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r25 = 0
        L_0x0330:
            r0 = r28
            if (r0 >= r3) goto L_0x0513
            r7 = 1
            int[] r0 = new int[r7]
            r24 = r0
            int[] r12 = new int[r7]
            r0 = r28
            if (r0 >= r3) goto L_0x050b
            int r14 = r4 % r3
            int r13 = r3 - r14
            int r7 = r4 / r3
            int r11 = r7 + 1
            int r10 = r30 / r3
            int r9 = r10 + 1
            int r7 = r7 - r10
            int r11 = r11 - r9
            if (r7 != r11) goto L_0x0503
            int r0 = r13 + r14
            if (r3 != r0) goto L_0x04fb
            int r8 = r10 + r7
            int r8 = r8 * r13
            int r0 = r9 + r11
            int r0 = r0 * r14
            int r8 = r8 + r0
            if (r4 != r8) goto L_0x04f3
            r0 = r28
            if (r0 >= r13) goto L_0x04d2
            r24[r5] = r10
            r12[r5] = r7
        L_0x0364:
            r8 = r24[r5]
            byte[] r0 = new byte[r8]
            r23 = r0
            int r12 = r27 << 3
            r11 = 0
        L_0x036d:
            if (r11 >= r8) goto L_0x038b
            r13 = 0
            r10 = 0
        L_0x0371:
            boolean r0 = r6.A03(r12)
            if (r0 == 0) goto L_0x037c
            int r9 = 7 - r13
            r0 = 1
            int r0 = r0 << r9
            r10 = r10 | r0
        L_0x037c:
            int r12 = r12 + 1
            int r13 = r13 + 1
            r0 = 8
            if (r13 < r0) goto L_0x0371
            r0 = r23
            int r11 = X.C165617ti.A07(r0, r10, r11)
            goto L_0x036d
        L_0x038b:
            int r11 = r8 + r7
            int[] r9 = new int[r11]
            r22 = 0
            r10 = 0
        L_0x0392:
            if (r10 >= r8) goto L_0x039d
            byte r0 = r23[r10]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9[r10] = r0
            int r10 = r10 + 1
            goto L_0x0392
        L_0x039d:
            X.9gX r18 = X.C200059gX.A0D
            java.util.ArrayList r17 = X.AnonymousClass001.A0I()
            r10 = 1
            int[] r13 = new int[r10]
            r13[r5] = r10
            X.9YH r12 = new X.9YH
            r0 = r18
            r12.<init>(r0, r13)
            r0 = r17
            r0.add(r12)
            if (r7 == 0) goto L_0x04ec
            int r11 = r11 - r7
            if (r11 <= 0) goto L_0x04e5
            int r0 = r17.size()
            if (r7 < r0) goto L_0x03f7
            int r12 = r17.size()
            int r12 = r12 - r10
            r0 = r17
            java.lang.Object r13 = r0.get(r12)
            X.9YH r13 = (X.AnonymousClass9YH) r13
            int r12 = r17.size()
        L_0x03d0:
            if (r12 > r7) goto L_0x03f7
            int[] r16 = X.C36441kJ.A1O()
            r16[r5] = r10
            int r14 = r12 + -1
            r0 = r18
            int[] r0 = r0.A02
            r0 = r0[r14]
            r16[r10] = r0
            X.9YH r15 = new X.9YH
            r14 = r18
            r0 = r16
            r15.<init>(r14, r0)
            X.9YH r13 = r13.A04(r15)
            r0 = r17
            r0.add(r13)
            int r12 = r12 + 1
            goto L_0x03d0
        L_0x03f7:
            r0 = r17
            java.lang.Object r15 = r0.get(r7)
            X.9YH r15 = (X.AnonymousClass9YH) r15
            int[] r13 = new int[r11]
            java.lang.System.arraycopy(r9, r5, r13, r5, r11)
            X.9YH r12 = new X.9YH
            r0 = r18
            r12.<init>(r0, r13)
            X.9YH r14 = r12.A02(r7, r10)
            X.9gX r13 = r14.A00
            X.9gX r0 = r15.A00
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x04de
            int[] r0 = r15.A01
            r12 = r0
            r0 = r0[r5]
            if (r0 != 0) goto L_0x0427
            java.lang.String r0 = "Divide by 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0427:
            X.9YH r0 = r13.A01
            r31 = r0
            r21 = r0
            int r0 = r12.length
            int r20 = r0 + -1
            int r0 = r20 - r20
            r0 = r12[r0]
            int r19 = r13.A00(r0)
        L_0x0438:
            int[] r0 = r14.A01
            int r0 = r0.length
            int r0 = r0 + -1
            r12 = r0
            r0 = r20
            if (r12 < r0) goto L_0x0485
            int[] r0 = r14.A01
            r0 = r0[r5]
            if (r0 == 0) goto L_0x0485
            int[] r0 = r14.A01
            r12 = r0
            int r0 = r0.length
            int r0 = r0 + -1
            int r18 = r0 - r20
            int r0 = r0 - r0
            r0 = r12[r0]
            r12 = r0
            r0 = r19
            int r16 = r13.A01(r12, r0)
            r12 = r18
            r0 = r16
            X.9YH r17 = r15.A02(r12, r0)
            if (r18 < 0) goto L_0x04d9
            if (r16 != 0) goto L_0x0477
            r16 = r31
        L_0x0468:
            r12 = r21
            r0 = r16
            X.9YH r21 = r12.A03(r0)
            r0 = r17
            X.9YH r14 = r14.A03(r0)
            goto L_0x0438
        L_0x0477:
            int r0 = r18 + 1
            int[] r0 = new int[r0]
            r0[r5] = r16
            X.9YH r16 = new X.9YH
            r12 = r16
            r12.<init>(r13, r0)
            goto L_0x0468
        L_0x0485:
            r0 = 2
            X.9YH[] r0 = new X.AnonymousClass9YH[r0]
            r0[r5] = r21
            r0[r10] = r14
            r0 = r0[r10]
            int[] r14 = r0.A01
            int r13 = r14.length
            int r12 = r7 - r13
            r10 = 0
        L_0x0494:
            if (r10 >= r12) goto L_0x049d
            int r0 = r11 + r10
            r9[r0] = r5
            int r10 = r10 + 1
            goto L_0x0494
        L_0x049d:
            int r11 = r11 + r12
            java.lang.System.arraycopy(r14, r5, r9, r11, r13)
            byte[] r11 = new byte[r7]
        L_0x04a3:
            r0 = r22
            if (r0 >= r7) goto L_0x04b2
            int r0 = r8 + r22
            r10 = r9[r0]
            r0 = r22
            int r22 = X.C165617ti.A07(r11, r10, r0)
            goto L_0x04a3
        L_0x04b2:
            X.9H6 r9 = new X.9H6
            r0 = r23
            r9.<init>(r0, r11)
            r0 = r29
            r0.add(r9)
            r0 = r26
            int r26 = java.lang.Math.max(r0, r8)
            r0 = r25
            int r25 = java.lang.Math.max(r0, r7)
            r0 = r24[r5]
            int r27 = r27 + r0
            int r28 = r28 + 1
            goto L_0x0330
        L_0x04d2:
            r24[r5] = r9
            r12[r5] = r11
            r7 = r11
            goto L_0x0364
        L_0x04d9:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x04de:
            java.lang.String r0 = "GenericGFPolys do not have same GenericGF field"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x04e5:
            java.lang.String r0 = "No data bytes provided"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x04ec:
            java.lang.String r0 = "No error correction bytes"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x04f3:
            java.lang.String r1 = "Total bytes mismatch"
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04fb:
            java.lang.String r1 = "RS blocks mismatch"
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0503:
            java.lang.String r1 = "EC bytes mismatch"
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x050b:
            java.lang.String r1 = "Block ID too large"
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0513:
            r3 = r27
            r0 = r30
            if (r0 != r3) goto L_0x074d
            X.AUZ r3 = new X.AUZ
            r3.<init>()
            r9 = 0
        L_0x051f:
            r8 = 8
            r0 = r26
            if (r9 >= r0) goto L_0x0543
            java.util.Iterator r7 = r29.iterator()
        L_0x0529:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0540
            java.lang.Object r0 = r7.next()
            X.9H6 r0 = (X.AnonymousClass9H6) r0
            byte[] r6 = r0.A00
            int r0 = r6.length
            if (r9 >= r0) goto L_0x0529
            byte r0 = r6[r9]
            r3.A01(r0, r8)
            goto L_0x0529
        L_0x0540:
            int r9 = r9 + 1
            goto L_0x051f
        L_0x0543:
            r0 = r25
            if (r5 >= r0) goto L_0x0565
            java.util.Iterator r7 = r29.iterator()
        L_0x054b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0562
            java.lang.Object r0 = r7.next()
            X.9H6 r0 = (X.AnonymousClass9H6) r0
            byte[] r6 = r0.A01
            int r0 = r6.length
            if (r5 >= r0) goto L_0x054b
            byte r0 = r6[r5]
            r3.A01(r0, r8)
            goto L_0x054b
        L_0x0562:
            int r5 = r5 + 1
            goto L_0x0543
        L_0x0565:
            int r0 = r3.A00
            int r0 = r0 + 7
            int r5 = r0 / 8
            if (r4 != r5) goto L_0x0730
            X.9S4 r4 = new X.9S4
            r4.<init>()
            r0 = r32
            r4.A04 = r0
            r4.A01 = r1
            r4.A02 = r2
            int r0 = r2.A01
            int r0 = r0 * 4
            int r0 = r0 + 17
            X.3DX r5 = new X.3DX
            r5.<init>(r0, r0)
            r19 = 2147483647(0x7fffffff, float:NaN)
            r18 = -1
            r6 = 0
        L_0x058b:
            r0 = r32
            X.C202459lt.A00(r3, r2, r5, r0, r6)
            int r10 = r5.A00
            int r13 = r5.A01
            byte[][] r12 = r5.A02
            r7 = 0
            r8 = 0
        L_0x0598:
            if (r7 >= r10) goto L_0x05bf
            r15 = -1
            r11 = 0
            r14 = 0
        L_0x059d:
            r9 = 5
            if (r11 >= r13) goto L_0x05b5
            r0 = r12[r7]
            byte r1 = r0[r11]
            if (r1 != r15) goto L_0x05ab
            int r14 = r14 + 1
        L_0x05a8:
            int r11 = r11 + 1
            goto L_0x059d
        L_0x05ab:
            if (r14 < r9) goto L_0x05b2
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r8 = r8 + r0
        L_0x05b2:
            r15 = r1
            r14 = 1
            goto L_0x05a8
        L_0x05b5:
            if (r14 < r9) goto L_0x05bc
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r8 = r8 + r0
        L_0x05bc:
            int r7 = r7 + 1
            goto L_0x0598
        L_0x05bf:
            r7 = 0
            r16 = 0
        L_0x05c2:
            if (r7 >= r13) goto L_0x05eb
            r15 = -1
            r11 = 0
            r14 = 0
        L_0x05c7:
            r9 = 5
            if (r11 >= r10) goto L_0x05e0
            r0 = r12[r11]
            byte r1 = r0[r7]
            if (r1 != r15) goto L_0x05d5
            int r14 = r14 + 1
        L_0x05d2:
            int r11 = r11 + 1
            goto L_0x05c7
        L_0x05d5:
            if (r14 < r9) goto L_0x05dd
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r16 = r16 + r0
        L_0x05dd:
            r15 = r1
            r14 = 1
            goto L_0x05d2
        L_0x05e0:
            if (r14 < r9) goto L_0x05e8
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r16 = r16 + r0
        L_0x05e8:
            int r7 = r7 + 1
            goto L_0x05c2
        L_0x05eb:
            int r8 = r8 + r16
            r9 = 0
            r16 = 0
        L_0x05f0:
            int r0 = r10 + -1
            if (r9 >= r0) goto L_0x0618
            r15 = r12[r9]
            r14 = 0
        L_0x05f7:
            int r0 = r13 + -1
            if (r14 >= r0) goto L_0x0615
            byte r7 = r15[r14]
            int r11 = r14 + 1
            byte r0 = r15[r11]
            if (r7 != r0) goto L_0x0613
            int r1 = r9 + 1
            r0 = r12[r1]
            byte r0 = r0[r14]
            if (r7 != r0) goto L_0x0613
            r0 = r12[r1]
            byte r0 = r0[r11]
            if (r7 != r0) goto L_0x0613
            int r16 = r16 + 1
        L_0x0613:
            r14 = r11
            goto L_0x05f7
        L_0x0615:
            int r9 = r9 + 1
            goto L_0x05f0
        L_0x0618:
            int r0 = r16 * 3
            int r8 = r8 + r0
            r9 = 0
            r17 = 0
        L_0x061e:
            if (r9 >= r10) goto L_0x06ef
            r7 = 0
        L_0x0621:
            if (r7 >= r13) goto L_0x06eb
            r14 = r12[r9]
            int r11 = r7 + 6
            r1 = 1
            if (r11 >= r13) goto L_0x067e
            byte r0 = r14[r7]
            if (r0 != r1) goto L_0x067e
            int r0 = r7 + 1
            byte r0 = r14[r0]
            if (r0 != 0) goto L_0x067e
            int r0 = r7 + 2
            byte r0 = r14[r0]
            if (r0 != r1) goto L_0x067e
            int r0 = r7 + 3
            byte r0 = r14[r0]
            if (r0 != r1) goto L_0x067e
            int r0 = r7 + 4
            byte r0 = r14[r0]
            if (r0 != r1) goto L_0x067e
            int r0 = r7 + 5
            byte r0 = r14[r0]
            if (r0 != 0) goto L_0x067e
            byte r0 = r14[r11]
            if (r0 != r1) goto L_0x067e
            int r0 = r7 + -4
            r15 = 0
            int r11 = java.lang.Math.max(r0, r15)
            int r0 = r14.length
            int r16 = java.lang.Math.min(r7, r0)
        L_0x065c:
            r0 = r16
            if (r11 >= r0) goto L_0x067c
            byte r0 = r14[r11]
            int r11 = r11 + 1
            if (r0 != r1) goto L_0x065c
            int r0 = r7 + 7
            int r11 = r7 + 11
            int r15 = java.lang.Math.max(r0, r15)
            int r0 = r14.length
            int r11 = java.lang.Math.min(r11, r0)
        L_0x0673:
            if (r15 >= r11) goto L_0x067c
            byte r0 = r14[r15]
            if (r0 == r1) goto L_0x067e
            int r15 = r15 + 1
            goto L_0x0673
        L_0x067c:
            int r17 = r17 + 1
        L_0x067e:
            int r11 = r9 + 6
            if (r11 >= r10) goto L_0x06e7
            r0 = r12[r9]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06e7
            int r0 = r9 + 1
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != 0) goto L_0x06e7
            int r0 = r9 + 2
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06e7
            int r0 = r9 + 3
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06e7
            int r0 = r9 + 4
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06e7
            int r0 = r9 + 5
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != 0) goto L_0x06e7
            r0 = r12[r11]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06e7
            int r0 = r9 + -4
            r14 = 0
            int r15 = java.lang.Math.max(r0, r14)
            int r11 = r12.length
            int r16 = java.lang.Math.min(r9, r11)
        L_0x06c2:
            r0 = r16
            if (r15 >= r0) goto L_0x06e5
            r0 = r12[r15]
            byte r0 = r0[r7]
            int r15 = r15 + 1
            if (r0 != r1) goto L_0x06c2
            int r15 = r9 + 7
            int r0 = r9 + 11
            int r14 = java.lang.Math.max(r15, r14)
            int r11 = java.lang.Math.min(r0, r11)
        L_0x06da:
            if (r14 >= r11) goto L_0x06e5
            r0 = r12[r14]
            byte r0 = r0[r7]
            if (r0 == r1) goto L_0x06e7
            int r14 = r14 + 1
            goto L_0x06da
        L_0x06e5:
            int r17 = r17 + 1
        L_0x06e7:
            int r7 = r7 + 1
            goto L_0x0621
        L_0x06eb:
            int r9 = r9 + 1
            goto L_0x061e
        L_0x06ef:
            int r0 = r17 * 40
            int r8 = r8 + r0
            r14 = 0
            r11 = 0
        L_0x06f4:
            r9 = 1
            if (r14 >= r10) goto L_0x0708
            r7 = r12[r14]
            r1 = 0
        L_0x06fa:
            if (r1 >= r13) goto L_0x0705
            byte r0 = r7[r1]
            if (r0 != r9) goto L_0x0702
            int r11 = r11 + 1
        L_0x0702:
            int r1 = r1 + 1
            goto L_0x06fa
        L_0x0705:
            int r14 = r14 + 1
            goto L_0x06f4
        L_0x0708:
            int r10 = r10 * r13
            int r0 = r11 << 1
            int r0 = X.AnonymousClass000.A05(r0, r10)
            int r0 = r0 * 10
            int r0 = r0 / r10
            int r0 = r0 * 10
            int r8 = r8 + r0
            r0 = r19
            if (r8 >= r0) goto L_0x071d
            r18 = r6
            r19 = r8
        L_0x071d:
            int r6 = r6 + 1
            r0 = 8
            if (r6 < r0) goto L_0x058b
            r0 = r18
            r4.A00 = r0
            r1 = r0
            r0 = r32
            X.C202459lt.A00(r3, r2, r5, r0, r1)
            r4.A03 = r5
            return r4
        L_0x0730:
            java.lang.String r0 = "Interleaving error: "
            java.lang.StringBuilder r1 = X.C90524aI.A0i(r0)
            r1.append(r4)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " differ."
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x074d:
            java.lang.String r1 = "Data bytes does not match offset"
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0755:
            java.lang.String r1 = "Number of bits and data bytes does not match"
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x075d:
            java.lang.String r1 = "Bits size does not equal capacity"
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0765:
            java.lang.String r0 = "data bits cannot fit in the QR Code"
            java.lang.StringBuilder r1 = X.C90524aI.A0i(r0)
            r1.append(r3)
            java.lang.String r0 = " > "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r8)
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x077a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r1.append(r5)
            java.lang.String r0 = " is bigger than "
            r1.append(r0)
            int r3 = r3 - r4
            java.lang.String r1 = X.C36381kD.A10(r1, r3)
            X.92E r0 = new X.92E
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200649ht.A00(java.lang.Integer, java.lang.String, java.util.Map):X.9S4");
    }

    public static boolean A01(C202039kw r7, Integer num, int i) {
        int i2 = r7.A00;
        AnonymousClass9H5 r0 = r7.A03[num.intValue()];
        int i3 = r0.A00;
        int i4 = 0;
        for (AnonymousClass9H4 r02 : r0.A01) {
            i4 += r02.A00;
        }
        return C36371kC.A1T(i2 - (i3 * i4), (i + 7) / 8);
    }
}
