package X;

import android.net.Uri;
import com.whatsapp.mediacomposer.ImageComposerFragment;

/* renamed from: X.6uN  reason: invalid class name and case insensitive filesystem */
public class C145696uN implements AnonymousClass4TB {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ ImageComposerFragment A01;

    public C145696uN(Uri uri, ImageComposerFragment imageComposerFragment) {
        this.A01 = imageComposerFragment;
        this.A00 = uri;
    }

    public String BIB() {
        String str;
        ImageComposerFragment imageComposerFragment = this.A01;
        Uri uri = imageComposerFragment.A00;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = "";
        }
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(":");
        return C36421kH.A0d(A0v, imageComposerFragment.A08);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r2 == 44) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        r3 = (com.whatsapp.mediacomposer.StickerComposerFragment) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap BOD() {
        /*
            r8 = this;
            com.whatsapp.mediacomposer.ImageComposerFragment r6 = r8.A01     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            android.net.Uri r4 = r8.A00     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            X.0yC r3 = r6.A0A     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            X.1GX r2 = r6.A0P     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            boolean r1 = r6.A08     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            r0 = 1576(0x628, float:2.208E-42)
            if (r1 == 0) goto L_0x0010
            r0 = 2654(0xa5e, float:3.719E-42)
        L_0x0010:
            int r0 = r3.A07(r0)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            android.graphics.Bitmap r7 = r2.A0e(r4, r0, r0)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            boolean r0 = r6 instanceof com.whatsapp.mediacomposer.StickerComposerFragment     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            if (r0 == 0) goto L_0x007a
            r3 = r6
            com.whatsapp.mediacomposer.StickerComposerFragment r3 = (com.whatsapp.mediacomposer.StickerComposerFragment) r3     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            X.7le r0 = r3.A1a()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            if (r0 == 0) goto L_0x007a
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            int r2 = X.C90494aF.A09(r0)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            X.6Se r0 = r3.A02     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            if (r0 == 0) goto L_0x004f
            android.graphics.Bitmap r5 = X.C132106Se.A01(r7)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            r0 = 42
            if (r2 == r0) goto L_0x003c
            r0 = 44
            r1 = 0
            if (r2 != r0) goto L_0x003d
        L_0x003c:
            r1 = 1
        L_0x003d:
            X.6Se r0 = r3.A02     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            if (r0 == 0) goto L_0x0048
            if (r1 == 0) goto L_0x0056
            android.graphics.Bitmap r7 = X.C132106Se.A00(r5)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            goto L_0x005e
        L_0x0048:
            java.lang.String r0 = "stickerMakerBitmapUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            throw r0     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
        L_0x004f:
            java.lang.String r0 = "stickerMakerBitmapUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            throw r0     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
        L_0x0056:
            android.graphics.Bitmap r0 = r0.A02(r5)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            android.graphics.Bitmap r7 = X.C132106Se.A00(r0)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
        L_0x005e:
            android.net.Uri r4 = r3.A00     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            if (r4 == 0) goto L_0x0077
            X.00T r0 = r3.A04     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r3 = (com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel) r3     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            X.040 r2 = X.C109325Xd.A00(r3)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            r1 = 0
            com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1 r0 = new com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            r0.<init>(r7, r4, r3, r1)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            X.C36331k8.A1T(r0, r2)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
        L_0x0077:
            r5.recycle()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
        L_0x007a:
            X.6WR r1 = r6.A05     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            r1.A04 = r7     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            r0 = 0
            r1.A09 = r0     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            r1.A05()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0085 }
            return r7
        L_0x0085:
            r1 = move-exception
            java.lang.String r0 = "ImageComposerFragment/loadBitmap"
            com.whatsapp.util.Log.e(r0, r1)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145696uN.BOD():android.graphics.Bitmap");
    }
}
