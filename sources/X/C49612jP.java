package X;

import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.2jP  reason: invalid class name and case insensitive filesystem */
public final class C49612jP extends C132446Tt {
    public final AnonymousClass1DF A00;
    public final AnonymousClass16J A01;
    public final MediaViewFragment A02;
    public final C46882bp A03;
    public final AnonymousClass1GX A04;
    public final AnonymousClass1SV A05;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.C05600Qi.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce A[Catch:{ all -> 0x0100, all -> 0x0105, IOException -> 0x00c5, all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e1 A[SYNTHETIC, Splitter:B:50:0x00e1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r17) {
        /*
            r16 = this;
            r0 = r16
            X.1DF r7 = r0.A00     // Catch:{ IOException -> 0x0114 }
            X.2bp r6 = r0.A03     // Catch:{ IOException -> 0x0114 }
            X.32U r9 = new X.32U     // Catch:{ IOException -> 0x0114 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0114 }
            X.C18740tg.A00()     // Catch:{ IOException -> 0x0114 }
            X.12P r0 = r7.A08     // Catch:{ IOException -> 0x0114 }
            X.1M0 r15 = r0.A05()     // Catch:{ IOException -> 0x0114 }
            X.3Qj r5 = X.AnonymousClass2bU.A00(r6)     // Catch:{ all -> 0x010a }
            X.1Ay r1 = r7.A05     // Catch:{ all -> 0x010a }
            java.io.File r0 = r5.A0I     // Catch:{ all -> 0x010a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x010a }
            int r0 = r1.A00(r0)     // Catch:{ all -> 0x010a }
            if (r0 <= 0) goto L_0x0044
            X.0y0 r8 = r7.A00     // Catch:{ all -> 0x010a }
            X.0wg r3 = r7.A0B     // Catch:{ all -> 0x010a }
            java.io.File r2 = r5.A0I     // Catch:{ all -> 0x010a }
            X.1Gl r1 = X.C25471Gl.A0D     // Catch:{ all -> 0x010a }
            r0 = 2
            java.io.File r4 = X.AnonymousClass1GW.A0F(r8, r3, r1, r2, r0)     // Catch:{ all -> 0x010a }
            java.io.File r0 = r5.A0I     // Catch:{ all -> 0x010a }
            r8.A0e(r0, r4)     // Catch:{ all -> 0x010a }
        L_0x0038:
            X.2jP r9 = r9.A00     // Catch:{ all -> 0x010a }
            r3 = 0
            r14 = 1
            X.AnonymousClass00C.A0D(r4, r14)     // Catch:{ all -> 0x010a }
            java.lang.String r13 = "Orientation"
            java.lang.String r8 = "MediaViewFragment/RotateImageTask/rotateImageClockwise/rotate/recreateThumb"
            goto L_0x0047
        L_0x0044:
            java.io.File r4 = r5.A0I     // Catch:{ all -> 0x010a }
            goto L_0x0038
        L_0x0047:
            boolean r0 = X.C203859oz.A0P     // Catch:{ IOException -> 0x00c5 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x00c5 }
            X.9oz r12 = new X.9oz     // Catch:{ IOException -> 0x00c5 }
            r12.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x00c5 }
            r11 = 1
            int r10 = r12.A0Y(r14)     // Catch:{ IOException -> 0x00c5 }
            r2 = 8
            r1 = 6
            r0 = 3
            if (r10 == 0) goto L_0x006c
            if (r10 == r14) goto L_0x006c
            if (r10 == r0) goto L_0x0069
            if (r10 == r1) goto L_0x0067
            if (r10 == r2) goto L_0x006d
            r11 = r10
            goto L_0x006d
        L_0x0067:
            r11 = 3
            goto L_0x006d
        L_0x0069:
            r11 = 8
            goto L_0x006d
        L_0x006c:
            r11 = 6
        L_0x006d:
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x00c5 }
            r12.A0b(r13, r0)     // Catch:{ IOException -> 0x00c5 }
            r12.A0a()     // Catch:{ IOException -> 0x00c5 }
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x00c0 }
            r10.<init>()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x00c0 }
            X.1GX r2 = r9.A04     // Catch:{ all -> 0x00b9 }
            android.net.Uri r1 = android.net.Uri.fromFile(r4)     // Catch:{ all -> 0x00b9 }
            r0 = 100
            android.graphics.Bitmap r2 = r2.A0e(r1, r0, r0)     // Catch:{ all -> 0x00b9 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00b9 }
            r0 = 80
            r2.compress(r1, r0, r10)     // Catch:{ all -> 0x00b9 }
            byte[] r0 = r10.toByteArray()     // Catch:{ all -> 0x00b9 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00b9 }
            r2.recycle()     // Catch:{ all -> 0x00b9 }
            r10.close()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x00c0 }
            X.2bp r8 = r9.A03     // Catch:{ all -> 0x010a }
            r8.A1C(r0)     // Catch:{ all -> 0x010a }
            X.3Qj r2 = X.AnonymousClass2bU.A00(r8)     // Catch:{ all -> 0x010a }
            long r0 = r4.length()     // Catch:{ all -> 0x010a }
            r2.A0C = r0     // Catch:{ all -> 0x010a }
            r2.A02 = r3     // Catch:{ all -> 0x010a }
            r2.A03 = r3     // Catch:{ all -> 0x010a }
            X.AnonymousClass1GW.A0Q(r2, r4)     // Catch:{ all -> 0x010a }
            X.1SV r0 = r9.A05     // Catch:{ all -> 0x010a }
            r0.A0H(r8)     // Catch:{ all -> 0x010a }
            r0 = 1
            goto L_0x00cc
        L_0x00b9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x00c0 }
            throw r0     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            com.whatsapp.util.Log.e(r8, r0)     // Catch:{ all -> 0x010a }
            goto L_0x00cb
        L_0x00c5:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/RotateImageTask/rotateImageClockwise/rotate"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x010a }
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            if (r0 != 0) goto L_0x00e1
            java.io.File r0 = r5.A0I     // Catch:{ all -> 0x010a }
            if (r0 == r4) goto L_0x00dd
            boolean r0 = r4.delete()     // Catch:{ all -> 0x010a }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "failed to delete media file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x010a }
        L_0x00dd:
            r15.close()     // Catch:{ IOException -> 0x0114 }
            goto L_0x011c
        L_0x00e1:
            X.71s r2 = r15.B1k()     // Catch:{ all -> 0x010a }
            java.io.File r0 = r5.A0I     // Catch:{ all -> 0x0100 }
            if (r0 == r4) goto L_0x00f0
            X.1DG r0 = r7.A04     // Catch:{ all -> 0x0100 }
            r0.A03(r6, r3, r3)     // Catch:{ all -> 0x0100 }
            r5.A0I = r4     // Catch:{ all -> 0x0100 }
        L_0x00f0:
            X.0xM r0 = r7.A03     // Catch:{ all -> 0x0100 }
            r0.A0k(r6)     // Catch:{ all -> 0x0100 }
            r2.A00()     // Catch:{ all -> 0x0100 }
            r2.close()     // Catch:{ all -> 0x010a }
            r15.close()     // Catch:{ IOException -> 0x0114 }
            r0 = 1
            goto L_0x011d
        L_0x0100:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0105 }
            goto L_0x0109
        L_0x0105:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x010a }
        L_0x0109:
            throw r1     // Catch:{ all -> 0x010a }
        L_0x010a:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x010f }
            goto L_0x0113
        L_0x010f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0114 }
        L_0x0113:
            throw r1     // Catch:{ IOException -> 0x0114 }
        L_0x0114:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/RotateImageTask/doInBackground/rotate"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            goto L_0x011d
        L_0x011c:
            r0 = 0
        L_0x011d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49612jP.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass755 r0;
        MediaViewFragment mediaViewFragment = this.A02;
        C46882bp r2 = this.A03;
        AnonymousClass01I A0h = mediaViewFragment.A0h();
        if (A0h != null && !A0h.isFinishing()) {
            mediaViewFragment.A1l.A0H(r2);
            PhotoView A1b = mediaViewFragment.A1b(r2.A1J);
            if (!(A1b == null || (r0 = mediaViewFragment.A0A) == null)) {
                r0.A01(A1b, r2);
            }
        }
        if (C36341k9.A1Z(obj)) {
            this.A01.A05(r2, 9);
        }
    }

    public C49612jP(AnonymousClass1DF r2, AnonymousClass16J r3, MediaViewFragment mediaViewFragment, C46882bp r5, AnonymousClass1GX r6, AnonymousClass1SV r7) {
        C36321k7.A19(r5, r6, r3, r2);
        AnonymousClass00C.A0D(r7, 6);
        this.A02 = mediaViewFragment;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r7;
    }
}
