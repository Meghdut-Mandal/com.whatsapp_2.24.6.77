package X;

/* renamed from: X.6HS  reason: invalid class name */
public abstract class AnonymousClass6HS {
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c4, code lost:
        if (r11 != 19) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(byte[] r15, int r16) {
        /*
            int r10 = r15.length     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r0 = r16 & 1
            r14 = 1
            boolean r13 = X.AnonymousClass000.A1Q(r0)
            r0 = r16 & 2
            boolean r12 = X.AnonymousClass000.A1Q(r0)
            r0 = r16 & 4
            if (r0 != 0) goto L_0x0013
            r14 = 0
        L_0x0013:
            r0 = r16 & 8
            if (r0 != 0) goto L_0x001a
            byte[] r5 = X.C107695Qm.A00     // Catch:{ UnsupportedEncodingException -> 0x00da }
            goto L_0x001c
        L_0x001a:
            byte[] r5 = X.C107695Qm.A01     // Catch:{ UnsupportedEncodingException -> 0x00da }
        L_0x001c:
            r11 = -1
            if (r12 == 0) goto L_0x0021
            r11 = 19
        L_0x0021:
            int r0 = r10 / 3
            int r3 = r0 * 4
            r2 = 2
            r1 = 1
            int r0 = r10 % 3
            if (r13 == 0) goto L_0x0030
            if (r0 <= 0) goto L_0x0036
            int r3 = r3 + 4
            goto L_0x0036
        L_0x0030:
            if (r0 == r1) goto L_0x003b
            if (r0 != r2) goto L_0x0036
            int r3 = r3 + 3
        L_0x0036:
            if (r12 == 0) goto L_0x0049
            if (r10 <= 0) goto L_0x0049
            goto L_0x003e
        L_0x003b:
            int r3 = r3 + 2
            goto L_0x0036
        L_0x003e:
            int r0 = r10 + -1
            int r0 = r0 / 57
            int r0 = r0 + 1
            if (r14 != 0) goto L_0x0047
            r2 = 1
        L_0x0047:
            int r0 = r0 * r2
            int r3 = r3 + r0
        L_0x0049:
            byte[] r2 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r9 = 0
            r3 = 4
            r8 = 13
            r7 = 10
            r4 = 0
        L_0x0052:
            int r1 = r9 + 3
            if (r1 > r10) goto L_0x0071
            X.C90484aE.A1N(r15, r5, r2, r9, r4)     // Catch:{ UnsupportedEncodingException -> 0x00da }
            int r4 = r4 + 4
            int r11 = r11 + -1
            if (r11 != 0) goto L_0x006f
            if (r14 == 0) goto L_0x0066
            int r0 = r4 + 1
            r2[r4] = r8     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r4 = r0
        L_0x0066:
            int r0 = r4 + 1
            r2[r4] = r7     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r4 = r0
            r9 = r1
            r11 = 19
            goto L_0x0052
        L_0x006f:
            r9 = r1
            goto L_0x0052
        L_0x0071:
            int r0 = r10 + -1
            r6 = 61
            if (r9 != r0) goto L_0x008d
            byte r0 = r15[r9]     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r3
            int r4 = X.C90484aE.A0I(r5, r2, r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x00da }
            if (r13 == 0) goto L_0x008a
            int r0 = r4 + 1
            r2[r4] = r6     // Catch:{ UnsupportedEncodingException -> 0x00da }
            int r4 = r0 + 1
            r2[r0] = r6     // Catch:{ UnsupportedEncodingException -> 0x00da }
        L_0x008a:
            if (r12 == 0) goto L_0x00d2
            goto L_0x00c6
        L_0x008d:
            int r0 = r10 + -2
            if (r9 != r0) goto L_0x00be
            int r1 = r9 + 1
            byte r0 = r15[r9]     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r7
            byte r0 = r15[r1]     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 2
            r3 = r3 | r0
            int r1 = r4 + 1
            int r0 = r3 >> 12
            r0 = r0 & 63
            byte r0 = r5[r0]     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r2[r4] = r0     // Catch:{ UnsupportedEncodingException -> 0x00da }
            int r1 = X.C90484aE.A0I(r5, r2, r1, r3)     // Catch:{ UnsupportedEncodingException -> 0x00da }
            if (r13 == 0) goto L_0x00b4
            int r0 = r1 + 1
            r2[r1] = r6     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r1 = r0
        L_0x00b4:
            if (r12 == 0) goto L_0x00d2
            if (r14 == 0) goto L_0x00d0
            int r0 = r1 + 1
            r2[r1] = r8     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r1 = r0
            goto L_0x00d0
        L_0x00be:
            if (r12 == 0) goto L_0x00d2
            if (r4 <= 0) goto L_0x00d2
            r0 = 19
            if (r11 == r0) goto L_0x00d2
        L_0x00c6:
            if (r14 == 0) goto L_0x00cd
            int r0 = r4 + 1
            r2[r4] = r8     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r4 = r0
        L_0x00cd:
            r2[r4] = r7     // Catch:{ UnsupportedEncodingException -> 0x00da }
            goto L_0x00d2
        L_0x00d0:
            r2[r1] = r7     // Catch:{ UnsupportedEncodingException -> 0x00da }
        L_0x00d2:
            java.lang.String r1 = "US-ASCII"
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00da }
            r0.<init>(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x00da }
            return r0
        L_0x00da:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6HS.A00(byte[], int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r13 != 4) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r2 == r5) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r1 = new byte[r2];
        java.lang.System.arraycopy(r4, 0, r1, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0033 A[EDGE_INSN: B:54:0x0033->B:14:0x0033 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(byte[] r16) {
        /*
            r7 = r16
            int r6 = r7.length
            int r0 = r6 * 3
            int r5 = r0 / 4
            byte[] r4 = new byte[r5]
            int[] r3 = X.C107685Ql.A00
            r8 = 0
            r2 = 0
            r13 = 0
            r1 = 0
        L_0x000f:
            r14 = 3
            r12 = 4
            r11 = 2
            r15 = 1
            if (r1 >= r6) goto L_0x002b
            if (r13 != 0) goto L_0x0054
        L_0x0017:
            int r0 = r1 + 4
            if (r0 > r6) goto L_0x0028
            int r8 = X.C90504aG.A0D(r7, r3, r1)
            if (r8 < 0) goto L_0x0028
            X.C90484aE.A1M(r4, r2, r8)
            int r2 = r2 + 3
            r1 = r0
            goto L_0x0017
        L_0x0028:
            if (r1 < r6) goto L_0x0054
            goto L_0x0033
        L_0x002b:
            if (r13 == r15) goto L_0x006d
            if (r13 == r11) goto L_0x004b
            if (r13 == r14) goto L_0x003c
            if (r13 == r12) goto L_0x006d
        L_0x0033:
            if (r2 == r5) goto L_0x00c0
            byte[] r1 = new byte[r2]
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r1, r0, r2)
            return r1
        L_0x003c:
            int r1 = r2 + 1
            int r0 = r8 >> 10
            byte r0 = (byte) r0
            r4[r2] = r0
            int r2 = r1 + 1
            int r0 = r8 >> 2
            byte r0 = (byte) r0
            r4[r1] = r0
            goto L_0x0033
        L_0x004b:
            int r1 = r2 + 1
            int r0 = r8 >> 4
            byte r0 = (byte) r0
            r4[r2] = r0
            r2 = r1
            goto L_0x0033
        L_0x0054:
            int r16 = r1 + 1
            byte r0 = r7[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r10 = r3[r0]
            r9 = 5
            r1 = -1
            if (r13 == 0) goto L_0x008f
            if (r13 == r15) goto L_0x008a
            r0 = -2
            if (r13 == r11) goto L_0x0079
            if (r13 == r14) goto L_0x009b
            if (r13 == r12) goto L_0x0074
            if (r13 != r9) goto L_0x00a7
            if (r10 == r1) goto L_0x00a7
        L_0x006d:
            java.lang.String r0 = "bad base-64"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0074:
            if (r10 == r0) goto L_0x00bb
            if (r10 == r1) goto L_0x00a7
            goto L_0x006d
        L_0x0079:
            if (r10 >= 0) goto L_0x0094
            if (r10 != r0) goto L_0x0087
            int r1 = r2 + 1
            int r0 = r8 >> 4
            byte r0 = (byte) r0
            r4[r2] = r0
            r2 = r1
            r13 = 4
            goto L_0x00a7
        L_0x0087:
            if (r10 == r1) goto L_0x00a7
            goto L_0x006d
        L_0x008a:
            if (r10 >= 0) goto L_0x0094
            if (r10 == r1) goto L_0x00a7
            goto L_0x006d
        L_0x008f:
            if (r10 >= 0) goto L_0x0097
            if (r10 == r1) goto L_0x00a7
            goto L_0x006d
        L_0x0094:
            int r0 = r8 << 6
            r10 = r10 | r0
        L_0x0097:
            int r13 = r13 + 1
            r8 = r10
            goto L_0x00a7
        L_0x009b:
            if (r10 < 0) goto L_0x00ab
            int r0 = r8 << 6
            r10 = r10 | r0
            X.C90484aE.A1M(r4, r2, r10)
            int r2 = r2 + 3
            r8 = r10
            r13 = 0
        L_0x00a7:
            r1 = r16
            goto L_0x000f
        L_0x00ab:
            if (r10 != r0) goto L_0x00bd
            int r1 = r2 + 1
            int r0 = r8 >> 2
            byte r0 = (byte) r0
            r4[r1] = r0
            int r0 = r8 >> 10
            byte r0 = (byte) r0
            r4[r2] = r0
            int r2 = r2 + 2
        L_0x00bb:
            r13 = 5
            goto L_0x00a7
        L_0x00bd:
            if (r10 == r1) goto L_0x00a7
            goto L_0x006d
        L_0x00c0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6HS.A01(byte[]):byte[]");
    }
}
