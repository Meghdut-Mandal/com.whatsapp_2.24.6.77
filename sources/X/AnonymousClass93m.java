package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.93m  reason: invalid class name */
public abstract class AnonymousClass93m {
    public static void A00(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AnonymousClass000.A0r("csd-", AnonymousClass000.A0u(), i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
