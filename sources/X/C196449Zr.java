package X;

/* renamed from: X.9Zr  reason: invalid class name and case insensitive filesystem */
public abstract class C196449Zr {
    public static final int[] A00 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bd, code lost:
        r18 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C201519jm r21, boolean r22) {
        /*
            r14 = 0
            r11 = r21
            long r6 = r11.A04
            r1 = 4096(0x1000, double:2.0237E-320)
            r20 = -1
            int r19 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r19 == 0) goto L_0x0012
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            r1 = r6
        L_0x0012:
            int r10 = (int) r1
            r0 = 64
            X.9lW r9 = new X.9lW
            r9.<init>((int) r0)
            r15 = 0
            r8 = 0
            r18 = 0
        L_0x001e:
            if (r8 >= r10) goto L_0x00db
            r13 = 8
            r9.A0G(r13)
            byte[] r2 = r9.A02
            r0 = 1
            boolean r0 = r11.A04(r13, r0)
            if (r0 == 0) goto L_0x00db
            byte[] r1 = r11.A03
            int r0 = r11.A01
            int r0 = r0 - r13
            java.lang.System.arraycopy(r1, r0, r2, r14, r13)
            long r2 = r9.A09()
            int r12 = r9.A03()
            r4 = 1
            r1 = 16
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00c2
            byte[] r0 = r9.A02
            r11.A03(r0, r13, r13)
            r9.A0H(r1)
            long r2 = r9.A08()
        L_0x0052:
            long r4 = (long) r1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00e6
            int r8 = r8 + r1
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r12 != r0) goto L_0x0068
            int r0 = (int) r2
            int r10 = r10 + r0
            if (r19 == 0) goto L_0x001e
            long r0 = (long) r10
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x001e
            int r10 = (int) r6
            goto L_0x001e
        L_0x0068:
            r0 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r12 == r0) goto L_0x00dd
            r0 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r12 == r0) goto L_0x00dd
            long r0 = (long) r8
            long r0 = r0 + r2
            long r0 = r0 - r4
            long r15 = (long) r10
            int r17 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x00db
            long r2 = r2 - r4
            int r1 = (int) r2
            int r8 = r8 + r1
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r12 != r0) goto L_0x00b7
            if (r1 < r13) goto L_0x00da
            r2 = 0
            r9.A0G(r1)
            byte[] r0 = r9.A02
            r11.A03(r0, r14, r1)
            int r1 = r1 / 4
        L_0x008f:
            if (r2 >= r1) goto L_0x00b4
            r0 = 1
            if (r2 != r0) goto L_0x009b
            r0 = 4
            r9.A0J(r0)
        L_0x0098:
            int r2 = r2 + 1
            goto L_0x008f
        L_0x009b:
            int r12 = r9.A03()
            int r3 = r12 >>> 8
            r0 = 3368816(0x336770, float:4.720717E-39)
            if (r3 == r0) goto L_0x00bd
            int[] r5 = A00
            r4 = 29
            r3 = 0
        L_0x00ab:
            r0 = r5[r3]
            if (r0 == r12) goto L_0x00bd
            int r3 = r3 + 1
            if (r3 >= r4) goto L_0x0098
            goto L_0x00ab
        L_0x00b4:
            if (r18 != 0) goto L_0x00bf
            return r14
        L_0x00b7:
            if (r1 == 0) goto L_0x00bf
            r11.A04(r1, r14)
            goto L_0x00bf
        L_0x00bd:
            r18 = 1
        L_0x00bf:
            r15 = 0
            goto L_0x001e
        L_0x00c2:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00d6
            int r0 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00d6
            long r0 = r11.A02
            int r2 = r11.A01
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r6 - r0
            long r0 = (long) r13
            long r2 = r2 + r0
        L_0x00d6:
            r1 = 8
            goto L_0x0052
        L_0x00da:
            return r14
        L_0x00db:
            r0 = 0
            goto L_0x00de
        L_0x00dd:
            r0 = 1
        L_0x00de:
            if (r18 == 0) goto L_0x00e5
            r15 = 1
            r1 = r22
            if (r1 == r0) goto L_0x00e6
        L_0x00e5:
            r15 = 0
        L_0x00e6:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196449Zr.A00(X.9jm, boolean):boolean");
    }
}
