package X;

import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.stream.Framing;
import java.nio.ByteBuffer;

/* renamed from: X.A2x  reason: case insensitive filesystem */
public final class C21009A2x implements C22885Axg {
    public final Framing A00;
    public final ByteBuffer A01;

    public C21009A2x(Framing framing) {
        AnonymousClass00C.A0D(framing, 1);
        this.A00 = framing;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(new Framing((HybridData) null).outerFrameSizeNative(Integer.MAX_VALUE));
        allocateDirect.limit(0);
        this.A01 = allocateDirect;
    }

    public ByteBuffer Bw1(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.A01;
        if (!byteBuffer2.hasRemaining()) {
            Framing framing = this.A00;
            byteBuffer2.clear();
            C188418zY unpack = framing.unpack(byteBuffer, byteBuffer2);
            switch (unpack.ordinal()) {
                case 0:
                    byteBuffer2.flip();
                    break;
                case 1:
                    throw new C187288xb(unpack, "unable to process secure frame", (Throwable) null);
                case 2:
                case 3:
                    C165597tg.A1K(byteBuffer2);
                    return null;
                case 4:
                    throw new C187288xb(unpack, "unable to authenticate secure frame", (Throwable) null);
                case 5:
                    throw new C187288xb(unpack, "unable to decrypt secure frame", (Throwable) null);
                default:
                    throw C36441kJ.A18();
            }
        }
        return byteBuffer2;
    }
}
