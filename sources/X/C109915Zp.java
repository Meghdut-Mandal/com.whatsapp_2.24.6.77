package X;

/* renamed from: X.5Zp  reason: invalid class name and case insensitive filesystem */
public abstract class C109915Zp {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (r33 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        if (r0.isEmpty() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0062, code lost:
        if (r33 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0064, code lost:
        r0 = r1.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0066, code lost:
        if (r0 == null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0068, code lost:
        r2 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006a, code lost:
        r0 = r1.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006c, code lost:
        if (r0 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006e, code lost:
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0070, code lost:
        r14 = new X.C134736bW(r3, r0, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0075, code lost:
        if (r33 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0077, code lost:
        r18 = r1.A0F;
        r17 = r1.A05;
        r15 = r1.A0C;
        r13 = r1.A06;
        r12 = r1.A04;
        r11 = r1.A0E;
        r10 = r1.A0G;
        r9 = r1.A07;
        r8 = r1.A01;
        r7 = r1.A02;
        r6 = r1.A0D;
        r5 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c2, code lost:
        return new X.C207269up(r1.A0A, r8, r7, r14, r12, r18, r17, r15, r11, r10, r6, r13, r9, r5, r1.A09, r1.A0H, r1.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c3, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c4, code lost:
        if (r33 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d4, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C207269up A00(X.C207269up r33, X.C207269up r34) {
        /*
            r6 = 0
            r1 = r33
            r5 = r34
            if (r33 == 0) goto L_0x0015
            X.6bW r0 = r1.A0B
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = r0.A02
            if (r4 == 0) goto L_0x0015
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0048
        L_0x0015:
            if (r34 == 0) goto L_0x00d1
            X.6bW r0 = r5.A0B
            if (r0 == 0) goto L_0x00d1
            X.6bD r0 = r0.A00
            if (r0 == 0) goto L_0x00d1
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00d1
            java.util.Iterator r4 = r0.iterator()
        L_0x0027:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.6bO r0 = (X.C134656bO) r0
            java.lang.String r2 = r0.A00
            if (r33 == 0) goto L_0x00cb
            java.lang.String r0 = r1.A0F
        L_0x003a:
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0027
        L_0x0040:
            X.6bO r3 = (X.C134656bO) r3
            if (r3 == 0) goto L_0x00d1
            java.util.List r4 = r3.A01
        L_0x0046:
            if (r33 == 0) goto L_0x005a
        L_0x0048:
            X.6bW r0 = r1.A0B
            if (r0 == 0) goto L_0x005a
            X.6bD r3 = r0.A00
            if (r3 == 0) goto L_0x005a
            java.util.List r0 = r3.A00
            if (r0 == 0) goto L_0x005a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0064
        L_0x005a:
            if (r34 == 0) goto L_0x00c9
            X.6bW r0 = r5.A0B
            if (r0 == 0) goto L_0x00c9
            X.6bD r3 = r0.A00
        L_0x0062:
            if (r33 == 0) goto L_0x00c3
        L_0x0064:
            X.6bW r0 = r1.A0B
            if (r0 == 0) goto L_0x00c3
            java.util.List r2 = r0.A03
        L_0x006a:
            X.6bW r0 = r1.A0B
            if (r0 == 0) goto L_0x00c7
            X.6bP r0 = r0.A01
        L_0x0070:
            X.6bW r14 = new X.6bW
            r14.<init>(r3, r0, r2, r4)
            if (r33 == 0) goto L_0x00d4
            java.lang.String r0 = r1.A0F
            r18 = r0
            java.lang.String r0 = r1.A05
            r17 = r0
            java.lang.String r15 = r1.A0C
            java.math.BigDecimal r13 = r1.A06
            X.6Tk r12 = r1.A04
            java.lang.String r11 = r1.A0E
            java.lang.String r10 = r1.A0G
            java.util.List r9 = r1.A07
            X.9tw r8 = r1.A01
            X.6bV r7 = r1.A02
            java.lang.String r6 = r1.A0D
            int r5 = r1.A00
            boolean r4 = r1.A0H
            boolean r3 = r1.A08
            X.9te r2 = r1.A0A
            long r0 = r1.A09
            X.9up r16 = new X.9up
            r31 = r0
            r33 = r4
            r34 = r3
            r28 = r13
            r29 = r9
            r30 = r5
            r25 = r11
            r26 = r10
            r27 = r6
            r22 = r18
            r23 = r17
            r24 = r15
            r19 = r7
            r20 = r14
            r21 = r12
            r17 = r2
            r18 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34)
            return r16
        L_0x00c3:
            r2 = r6
            if (r33 == 0) goto L_0x00c7
            goto L_0x006a
        L_0x00c7:
            r0 = r6
            goto L_0x0070
        L_0x00c9:
            r3 = r6
            goto L_0x0062
        L_0x00cb:
            r0 = r6
            goto L_0x003a
        L_0x00ce:
            r3 = r6
            goto L_0x0040
        L_0x00d1:
            r4 = r6
            goto L_0x0046
        L_0x00d4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109915Zp.A00(X.9up, X.9up):X.9up");
    }
}
