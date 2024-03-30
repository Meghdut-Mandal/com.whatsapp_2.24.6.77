package X;

import java.util.List;

/* renamed from: X.9Zl  reason: invalid class name and case insensitive filesystem */
public abstract class C196389Zl {
    public static final List A00 = C023409w.A00;

    static {
        long j = C133336Xx.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f0, code lost:
        if (r1 != '.') goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014f, code lost:
        if (r1 != '-') goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (r1 == '+') goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0156, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0158, code lost:
        r1 = r13.charAt(r10);
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015f, code lost:
        if (r10 == r21) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0161, code lost:
        r2 = r1 - '0';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0166, code lost:
        if (((char) r2) >= 10) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x016a, code lost:
        if (r9 >= 1024) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016c, code lost:
        r9 = (r9 * 10) + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016f, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0173, code lost:
        if (r10 >= r33) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0175, code lost:
        r1 = r13.charAt(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x017a, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0181, code lost:
        if (r3 == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0183, code lost:
        r9 = -r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0184, code lost:
        r15 = r15 + r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0380 A[EDGE_INSN: B:336:0x0380->B:193:0x0380 ?: BREAK  
    EDGE_INSN: B:337:0x0380->B:193:0x0380 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc A[LOOP:5: B:40:0x00be->B:44:0x00cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(java.lang.String r33) {
        /*
            r13 = r33
            if (r33 != 0) goto L_0x0007
            java.util.List r14 = A00
        L_0x0006:
            return r14
        L_0x0007:
            X.9G4 r18 = new X.9G4
            r18.<init>()
            r0 = r18
            java.util.ArrayList r14 = r0.A01
            r14.clear()
            int r21 = r13.length()
            r33 = r21
            r2 = 0
        L_0x001a:
            r16 = 32
            r0 = r21
            if (r2 >= r0) goto L_0x002f
            char r1 = r13.charAt(r2)
            r0 = 32
            int r0 = X.AnonymousClass00C.A00(r1, r0)
            if (r0 > 0) goto L_0x002f
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002f:
            r0 = r21
            if (r0 <= r2) goto L_0x0044
            int r0 = r21 + -1
            char r1 = r13.charAt(r0)
            r0 = 32
            int r0 = X.AnonymousClass00C.A00(r1, r0)
            if (r0 > 0) goto L_0x0044
            int r21 = r21 + -1
            goto L_0x002f
        L_0x0044:
            r17 = 0
        L_0x0046:
            r0 = r21
            if (r2 >= r0) goto L_0x0006
        L_0x004a:
            int r22 = r2 + 1
            char r8 = r13.charAt(r2)
            r2 = r8 | 32
            int r1 = r2 + -97
            int r0 = r2 + -122
            int r1 = r1 * r0
            if (r1 > 0) goto L_0x05ec
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L_0x05ec
            if (r8 == 0) goto L_0x05f8
            r1 = r8 | 32
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L_0x0388
            r17 = 0
        L_0x0067:
            r1 = r22
            r0 = r21
            if (r1 >= r0) goto L_0x007c
            char r1 = r13.charAt(r1)
            r0 = 32
            int r0 = X.AnonymousClass00C.A00(r1, r0)
            if (r0 > 0) goto L_0x007c
            int r22 = r22 + 1
            goto L_0x0067
        L_0x007c:
            r9 = 2143289344(0x7fc00000, float:NaN)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = r21
            r1 = r22
            if (r1 != r2) goto L_0x00cf
            long r3 = (long) r1
        L_0x008a:
            long r3 = r3 << r16
            int r0 = java.lang.Float.floatToRawIntBits(r9)
            long r0 = (long) r0
        L_0x0091:
            long r0 = r0 & r5
            long r3 = r3 | r0
            long r1 = r3 >>> r16
            int r0 = (int) r1
            r22 = r0
            long r3 = r3 & r5
            int r0 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r0)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L_0x00be
            r0 = r18
            float[] r4 = r0.A00
            int r3 = r17 + 1
            r4[r17] = r1
            int r0 = r4.length
            if (r3 < r0) goto L_0x00bc
            int r0 = r3 * 2
            float[] r2 = new float[r0]
            r0 = r18
            r0.A00 = r2
            int r1 = r4.length
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r2, r0, r1)
        L_0x00bc:
            r17 = r3
        L_0x00be:
            r1 = r22
            r0 = r21
            if (r1 >= r0) goto L_0x0380
            char r1 = r13.charAt(r1)
            r0 = 44
            if (r1 != r0) goto L_0x0380
            int r22 = r22 + 1
            goto L_0x00be
        L_0x00cf:
            char r1 = r13.charAt(r1)
            r0 = 45
            boolean r32 = X.AnonymousClass000.A1S(r1, r0)
            r2 = 46
            r7 = r22
            if (r32 == 0) goto L_0x00f4
            int r7 = r22 + 1
            r0 = r21
            if (r7 == r0) goto L_0x00f2
            char r1 = r13.charAt(r7)
            int r0 = r1 + -48
            char r3 = (char) r0
            r0 = 10
            if (r3 < r0) goto L_0x00f4
            if (r1 == r2) goto L_0x00f4
        L_0x00f2:
            long r3 = (long) r7
            goto L_0x008a
        L_0x00f4:
            r19 = 0
            r12 = r7
            r4 = 0
        L_0x00f9:
            r23 = 10
            r0 = r21
            if (r12 == r0) goto L_0x0117
            int r6 = r1 + -48
            char r3 = (char) r6
            r0 = 10
            if (r3 >= r0) goto L_0x0117
            long r4 = r4 * r23
            long r0 = (long) r6
            long r4 = r4 + r0
            int r12 = r12 + 1
            r0 = r33
            if (r12 >= r0) goto L_0x0115
            char r1 = r13.charAt(r12)
            goto L_0x00f9
        L_0x0115:
            r1 = 0
            goto L_0x00f9
        L_0x0117:
            int r11 = r12 - r7
            r15 = 16
            r0 = r21
            if (r12 == r0) goto L_0x0125
            int r31 = r12 + 1
            r6 = r31
            if (r1 == r2) goto L_0x030b
        L_0x0125:
            r6 = r12
            r31 = r12
            r15 = 0
        L_0x0129:
            if (r11 != 0) goto L_0x013c
            long r3 = (long) r6
            long r3 = r3 << r16
            r0 = 2143289344(0x7fc00000, float:NaN)
        L_0x0130:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
        L_0x0134:
            long r0 = (long) r0
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L_0x0091
        L_0x013c:
            r1 = r1 | 32
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L_0x017e
            int r10 = r6 + 1
            r0 = r33
            if (r10 >= r0) goto L_0x017c
            char r1 = r13.charAt(r10)
            r0 = 45
            r3 = 1
            if (r1 == r0) goto L_0x0156
        L_0x0151:
            r3 = 0
            r0 = 43
            if (r1 != r0) goto L_0x0158
        L_0x0156:
            int r10 = r10 + 1
        L_0x0158:
            char r1 = r13.charAt(r10)
            r9 = 0
        L_0x015d:
            r0 = r21
            if (r10 == r0) goto L_0x0181
            int r2 = r1 + -48
            char r1 = (char) r2
            r0 = 10
            if (r1 >= r0) goto L_0x0181
            r0 = 1024(0x400, float:1.435E-42)
            if (r9 >= r0) goto L_0x016f
            int r9 = r9 * 10
            int r9 = r9 + r2
        L_0x016f:
            int r10 = r10 + 1
            r0 = r33
            if (r10 >= r0) goto L_0x017a
            char r1 = r13.charAt(r10)
            goto L_0x015d
        L_0x017a:
            r1 = 0
            goto L_0x015d
        L_0x017c:
            r1 = 0
            goto L_0x0151
        L_0x017e:
            r10 = r6
            r9 = 0
            goto L_0x0185
        L_0x0181:
            if (r3 == 0) goto L_0x0184
            int r9 = -r9
        L_0x0184:
            int r15 = r15 + r9
        L_0x0185:
            r0 = 19
            if (r11 <= r0) goto L_0x01dd
            char r2 = r13.charAt(r7)
            r1 = r7
        L_0x018e:
            r0 = r21
            if (r10 == r0) goto L_0x01aa
            r0 = 48
            if (r2 == r0) goto L_0x01a7
            r0 = 46
            if (r2 != r0) goto L_0x01aa
        L_0x019a:
            int r1 = r1 + 1
            r0 = r33
            if (r1 >= r0) goto L_0x01a5
            char r2 = r13.charAt(r1)
            goto L_0x018e
        L_0x01a5:
            r2 = 0
            goto L_0x018e
        L_0x01a7:
            int r11 = r11 + -1
            goto L_0x019a
        L_0x01aa:
            r0 = 19
            if (r11 <= r0) goto L_0x01dd
            char r11 = r13.charAt(r7)
            r4 = 0
        L_0x01b4:
            if (r7 == r12) goto L_0x01df
            r0 = -9223372036854775808
            long r27 = r4 ^ r0
            r25 = -8223372036854775808(0x8de0b6b3a7640000, double:-7.832953389245686E-242)
            r2 = r27
            r0 = r25
            int r0 = java.lang.Long.compare(r2, r0)
            if (r0 >= 0) goto L_0x01df
            long r4 = r4 * r23
            r0 = 48
            int r11 = r11 - r0
            long r0 = (long) r11
            long r4 = r4 + r0
            int r7 = r7 + 1
            r0 = r33
            if (r7 >= r0) goto L_0x01db
            char r11 = r13.charAt(r7)
            goto L_0x01b4
        L_0x01db:
            r11 = 0
            goto L_0x01b4
        L_0x01dd:
            r1 = 0
            goto L_0x01f6
        L_0x01df:
            r29 = -9223372036854775808
            long r27 = r4 ^ r29
            r25 = -8223372036854775808(0x8de0b6b3a7640000, double:-7.832953389245686E-242)
            r2 = r27
            r0 = r25
            int r0 = java.lang.Long.compare(r2, r0)
            if (r0 < 0) goto L_0x02db
            int r12 = r12 - r7
            int r15 = r12 + r9
        L_0x01f5:
            r1 = 1
        L_0x01f6:
            r0 = -10
            if (r0 > r15) goto L_0x0228
            r0 = 11
            if (r15 >= r0) goto L_0x0228
            if (r1 != 0) goto L_0x0228
            r0 = -9223372036854775808
            long r2 = r4 ^ r0
            r0 = -9223372036837998592(0x8000000001000000, double:-8.289046E-317)
            int r0 = java.lang.Long.compare(r2, r0)
            if (r0 > 0) goto L_0x0228
            float r2 = (float) r4
            float[] r1 = X.AnonymousClass9AA.A00
            if (r15 >= 0) goto L_0x0224
            int r0 = -r15
            r0 = r1[r0]
            float r2 = r2 / r0
        L_0x0218:
            if (r32 == 0) goto L_0x021b
            float r2 = -r2
        L_0x021b:
            long r3 = (long) r10
            long r3 = r3 << r16
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            goto L_0x0134
        L_0x0224:
            r0 = r1[r15]
            float r2 = r2 * r0
            goto L_0x0218
        L_0x0228:
            int r0 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0232
            r2 = 0
            if (r32 == 0) goto L_0x021b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x021b
        L_0x0232:
            r0 = -126(0xffffffffffffff82, float:NaN)
            if (r0 > r15) goto L_0x0287
            r0 = 128(0x80, float:1.794E-43)
            if (r15 >= r0) goto L_0x0287
            r23 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long[] r1 = X.AnonymousClass9AA.A01
            int r0 = r15 + 325
            r11 = r1[r0]
            int r6 = java.lang.Long.numberOfLeadingZeros(r4)
            long r4 = r4 << r6
            long r2 = r4 & r23
            long r4 = r4 >>> r16
            long r0 = r11 & r23
            long r11 = r11 >>> r16
            long r25 = r4 * r11
            long r11 = r11 * r2
            long r4 = r4 * r0
            long r2 = r2 * r0
            long r2 = r2 >>> r16
            long r4 = r4 + r2
            long r0 = r11 & r23
            long r4 = r4 + r0
            long r4 = r4 >>> r16
            long r25 = r25 + r4
            long r11 = r11 >>> r16
            long r25 = r25 + r11
            r4 = 63
            long r0 = r25 >>> r4
            int r2 = (int) r0
            int r0 = r2 + 9
            long r23 = r25 >>> r0
            r0 = r2 ^ 1
            int r6 = r6 + r0
            r1 = 511(0x1ff, double:2.525E-321)
            long r25 = r25 & r1
            int r0 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0287
            r11 = 1
            int r0 = (r25 > r19 ? 1 : (r25 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0299
            r1 = 3
            long r1 = r1 & r23
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0299
        L_0x0287:
            r0 = r22
            java.lang.String r0 = r13.substring(r0, r10)
            X.AnonymousClass00C.A08(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            long r3 = (long) r10
            long r3 = r3 << r16
            goto L_0x0130
        L_0x0299:
            long r23 = r23 + r11
            r0 = 1
            long r23 = r23 >>> r0
            r1 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            int r0 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02a8
            r23 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            int r6 = r6 + -1
        L_0x02a8:
            r0 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
            long r23 = r23 & r0
            r0 = 217706(0x3526a, double:1.07561E-318)
            long r2 = (long) r15
            long r2 = r2 * r0
            r0 = 16
            long r2 = r2 >> r0
            r0 = 1024(0x400, float:1.435E-42)
            long r0 = (long) r0
            long r2 = r2 + r0
            long r0 = (long) r4
            long r2 = r2 + r0
            long r0 = (long) r6
            long r2 = r2 - r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0287
            r4 = 2046(0x7fe, double:1.011E-320)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0287
            r0 = 52
            long r2 = r2 << r0
            long r2 = r2 | r23
            if (r32 == 0) goto L_0x02d2
            r19 = -9223372036854775808
        L_0x02d2:
            long r2 = r2 | r19
            double r0 = java.lang.Double.longBitsToDouble(r2)
            float r2 = (float) r0
            goto L_0x021b
        L_0x02db:
            r0 = r31
            char r11 = r13.charAt(r0)
            r7 = r0
        L_0x02e2:
            if (r7 == r6) goto L_0x0305
            long r2 = r4 ^ r29
            r0 = -8223372036854775808(0x8de0b6b3a7640000, double:-7.832953389245686E-242)
            int r0 = java.lang.Long.compare(r2, r0)
            if (r0 >= 0) goto L_0x0305
            long r4 = r4 * r23
            r0 = 48
            int r11 = r11 - r0
            long r0 = (long) r11
            long r4 = r4 + r0
            int r7 = r7 + 1
            r0 = r33
            if (r7 >= r0) goto L_0x0303
            char r11 = r13.charAt(r7)
            goto L_0x02e2
        L_0x0303:
            r11 = 0
            goto L_0x02e2
        L_0x0305:
            int r31 = r31 - r7
            int r15 = r31 + r9
            goto L_0x01f5
        L_0x030b:
            int r1 = r21 - r6
            r0 = 4
            if (r1 < r0) goto L_0x035f
            char r0 = r13.charAt(r6)
            long r0 = (long) r0
            int r2 = r6 + 1
            char r2 = r13.charAt(r2)
            long r2 = (long) r2
            long r2 = r2 << r15
            long r2 = r2 | r0
            int r0 = r6 + 2
            char r0 = r13.charAt(r0)
            long r0 = (long) r0
            long r0 = r0 << r16
            long r2 = r2 | r0
            int r0 = r6 + 3
            char r0 = r13.charAt(r0)
            long r0 = (long) r0
            r9 = 48
            long r0 = r0 << r9
            long r2 = r2 | r0
            r9 = 13511005043687472(0x30003000300030, double:8.90070286343755E-308)
            long r0 = r2 - r9
            r9 = 19703549022044230(0x46004600460046, double:2.447700077935472E-307)
            long r2 = r2 + r9
            long r2 = r2 | r0
            r9 = -35747867511423104(0xff80ff80ff80ff80, double:-1.4920556421249022E306)
            long r2 = r2 & r9
            int r9 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r9 != 0) goto L_0x035f
            r2 = 281475406208040961(0x3e80064000a0001, double:7.696495802097085E-290)
            long r0 = r0 * r2
            r2 = 48
            long r0 = r0 >>> r2
            int r2 = (int) r0
            if (r2 < 0) goto L_0x035f
            r0 = 10000(0x2710, double:4.9407E-320)
            long r4 = r4 * r0
            long r0 = (long) r2
            long r4 = r4 + r0
            int r6 = r6 + 4
            goto L_0x030b
        L_0x035f:
            r0 = r33
            if (r6 >= r0) goto L_0x0379
            char r1 = r13.charAt(r6)
        L_0x0367:
            r0 = r21
            if (r6 == r0) goto L_0x037b
            int r3 = r1 + -48
            char r2 = (char) r3
            r0 = 10
            if (r2 >= r0) goto L_0x037b
            long r4 = r4 * r23
            long r0 = (long) r3
            long r4 = r4 + r0
            int r6 = r6 + 1
            goto L_0x035f
        L_0x0379:
            r1 = 0
            goto L_0x0367
        L_0x037b:
            int r15 = r31 - r6
            int r11 = r11 - r15
            goto L_0x0129
        L_0x0380:
            r1 = r22
            r0 = r21
            if (r1 >= r0) goto L_0x0388
            if (r5 == 0) goto L_0x0067
        L_0x0388:
            r0 = r18
            float[] r0 = r0.A00
            r1 = 0
            r2 = 122(0x7a, float:1.71E-43)
            if (r8 == r2) goto L_0x05f3
            r2 = 90
            if (r8 == r2) goto L_0x05f3
            r2 = 109(0x6d, float:1.53E-43)
            if (r8 != r2) goto L_0x03b9
            int r6 = r17 + -2
        L_0x039b:
            if (r1 > r6) goto L_0x05f8
            r3 = r0[r1]
            int r5 = r1 + 1
            r2 = r0[r5]
            X.7wm r4 = new X.7wm
            r4.<init>(r3, r2)
            if (r1 <= 0) goto L_0x03b3
            r3 = r0[r1]
            r2 = r0[r5]
            X.7wl r4 = new X.7wl
            r4.<init>(r3, r2)
        L_0x03b3:
            r14.add(r4)
            int r1 = r1 + 2
            goto L_0x039b
        L_0x03b9:
            r2 = 77
            if (r8 != r2) goto L_0x03dd
            int r6 = r17 + -2
        L_0x03bf:
            if (r1 > r6) goto L_0x05f8
            r3 = r0[r1]
            int r5 = r1 + 1
            r2 = r0[r5]
            X.7wj r4 = new X.7wj
            r4.<init>(r3, r2)
            if (r1 <= 0) goto L_0x03d7
            r3 = r0[r1]
            r2 = r0[r5]
            X.7wi r4 = new X.7wi
            r4.<init>(r3, r2)
        L_0x03d7:
            r14.add(r4)
            int r1 = r1 + 2
            goto L_0x03bf
        L_0x03dd:
            r2 = 108(0x6c, float:1.51E-43)
            if (r8 != r2) goto L_0x03f6
            int r5 = r17 + -2
        L_0x03e3:
            if (r1 > r5) goto L_0x05f8
            r4 = r0[r1]
            int r2 = r1 + 1
            r3 = r0[r2]
            X.7wl r2 = new X.7wl
            r2.<init>(r4, r3)
            r14.add(r2)
            int r1 = r1 + 2
            goto L_0x03e3
        L_0x03f6:
            r2 = 76
            if (r8 != r2) goto L_0x040f
            int r5 = r17 + -2
        L_0x03fc:
            if (r1 > r5) goto L_0x05f8
            r4 = r0[r1]
            int r2 = r1 + 1
            r3 = r0[r2]
            X.7wi r2 = new X.7wi
            r2.<init>(r4, r3)
            r14.add(r2)
            int r1 = r1 + 2
            goto L_0x03fc
        L_0x040f:
            r2 = 104(0x68, float:1.46E-43)
            if (r8 != r2) goto L_0x0424
            int r4 = r17 + -1
        L_0x0415:
            if (r1 > r4) goto L_0x05f8
            r3 = r0[r1]
            X.7wf r2 = new X.7wf
            r2.<init>(r3)
            r14.add(r2)
            int r1 = r1 + 1
            goto L_0x0415
        L_0x0424:
            r2 = 72
            if (r8 != r2) goto L_0x0439
            int r4 = r17 + -1
        L_0x042a:
            if (r1 > r4) goto L_0x05f8
            r3 = r0[r1]
            X.7we r2 = new X.7we
            r2.<init>(r3)
            r14.add(r2)
            int r1 = r1 + 1
            goto L_0x042a
        L_0x0439:
            r2 = 118(0x76, float:1.65E-43)
            if (r8 != r2) goto L_0x044e
            int r4 = r17 + -1
        L_0x043f:
            if (r1 > r4) goto L_0x05f8
            r3 = r0[r1]
            X.7wg r2 = new X.7wg
            r2.<init>(r3)
            r14.add(r2)
            int r1 = r1 + 1
            goto L_0x043f
        L_0x044e:
            r2 = 86
            if (r8 != r2) goto L_0x0463
            int r4 = r17 + -1
        L_0x0454:
            if (r1 > r4) goto L_0x05f8
            r3 = r0[r1]
            X.7wh r2 = new X.7wh
            r2.<init>(r3)
            r14.add(r2)
            int r1 = r1 + 1
            goto L_0x0454
        L_0x0463:
            r2 = 99
            if (r8 != r2) goto L_0x048d
            int r3 = r17 + -6
        L_0x0469:
            if (r1 > r3) goto L_0x05f8
            r5 = r0[r1]
            int r2 = r1 + 1
            r6 = r0[r2]
            int r2 = r1 + 2
            r7 = r0[r2]
            int r2 = r1 + 3
            r8 = r0[r2]
            int r2 = r1 + 4
            r9 = r0[r2]
            int r2 = r1 + 5
            r10 = r0[r2]
            X.7wt r2 = new X.7wt
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r14.add(r2)
            int r1 = r1 + 6
            goto L_0x0469
        L_0x048d:
            r2 = 67
            if (r8 != r2) goto L_0x04b7
            int r3 = r17 + -6
        L_0x0493:
            if (r1 > r3) goto L_0x05f8
            r5 = r0[r1]
            int r2 = r1 + 1
            r6 = r0[r2]
            int r2 = r1 + 2
            r7 = r0[r2]
            int r2 = r1 + 3
            r8 = r0[r2]
            int r2 = r1 + 4
            r9 = r0[r2]
            int r2 = r1 + 5
            r10 = r0[r2]
            X.7ws r2 = new X.7ws
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r14.add(r2)
            int r1 = r1 + 6
            goto L_0x0493
        L_0x04b7:
            r2 = 115(0x73, float:1.61E-43)
            if (r8 != r2) goto L_0x04d8
            int r7 = r17 + -4
        L_0x04bd:
            if (r1 > r7) goto L_0x05f8
            r6 = r0[r1]
            int r2 = r1 + 1
            r5 = r0[r2]
            int r2 = r1 + 2
            r4 = r0[r2]
            int r2 = r1 + 3
            r3 = r0[r2]
            X.7wr r2 = new X.7wr
            r2.<init>(r6, r5, r4, r3)
            r14.add(r2)
            int r1 = r1 + 4
            goto L_0x04bd
        L_0x04d8:
            r2 = 83
            if (r8 != r2) goto L_0x04f9
            int r7 = r17 + -4
        L_0x04de:
            if (r1 > r7) goto L_0x05f8
            r6 = r0[r1]
            int r2 = r1 + 1
            r5 = r0[r2]
            int r2 = r1 + 2
            r4 = r0[r2]
            int r2 = r1 + 3
            r3 = r0[r2]
            X.7wp r2 = new X.7wp
            r2.<init>(r6, r5, r4, r3)
            r14.add(r2)
            int r1 = r1 + 4
            goto L_0x04de
        L_0x04f9:
            r2 = 113(0x71, float:1.58E-43)
            if (r8 != r2) goto L_0x051a
            int r7 = r17 + -4
        L_0x04ff:
            if (r1 > r7) goto L_0x05f8
            r6 = r0[r1]
            int r2 = r1 + 1
            r5 = r0[r2]
            int r2 = r1 + 2
            r4 = r0[r2]
            int r2 = r1 + 3
            r3 = r0[r2]
            X.7wq r2 = new X.7wq
            r2.<init>(r6, r5, r4, r3)
            r14.add(r2)
            int r1 = r1 + 4
            goto L_0x04ff
        L_0x051a:
            r2 = 81
            if (r8 != r2) goto L_0x053b
            int r7 = r17 + -4
        L_0x0520:
            if (r1 > r7) goto L_0x05f8
            r6 = r0[r1]
            int r2 = r1 + 1
            r5 = r0[r2]
            int r2 = r1 + 2
            r4 = r0[r2]
            int r2 = r1 + 3
            r3 = r0[r2]
            X.7wo r2 = new X.7wo
            r2.<init>(r6, r5, r4, r3)
            r14.add(r2)
            int r1 = r1 + 4
            goto L_0x0520
        L_0x053b:
            r2 = 116(0x74, float:1.63E-43)
            if (r8 != r2) goto L_0x0554
            int r5 = r17 + -2
        L_0x0541:
            if (r1 > r5) goto L_0x05f8
            r4 = r0[r1]
            int r2 = r1 + 1
            r3 = r0[r2]
            X.7wn r2 = new X.7wn
            r2.<init>(r4, r3)
            r14.add(r2)
            int r1 = r1 + 2
            goto L_0x0541
        L_0x0554:
            r2 = 84
            if (r8 != r2) goto L_0x056d
            int r5 = r17 + -2
        L_0x055a:
            if (r1 > r5) goto L_0x05f8
            r4 = r0[r1]
            int r2 = r1 + 1
            r3 = r0[r2]
            X.7wk r2 = new X.7wk
            r2.<init>(r4, r3)
            r14.add(r2)
            int r1 = r1 + 2
            goto L_0x055a
        L_0x056d:
            r2 = 97
            r1 = 0
            if (r8 != r2) goto L_0x05ad
            int r4 = r17 + -7
            r3 = 0
        L_0x0575:
            if (r3 > r4) goto L_0x05f8
            r6 = r0[r3]
            int r2 = r3 + 1
            r7 = r0[r2]
            int r2 = r3 + 2
            r8 = r0[r2]
            int r2 = r3 + 3
            r2 = r0[r2]
            int r2 = java.lang.Float.compare(r2, r1)
            boolean r11 = X.AnonymousClass000.A1P(r2)
            int r2 = r3 + 4
            r2 = r0[r2]
            int r2 = java.lang.Float.compare(r2, r1)
            boolean r12 = X.AnonymousClass000.A1P(r2)
            int r2 = r3 + 5
            r9 = r0[r2]
            int r2 = r3 + 6
            r10 = r0[r2]
            X.7wv r2 = new X.7wv
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r14.add(r2)
            int r3 = r3 + 7
            goto L_0x0575
        L_0x05ad:
            r2 = 65
            if (r8 != r2) goto L_0x05fc
            int r4 = r17 + -7
            r3 = 0
        L_0x05b4:
            if (r3 > r4) goto L_0x05f8
            r6 = r0[r3]
            int r2 = r3 + 1
            r7 = r0[r2]
            int r2 = r3 + 2
            r8 = r0[r2]
            int r2 = r3 + 3
            r2 = r0[r2]
            int r2 = java.lang.Float.compare(r2, r1)
            boolean r11 = X.AnonymousClass000.A1P(r2)
            int r2 = r3 + 4
            r2 = r0[r2]
            int r2 = java.lang.Float.compare(r2, r1)
            boolean r12 = X.AnonymousClass000.A1P(r2)
            int r2 = r3 + 5
            r9 = r0[r2]
            int r2 = r3 + 6
            r10 = r0[r2]
            X.7wu r2 = new X.7wu
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r14.add(r2)
            int r3 = r3 + 7
            goto L_0x05b4
        L_0x05ec:
            r2 = r22
            r0 = r21
            if (r2 < r0) goto L_0x004a
            goto L_0x05f8
        L_0x05f3:
            X.7ww r0 = X.C166867ww.A00
            r14.add(r0)
        L_0x05f8:
            r2 = r22
            goto L_0x0046
        L_0x05fc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown command for: "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r8)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196389Zl.A00(java.lang.String):java.util.List");
    }
}
