package X;

import android.net.Uri;
import com.whatsapp.mediacomposer.MediaComposerActivity;

/* renamed from: X.73D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73D implements Runnable {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ MediaComposerActivity A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass73D(Uri uri, MediaComposerActivity mediaComposerActivity, boolean z, boolean z2) {
        this.A01 = mediaComposerActivity;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = uri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (r3.A0r.A01(r8.A04(), r3.A0q.A0F(r3, r4, r8.A05(), com.whatsapp.voipcalling.camera.VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH)) != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0015 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            com.whatsapp.mediacomposer.MediaComposerActivity r3 = r13.A01
            boolean r7 = r13.A02
            boolean r6 = r13.A03
            android.net.Uri r5 = r13.A00
            X.6Tg r0 = r3.A1r
            java.util.Map r0 = r0.A00
            java.util.ArrayList r0 = X.C90494aF.A0g(r0)
            java.util.Iterator r12 = r0.iterator()
            r11 = 0
        L_0x0015:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r8 = r12.next()
            X.6QO r8 = (X.AnonymousClass6QO) r8
            X.1Gn r0 = r3.A0m
            int r2 = r0.A01(r8)
            r1 = 3
            r0 = 1
            if (r2 != r0) goto L_0x002e
            if (r7 != 0) goto L_0x0032
            goto L_0x0015
        L_0x002e:
            if (r2 != r1) goto L_0x0015
            if (r6 == 0) goto L_0x0015
        L_0x0032:
            android.net.Uri r4 = r8.A0J
            if (r2 != r0) goto L_0x0071
            X.1D1 r9 = r3.A0p
            boolean r10 = com.whatsapp.mediacomposer.MediaComposerActivity.A0u(r3)
            android.graphics.Rect r0 = r8.A04()
            r2 = 0
            java.lang.String r8 = "ImageQuality/isOriginalQuality"
            if (r0 == 0) goto L_0x0046
            goto L_0x0056
        L_0x0046:
            X.1Ax r1 = r9.A03     // Catch:{ 1Gt | IOException | Exception | IllegalStateException | SecurityException -> 0x0098 }
            r0 = 1
            android.graphics.BitmapFactory$Options r0 = r1.A06(r4, r2, r0, r0)     // Catch:{ 1Gt | IOException | Exception | IllegalStateException | SecurityException -> 0x0098 }
            int r1 = r0.outHeight     // Catch:{ 1Gt | IOException | Exception | IllegalStateException | SecurityException -> 0x0098 }
            int r0 = r0.outWidth     // Catch:{ 1Gt | IOException | Exception | IllegalStateException | SecurityException -> 0x0098 }
            int r2 = java.lang.Math.max(r1, r0)     // Catch:{ 1Gt | IOException | Exception | IllegalStateException | SecurityException -> 0x0098 }
            goto L_0x0062
        L_0x0056:
            int r1 = r0.width()     // Catch:{ 1Gt | IOException | Exception | IllegalStateException | SecurityException -> 0x0098 }
            int r0 = r0.height()     // Catch:{ 1Gt | IOException | Exception | IllegalStateException | SecurityException -> 0x0098 }
            int r2 = java.lang.Math.max(r1, r0)     // Catch:{ 1Gt | IOException | Exception | IllegalStateException | SecurityException -> 0x0098 }
        L_0x0062:
            X.0yC r1 = r9.A02     // Catch:{ 1Gt | IOException | Exception | IllegalStateException | SecurityException -> 0x0098 }
            r0 = 3068(0xbfc, float:4.299E-42)
            if (r10 == 0) goto L_0x006a
            r0 = 6031(0x178f, float:8.451E-42)
        L_0x006a:
            int r0 = r1.A07(r0)     // Catch:{ 1Gt | IOException | Exception | IllegalStateException | SecurityException -> 0x0098 }
            if (r2 < r0) goto L_0x009c
            goto L_0x008b
        L_0x0071:
            if (r2 != r1) goto L_0x009c
            X.1GJ r2 = r3.A0q
            X.67y r1 = r8.A05()
            r0 = 1280(0x500, float:1.794E-42)
            X.011 r2 = r2.A0F(r3, r4, r1, r0)
            X.1E2 r1 = r3.A0r
            android.graphics.Rect r0 = r8.A04()
            boolean r0 = r1.A01(r0, r2)
            if (r0 == 0) goto L_0x009c
        L_0x008b:
            if (r11 != 0) goto L_0x0091
            boolean r11 = r5.equals(r4)
        L_0x0091:
            java.util.HashSet r0 = r3.A1x
            r0.add(r4)
            goto L_0x0015
        L_0x0098:
            r0 = move-exception
            com.whatsapp.util.Log.e(r8, r0)
        L_0x009c:
            java.util.HashSet r1 = r3.A1x
            boolean r0 = r1.contains(r4)
            if (r0 == 0) goto L_0x0015
            if (r11 != 0) goto L_0x00aa
            boolean r11 = r5.equals(r4)
        L_0x00aa:
            r1.remove(r4)
            goto L_0x0015
        L_0x00af:
            if (r11 == 0) goto L_0x00c1
            boolean r0 = r3.A1V
            if (r0 == 0) goto L_0x00c1
            X.17Y r2 = r3.A05
            r1 = 30
            X.74t r0 = new X.74t
            r0.<init>((com.whatsapp.mediacomposer.MediaComposerActivity) r3, (int) r1)
            r2.A0H(r0)
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73D.run():void");
    }
}
