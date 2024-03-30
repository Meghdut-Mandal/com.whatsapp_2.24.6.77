package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.whatsapp.util.Log;

/* renamed from: X.3R8  reason: invalid class name */
public abstract class AnonymousClass3R8 {
    public static final Bitmap A00(Bitmap bitmap, int i) {
        Bitmap bitmap2 = bitmap;
        if (i != 0) {
            Matrix matrix = new Matrix();
            float f = (float) 2;
            matrix.setRotate((float) i, ((float) bitmap2.getWidth()) / f, ((float) bitmap2.getHeight()) / f);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                AnonymousClass00C.A08(createBitmap);
                if (!bitmap2.equals(createBitmap)) {
                    bitmap2.recycle();
                    return createBitmap;
                }
            } catch (OutOfMemoryError e) {
                Log.e("Util/rotate/", e);
            }
        }
        return bitmap2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r14 == -1) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap A01(android.os.ParcelFileDescriptor r13, int r14, long r15) {
        /*
            r11 = r14
            r8 = 0
            if (r13 == 0) goto L_0x0065
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0059 }
            r2.<init>()     // Catch:{ OutOfMemoryError -> 0x0059 }
            java.io.FileDescriptor r1 = r13.getFileDescriptor()     // Catch:{ OutOfMemoryError -> 0x0059 }
            r0 = 1
            r2.inJustDecodeBounds = r0     // Catch:{ OutOfMemoryError -> 0x0059 }
            X.3Rp r0 = X.C65323Rp.A01()     // Catch:{ OutOfMemoryError -> 0x0059 }
            r0.A02(r2, r1)     // Catch:{ OutOfMemoryError -> 0x0059 }
            boolean r0 = r2.mCancel     // Catch:{ OutOfMemoryError -> 0x0059 }
            if (r0 != 0) goto L_0x0065
            int r6 = r2.outWidth     // Catch:{ OutOfMemoryError -> 0x0059 }
            r0 = -1
            if (r6 == r0) goto L_0x0065
            int r5 = r2.outHeight     // Catch:{ OutOfMemoryError -> 0x0059 }
            if (r5 == r0) goto L_0x0065
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r0) goto L_0x002c
            r10 = r14
            if (r14 != r0) goto L_0x002f
        L_0x002c:
            r11 = 2147483647(0x7fffffff, float:NaN)
        L_0x002f:
            r3 = -1
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            r9 = 0
            goto L_0x003b
        L_0x0037:
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ OutOfMemoryError -> 0x0059 }
        L_0x003b:
            r12 = 1
            X.6Kx r7 = new X.6Kx     // Catch:{ OutOfMemoryError -> 0x0059 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ OutOfMemoryError -> 0x0059 }
            int r0 = X.AnonymousClass6Y8.A02(r7, r6, r5)     // Catch:{ OutOfMemoryError -> 0x0059 }
            r2.inSampleSize = r0     // Catch:{ OutOfMemoryError -> 0x0059 }
            r0 = 0
            r2.inJustDecodeBounds = r0     // Catch:{ OutOfMemoryError -> 0x0059 }
            r2.inDither = r0     // Catch:{ OutOfMemoryError -> 0x0059 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0059 }
            r2.inPreferredConfig = r0     // Catch:{ OutOfMemoryError -> 0x0059 }
            X.3Rp r0 = X.C65323Rp.A01()     // Catch:{ OutOfMemoryError -> 0x0059 }
            android.graphics.Bitmap r8 = r0.A02(r2, r1)     // Catch:{ OutOfMemoryError -> 0x0059 }
            goto L_0x0065
        L_0x0059:
            r1 = move-exception
            java.lang.String r0 = "GalleryPickerUtil/Got oom exception "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0060 }
            goto L_0x0065
        L_0x0060:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0
        L_0x0065:
            if (r13 == 0) goto L_0x006a
            r13.close()     // Catch:{ all -> 0x006a }
        L_0x006a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3R8.A01(android.os.ParcelFileDescriptor, int, long):android.graphics.Bitmap");
    }
}
