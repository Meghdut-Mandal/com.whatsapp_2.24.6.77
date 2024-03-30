package com.facebook.cameracore.mediapipeline.engine;

import X.AnonymousClass00C;
import X.C36441kJ;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

public final class EngineImageUtil {
    public static final EngineImageUtil INSTANCE = new EngineImageUtil();

    public static final boolean getBytesFromByteArray(byte[] bArr, int i, ByteBuffer byteBuffer, int i2) {
        AnonymousClass00C.A0D(byteBuffer, 2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inSampleSize = i2;
        try {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
            if (decodeByteArray != null) {
                decodeByteArray.copyPixelsToBuffer(byteBuffer);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final int[] getDimensionFromByteArray(byte[] bArr, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, i, options);
        int[] A1O = C36441kJ.A1O();
        A1O[0] = options.outWidth;
        A1O[1] = options.outHeight;
        return A1O;
    }
}
