package X;

/* renamed from: X.6IQ  reason: invalid class name */
public abstract class AnonymousClass6IQ {
    public static final byte[] A00 = C36371kC.A1Z("MotionPhoto_Data", AnonymousClass0S4.A05);

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r11 == -1) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4 = (r4 + r11) + r3;
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(java.io.File r14) {
        /*
            r9 = 0
            X.AnonymousClass00C.A0D(r14, r9)
            boolean r0 = r14.exists()
            r8 = -1
            if (r0 == 0) goto L_0x00a6
            long r0 = r14.length()
            double r2 = (double) r0
            r0 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r2 = r2 * r0
            int r7 = (int) r2
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r0]
            java.io.FileInputStream r5 = X.C90524aI.A0U(r14)     // Catch:{ all -> 0x00a6 }
            int r0 = r5.read(r6)     // Catch:{ all -> 0x009b }
            if (r0 == r8) goto L_0x0097
            r4 = 0
        L_0x0026:
            if (r4 > r7) goto L_0x0097
            r12 = 8192(0x2000, float:1.14794E-41)
            r11 = 0
        L_0x002b:
            byte r1 = r6[r11]     // Catch:{ all -> 0x009b }
            byte[] r10 = A00     // Catch:{ all -> 0x009b }
            byte r0 = r10[r9]     // Catch:{ all -> 0x009b }
            if (r1 != r0) goto L_0x004d
            int r3 = r10.length     // Catch:{ all -> 0x009b }
            r13 = 1
            r2 = 1
        L_0x0036:
            if (r2 >= r3) goto L_0x004d
            int r0 = r11 + r2
            if (r0 >= r12) goto L_0x004d
            byte r1 = r6[r0]     // Catch:{ all -> 0x009b }
            byte r0 = r10[r2]     // Catch:{ all -> 0x009b }
            if (r1 != r0) goto L_0x004d
            int r0 = r3 - r13
            if (r2 != r0) goto L_0x004a
            if (r11 == r8) goto L_0x0052
            int r4 = r4 + r11
            goto L_0x008e
        L_0x004a:
            int r2 = r2 + 1
            goto L_0x0036
        L_0x004d:
            int r11 = r11 + 1
            if (r11 >= r12) goto L_0x0052
            goto L_0x002b
        L_0x0052:
            long r2 = r14.length()     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "Item:Semantic=\"MotionPhoto\"\\s+Item:Length=\"(\\d+)\""
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x009b }
            java.nio.charset.Charset r1 = X.AnonymousClass0S4.A05     // Catch:{ all -> 0x009b }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x009b }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x009b }
            java.util.regex.Matcher r1 = r10.matcher(r0)     // Catch:{ all -> 0x009b }
            boolean r0 = r1.find()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0080
            r0 = 1
            java.lang.String r0 = r1.group(r0)     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0079
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x009b }
            goto L_0x007b
        L_0x0079:
            r0 = 0
        L_0x007b:
            long r2 = r2 - r0
            int r0 = (int) r2     // Catch:{ all -> 0x009b }
            if (r0 == r8) goto L_0x0080
            goto L_0x0093
        L_0x0080:
            int r4 = r4 + 4096
            r0 = 4096(0x1000, float:5.74E-42)
            java.lang.System.arraycopy(r6, r0, r6, r9, r0)     // Catch:{ all -> 0x009b }
            int r0 = r5.read(r6, r0, r0)     // Catch:{ all -> 0x009b }
            if (r0 != r8) goto L_0x0026
            goto L_0x0097
        L_0x008e:
            int r4 = r4 + r3
            r5.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x00a3
        L_0x0093:
            r5.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x00a2
        L_0x0097:
            r5.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x00a6
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00a6 }
            throw r0     // Catch:{ all -> 0x00a6 }
        L_0x00a2:
            r4 = r0
        L_0x00a3:
            r0 = 1
            if (r4 > r8) goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6IQ.A00(java.io.File):boolean");
    }
}
