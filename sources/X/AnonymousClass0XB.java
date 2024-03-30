package X;

import java.util.Arrays;

/* renamed from: X.0XB  reason: invalid class name */
public final class AnonymousClass0XB {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final byte[] A06;
    public final char[] A07;

    public final String toString() {
        return this.A04;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0XB) {
            AnonymousClass0XB r4 = (AnonymousClass0XB) obj;
            if (this.A05 != r4.A05 || !Arrays.equals(this.A07, r4.A07)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.A07);
        int i = 1231;
        if (true != this.A05) {
            i = 1237;
        }
        return hashCode + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r3 = 31 - java.lang.Integer.numberOfLeadingZeros(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r5.A01 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        r2 = java.lang.Integer.numberOfTrailingZeros(r3);
        r5.A02 = 1 << (3 - r2);
        r5.A03 = r3 >> r2;
        r5.A00 = r4 - 1;
        r5.A06 = r8;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r3 >= r5.A03) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        X.AnonymousClass0QZ.A00(r3 * 8, r5.A01, java.math.RoundingMode.CEILING);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        r5.A05 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0XB(java.lang.String r6, char[] r7, byte[] r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.A04 = r6
            java.util.Objects.requireNonNull(r7)
            r5.A07 = r7
            int r4 = r7.length     // Catch:{ ArithmeticException -> 0x007b }
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch:{ ArithmeticException -> 0x007b }
            if (r4 <= 0) goto L_0x002d
            int[] r1 = X.AnonymousClass0RR.A00     // Catch:{ ArithmeticException -> 0x007b }
            int r0 = r0.ordinal()     // Catch:{ ArithmeticException -> 0x007b }
            r0 = r1[r0]     // Catch:{ ArithmeticException -> 0x007b }
            switch(r0) {
                case 1: goto L_0x0020;
                case 2: goto L_0x0043;
                case 3: goto L_0x0043;
                case 4: goto L_0x004a;
                case 5: goto L_0x004a;
                case 6: goto L_0x0034;
                case 7: goto L_0x0034;
                case 8: goto L_0x0034;
                default: goto L_0x001a;
            }     // Catch:{ ArithmeticException -> 0x007b }
        L_0x001a:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ ArithmeticException -> 0x007b }
            r1.<init>()     // Catch:{ ArithmeticException -> 0x007b }
        L_0x001f:
            throw r1     // Catch:{ ArithmeticException -> 0x007b }
        L_0x0020:
            int r0 = r4 + -1
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ArithmeticException -> 0x007b }
            r1.<init>(r0)     // Catch:{ ArithmeticException -> 0x007b }
            goto L_0x001f
        L_0x002d:
            java.lang.String r0 = "x (0) must be > 0"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)     // Catch:{ ArithmeticException -> 0x007b }
            goto L_0x001f
        L_0x0034:
            r1 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch:{ ArithmeticException -> 0x007b }
            int r1 = r1 >>> r0
            int r3 = 31 - r0
            int r1 = r1 - r4
            int r0 = r1 >>> 31
            int r3 = r3 + r0
            goto L_0x0052
        L_0x0043:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch:{ ArithmeticException -> 0x007b }
            int r3 = 31 - r0
            goto L_0x0052
        L_0x004a:
            int r0 = r4 + -1
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch:{ ArithmeticException -> 0x007b }
            int r3 = 32 - r0
        L_0x0052:
            r5.A01 = r3     // Catch:{ ArithmeticException -> 0x007b }
            int r2 = java.lang.Integer.numberOfTrailingZeros(r3)
            int r1 = 3 - r2
            r0 = 1
            int r0 = r0 << r1
            r5.A02 = r0
            int r3 = r3 >> r2
            r5.A03 = r3
            int r0 = r4 + -1
            r5.A00 = r0
            r5.A06 = r8
            r3 = 0
        L_0x0068:
            int r0 = r5.A03
            if (r3 >= r0) goto L_0x0078
            int r2 = r3 * 8
            int r1 = r5.A01
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            X.AnonymousClass0QZ.A00(r2, r1, r0)
            int r3 = r3 + 1
            goto L_0x0068
        L_0x0078:
            r5.A05 = r9
            return
        L_0x007b:
            r3 = move-exception
            int r2 = r7.length
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Illegal alphabet length "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XB.<init>(java.lang.String, char[], byte[], boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0XB(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r8 = 128(0x80, float:1.794E-43)
            byte[] r7 = new byte[r8]
            r6 = -1
            java.util.Arrays.fill(r7, r6)
            r4 = 0
            r5 = 0
        L_0x000a:
            int r0 = r11.length
            if (r5 >= r0) goto L_0x004b
            char r3 = r11[r5]
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1T(r3, r8)
            java.lang.String r2 = "Non-ASCII character: %s"
            if (r0 == 0) goto L_0x003a
            byte r0 = r7[r3]
            if (r0 == r6) goto L_0x001d
            r1 = 0
        L_0x001d:
            java.lang.String r2 = "Duplicate character: %s"
            if (r1 == 0) goto L_0x0027
            byte r0 = (byte) r5
            r7[r3] = r0
            int r5 = r5 + 1
            goto L_0x000a
        L_0x0027:
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            r1[r4] = r0
            java.lang.String r0 = X.AnonymousClass0QX.A00(r2, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x003a:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            r1[r4] = r0
            java.lang.String r0 = X.AnonymousClass0QX.A00(r2, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x004b:
            r9.<init>(r10, r11, r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XB.<init>(java.lang.String, char[]):void");
    }
}
