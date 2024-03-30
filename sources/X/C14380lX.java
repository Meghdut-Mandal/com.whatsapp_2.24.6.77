package X;

/* renamed from: X.0lX  reason: invalid class name and case insensitive filesystem */
public abstract class C14380lX extends C05240Oy {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A01(java.io.File r9) {
        /*
            r7 = 0
            X.AnonymousClass00C.A0D(r9, r7)
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r9)
            long r4 = r9.length()     // Catch:{ all -> 0x008e }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r8 = "File "
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0073
            int r6 = (int) r4
            byte[] r4 = new byte[r6]     // Catch:{ all -> 0x008e }
            r2 = r6
            r1 = 0
        L_0x001b:
            if (r2 <= 0) goto L_0x0026
            int r0 = r3.read(r4, r1, r2)     // Catch:{ all -> 0x008e }
            if (r0 < 0) goto L_0x0026
            int r2 = r2 - r0
            int r1 = r1 + r0
            goto L_0x001b
        L_0x0026:
            if (r2 <= 0) goto L_0x0030
            byte[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch:{ all -> 0x008e }
            X.AnonymousClass00C.A08(r4)     // Catch:{ all -> 0x008e }
            goto L_0x006f
        L_0x0030:
            int r1 = r3.read()     // Catch:{ all -> 0x008e }
            r0 = -1
            if (r1 == r0) goto L_0x006f
            X.0NW r2 = new X.0NW     // Catch:{ all -> 0x008e }
            r2.<init>()     // Catch:{ all -> 0x008e }
            r2.write(r1)     // Catch:{ all -> 0x008e }
            X.AnonymousClass0Va.A00(r3, r2)     // Catch:{ all -> 0x008e }
            int r0 = r2.size()     // Catch:{ all -> 0x008e }
            int r0 = r0 + r6
            if (r0 < 0) goto L_0x005c
            byte[] r1 = r2.A00()     // Catch:{ all -> 0x008e }
            byte[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch:{ all -> 0x008e }
            X.AnonymousClass00C.A08(r4)     // Catch:{ all -> 0x008e }
            int r0 = r2.size()     // Catch:{ all -> 0x008e }
            java.lang.System.arraycopy(r1, r7, r4, r6, r0)     // Catch:{ all -> 0x008e }
            goto L_0x006f
        L_0x005c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)     // Catch:{ all -> 0x008e }
            r1.append(r9)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = " is too big to fit in memory."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x008e }
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x008e }
            r1.<init>(r0)     // Catch:{ all -> 0x008e }
            goto L_0x008d
        L_0x006f:
            r3.close()
            return r4
        L_0x0073:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)     // Catch:{ all -> 0x008e }
            r1.append(r9)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = " is too big ("
            r1.append(r0)     // Catch:{ all -> 0x008e }
            r1.append(r4)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = " bytes) to fit in memory."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x008e }
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x008e }
            r1.<init>(r0)     // Catch:{ all -> 0x008e }
        L_0x008d:
            throw r1     // Catch:{ all -> 0x008e }
        L_0x008e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14380lX.A01(java.io.File):byte[]");
    }
}
