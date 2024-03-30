package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: X.5Ym  reason: invalid class name and case insensitive filesystem */
public abstract class C109675Ym {
    public static boolean A00(MediaFormat mediaFormat, C159937kC r9) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        if (byteBuffer == null) {
            return false;
        }
        r9.BqJ(0, byteBuffer.limit(), 0, 2);
        ByteBuffer B95 = r9.B95();
        B95.position(0);
        byteBuffer.position(0);
        B95.limit(byteBuffer.limit());
        B95.put(byteBuffer);
        return true;
    }
}
