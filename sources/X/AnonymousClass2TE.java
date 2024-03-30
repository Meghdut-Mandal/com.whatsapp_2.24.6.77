package X;

/* renamed from: X.2TE  reason: invalid class name */
public final class AnonymousClass2TE extends AnonymousClass3J8 {
    public final long A00;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(X.AnonymousClass2TE r8, java.io.OutputStream r9, java.util.zip.ZipInputStream r10) {
        /*
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r0]
            r5 = 0
        L_0x0006:
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 + r5
            long r1 = r8.A00     // Catch:{ all -> 0x0023 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x001d
            int r1 = r10.read(r7)     // Catch:{ all -> 0x0023 }
            r0 = -1
            if (r1 == r0) goto L_0x001d
            r0 = 0
            r9.write(r7, r0, r1)     // Catch:{ all -> 0x0023 }
            long r0 = (long) r1     // Catch:{ all -> 0x0023 }
            long r5 = r5 + r0
            goto L_0x0006
        L_0x001d:
            if (r9 == 0) goto L_0x0022
            r9.close()     // Catch:{ IOException -> 0x002a }
        L_0x0022:
            return r5
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ IOException -> 0x002a }
            throw r0     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            r1 = move-exception
            java.lang.String r0 = "LottieStickerZipEntrySaver/saveToOutputStream "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2TE.A00(X.2TE, java.io.OutputStream, java.util.zip.ZipInputStream):long");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2TE(C20690y0 r8, C20810yC r9) {
        super(r8.A0E(), 20, C36441kJ.A0B(r9, 1900) * 1024);
        C36321k7.A0x(r9, r8);
        this.A00 = C36441kJ.A0B(r9, 1900) * 1024;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A02(java.io.OutputStream r5, java.util.zip.ZipInputStream r6) {
        /*
            r4 = this;
            X.C36321k7.A0w(r6, r5)
            java.util.zip.ZipEntry r3 = r6.getNextEntry()
            r2 = 0
        L_0x0008:
            if (r3 == 0) goto L_0x0028
            java.lang.String r1 = "animation/animation.json"
            java.lang.String r0 = r3.getName()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002b
            java.util.zip.ZipEntry r3 = r6.getNextEntry()
            int r2 = r2 + 1
            r0 = 20
            if (r2 <= r0) goto L_0x0008
            java.lang.String r0 = "LottieStickerZipEntrySaver/findAnimationEntry too many files to unzip"
        L_0x0022:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = -1
            return r0
        L_0x0028:
            java.lang.String r0 = "LottieStickerZipEntrySaver/findAnimationEntry unable to find right entry"
            goto L_0x0022
        L_0x002b:
            long r0 = A00(r4, r5, r6)     // Catch:{ all -> 0x0036 }
            r5.close()     // Catch:{ all -> 0x003d }
            r6.close()
            return r0
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2TE.A02(java.io.OutputStream, java.util.zip.ZipInputStream):long");
    }
}
