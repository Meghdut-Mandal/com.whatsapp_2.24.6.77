package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C90524aI;
import java.math.RoundingMode;

public abstract class zzga {
    public static int zzb(int i, RoundingMode roundingMode) {
        if (i > 0) {
            switch (C90524aI.A03(roundingMode, zzfz.zza)) {
                case 1:
                    zzgc.zzb(AnonymousClass000.A1Q((i - 1) & i));
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                    return (31 - numberOfLeadingZeros) + (((-1257966797 >>> numberOfLeadingZeros) - i) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i);
        }
        throw AnonymousClass001.A08("x (0) must be > 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        return r4 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r2 < 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r2 > 0) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(int r5, int r6, java.math.RoundingMode r7) {
        /*
            java.util.Objects.requireNonNull(r7)
            if (r6 == 0) goto L_0x004c
            int r4 = r5 / r6
            int r0 = r6 * r4
            int r3 = r5 - r0
            if (r3 == 0) goto L_0x004b
            r5 = r5 ^ r6
            int[] r0 = com.google.android.recaptcha.internal.zzfz.zza
            int r1 = X.C90524aI.A03(r7, r0)
            int r0 = r5 >> 31
            r2 = r0 | 1
            r0 = 0
            switch(r1) {
                case 1: goto L_0x0048;
                case 2: goto L_0x004b;
                case 3: goto L_0x0022;
                case 4: goto L_0x0043;
                case 5: goto L_0x0025;
                case 6: goto L_0x0028;
                case 7: goto L_0x0028;
                case 8: goto L_0x0028;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x0022:
            if (r2 >= 0) goto L_0x004b
            goto L_0x0043
        L_0x0025:
            if (r2 <= 0) goto L_0x004b
            goto L_0x0043
        L_0x0028:
            int r1 = java.lang.Math.abs(r3)
            int r0 = java.lang.Math.abs(r6)
            int r0 = r0 - r1
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0045
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            if (r7 == r0) goto L_0x0043
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_EVEN
            boolean r1 = X.C36361kB.A1a(r7, r0)
            r0 = r4 & 1
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004b
        L_0x0043:
            int r4 = r4 + r2
            return r4
        L_0x0045:
            if (r1 <= 0) goto L_0x004b
            goto L_0x0043
        L_0x0048:
            com.google.android.recaptcha.internal.zzgc.zzb(r0)
        L_0x004b:
            return r4
        L_0x004c:
            java.lang.String r0 = "/ by zero"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzga.zza(int, int, java.math.RoundingMode):int");
    }
}
