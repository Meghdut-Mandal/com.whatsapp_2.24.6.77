package X;

import android.net.Uri;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import java.io.File;

/* renamed from: X.7pl  reason: invalid class name and case insensitive filesystem */
public class C163167pl implements AnonymousClass4TB {
    public Object A00;
    public final int A01;

    public C163167pl(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public String BIB() {
        String str;
        String absolutePath;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            File file = ((VideoComposerFragment) obj).A0M;
            if (file == null || (absolutePath = file.getAbsolutePath()) == null) {
                return "";
            }
            return absolutePath;
        }
        Uri uri = ((MediaComposerFragment) obj).A00;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = "";
        }
        return AnonymousClass000.A0q("-original", AnonymousClass000.A0v(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap BOD() {
        /*
            r6 = this;
            int r0 = r6.A01
            if (r0 == 0) goto L_0x003a
            java.lang.String r3 = "VideoComposerFragment/getVideoThumb"
            X.1le r2 = new X.1le     // Catch:{ Exception | NoSuchMethodError -> 0x002b }
            r2.<init>()     // Catch:{ Exception | NoSuchMethodError -> 0x002b }
            java.lang.Object r0 = r6.A00     // Catch:{ Exception | NoSuchMethodError -> 0x002b }
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            java.io.File r0 = r0.A0M     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0024 }
            r2.setDataSource(r0)     // Catch:{ all -> 0x0024 }
        L_0x001a:
            r0 = 1
            android.graphics.Bitmap r0 = r2.getFrameAtTime(r0)     // Catch:{ all -> 0x0024 }
            r2.close()     // Catch:{ Exception | NoSuchMethodError -> 0x002b }
            return r0
        L_0x0024:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ Exception | NoSuchMethodError -> 0x002b }
            throw r0     // Catch:{ Exception | NoSuchMethodError -> 0x002b }
        L_0x002b:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            java.lang.Object r0 = r6.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            java.io.File r0 = r0.A0M
            android.graphics.Bitmap r0 = X.C25541Gs.A01(r0)
            return r0
        L_0x003a:
            java.lang.Object r5 = r6.A00     // Catch:{ 1X5 | IOException -> 0x0088 }
            com.whatsapp.mediacomposer.ImageComposerFragment r5 = (com.whatsapp.mediacomposer.ImageComposerFragment) r5     // Catch:{ 1X5 | IOException -> 0x0088 }
            android.net.Uri r1 = r5.A00     // Catch:{ 1X5 | IOException -> 0x0088 }
            if (r1 == 0) goto L_0x007a
            X.7le r0 = r5.A1a()     // Catch:{ 1X5 | IOException -> 0x0088 }
            if (r0 == 0) goto L_0x007a
            X.6QO r0 = X.C132366Tg.A01(r1, r0)     // Catch:{ 1X5 | IOException -> 0x0088 }
            java.io.File r0 = r0.A08()     // Catch:{ 1X5 | IOException -> 0x0088 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ 1X5 | IOException -> 0x0088 }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ 1X5 | IOException -> 0x0088 }
            android.net.Uri r0 = r5.A00     // Catch:{ 1X5 | IOException -> 0x0088 }
            java.lang.String r1 = "flip-h"
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ 1X5 | IOException -> 0x0088 }
            if (r0 == 0) goto L_0x006b
            android.net.Uri r0 = r5.A00     // Catch:{ 1X5 | IOException -> 0x0088 }
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ 1X5 | IOException -> 0x0088 }
            r2.appendQueryParameter(r1, r0)     // Catch:{ 1X5 | IOException -> 0x0088 }
        L_0x006b:
            android.net.Uri r4 = r2.build()     // Catch:{ 1X5 | IOException -> 0x0088 }
        L_0x006f:
            X.0yC r3 = r5.A0A     // Catch:{ 1X5 | IOException -> 0x0088 }
            X.1GX r2 = r5.A0P     // Catch:{ 1X5 | IOException -> 0x0088 }
            boolean r1 = r5.A08     // Catch:{ 1X5 | IOException -> 0x0088 }
            r0 = 1576(0x628, float:2.208E-42)
            if (r1 == 0) goto L_0x007f
            goto L_0x007d
        L_0x007a:
            android.net.Uri r4 = android.net.Uri.EMPTY     // Catch:{ 1X5 | IOException -> 0x0088 }
            goto L_0x006f
        L_0x007d:
            r0 = 2654(0xa5e, float:3.719E-42)
        L_0x007f:
            int r0 = r3.A07(r0)     // Catch:{ 1X5 | IOException -> 0x0088 }
            android.graphics.Bitmap r0 = r2.A0e(r4, r0, r0)     // Catch:{ 1X5 | IOException -> 0x0088 }
            return r0
        L_0x0088:
            r1 = move-exception
            java.lang.String r0 = "ImageComposerFragment/loadOriginalBitmap"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163167pl.BOD():android.graphics.Bitmap");
    }
}
