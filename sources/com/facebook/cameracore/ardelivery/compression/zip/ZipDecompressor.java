package com.facebook.cameracore.ardelivery.compression.zip;

import X.AnonymousClass7eU;
import X.C131686Qb;
import java.io.InputStream;

public final class ZipDecompressor implements AnonymousClass7eU {
    public static final C131686Qb Companion = new C131686Qb();
    public static final int UNZIP_BUFFER_SIZE = 4096;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C129966Je decompress(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r3 = "Failed to unzip:"
            X.C36321k7.A0w(r5, r6)
            X.5Qq r0 = new X.5Qq     // Catch:{ IOException | IllegalArgumentException -> 0x0033 }
            r0.<init>((java.lang.String) r5)     // Catch:{ IOException | IllegalArgumentException -> 0x0033 }
            java.io.FileInputStream r2 = X.C90524aI.A0U(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0033 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x002c }
            int r0 = X.C131686Qb.A00(r2, r6)     // Catch:{ all -> 0x002c }
            if (r0 <= 0) goto L_0x0021
            java.io.File r0 = X.C90524aI.A0S(r6)     // Catch:{ all -> 0x002c }
            X.6Je r1 = new X.6Je     // Catch:{ all -> 0x002c }
            r1.<init>((java.io.File) r0)     // Catch:{ all -> 0x002c }
            goto L_0x0028
        L_0x0021:
            java.lang.String r0 = "Failed to unzip: file size is 0"
            X.6Je r1 = new X.6Je     // Catch:{ all -> 0x002c }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x002c }
        L_0x0028:
            r2.close()     // Catch:{ IOException | IllegalArgumentException -> 0x0033 }
            return r1
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0033 }
            throw r0     // Catch:{ IOException | IllegalArgumentException -> 0x0033 }
        L_0x0033:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r1 = X.C36331k8.A0i(r3, r0, r1)
            X.6Je r0 = new X.6Je
            r0.<init>((java.lang.String) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.decompress(java.lang.String, java.lang.String):X.6Je");
    }

    public static final int unZipToFolderBuffered(InputStream inputStream, String str) {
        return C131686Qb.A00(inputStream, str);
    }

    public static final void createDirIfNotExist(String str, String str2) {
        C131686Qb.A01(str, str2);
    }
}
