package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass1GX;
import X.AnonymousClass3T0;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C47212e0;
import X.C89364Wg;
import android.net.Uri;
import android.view.MenuItem;
import com.whatsapp.mediaview.PhotoView;

public class GalleryWallpaperPreview extends C47212e0 {
    public int A00;
    public Uri A01;
    public PhotoView A02;
    public AnonymousClass3T0 A03;
    public AnonymousClass1GX A04;
    public boolean A05;

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36341k9.A0R(A0B);
            this.A02 = C36341k9.A0S(A0B);
            this.A04 = (AnonymousClass1GX) A0B.A4k.get();
            this.A03 = (AnonymousClass3T0) r1.A4L.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x019c, code lost:
        if (r4 != null) goto L_0x019e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r2 = r22
            r0 = r23
            super.onCreate(r0)
            r0 = 2131435297(0x7f0b1f21, float:1.8492432E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r2.A02 = r0
            r0 = 2131428559(0x7f0b04cf, float:1.8478766E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 37
            X.AnonymousClass3Y8.A00(r1, r2, r0)
            r0 = 2131432880(0x7f0b15b0, float:1.848753E38)
            android.view.ViewGroup r8 = X.C36421kH.A0E(r2, r0)
            r0 = -1
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r9.<init>(r0, r0)
            X.0wo r3 = r2.A07
            X.0wQ r0 = r2.A02
            r1 = 0
            r6 = 0
            java.lang.String r0 = X.C237919w.A00(r0, r3)
            X.3Qa r3 = new X.3Qa
            r3.<init>(r1, r0, r6)
            long r0 = X.C36431kI.A08(r2)
            X.2bV r7 = new X.2bV
            r7.<init>(r3, r0)
            r0 = 2131896108(0x7f12272c, float:1.9427068E38)
            java.lang.String r0 = r2.getString(r0)
            r7.A16(r0)
            X.0wo r3 = r2.A07
            X.0wQ r0 = r2.A02
            com.whatsapp.jid.PhoneUserJid r1 = X.C36441kJ.A0n(r0)
            r5 = 1
            java.lang.String r0 = X.C237919w.A00(r0, r3)
            X.3Qa r3 = new X.3Qa
            r3.<init>(r1, r0, r5)
            long r0 = X.C36431kI.A08(r2)
            X.2bV r4 = new X.2bV
            r4.<init>(r3, r0)
            java.lang.String r0 = r2.A3i()
            r4.A16(r0)
            r0 = 5
            r4.A0n(r0)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r2)
            r3.setBackgroundResource(r6)
            r3.setLayoutParams(r9)
            r3.setOrientation(r5)
            X.8Ze r1 = new X.8Ze
            r1.<init>(r2, r7)
            r1.A24(r5)
            r1.setEnabled(r6)
            r1.setClickable(r6)
            X.8Ze r0 = new X.8Ze
            r0.<init>(r2, r4)
            r0.A24(r6)
            r0.setEnabled(r6)
            r0.setClickable(r6)
            r3.addView(r1)
            r3.addView(r0)
            r3.setClickable(r6)
            r8.addView(r3)
            android.os.Bundle r1 = X.C36371kC.A0H(r2)
            if (r1 == 0) goto L_0x00c1
            java.lang.String r0 = "output"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r2.A01 = r0
            java.lang.String r0 = "maxFileSize"
            int r0 = r1.getInt(r0, r6)
            r2.A00 = r0
        L_0x00c1:
            android.content.Intent r0 = r2.getIntent()
            android.net.Uri r4 = r0.getData()
            java.lang.String r3 = "io-error"
            r10 = 0
            r15 = 1
            if (r4 != 0) goto L_0x00e3
            java.lang.String r0 = "gallerywallpaperpreview/no uri found in intent"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r0 = X.C36431kI.A0D()
        L_0x00d8:
            android.content.Intent r0 = r0.putExtra(r3, r15)
        L_0x00dc:
            r2.setResult(r10, r0)
            r2.finish()
            return
        L_0x00e3:
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            r1.<init>()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            X.C36321k7.A0K(r2, r1)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            X.1GX r0 = r2.A04     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            java.io.InputStream r7 = X.AnonymousClass1GX.A0V(r4, r0, r5)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x01fa }
            r6.<init>()     // Catch:{ all -> 0x01fa }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x01fa }
            r6.inPreferredConfig = r0     // Catch:{ all -> 0x01fa }
            r6.inDither = r5     // Catch:{ all -> 0x01fa }
            int r5 = r1.x     // Catch:{ all -> 0x01fa }
            int r1 = r1.y     // Catch:{ all -> 0x01fa }
            r18 = 0
            X.6Kx r0 = new X.6Kx     // Catch:{ all -> 0x01fa }
            r21 = 0
            r16 = r0
            r17 = r6
            r19 = r5
            r20 = r1
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01fa }
            X.5sn r0 = X.AnonymousClass6Y8.A0A(r0, r7)     // Catch:{ all -> 0x01fa }
            android.graphics.Bitmap r9 = r0.A02     // Catch:{ all -> 0x01fa }
            r7.close()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            java.lang.String r1 = "not-a-image"
            java.lang.String r8 = "gallerywallpaperpreview/failed to load bitmap"
            if (r9 == 0) goto L_0x01e3
            int r0 = r9.getWidth()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            if (r0 == 0) goto L_0x01e3
            int r0 = r9.getHeight()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            if (r0 == 0) goto L_0x01e3
            X.0yb r0 = r2.A08     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            X.0ya r0 = r0.A0O()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            android.graphics.Matrix r14 = X.AnonymousClass1GW.A0A(r4, r0)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            if (r14 != 0) goto L_0x013d
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            r14.<init>()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
        L_0x013d:
            int r12 = r9.getWidth()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            int r13 = r9.getHeight()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            r11 = 0
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            if (r9 == r5) goto L_0x014f
            r9.recycle()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
        L_0x014f:
            r4 = r5
            android.graphics.Point r6 = new android.graphics.Point     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            r6.<init>()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            X.C36321k7.A0K(r2, r6)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            int r0 = r6.x     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            float r7 = (float) r0     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            int r0 = r5.getWidth()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            float r7 = r7 / r0
            int r0 = r6.y     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            float r6 = (float) r0     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            int r0 = r5.getHeight()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            float r6 = r6 / r0
            float r6 = java.lang.Math.max(r7, r6)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0197
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            java.lang.String r0 = "gallerywallpaperpreview/scaling image by "
            r4.append(r0)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            r4.append(r6)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            java.lang.String r0 = "x to fit screen"
            X.C36321k7.A1a(r4, r0)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            int r0 = r5.getWidth()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            float r0 = r0 * r6
            int r4 = (int) r0     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            int r0 = r5.getHeight()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            float r0 = r0 * r6
            int r0 = (int) r0     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r5, r4, r0, r15)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
        L_0x0197:
            if (r4 == r5) goto L_0x019e
            r5.recycle()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            if (r4 == 0) goto L_0x01d6
        L_0x019e:
            int r0 = r4.getWidth()
            if (r0 == 0) goto L_0x01d6
            int r0 = r4.getHeight()
            if (r0 == 0) goto L_0x01d6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "gallerywallpaperpreview/wallpaper loaded/w="
            r1.append(r0)
            int r0 = r4.getWidth()
            r1.append(r0)
            java.lang.String r0 = "; h="
            r1.append(r0)
            int r0 = r4.getHeight()
            X.C36321k7.A1Y(r1, r0)
            com.whatsapp.mediaview.PhotoView r1 = r2.A02
            r1.A0O = r15
            r0 = 3
            r1.A09 = r0
            r1.setAllowFullViewCrop(r15)
            com.whatsapp.mediaview.PhotoView r0 = r2.A02
            r0.A08(r4)
            return
        L_0x01d6:
            com.whatsapp.util.Log.e((java.lang.String) r8)
            android.content.Intent r0 = X.C36431kI.A0D()
            android.content.Intent r0 = r0.putExtra(r1, r15)
            goto L_0x00dc
        L_0x01e3:
            com.whatsapp.util.Log.e((java.lang.String) r8)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            if (r9 == 0) goto L_0x01eb
            r9.recycle()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
        L_0x01eb:
            android.content.Intent r0 = X.C36431kI.A0D()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            android.content.Intent r0 = r0.putExtra(r1, r15)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            r2.setResult(r10, r0)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            r2.finish()     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
            goto L_0x021e
        L_0x01fa:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x01ff }
            goto L_0x0203
        L_0x01ff:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
        L_0x0203:
            throw r1     // Catch:{ IOException -> 0x0212, OutOfMemoryError -> 0x0204 }
        L_0x0204:
            r1 = move-exception
            java.lang.String r0 = "gallerywallpaperpreview/out of memory trying to load wallpaper"
            com.whatsapp.util.Log.e(r0, r1)
            android.content.Intent r0 = X.C36431kI.A0D()
            java.lang.String r3 = "error-oom"
            goto L_0x00d8
        L_0x0212:
            r1 = move-exception
            java.lang.String r0 = "gallerywallpaperpreview/io error loading wallpaper"
            com.whatsapp.util.Log.e(r0, r1)
            android.content.Intent r0 = X.C36431kI.A0D()
            goto L_0x00d8
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview.onCreate(android.os.Bundle):void");
    }

    public GalleryWallpaperPreview(int i) {
        this.A05 = false;
        C89364Wg.A00(this, 37);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }

    public GalleryWallpaperPreview() {
        this(0);
    }
}
