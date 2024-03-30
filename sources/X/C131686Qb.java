package X;

import java.io.File;

/* renamed from: X.6Qb  reason: invalid class name and case insensitive filesystem */
public final class C131686Qb {
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(java.io.InputStream r11, java.lang.String r12) {
        /*
            r10 = 0
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x00d9 }
            r3.<init>(r11)     // Catch:{ all -> 0x00d9 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00d7 }
            r4.<init>(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = ""
            A01(r12, r0)     // Catch:{ all -> 0x00dc }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x00dc }
            r6 = 0
            r9 = 0
        L_0x0016:
            java.util.zip.ZipEntry r2 = r3.getNextEntry()     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x00d0
            java.lang.String r8 = r2.getName()     // Catch:{ all -> 0x00dc }
            X.AnonymousClass00C.A0B(r8)     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = ".."
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = java.io.File.separator     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x00dc }
            boolean r0 = X.AnonymousClass099.A0O(r8, r0, r6)     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x0042
            A01(r12, r8)     // Catch:{ all -> 0x00dc }
            goto L_0x0016
        L_0x0042:
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x00dc }
            X.AnonymousClass00C.A09(r2)     // Catch:{ all -> 0x00dc }
            X.AnonymousClass00C.A0D(r8, r6)     // Catch:{ all -> 0x00dc }
            int r0 = r8.length()     // Catch:{ all -> 0x00dc }
            int r0 = r0 + -1
            int r0 = X.AnonymousClass099.A0B(r8, r2, r0)     // Catch:{ all -> 0x00dc }
            r5 = -1
            if (r0 == r5) goto L_0x0066
            java.lang.String r0 = X.C36431kI.A16(r6, r0, r8)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = X.C90464aC.A0e(r12, r2, r0)     // Catch:{ all -> 0x00dc }
            java.io.File r0 = X.C90524aI.A0S(r0)     // Catch:{ all -> 0x00dc }
            r0.mkdirs()     // Catch:{ all -> 0x00dc }
        L_0x0066:
            java.io.File r0 = X.C90524aI.A0T(r12, r8)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ all -> 0x00dc }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x00dc }
            java.io.File r0 = X.C90524aI.A0S(r12)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ all -> 0x00dc }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00dc }
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = X.C90464aC.A0e(r12, r2, r8)     // Catch:{ all -> 0x00ae }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ae }
            r2.<init>(r0)     // Catch:{ all -> 0x00ae }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00ac }
            r1.<init>(r2)     // Catch:{ all -> 0x00ac }
        L_0x0090:
            int r0 = r4.read(r7)     // Catch:{ all -> 0x00a9 }
            if (r0 == r5) goto L_0x009b
            r1.write(r7, r6, r0)     // Catch:{ all -> 0x00a9 }
            int r9 = r9 + r0
            goto L_0x0090
        L_0x009b:
            r1.flush()     // Catch:{ all -> 0x00a9 }
            r3.closeEntry()     // Catch:{ all -> 0x00dc }
            X.AnonymousClass6I7.A00(r1)     // Catch:{ all -> 0x00dc }
            X.AnonymousClass6I7.A00(r2)     // Catch:{ all -> 0x00dc }
            goto L_0x0016
        L_0x00a9:
            r0 = move-exception
            r10 = r1
            goto L_0x00b0
        L_0x00ac:
            r0 = move-exception
            goto L_0x00b0
        L_0x00ae:
            r0 = move-exception
            r2 = r10
        L_0x00b0:
            r3.closeEntry()     // Catch:{ all -> 0x00dc }
            X.AnonymousClass6I7.A00(r10)     // Catch:{ all -> 0x00dc }
            X.AnonymousClass6I7.A00(r2)     // Catch:{ all -> 0x00dc }
            goto L_0x00cf
        L_0x00ba:
            java.lang.String r0 = "zipEntryName contains ../"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x00cf
        L_0x00c1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "ZIP input flows into path traversal sink. The generated file doesn't start with "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r12, r1)     // Catch:{ all -> 0x00dc }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x00dc }
        L_0x00cf:
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x00d0:
            X.AnonymousClass6I7.A00(r4)
            X.AnonymousClass6I7.A00(r3)
            return r9
        L_0x00d7:
            r0 = move-exception
            goto L_0x00de
        L_0x00d9:
            r0 = move-exception
            r3 = r10
            goto L_0x00de
        L_0x00dc:
            r0 = move-exception
            r10 = r4
        L_0x00de:
            X.AnonymousClass6I7.A00(r10)
            X.AnonymousClass6I7.A00(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131686Qb.A00(java.io.InputStream, java.lang.String):int");
    }

    public static final void A01(String str, String str2) {
        File A0S = C90524aI.A0S(AnonymousClass000.A0p(File.separator, str2, AnonymousClass000.A0v(str)));
        if (!A0S.isDirectory()) {
            A0S.mkdirs();
        }
    }
}
