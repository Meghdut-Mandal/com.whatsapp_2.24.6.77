package X;

/* renamed from: X.6ML  reason: invalid class name */
public final class AnonymousClass6ML {
    public final AnonymousClass1D1 A00;

    public AnonymousClass6ML(AnonymousClass1D1 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A00(java.io.File r2, int r3) {
        /*
            long r0 = (long) r3
            r3 = 0
            X.5Qt r2 = X.C111775cp.A00(r2, r0)     // Catch:{ IOException -> 0x0015 }
            byte[] r0 = X.AnonymousClass0QO.A00(r2)     // Catch:{ all -> 0x000e }
            r2.close()     // Catch:{ IOException -> 0x0015 }
            return r0
        L_0x000e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x0015 }
            throw r0     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            r1 = move-exception
            java.lang.String r0 = "ProgressiveJpegUtils/generateThumbnailFromFirstScan/errorGeneratingThumbnail"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ML.A00(java.io.File, int):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(java.io.File r6, int r7, boolean r8) {
        /*
            r5 = this;
            long r0 = (long) r7
            X.5Qt r4 = X.C111775cp.A00(r6, r0)
            X.1D1 r1 = r5.A00     // Catch:{ all -> 0x0036 }
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)     // Catch:{ all -> 0x0036 }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0036 }
            r3.<init>()     // Catch:{ all -> 0x0036 }
            r2 = 1
            r3.inJustDecodeBounds = r2     // Catch:{ all -> 0x0036 }
            r0 = 0
            android.graphics.BitmapFactory.decodeStream(r4, r0, r3)     // Catch:{ all -> 0x0036 }
            X.0yC r1 = r1.A02     // Catch:{ all -> 0x0036 }
            if (r8 == 0) goto L_0x002b
            X.5Bn r0 = new X.5Bn     // Catch:{ all -> 0x0036 }
            r0.<init>(r1)     // Catch:{ all -> 0x0036 }
        L_0x0020:
            int r1 = r0.A00     // Catch:{ all -> 0x0036 }
            int r0 = r3.outHeight     // Catch:{ all -> 0x0036 }
            if (r0 > r1) goto L_0x0032
            int r0 = r3.outWidth     // Catch:{ all -> 0x0036 }
            if (r0 > r1) goto L_0x0032
            goto L_0x0031
        L_0x002b:
            X.5Bp r0 = new X.5Bp     // Catch:{ all -> 0x0036 }
            r0.<init>(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0020
        L_0x0031:
            r2 = 0
        L_0x0032:
            r4.close()
            return r2
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ML.A01(java.io.File, int, boolean):boolean");
    }
}
