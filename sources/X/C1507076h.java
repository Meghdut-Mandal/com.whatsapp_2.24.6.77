package X;

import java.util.concurrent.Callable;

/* renamed from: X.76h  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1507076h implements Callable {
    public final C1495171n A00;

    public C1507076h(C1495171n r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        if (r3.read() != -1) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        r6 = new byte[2147483639];
        r8 = 2147483639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
        r3 = (byte[]) r10.removeFirst();
        r2 = java.lang.Math.min(r8, r3.length);
        java.lang.System.arraycopy(r3, 0, r6, 2147483639 - r8, r2);
        r8 = r8 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00af, code lost:
        if (r8 <= 0) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0129, code lost:
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012d, code lost:
        if (r9 != null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0132, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0133, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0134, code lost:
        X.C112945ei.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0139, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r13 = this;
            X.71n r3 = r13.A00
            java.net.URL r5 = r3.A01
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r0 = X.C90474aD.A05(r2)
            int r0 = r0 + 22
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "Starting download of: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r4 = "FirebaseMessaging"
            android.util.Log.i(r4, r0)
            java.net.URLConnection r1 = r5.openConnection()
            int r0 = r1.getContentLength()
            r7 = 1048576(0x100000, float:1.469368E-39)
            if (r0 > r7) goto L_0x013a
            java.io.InputStream r9 = r1.getInputStream()
            r3.A02 = r9     // Catch:{ all -> 0x012a }
            X.5Qu r3 = new X.5Qu     // Catch:{ all -> 0x012a }
            r3.<init>(r9)     // Catch:{ all -> 0x012a }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x012a }
            r0 = 20
            java.util.ArrayDeque r10 = new java.util.ArrayDeque     // Catch:{ all -> 0x012a }
            r10.<init>(r0)     // Catch:{ all -> 0x012a }
            r6 = 8192(0x2000, float:1.14794E-41)
            r8 = 0
        L_0x0041:
            r12 = -1
            r11 = 2147483639(0x7ffffff7, float:NaN)
            if (r8 >= r11) goto L_0x0092
            int r11 = r11 - r8
            int r11 = java.lang.Math.min(r6, r11)     // Catch:{ all -> 0x012a }
            byte[] r2 = new byte[r11]     // Catch:{ all -> 0x012a }
            r10.add(r2)     // Catch:{ all -> 0x012a }
            r1 = 0
        L_0x0052:
            if (r1 >= r11) goto L_0x0063
            int r0 = r11 - r1
            int r0 = r3.read(r2, r1, r0)     // Catch:{ all -> 0x012a }
            if (r0 != r12) goto L_0x0060
            byte[] r6 = new byte[r8]     // Catch:{ all -> 0x012a }
            r11 = r8
            goto L_0x007d
        L_0x0060:
            int r1 = r1 + r0
            int r8 = r8 + r0
            goto L_0x0052
        L_0x0063:
            long r0 = (long) r6     // Catch:{ all -> 0x012a }
            r2 = 1
            long r0 = r0 << r2
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0071
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0041
        L_0x0071:
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x007b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0041
        L_0x007b:
            int r6 = (int) r0     // Catch:{ all -> 0x012a }
            goto L_0x0041
        L_0x007d:
            if (r11 <= 0) goto L_0x00b2
            java.lang.Object r3 = r10.removeFirst()     // Catch:{ all -> 0x012a }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x012a }
            int r0 = r3.length     // Catch:{ all -> 0x012a }
            int r2 = java.lang.Math.min(r11, r0)     // Catch:{ all -> 0x012a }
            int r1 = r8 - r11
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r6, r1, r2)     // Catch:{ all -> 0x012a }
            int r11 = r11 - r2
            goto L_0x007d
        L_0x0092:
            int r0 = r3.read()     // Catch:{ all -> 0x012a }
            if (r0 != r12) goto L_0x0122
            byte[] r6 = new byte[r11]     // Catch:{ all -> 0x012a }
            r8 = 2147483639(0x7ffffff7, float:NaN)
        L_0x009d:
            java.lang.Object r3 = r10.removeFirst()     // Catch:{ all -> 0x012a }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x012a }
            int r0 = r3.length     // Catch:{ all -> 0x012a }
            int r2 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x012a }
            int r1 = r11 - r8
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r6, r1, r2)     // Catch:{ all -> 0x012a }
            int r8 = r8 - r2
            if (r8 <= 0) goto L_0x00b2
            goto L_0x009d
        L_0x00b2:
            if (r9 == 0) goto L_0x00b7
            r9.close()
        L_0x00b7:
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            if (r0 == 0) goto L_0x00de
            int r3 = r6.length
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r0 = X.C90474aD.A05(r2)
            int r0 = r0 + 34
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "Downloaded "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " bytes from "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            android.util.Log.v(r4, r0)
        L_0x00de:
            int r1 = r6.length
            if (r1 > r7) goto L_0x011b
            r0 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r6, r0, r1)
            if (r3 == 0) goto L_0x0102
            boolean r0 = X.C90494aF.A1a(r4)
            if (r0 == 0) goto L_0x0101
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r0 = X.C90474aD.A05(r2)
            int r0 = r0 + 31
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "Successfully downloaded image: "
            X.C90464aC.A1G(r0, r2, r4, r1)
        L_0x0101:
            return r3
        L_0x0102:
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r0 = X.C90474aD.A05(r2)
            int r0 = r0 + 24
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "Failed to decode image: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x011b:
            java.lang.String r0 = "Image exceeds max size of 1048576"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x0122:
            java.lang.String r1 = "input is too large to fit in a byte array"
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x012a }
            r0.<init>(r1)     // Catch:{ all -> 0x012a }
            throw r0     // Catch:{ all -> 0x012a }
        L_0x012a:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x012c }
        L_0x012c:
            r2 = move-exception
            if (r9 == 0) goto L_0x0139
            r9.close()     // Catch:{ all -> 0x0133 }
            throw r2
        L_0x0133:
            r1 = move-exception
            X.5zb r0 = X.C112945ei.A00
            r0.A00(r3, r1)
        L_0x0139:
            throw r2
        L_0x013a:
            java.lang.String r0 = "Content-Length exceeds max size of 1048576"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1507076h.call():java.lang.Object");
    }
}