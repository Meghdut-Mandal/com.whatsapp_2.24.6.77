package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.5Wc  reason: invalid class name and case insensitive filesystem */
public abstract class C109055Wc {
    public static final short A00(float f) {
        int i;
        int i2;
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i3 = floatToRawIntBits >>> 31;
        int i4 = (floatToRawIntBits >>> 23) & 255;
        int i5 = floatToRawIntBits & 8388607;
        int i6 = 0;
        if (i4 == 255) {
            if (i5 != 0) {
                i6 = 512;
            }
            i = i6;
            i6 = 31;
        } else {
            int i7 = (i4 - 127) + 15;
            if (i7 >= 31) {
                i = 0;
                i6 = 49;
            } else if (i7 > 0) {
                i = i5 >> 13;
                if ((i5 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                    i = ((i7 << 10) | i) + 1;
                    i2 = i3 << 15;
                    return (short) (i | i2);
                }
                i6 = i7;
            } else if (i7 >= -10) {
                int i8 = (i5 | 8388608) >> (1 - i7);
                if ((i8 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                    i8 += DefaultCrypto.BUFFER_SIZE;
                }
                i = i8 >> 13;
            } else {
                i = 0;
            }
        }
        i2 = (i3 << 15) | (i6 << 10);
        return (short) (i | i2);
    }
}
