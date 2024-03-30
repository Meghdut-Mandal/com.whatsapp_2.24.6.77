package X;

import java.io.File;

/* renamed from: X.3J8  reason: invalid class name */
public abstract class AnonymousClass3J8 {
    public final int A00;
    public final long A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        if (r2.isDirectory() != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(java.util.zip.ZipInputStream r19) {
        /*
            r18 = this;
            r0 = 8192(0x2000, float:1.14794E-41)
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r0]
            r6 = 0
            r16 = 0
            r5 = 0
        L_0x000a:
            r4 = r19
            java.util.zip.ZipEntry r12 = r4.getNextEntry()
            if (r12 == 0) goto L_0x012e
            r9 = r18
            java.lang.String r11 = r9.A02
            java.lang.String r0 = r12.getName()
            java.io.File r2 = X.AnonymousClass6YY.A05(r11, r0)
            if (r2 == 0) goto L_0x003a
            boolean r0 = r9 instanceof X.AnonymousClass2TE
            if (r0 == 0) goto L_0x0051
            r0 = 0
            throw r0
        L_0x0026:
            r1.append(r11)
            java.lang.String r0 = "/backgrounds"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            boolean r0 = r10.startsWith(r0)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "PAY: PaymentBackgroundBatchZipEntrySaver/invalid zip content"
        L_0x0037:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x003a:
            r12.getName()
            goto L_0x000a
        L_0x003e:
            java.lang.String r0 = r2.getAbsolutePath()
            java.lang.String r1 = X.AnonymousClass6YY.A07(r0)
            java.lang.String r0 = "webp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = "PAY: PaymentBackgroundBatchZipEntrySaver/store: Zip entry not webp"
            goto L_0x0037
        L_0x0051:
            boolean r3 = r9 instanceof X.AnonymousClass2TC
            java.lang.String r10 = r2.getCanonicalPath()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r3 == 0) goto L_0x0026
            r1.append(r11)
            r0 = 47
            r1.append(r0)
            java.lang.String r0 = "thumbnails"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r2.getAbsolutePath()
            java.lang.String r1 = X.AnonymousClass6YY.A07(r0)
            java.lang.String r0 = "jpg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0087
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x003a
        L_0x0087:
            if (r3 == 0) goto L_0x00c4
            java.io.File r1 = r2.getParentFile()
            if (r1 == 0) goto L_0x0098
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0098
            r1.mkdirs()
        L_0x0098:
            r14 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x010e }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x009f:
            int r1 = r4.read(r7)     // Catch:{ all -> 0x00ba }
            r0 = -1
            if (r1 == r0) goto L_0x00b6
            r3.write(r7, r6, r1)     // Catch:{ all -> 0x00ba }
            long r0 = (long) r1     // Catch:{ all -> 0x00ba }
            long r14 = r14 + r0
            r10 = 8192(0x2000, double:4.0474E-320)
            long r10 = r10 + r14
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b6
            goto L_0x009f
        L_0x00b6:
            r3.close()     // Catch:{ FileNotFoundException -> 0x010e }
            goto L_0x0114
        L_0x00ba:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00bf }
            goto L_0x00c3
        L_0x00bf:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00c3:
            throw r1     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00c4:
            r13 = r9
            X.2TD r13 = (X.AnonymousClass2TD) r13
            java.io.File r1 = r13.A00
            java.lang.String r0 = r2.getName()
            java.io.File r12 = X.C36441kJ.A0w(r1, r0)
            r14 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x010a }
            r3.<init>(r12)     // Catch:{ FileNotFoundException -> 0x010a }
        L_0x00d8:
            int r1 = r4.read(r7)     // Catch:{ all -> 0x0100 }
            r0 = -1
            if (r1 == r0) goto L_0x00ef
            r3.write(r7, r6, r1)     // Catch:{ all -> 0x0100 }
            long r0 = (long) r1     // Catch:{ all -> 0x0100 }
            long r14 = r14 + r0
            r10 = 8192(0x2000, double:4.0474E-320)
            long r10 = r10 + r14
            r1 = 524288000(0x1f400000, double:2.590326893E-315)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ef
            goto L_0x00d8
        L_0x00ef:
            java.util.Set r1 = r13.A01     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = r12.getName()     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = X.AnonymousClass6YY.A08(r0)     // Catch:{ all -> 0x0100 }
            r1.add(r0)     // Catch:{ all -> 0x0100 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x010a }
            goto L_0x0114
        L_0x0100:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0105 }
            goto L_0x0109
        L_0x0105:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x010a }
        L_0x0109:
            throw r1     // Catch:{ FileNotFoundException -> 0x010a }
        L_0x010a:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentBackgroundBatchZipEntrySaver"
            goto L_0x0111
        L_0x010e:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperZipEntrySaver"
        L_0x0111:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0114:
            long r16 = r16 + r14
            long r3 = (long) r8
            long r3 = r3 + r16
            long r1 = r9.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0125
            java.lang.String r0 = "SafeZipEntrySaver: File being unzipped is too big."
        L_0x0121:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        L_0x0125:
            int r5 = r5 + 1
            int r0 = r9.A00
            if (r5 <= r0) goto L_0x000a
            java.lang.String r0 = "SafeZipEntrySaver: Too many files to unzip."
            goto L_0x0121
        L_0x012e:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3J8.A01(java.util.zip.ZipInputStream):boolean");
    }

    public AnonymousClass3J8(File file, int i, long j) {
        this.A01 = j;
        this.A00 = i;
        this.A02 = file.getCanonicalPath();
    }
}
