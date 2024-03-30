package X;

/* renamed from: X.097  reason: invalid class name */
public abstract class AnonymousClass097 extends AnonymousClass096 {
    public static final Integer A03(String str) {
        boolean z;
        int i;
        AnonymousClass00C.A0D(str, 0);
        C06780Vb.A00(10);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            int i3 = -2147483647;
            int i4 = 1;
            if (AnonymousClass00C.A00(charAt, 48) >= 0) {
                z = false;
                i4 = 0;
            } else if (length != 1) {
                if (charAt == '-') {
                    i3 = Integer.MIN_VALUE;
                    z = true;
                } else if (charAt == '+') {
                    z = false;
                }
            }
            int i5 = -59652323;
            while (i4 < length) {
                int digit = Character.digit(str.charAt(i4), 10);
                if (digit >= 0 && ((i2 >= i5 || (i5 == -59652323 && i2 >= (i5 = i3 / 10))) && (i = i2 * 10) >= i3 + digit)) {
                    i2 = i - digit;
                    i4++;
                }
            }
            if (z) {
                return Integer.valueOf(i2);
            }
            return Integer.valueOf(-i2);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long A04(java.lang.String r16) {
        /*
            r0 = 0
            r11 = r16
            X.AnonymousClass00C.A0D(r11, r0)
            r10 = 10
            X.C06780Vb.A00(r10)
            int r9 = r11.length()
            r16 = 0
            if (r9 == 0) goto L_0x0056
            r8 = 0
            char r1 = r11.charAt(r0)
            r0 = 48
            int r0 = X.AnonymousClass00C.A00(r1, r0)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 1
            if (r0 >= 0) goto L_0x006e
            if (r9 == r7) goto L_0x0056
            r0 = 45
            if (r1 != r0) goto L_0x0069
            r14 = -9223372036854775808
            r8 = 1
        L_0x002f:
            r3 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r5 = 0
            r12 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
        L_0x003b:
            if (r8 >= r9) goto L_0x0070
            char r0 = r11.charAt(r8)
            int r2 = java.lang.Character.digit(r0, r10)
            if (r2 < 0) goto L_0x0056
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
            long r0 = (long) r10
            long r12 = r14 / r0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
        L_0x0056:
            return r16
        L_0x0057:
            long r0 = (long) r10
            long r5 = r5 * r0
            long r3 = (long) r2
            long r1 = r14 + r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0056
            long r5 = r5 - r3
            int r8 = r8 + 1
            r3 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L_0x003b
        L_0x0069:
            r0 = 43
            if (r1 != r0) goto L_0x0056
            r8 = 1
        L_0x006e:
            r7 = 0
            goto L_0x002f
        L_0x0070:
            if (r7 == 0) goto L_0x0077
            java.lang.Long r16 = java.lang.Long.valueOf(r5)
            return r16
        L_0x0077:
            long r0 = -r5
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass097.A04(java.lang.String):java.lang.Long");
    }
}
