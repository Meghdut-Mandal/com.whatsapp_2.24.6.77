package com.whatsapp.filter;

import X.AnonymousClass000;
import X.AnonymousClass6XA;
import X.C1032954s;
import X.C129876Iu;
import X.C159437jM;
import X.C36321k7;
import X.C36351kA;
import X.C90524aI;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public class FilterUtils {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r7 >= X.C129876Iu.A00.size()) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(android.graphics.Bitmap r5, X.C1032954s r6, int r7, boolean r8) {
        /*
            r4 = 0
            if (r5 != 0) goto L_0x0009
            java.lang.String r0 = "FilterUtils/applyFilter/source is null"
        L_0x0005:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        L_0x0009:
            android.graphics.Bitmap$Config r0 = r5.getConfig()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r3) goto L_0x0014
            java.lang.String r0 = "Invalid bitmap config."
            goto L_0x0005
        L_0x0014:
            java.util.Map r0 = X.C129876Iu.A01
            if (r7 < 0) goto L_0x0021
            java.util.List r0 = X.C129876Iu.A00
            int r1 = r0.size()
            r0 = 1
            if (r7 < r1) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "FilterUtils/applyFilter/filterId is invalid"
            goto L_0x0005
        L_0x0027:
            android.graphics.Bitmap r2 = A01(r6, r7)     // Catch:{ OutOfMemoryError -> 0x0035 }
            if (r8 == 0) goto L_0x003d
            r0 = 1
            android.graphics.Bitmap r5 = r5.copy(r3, r0)     // Catch:{ OutOfMemoryError -> 0x0033 }
            goto L_0x003d
        L_0x0033:
            r1 = move-exception
            goto L_0x0037
        L_0x0035:
            r1 = move-exception
            r2 = r4
        L_0x0037:
            java.lang.String r0 = "FilterUtils/applyFilter/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)
            r5 = r4
        L_0x003d:
            if (r5 == 0) goto L_0x004d
            if (r2 == 0) goto L_0x004d
            boolean r0 = applyFilter(r2, r5)
        L_0x0045:
            if (r2 == 0) goto L_0x004a
            r2.recycle()
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            return r5
        L_0x004d:
            r0 = 0
            goto L_0x0045
        L_0x004f:
            if (r8 == 0) goto L_0x0056
            if (r5 == 0) goto L_0x0056
            r5.recycle()
        L_0x0056:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.filter.FilterUtils.A00(android.graphics.Bitmap, X.54s, int, boolean):android.graphics.Bitmap");
    }

    public static boolean A02(Bitmap bitmap, Bitmap bitmap2, C1032954s r5, int i) {
        String str;
        if (bitmap == null) {
            str = "FilterUtils/applyFilterIntoBuffer/sourceImage is null";
        } else if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            str = "Invalid sourceImage config.";
        } else {
            Map map = C129876Iu.A01;
            if (i < 0 || i >= C129876Iu.A00.size()) {
                str = "FilterUtils/applyFilterIntoBuffer/filterId is invalid";
            } else {
                Log.a(bitmap2.isMutable());
                try {
                    Bitmap A01 = A01(r5, i);
                    if (A01 != null) {
                        boolean applyFilterIntoBuffer = applyFilterIntoBuffer(A01, bitmap, bitmap2);
                        A01.recycle();
                        return applyFilterIntoBuffer;
                    }
                    return false;
                } catch (OutOfMemoryError e) {
                    Log.e("FilterUtils/applyFilterIntoBuffer/OutOfMemoryError", e);
                    return false;
                }
            }
        }
        Log.e(str);
        return false;
    }

    public static native boolean applyFilter(Bitmap bitmap, Bitmap bitmap2);

    public static native boolean applyFilterIntoBuffer(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3);

    public static native boolean blurNative(Bitmap bitmap, int i, int i2);

    public static Bitmap A01(C1032954s r5, int i) {
        FileInputStream A0U;
        String str = C129876Iu.A00(i).A02;
        synchronized (r5) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            if (!r5.A0J()) {
                AnonymousClass6XA.A04("FilterManager/Downloadable files are not ready and createLut is called, ui should have prevented calling this");
                r5.A0I((C159437jM) null, 0);
                return null;
            }
            File file = (File) r5.A0H().get(str);
            if (file == null || !file.exists()) {
                r5.A0D((String) null);
                r5.A0B(0, -1);
                C36321k7.A1P("FilterManager/createLut/Error getting downloaded file to compute bitmap for filterFileName=", str, AnonymousClass000.A0u());
                return null;
            }
            try {
                A0U = C90524aI.A0U(file);
                Bitmap decodeStream = BitmapFactory.decodeStream(A0U, (Rect) null, options);
                A0U.close();
                return decodeStream;
            } catch (IOException e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("FilterManager/createLut/Could not get bitmap from downloaded file for ");
                C36351kA.A1Q(file.getName(), A0u, e);
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }
}
