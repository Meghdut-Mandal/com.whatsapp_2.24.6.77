package X;

/* renamed from: X.5Vz  reason: invalid class name and case insensitive filesystem */
public abstract class C109025Vz {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r8.B2f(r13) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r8.B2f(r10) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (r8.B2f(r11) == false) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C157497dd r19, X.C158767iC r20, X.C156907b9 r21, androidx.compose.foundation.lazy.LazyListState r22, X.C161337ma r23, X.C157627dq r24, X.C161267mT r25, X.C006302t r26, int r27, int r28, boolean r29, boolean r30) {
        /*
            r3 = r30
            r11 = r19
            r7 = r24
            r10 = r20
            r9 = r21
            r13 = r22
            r6 = r25
            r0 = -740714857(0xffffffffd3d99697, float:-1.86906876E12)
            r8 = r23
            r8.Bun(r0)
            r4 = r28
            r22 = r28 & 1
            r5 = r27
            r12 = r27 | 6
            if (r22 != 0) goto L_0x002e
            r0 = r27 & 14
            if (r0 != 0) goto L_0x0224
            boolean r0 = r8.B2f(r6)
            int r12 = X.C90484aE.A04(r0)
            r12 = r12 | r27
        L_0x002e:
            r0 = r27 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0041
            r0 = r28 & 2
            if (r0 != 0) goto L_0x003e
            boolean r1 = r8.B2f(r13)
            r0 = 32
            if (r1 != 0) goto L_0x0040
        L_0x003e:
            r0 = 16
        L_0x0040:
            r12 = r12 | r0
        L_0x0041:
            r21 = r28 & 4
            if (r21 == 0) goto L_0x0219
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r20 = r28 & 8
            r14 = r29
            if (r20 == 0) goto L_0x0208
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x004f:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r27
            if (r0 != 0) goto L_0x0065
            r0 = r28 & 16
            if (r0 != 0) goto L_0x0062
            boolean r1 = r8.B2f(r10)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x0064
        L_0x0062:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0064:
            r12 = r12 | r0
        L_0x0065:
            r19 = r28 & 32
            r18 = 458752(0x70000, float:6.42848E-40)
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r19 != 0) goto L_0x0079
            r0 = r27 & r18
            if (r0 != 0) goto L_0x007a
            boolean r0 = r8.B2f(r7)
            int r0 = X.C90514aH.A08(r0)
        L_0x0079:
            r12 = r12 | r0
        L_0x007a:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r0 = r27 & r17
            if (r0 != 0) goto L_0x008f
            r0 = r28 & 64
            if (r0 != 0) goto L_0x008c
            boolean r1 = r8.B2f(r11)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 != 0) goto L_0x008e
        L_0x008c:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x008e:
            r12 = r12 | r0
        L_0x008f:
            r1 = r4 & 128(0x80, float:1.794E-43)
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != 0) goto L_0x00a5
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r27 & r0
            if (r0 != 0) goto L_0x00a6
            boolean r0 = r8.B2g(r3)
            r2 = 4194304(0x400000, float:5.877472E-39)
            if (r0 == 0) goto L_0x00a5
            r2 = 8388608(0x800000, float:1.17549435E-38)
        L_0x00a5:
            r12 = r12 | r2
        L_0x00a6:
            r0 = r4 & 256(0x100, float:3.59E-43)
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r23 = r26
            if (r0 != 0) goto L_0x00c0
            r0 = r27 & r16
            if (r0 != 0) goto L_0x00c1
            r0 = r23
            boolean r0 = r8.B2h(r0)
            r2 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == 0) goto L_0x00c0
            r2 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x00c0:
            r12 = r12 | r2
        L_0x00c1:
            r0 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r12 & r0
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r0) goto L_0x00f9
            boolean r0 = r8.BHg()
            if (r0 == 0) goto L_0x00f9
            r8.BuE()
            r2 = r14
        L_0x00d5:
            X.6fO r1 = r8.B6Z()
            if (r1 == 0) goto L_0x00f8
            X.7Z5 r0 = new X.7Z5
            r14 = r0
            r15 = r11
            r16 = r10
            r17 = r9
            r18 = r13
            r19 = r7
            r20 = r6
            r21 = r23
            r22 = r5
            r23 = r4
            r24 = r2
            r25 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.A06 = r0
        L_0x00f8:
            return
        L_0x00f9:
            r8.BuS()
            r0 = r27 & 1
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x016b
            boolean r0 = r8.BAx()
            if (r0 != 0) goto L_0x016b
            r8.BuE()
            r0 = r28 & 2
            if (r0 == 0) goto L_0x0115
            r12 = r12 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0115:
            r0 = r28 & 16
            if (r0 == 0) goto L_0x011a
            r12 = r12 & r15
        L_0x011a:
            r0 = r28 & 64
            if (r0 == 0) goto L_0x011f
            r12 = r12 & r2
        L_0x011f:
            r2 = r14
        L_0x0120:
            r8.B6X()
            r29 = 1
            r24 = 0
            r15 = 0
            r0 = r12 & 14
            r1 = r0 | 24576(0x6000, float:3.4438E-41)
            r0 = r12 & 112(0x70, float:1.57E-43)
            r1 = r1 | r0
            r0 = r12 & 896(0x380, float:1.256E-42)
            r1 = r1 | r0
            r0 = r12 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r0
            int r0 = r12 >> 3
            r18 = r18 & r0
            r1 = r1 | r18
            r0 = r0 & r17
            r1 = r1 | r0
            int r0 = r12 << 9
            r0 = r0 & r16
            r1 = r1 | r0
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            int r0 = r12 << 15
            r14 = r14 & r0
            r1 = r1 | r14
            int r0 = r12 >> 18
            r0 = r0 & 896(0x380, float:1.256E-42)
            r27 = 3200(0xc80, float:4.484E-42)
            r18 = r13
            r19 = r8
            r20 = r7
            r21 = r15
            r22 = r6
            r25 = r1
            r26 = r0
            r28 = r2
            r30 = r3
            r14 = r11
            r16 = r10
            r17 = r9
            X.AnonymousClass5W0.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x00d5
        L_0x016b:
            if (r22 == 0) goto L_0x016f
            X.6fu r6 = X.C161267mT.A00
        L_0x016f:
            r0 = r28 & 2
            r2 = 0
            if (r0 == 0) goto L_0x017a
            androidx.compose.foundation.lazy.LazyListState r13 = X.C129726If.A00(r8)
            r12 = r12 & -113(0xffffffffffffff8f, float:NaN)
        L_0x017a:
            if (r21 == 0) goto L_0x0182
            float r0 = (float) r2
            X.6ew r9 = new X.6ew
            r9.<init>(r0, r0, r0, r0)
        L_0x0182:
            if (r20 != 0) goto L_0x0185
            r2 = r14
        L_0x0185:
            r0 = r28 & 16
            if (r0 == 0) goto L_0x018e
            if (r2 != 0) goto L_0x0205
            X.7iC r10 = X.AnonymousClass6J0.A03
        L_0x018d:
            r12 = r12 & r15
        L_0x018e:
            if (r19 == 0) goto L_0x0192
            X.7dq r7 = X.AnonymousClass6J7.A01
        L_0x0192:
            r0 = r28 & 64
            if (r0 == 0) goto L_0x0200
            r0 = 1107739818(0x4206c4aa, float:33.692055)
            r8.Bum(r0)
            float r0 = X.C112125dO.A00
            r0 = 904445851(0x35e8bf9b, float:1.7341112E-6)
            r8.Bum(r0)
            X.4gm r0 = X.C131996Rr.A00
            r14 = r8
            X.6fF r14 = (X.C136916fF) r14
            java.lang.Object r11 = X.AnonymousClass6G0.A01(r14, r0)
            X.7ni r11 = (X.C161937ni) r11
            float r0 = r11.BAy()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            boolean r0 = X.C90494aF.A1T(r8, r0)
            java.lang.Object r15 = r8.BnZ()
            if (r0 != 0) goto L_0x01c5
            java.lang.Object r0 = X.C129736Ig.A00
            if (r15 != r0) goto L_0x01d2
        L_0x01c5:
            X.6eI r0 = new X.6eI
            r0.<init>(r11)
            X.6eB r15 = new X.6eB
            r15.<init>(r0)
            r14.A0R(r15)
        L_0x01d2:
            r0 = 0
            X.C136916fF.A0M(r14, r0)
            X.7b2 r15 = (X.C156837b2) r15
            X.C136916fF.A0M(r14, r0)
            boolean r0 = X.C90494aF.A1T(r8, r15)
            java.lang.Object r11 = r8.BnZ()
            if (r0 != 0) goto L_0x01e9
            java.lang.Object r0 = X.C129736Ig.A00
            if (r11 != r0) goto L_0x01f3
        L_0x01e9:
            X.7oK r0 = androidx.compose.foundation.gestures.ScrollableKt.A02
            X.6ec r11 = new X.6ec
            r11.<init>(r15, r0)
            r14.A0R(r11)
        L_0x01f3:
            r0 = 0
            X.C136916fF.A0M(r14, r0)
            X.6ec r11 = (X.C136566ec) r11
            X.C136916fF.A0M(r14, r0)
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r12 = r12 & r0
        L_0x0200:
            if (r1 == 0) goto L_0x0120
            r3 = 1
            goto L_0x0120
        L_0x0205:
            X.7iC r10 = X.AnonymousClass6J0.A02
            goto L_0x018d
        L_0x0208:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x004f
            boolean r1 = r8.B2g(r14)
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0216
            r0 = 2048(0x800, float:2.87E-42)
        L_0x0216:
            r12 = r12 | r0
            goto L_0x004f
        L_0x0219:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0047
            int r0 = X.C90474aD.A04(r8, r9)
            r12 = r12 | r0
            goto L_0x0047
        L_0x0224:
            r12 = r5
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109025Vz.A00(X.7dd, X.7iC, X.7b9, androidx.compose.foundation.lazy.LazyListState, X.7ma, X.7dq, X.7mT, X.02t, int, int, boolean, boolean):void");
    }
}
