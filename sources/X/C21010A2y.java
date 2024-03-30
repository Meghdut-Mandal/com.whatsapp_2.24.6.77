package X;

import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.stream.Framing;
import java.nio.ByteBuffer;

/* renamed from: X.A2y  reason: case insensitive filesystem */
public final class C21010A2y implements C22885Axg {
    public final Framing A00;
    public final ByteBuffer A01;

    public C21010A2y(Framing framing) {
        AnonymousClass00C.A0D(framing, 1);
        this.A00 = framing;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(new Framing((HybridData) null).outerFrameSizeNative(Integer.MAX_VALUE));
        allocateDirect.limit(0);
        this.A01 = allocateDirect;
    }

    public ByteBuffer Bw1(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.A01;
        if (byteBuffer2.hasRemaining()) {
            return byteBuffer2;
        }
        try {
            Framing framing = this.A00;
            byteBuffer2.clear();
            C188418zY pack = framing.pack(byteBuffer, byteBuffer2);
            switch (pack.ordinal()) {
                case 0:
                    byteBuffer2.flip();
                    return byteBuffer2;
                case 1:
                    throw new C187288xb(pack, "unable to process data", (Throwable) null);
                case 2:
                case 3:
                    AnonymousClass6YR.A08("SecureLinkOutputTransformer", "Incomplete or Invalid frame while writing, should not happen!");
                    return null;
                case 4:
                case 5:
                    throw new C187288xb(pack, "unable to encrypt secure frame", (Throwable) null);
                default:
                    throw C36441kJ.A18();
            }
        } catch (IllegalArgumentException e) {
            AnonymousClass6YR.A0C("SecureLinkOutputTransformer", "Unable to pack frame", e);
            throw new C187288xb(C188418zY.FAILED, "out of bounds exception, unable to encrypt", e);
        }
    }
}
