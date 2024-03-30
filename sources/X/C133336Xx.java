package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.6Xx  reason: invalid class name and case insensitive filesystem */
public final class C133336Xx {
    public static final long A01 = (4278190080L << 32);
    public static final long A02 = (4278190335L << 32);
    public static final long A03 = (4294901760L << 32);
    public static final long A04 = (((long) 0) << 32);
    public static final long A05 = AnonymousClass6QU.A00(C114185go.A0H, 0.0f, 0.0f, 0.0f, 0.0f);
    public final long A00;

    public static final double A00(long j) {
        return (((double) (j >>> 11)) * ((double) EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) + ((double) (j & 2047));
    }

    public static final float A01(long j) {
        float A002;
        float f;
        if ((63 & j) == 0) {
            A002 = (float) A00((j >>> 56) & 255);
            f = 255.0f;
        } else {
            A002 = (float) A00((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return A002 / f;
    }

    public static final float A02(long j) {
        if ((63 & j) == 0) {
            return ((float) A00((j >>> 32) & 255)) / 255.0f;
        }
        return AnonymousClass72V.A00((short) ((int) ((j >>> 16) & 65535)));
    }

    public static final float A03(long j) {
        if ((63 & j) == 0) {
            return ((float) A00((j >>> 40) & 255)) / 255.0f;
        }
        return AnonymousClass72V.A00((short) ((int) ((j >>> 32) & 65535)));
    }

    public static final float A04(long j) {
        int i = ((63 & j) > 0 ? 1 : ((63 & j) == 0 ? 0 : -1));
        long j2 = j >>> 48;
        if (i == 0) {
            return ((float) A00(j2 & 255)) / 255.0f;
        }
        return AnonymousClass72V.A00((short) ((int) (j2 & 65535)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0286  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A06(X.AnonymousClass6FX r12, long r13) {
        /*
            r0 = 63
            long r2 = r13 & r0
            int r1 = (int) r2
            X.6FX[] r0 = X.C114185go.A0K
            r5 = r0[r1]
            boolean r0 = X.AnonymousClass00C.A0J(r12, r5)
            if (r0 != 0) goto L_0x006b
            X.4iQ r1 = X.C114185go.A0G
            if (r5 != r1) goto L_0x0273
            if (r12 != r1) goto L_0x026b
            X.6Uq r6 = X.C132646Uq.A05
        L_0x0017:
            float r7 = A04(r13)
            float r5 = A03(r13)
            float r4 = A02(r13)
            float r12 = A01(r13)
            boolean r0 = r6 instanceof X.C94584iS
            if (r0 == 0) goto L_0x006c
            X.4iS r6 = (X.C94584iS) r6
            X.4iQ r0 = r6.A01
            X.7du r2 = r0.A02
            double r0 = (double) r7
            double r0 = r2.BKs(r0)
            float r7 = (float) r0
            double r0 = (double) r5
            double r0 = r2.BKs(r0)
            float r5 = (float) r0
            double r0 = (double) r4
            double r0 = r2.BKs(r0)
            float r2 = (float) r0
            float[] r1 = r6.A02
            float r0 = X.C90464aC.A06(r1, r7, r5, r2)
            float r3 = X.C90464aC.A05(r1, r7, r5, r2)
            float r2 = X.C90464aC.A04(r1, r7, r5, r2)
            X.4iQ r5 = r6.A00
            X.7du r6 = r5.A04
        L_0x0055:
            double r0 = (double) r0
            double r0 = r6.BKs(r0)
            float r4 = (float) r0
            double r0 = (double) r3
            double r0 = r6.BKs(r0)
            float r3 = (float) r0
            double r0 = (double) r2
            double r1 = r6.BKs(r0)
            float r0 = (float) r1
            long r13 = X.AnonymousClass6QU.A00(r5, r4, r3, r0, r12)
        L_0x006b:
            return r13
        L_0x006c:
            boolean r0 = r6 instanceof X.C94574iR
            if (r0 == 0) goto L_0x0077
            X.6FX r0 = r6.A00
            long r13 = X.AnonymousClass6QU.A00(r0, r7, r5, r4, r12)
            return r13
        L_0x0077:
            X.6FX r8 = r6.A02
            boolean r10 = r8 instanceof X.C94544iO
            if (r10 == 0) goto L_0x01b0
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = X.C15040mb.A01(r7, r2, r0)
            float r0 = X.C15040mb.A01(r5, r2, r0)
            long r2 = X.C90464aC.A0B(r1, r0)
        L_0x008d:
            float r9 = X.C90464aC.A01(r2)
            float r2 = X.C90464aC.A00(r2)
            if (r10 == 0) goto L_0x0125
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r7 = X.C15040mb.A01(r4, r1, r0)
        L_0x009f:
            X.6FX r4 = r6.A01
            X.6FX r5 = r6.A00
            boolean r0 = r4 instanceof X.C94544iO
            if (r0 == 0) goto L_0x00bc
            r4 = -1073741824(0xffffffffc0000000, float:-2.0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = X.C15040mb.A01(r9, r4, r0)
            float r1 = X.C15040mb.A01(r2, r4, r0)
            float r0 = X.C15040mb.A01(r7, r4, r0)
        L_0x00b7:
            long r13 = X.AnonymousClass6QU.A00(r5, r3, r1, r0, r12)
            return r13
        L_0x00bc:
            boolean r0 = r4 instanceof X.C94564iQ
            if (r0 == 0) goto L_0x00d3
            X.4iQ r4 = (X.C94564iQ) r4
            float[] r1 = r4.A0B
            float r0 = X.C90464aC.A06(r1, r9, r2, r7)
            float r3 = X.C90464aC.A05(r1, r9, r2, r7)
            float r2 = X.C90464aC.A04(r1, r9, r2, r7)
            X.7du r6 = r4.A04
            goto L_0x0055
        L_0x00d3:
            boolean r0 = r4 instanceof X.C94554iP
            if (r0 == 0) goto L_0x02a6
            float[] r1 = X.C94554iP.A02
            float r0 = X.C90464aC.A06(r1, r9, r2, r7)
            float r4 = X.C90464aC.A05(r1, r9, r2, r7)
            float r10 = X.C90464aC.A04(r1, r9, r2, r7)
            float r7 = java.lang.Math.signum(r0)
            float r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            r2 = 1051372203(0x3eaaaaab, float:0.33333334)
            double r2 = (double) r2
            double r8 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r8
            float r7 = r7 * r0
            float r6 = java.lang.Math.signum(r4)
            float r0 = java.lang.Math.abs(r4)
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r0, r2)
            float r4 = (float) r0
            float r6 = r6 * r4
            float r4 = java.lang.Math.signum(r10)
            float r0 = java.lang.Math.abs(r10)
            double r0 = (double) r0
            double r1 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r1
            float r4 = r4 * r0
            float[] r0 = X.C94554iP.A03
            float r3 = X.C90464aC.A06(r0, r7, r6, r4)
            float r1 = X.C90464aC.A05(r0, r7, r6, r4)
            float r0 = X.C90464aC.A04(r0, r7, r6, r4)
            goto L_0x00b7
        L_0x0125:
            boolean r0 = r8 instanceof X.C94564iQ
            if (r0 == 0) goto L_0x0147
            X.4iQ r8 = (X.C94564iQ) r8
            X.7du r3 = r8.A02
            double r0 = (double) r7
            double r0 = r3.BKs(r0)
            float r7 = (float) r0
            double r0 = (double) r5
            double r0 = r3.BKs(r0)
            float r5 = (float) r0
            double r0 = (double) r4
            double r0 = r3.BKs(r0)
            float r3 = (float) r0
            float[] r0 = r8.A0D
            float r7 = X.C90464aC.A04(r0, r7, r5, r3)
            goto L_0x009f
        L_0x0147:
            boolean r0 = r8 instanceof X.C94554iP
            r1 = 0
            if (r0 == 0) goto L_0x017d
            r0 = 1065353216(0x3f800000, float:1.0)
            float r7 = X.C15040mb.A01(r7, r1, r0)
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = X.C15040mb.A01(r5, r1, r0)
            float r4 = X.C15040mb.A01(r4, r1, r0)
            float[] r0 = X.C94554iP.A01
            float r3 = X.C90464aC.A06(r0, r7, r5, r4)
            float r1 = X.C90464aC.A05(r0, r7, r5, r4)
            float r0 = X.C90464aC.A04(r0, r7, r5, r4)
            float r4 = r3 * r3
            float r4 = r4 * r3
            float r3 = r1 * r1
            float r3 = r3 * r1
            float r1 = r0 * r0
            float r1 = r1 * r0
            float[] r0 = X.C94554iP.A00
            float r7 = X.C90464aC.A04(r0, r4, r3, r1)
            goto L_0x009f
        L_0x017d:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = X.C15040mb.A01(r7, r1, r0)
            r1 = -1023410176(0xffffffffc3000000, float:-128.0)
            r0 = 1124073472(0x43000000, float:128.0)
            float r1 = X.C15040mb.A01(r4, r1, r0)
            r0 = 1098907648(0x41800000, float:16.0)
            float r3 = r3 + r0
            r0 = 1122500608(0x42e80000, float:116.0)
            float r3 = r3 / r0
            r0 = 1000593162(0x3ba3d70a, float:0.005)
            float r1 = r1 * r0
            float r3 = r3 - r1
            r0 = 1045683377(0x3e53dcb1, float:0.20689656)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a8
            float r7 = r3 * r3
        L_0x019f:
            float r7 = r7 * r3
            float[] r1 = X.C114055gZ.A04
            r0 = 2
            r0 = r1[r0]
            float r7 = r7 * r0
            goto L_0x009f
        L_0x01a8:
            r7 = 1040416807(0x3e038027, float:0.12841855)
            r0 = 1041055179(0x3e0d3dcb, float:0.13793103)
            float r3 = r3 - r0
            goto L_0x019f
        L_0x01b0:
            boolean r0 = r8 instanceof X.C94564iQ
            if (r0 == 0) goto L_0x01eb
            r9 = r8
            X.4iQ r9 = (X.C94564iQ) r9
            X.7du r2 = r9.A02
            double r0 = (double) r7
            double r0 = r2.BKs(r0)
            float r3 = (float) r0
            double r0 = (double) r5
            double r0 = r2.BKs(r0)
            float r11 = (float) r0
            double r0 = (double) r4
            double r0 = r2.BKs(r0)
            float r2 = (float) r0
            float[] r0 = r9.A0D
            float r9 = X.C90464aC.A06(r0, r3, r11, r2)
            float r1 = X.C90464aC.A05(r0, r3, r11, r2)
        L_0x01d5:
            int r0 = java.lang.Float.floatToRawIntBits(r9)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            r9 = 32
            long r2 = r2 << r9
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r13
            long r2 = r2 | r0
            goto L_0x008d
        L_0x01eb:
            boolean r0 = r8 instanceof X.C94554iP
            r1 = 0
            if (r0 == 0) goto L_0x0224
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = X.C15040mb.A01(r7, r1, r0)
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r9 = X.C15040mb.A01(r5, r1, r0)
            float r3 = X.C15040mb.A01(r4, r1, r0)
            float[] r0 = X.C94554iP.A01
            float r2 = X.C90464aC.A06(r0, r11, r9, r3)
            float r1 = X.C90464aC.A05(r0, r11, r9, r3)
            float r0 = X.C90464aC.A04(r0, r11, r9, r3)
            float r3 = r2 * r2
            float r3 = r3 * r2
            float r2 = r1 * r1
            float r2 = r2 * r1
            float r1 = r0 * r0
            float r1 = r1 * r0
            float[] r0 = X.C94554iP.A00
            float r9 = X.C90464aC.A06(r0, r3, r2, r1)
            float r1 = X.C90464aC.A05(r0, r3, r2, r1)
            goto L_0x01d5
        L_0x0224:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r13 = X.C15040mb.A01(r7, r1, r0)
            r1 = -1023410176(0xffffffffc3000000, float:-128.0)
            r0 = 1124073472(0x43000000, float:128.0)
            float r11 = X.C15040mb.A01(r5, r1, r0)
            r0 = 1098907648(0x41800000, float:16.0)
            float r13 = r13 + r0
            r0 = 1122500608(0x42e80000, float:116.0)
            float r13 = r13 / r0
            r0 = 990057071(0x3b03126f, float:0.002)
            float r11 = r11 * r0
            float r11 = r11 + r13
            r9 = 1041055179(0x3e0d3dcb, float:0.13793103)
            r2 = 1040416807(0x3e038027, float:0.12841855)
            r1 = 1045683377(0x3e53dcb1, float:0.20689656)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0267
            float r3 = r11 * r11
            float r3 = r3 * r11
        L_0x024d:
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0264
            float r2 = r13 * r13
            float r2 = r2 * r13
        L_0x0254:
            float[] r1 = X.C114055gZ.A04
            r0 = 0
            r0 = r1[r0]
            float r3 = r3 * r0
            r0 = 1
            r0 = r1[r0]
            float r2 = r2 * r0
            long r2 = X.C90464aC.A0B(r3, r2)
            goto L_0x008d
        L_0x0264:
            float r13 = r13 - r9
            float r2 = r2 * r13
            goto L_0x0254
        L_0x0267:
            float r11 = r11 - r9
            float r3 = r11 * r2
            goto L_0x024d
        L_0x026b:
            X.6FX r0 = X.C114185go.A02
            if (r12 != r0) goto L_0x027d
            X.6Uq r6 = X.C132646Uq.A06
            goto L_0x0017
        L_0x0273:
            X.6FX r0 = X.C114185go.A02
            if (r5 != r0) goto L_0x027d
            if (r12 != r1) goto L_0x027d
            X.6Uq r6 = X.C132646Uq.A04
            goto L_0x0017
        L_0x027d:
            if (r5 != r12) goto L_0x0286
            X.4iR r6 = new X.4iR
            r6.<init>(r5)
            goto L_0x0017
        L_0x0286:
            long r1 = r5.A01
            long r3 = X.AnonymousClass6J1.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x029f
            long r1 = r12.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x029f
            X.4iQ r5 = (X.C94564iQ) r5
            X.4iQ r12 = (X.C94564iQ) r12
            X.4iS r6 = new X.4iS
            r6.<init>(r5, r12)
            goto L_0x0017
        L_0x029f:
            X.6Uq r6 = new X.6Uq
            r6.<init>(r5, r12)
            goto L_0x0017
        L_0x02a6:
            float[] r1 = X.C114055gZ.A04
            r0 = 0
            r0 = r1[r0]
            float r9 = r9 / r0
            r0 = 1
            r0 = r1[r0]
            float r2 = r2 / r0
            r0 = 2
            r0 = r1[r0]
            float r7 = r7 / r0
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            r11 = 1041055179(0x3e0d3dcb, float:0.13793103)
            r10 = 1090072424(0x40f92f68, float:7.787037)
            r8 = 1007753895(0x3c111aa7, float:0.008856452)
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x030d
            double r3 = (double) r9
            double r0 = (double) r6
            double r0 = java.lang.Math.pow(r3, r0)
            float r9 = (float) r0
        L_0x02cb:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x030a
            double r2 = (double) r2
            double r0 = (double) r6
            double r0 = java.lang.Math.pow(r2, r0)
            float r2 = (float) r0
        L_0x02d6:
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0307
            double r3 = (double) r7
            double r0 = (double) r6
            double r0 = java.lang.Math.pow(r3, r0)
            float r7 = (float) r0
        L_0x02e1:
            r3 = 1122500608(0x42e80000, float:116.0)
            float r3 = r3 * r2
            r0 = 1098907648(0x41800000, float:16.0)
            float r3 = r3 - r0
            r0 = 1140457472(0x43fa0000, float:500.0)
            float r9 = r9 - r2
            float r9 = r9 * r0
            r0 = 1128792064(0x43480000, float:200.0)
            float r2 = r2 - r7
            float r2 = r2 * r0
            r1 = 0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r4 = X.C15040mb.A01(r3, r1, r0)
            r3 = -1023410176(0xffffffffc3000000, float:-128.0)
            r0 = 1124073472(0x43000000, float:128.0)
            float r1 = X.C15040mb.A01(r9, r3, r0)
            float r0 = X.C15040mb.A01(r2, r3, r0)
            long r13 = X.AnonymousClass6QU.A00(r5, r4, r1, r0, r12)
            return r13
        L_0x0307:
            float r7 = r7 * r10
            float r7 = r7 + r11
            goto L_0x02e1
        L_0x030a:
            float r2 = r2 * r10
            float r2 = r2 + r11
            goto L_0x02d6
        L_0x030d:
            float r9 = r9 * r10
            float r9 = r9 + r11
            goto L_0x02cb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133336Xx.A06(X.6FX, long):long");
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C133336Xx) || j != ((C133336Xx) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        return A07(this.A00);
    }

    public /* synthetic */ C133336Xx(long j) {
        this.A00 = j;
    }

    public static String A07(long j) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Color(");
        A0u.append(A04(j));
        A0u.append(", ");
        A0u.append(A03(j));
        A0u.append(", ");
        A0u.append(A02(j));
        A0u.append(", ");
        A0u.append(A01(j));
        A0u.append(", ");
        return C36321k7.A0E(C114185go.A0K[(int) (j & 63)].A02, A0u);
    }
}
