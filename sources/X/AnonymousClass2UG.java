package X;

import android.net.Uri;

/* renamed from: X.2UG  reason: invalid class name */
public final class AnonymousClass2UG extends C74823mE {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2UG(Uri uri, C21050ya r14, String str, String str2, int i, long j, long j2, long j3) {
        super(uri, r14, str, str2, j, j2, j3);
        AnonymousClass00C.A0D(uri, 3);
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r1 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap Bvb(int r15) {
        /*
            r14 = this;
            r13 = 1
            r0 = 144(0x90, float:2.02E-43)
            r11 = r15
            if (r15 >= r0) goto L_0x002d
            r1 = 0
            r0 = 3
            android.graphics.Bitmap r1 = r14.A01(r1, r0)
        L_0x000c:
            if (r1 != 0) goto L_0x0017
            long r2 = (long) r15
            long r2 = r2 * r2
            r0 = 2
            long r0 = (long) r0
            long r2 = r2 * r0
            android.graphics.Bitmap r1 = r14.A00(r2, r15)
        L_0x0017:
            boolean r0 = X.C19550w8.A06()
            if (r0 != 0) goto L_0x0027
            if (r1 == 0) goto L_0x002c
            int r0 = r14.A00
            if (r0 == 0) goto L_0x0029
            android.graphics.Bitmap r1 = X.AnonymousClass3R8.A00(r1, r0)
        L_0x0027:
            if (r1 == 0) goto L_0x002c
        L_0x0029:
            X.C26391Jz.A01()
        L_0x002c:
            return r1
        L_0x002d:
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r0 = 0
            r7.inDither = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r7.inPreferredConfig = r0
            X.0ya r0 = r14.A02
            android.content.ContentResolver r3 = r0.A00
            long r0 = r14.A00
            java.lang.String[] r2 = X.C56392wD.A00
            android.database.Cursor r5 = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(r3, r0, r13, r2)
            if (r5 == 0) goto L_0x0077
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "width"
            int r6 = X.C36351kA.A03(r5, r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "height"
            int r4 = X.C36351kA.A03(r5, r0)     // Catch:{ all -> 0x0081 }
            long r2 = (long) r15     // Catch:{ all -> 0x0081 }
            long r2 = r2 * r2
            r0 = 2
            long r0 = (long) r0     // Catch:{ all -> 0x0081 }
            long r2 = r2 * r0
            r8 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
            r10 = 0
            goto L_0x006a
        L_0x0066:
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0081 }
        L_0x006a:
            r9 = 0
            X.6Kx r8 = new X.6Kx     // Catch:{ all -> 0x0081 }
            r12 = r15
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0081 }
            int r0 = X.AnonymousClass6Y8.A02(r8, r6, r4)     // Catch:{ all -> 0x0081 }
            r7.inSampleSize = r0     // Catch:{ all -> 0x0081 }
        L_0x0077:
            if (r5 == 0) goto L_0x007c
            r5.close()
        L_0x007c:
            android.graphics.Bitmap r1 = r14.A01(r7, r13)
            goto L_0x000c
        L_0x0081:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2UG.Bvb(int):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r1 != 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap A01(android.graphics.BitmapFactory.Options r13, int r14) {
        /*
            r12 = this;
            X.3Rp r5 = X.C65323Rp.A01()     // Catch:{ all -> 0x0054 }
            X.0ya r4 = r12.A02     // Catch:{ all -> 0x0054 }
            long r6 = r12.A00     // Catch:{ all -> 0x0054 }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0054 }
            X.3Dj r2 = X.C65323Rp.A00(r5, r3)     // Catch:{ all -> 0x0054 }
            monitor-enter(r5)     // Catch:{ all -> 0x0054 }
            java.util.WeakHashMap r0 = r5.A00     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0051 }
            X.3Dj r0 = (X.C61773Dj) r0     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0020
            int r1 = r0.A00     // Catch:{ all -> 0x0051 }
            r0 = 0
            if (r1 == 0) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            monitor-exit(r5)     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0026
            r0 = 0
            return r0
        L_0x0026:
            r1 = 0
            monitor-enter(r2)     // Catch:{ all -> 0x0046 }
            r0 = 1
            r2.A02 = r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r2)     // Catch:{ all -> 0x0043 }
            android.content.ContentResolver r5 = r4.A00     // Catch:{ all -> 0x0046 }
            long r8 = r3.getId()     // Catch:{ all -> 0x0046 }
            r11 = r13
            r10 = r14
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r5, r6, r8, r10, r11)     // Catch:{ all -> 0x0046 }
            monitor-enter(r2)     // Catch:{ all -> 0x0054 }
            r2.A02 = r1     // Catch:{ all -> 0x0040 }
            r2.notifyAll()     // Catch:{ all -> 0x0040 }
            monitor-exit(r2)     // Catch:{ all -> 0x0040 }
            return r0
        L_0x0040:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0040 }
            goto L_0x0053
        L_0x0043:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            monitor-enter(r2)     // Catch:{ all -> 0x0054 }
            r2.A02 = r1     // Catch:{ all -> 0x004f }
            r2.notifyAll()     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r0 = move-exception
            goto L_0x004d
        L_0x0051:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0054 }
        L_0x0053:
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            java.lang.String r0 = "Image/getBitmapThumbnail/got exception"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2UG.A01(android.graphics.BitmapFactory$Options, int):android.graphics.Bitmap");
    }

    public int getType() {
        return 0;
    }
}
