package X;

/* renamed from: X.6te  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C145286te implements AnonymousClass7gX {
    public final /* synthetic */ C159437jM A00;
    public final /* synthetic */ AnonymousClass1H2 A01;

    public /* synthetic */ C145286te(C159437jM r1, AnonymousClass1H2 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e6, code lost:
        if (r0 == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x014c, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap BOG(android.content.res.Resources r12, int r13) {
        /*
            r11 = this;
            X.1H2 r0 = r11.A01
            X.7jM r5 = r11.A00
            X.1H4 r3 = r0.A03
            monitor-enter(r3)
            r7 = 1
            boolean r0 = X.AnonymousClass000.A1P(r13)
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x017e }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x017e }
            r2.<init>()     // Catch:{ all -> 0x017e }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x017e }
            r2.inPreferredConfig = r0     // Catch:{ all -> 0x017e }
            int r1 = r13 / 100
            boolean r0 = r3.A0E(r1)     // Catch:{ all -> 0x017e }
            r4 = 0
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Downloadable files are not ready and getBitmap is called"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x017e }
            int r8 = r3.A05(r1)     // Catch:{ all -> 0x017e }
            r6 = 0
            r2 = 5
            if (r8 == 0) goto L_0x005f
            if (r8 == r7) goto L_0x0050
            r0 = 2
            if (r8 == r0) goto L_0x005f
            r0 = 3
            if (r8 == r0) goto L_0x0050
            r0 = 4
            if (r8 == r0) goto L_0x005f
            if (r8 == r2) goto L_0x008a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "DoodleEmojiManager/getFilesAsyncFromState/Unexpected state "
            r1.append(r0)     // Catch:{ all -> 0x017c }
            java.util.HashMap r0 = X.AnonymousClass1H3.A0J     // Catch:{ all -> 0x017c }
            java.lang.Object r0 = X.C90484aE.A0j(r0, r8)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x017c }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x017c }
            goto L_0x0081
        L_0x0050:
            java.util.HashMap r2 = X.AnonymousClass1H3.A0J     // Catch:{ all -> 0x017c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x017c }
            r2.get(r0)     // Catch:{ all -> 0x017c }
            if (r5 == 0) goto L_0x009b
            r3.A0C(r5, r1)     // Catch:{ all -> 0x017c }
            goto L_0x009b
        L_0x005f:
            boolean r0 = r3.A0E(r1)     // Catch:{ all -> 0x017c }
            if (r0 != 0) goto L_0x0087
            X.0v0 r2 = r3.A08     // Catch:{ all -> 0x017c }
            X.0wD r0 = r3.A05     // Catch:{ all -> 0x017c }
            int r0 = r0.A03(r7)     // Catch:{ all -> 0x017c }
            int r0 = X.C54052sK.A00(r2, r0)     // Catch:{ all -> 0x017c }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0081
            r3.A0B(r7, r1)     // Catch:{ all -> 0x017c }
            if (r5 == 0) goto L_0x007d
            r3.A0C(r5, r1)     // Catch:{ all -> 0x017c }
        L_0x007d:
            r3.A0A(r6, r1)     // Catch:{ all -> 0x017c }
            goto L_0x009b
        L_0x0081:
            if (r5 == 0) goto L_0x009b
            r5.BWY()     // Catch:{ all -> 0x017c }
            goto L_0x009b
        L_0x0087:
            r3.A0B(r2, r1)     // Catch:{ all -> 0x017c }
        L_0x008a:
            if (r5 == 0) goto L_0x009b
            boolean r0 = r3.A0E(r1)     // Catch:{ all -> 0x017c }
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x017c }
            r3.A0H(r1)     // Catch:{ all -> 0x017c }
            android.util.SparseArray r0 = r3.A00     // Catch:{ all -> 0x017c }
            r5.BeC(r0)     // Catch:{ all -> 0x017c }
        L_0x009b:
            monitor-exit(r3)
            return r4
        L_0x009d:
            android.util.SparseArray r0 = r3.A00     // Catch:{ all -> 0x017c }
            java.lang.Object r5 = r0.get(r13)     // Catch:{ all -> 0x017c }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x017c }
            if (r5 == 0) goto L_0x016a
            boolean r0 = r5.exists()     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x016a
            java.io.FileInputStream r6 = X.C90524aI.A0U(r5)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r0 = r5.getPath()     // Catch:{ all -> 0x014d }
            java.lang.String r1 = X.AnonymousClass6YY.A07(r0)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "obi"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00e3
            X.1H6 r1 = r3.A01     // Catch:{ all -> 0x014d }
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x014d }
            if (r0 != 0) goto L_0x00d1
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x014d }
            java.util.HashSet r0 = X.C90524aI.A0k(r0)     // Catch:{ all -> 0x014d }
            r1.A00 = r0     // Catch:{ all -> 0x014d }
        L_0x00d1:
            boolean r0 = X.AnonymousClass000.A1Z(r0, r13)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00e5
            X.0yC r1 = r1.A01     // Catch:{ all -> 0x014d }
            r0 = 2025(0x7e9, float:2.838E-42)
            boolean r1 = r1.A0E(r0)     // Catch:{ all -> 0x014d }
            r0 = 1
            if (r1 != 0) goto L_0x00e6
            goto L_0x00e5
        L_0x00e3:
            r7 = 0
            goto L_0x00e8
        L_0x00e5:
            r0 = 0
        L_0x00e6:
            if (r0 == 0) goto L_0x00e3
        L_0x00e8:
            if (r7 == 0) goto L_0x0144
            X.1H6 r7 = r3.A01     // Catch:{ all -> 0x014d }
            int r2 = r6.available()     // Catch:{ IOException -> 0x0128 }
            X.1H7 r10 = r7.A03     // Catch:{ IOException -> 0x0128 }
            r0 = 12288(0x3000, float:1.7219E-41)
            int r0 = java.lang.Math.max(r2, r0)     // Catch:{ IOException -> 0x0128 }
            X.1H7 r9 = X.AnonymousClass6IZ.A00     // Catch:{ IOException -> 0x0128 }
            java.nio.ByteBuffer r8 = r9.A00(r0)     // Catch:{ IOException -> 0x0128 }
            byte[] r0 = r8.array()     // Catch:{ all -> 0x0123 }
            r6.read(r0)     // Catch:{ all -> 0x0123 }
            byte[] r1 = r8.array()     // Catch:{ all -> 0x0123 }
            r0 = 0
            com.whatsapp.superpack.WhatsAppObiInputStream r2 = com.whatsapp.superpack.WhatsAppObiInputStream.openBytes(r1, r0, r2)     // Catch:{ all -> 0x0123 }
            android.graphics.Bitmap r0 = X.AnonymousClass6IZ.A00(r10, r2)     // Catch:{ all -> 0x0119 }
            r2.close()     // Catch:{ all -> 0x0123 }
            r9.A01(r8)     // Catch:{ IOException -> 0x0128 }
            goto L_0x0140
        L_0x0119:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x011e }
            goto L_0x0122
        L_0x011e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0123 }
        L_0x0122:
            throw r1     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r0 = move-exception
            r9.A01(r8)     // Catch:{ IOException -> 0x0128 }
            throw r0     // Catch:{ IOException -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x014d }
            X.2Px r2 = new X.2Px     // Catch:{ all -> 0x014d }
            r2.<init>()     // Catch:{ all -> 0x014d }
            r2.A02 = r0     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "doodle_emoji"
            r2.A01 = r0     // Catch:{ all -> 0x014d }
            X.0u5 r1 = X.AnonymousClass1H6.A04     // Catch:{ all -> 0x014d }
            X.0yW r0 = r7.A02     // Catch:{ all -> 0x014d }
            r0.Blx(r2, r1)     // Catch:{ all -> 0x014d }
            r0 = 0
        L_0x0140:
            r6.close()     // Catch:{ IOException -> 0x0157 }
            goto L_0x014b
        L_0x0144:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r6, r4, r2)     // Catch:{ all -> 0x014d }
            r6.close()     // Catch:{ IOException -> 0x0157 }
        L_0x014b:
            monitor-exit(r3)
            return r0
        L_0x014d:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0152 }
            goto L_0x0156
        L_0x0152:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0157 }
        L_0x0156:
            throw r1     // Catch:{ IOException -> 0x0157 }
        L_0x0157:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x017e }
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Could not get bitmap from downloaded file for "
            r1.append(r0)     // Catch:{ all -> 0x017e }
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x017e }
            X.C36351kA.A1Q(r0, r1, r2)     // Catch:{ all -> 0x017e }
            monitor-exit(r3)
            return r4
        L_0x016a:
            r3.A0D(r4)     // Catch:{ all -> 0x017e }
            r0 = 0
            r3.A0B(r0, r1)     // Catch:{ all -> 0x017e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x017e }
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Error getting downloaded file to compute bitmap for emojiId="
            X.C36321k7.A1S(r0, r1, r13)     // Catch:{ all -> 0x017e }
            monitor-exit(r3)
            return r4
        L_0x017c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x017e }
        L_0x017e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145286te.BOG(android.content.res.Resources, int):android.graphics.Bitmap");
    }
}
