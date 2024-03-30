package X;

/* renamed from: X.0xW  reason: invalid class name and case insensitive filesystem */
public final class C20410xW implements AnonymousClass00M {
    public final C20690y0 A00;
    public final C19630wG A01;

    public C20410xW(C20690y0 r2, C19630wG r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0080, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A00(X.AnonymousClass2bV r7, X.C38401ok r8) {
        /*
            r6 = this;
            r5 = 0
            X.C18740tg.A00()
            X.0wG r0 = r6.A01
            android.content.Context r0 = r0.A00
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r3 = r0.widthPixels
            float r1 = (float) r3
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r1 / r0
            int r2 = X.C14960mT.A01(r1)
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r8.measure(r1, r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r2, r0)
            X.AnonymousClass00C.A08(r4)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r4)
            r8.layout(r5, r5, r3, r2)
            r8.draw(r0)
            r5 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            java.lang.String r0 = "share-"
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            X.3Qa r0 = r7.A1J     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            java.lang.String r0 = r0.A01     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            java.lang.String r0 = X.C18750th.A05(r0)     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            java.lang.String r0 = ".png"
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            X.0y0 r0 = r6.A00     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            java.io.File r0 = r0.A0E()     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            java.io.File r3 = X.C20690y0.A02(r0, r1)     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x007a }
            r0 = 75
            r4.compress(r1, r0, r2)     // Catch:{ all -> 0x007a }
            r2.flush()     // Catch:{ all -> 0x007a }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            r4.recycle()
            return r3
        L_0x007a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
            throw r0     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x009a }
        L_0x0081:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r1.<init>()     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "File not found: "
            r1.append(r0)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x009e }
            r1.append(r0)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x009e }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x009e }
        L_0x009a:
            r4.recycle()
            return r5
        L_0x009e:
            r0 = move-exception
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20410xW.A00(X.2bV, X.1ok):java.io.File");
    }
}
