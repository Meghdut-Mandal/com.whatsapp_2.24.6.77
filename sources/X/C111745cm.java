package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.util.Log;

/* renamed from: X.5cm  reason: invalid class name and case insensitive filesystem */
public abstract class C111745cm {
    public static Bitmap A00(BitmapFactory.Options options, byte[] bArr, int i) {
        boolean z;
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
            int i2 = options2.outWidth;
            if ((i2 > i || options2.outHeight > i) && (i2 > 300 || options2.outHeight > 300)) {
                z = false;
            } else {
                z = true;
            }
        } catch (IllegalArgumentException unused) {
            Log.e("MessageThumbSafeDecoder/isValidThumbnailSize/failed to generate bitmap");
            z = false;
        }
        if (!z) {
            return null;
        }
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (IllegalArgumentException unused2) {
            Log.e("image-thumb/decodethumbnail/failed to generate bitmap");
            return null;
        }
    }
}
