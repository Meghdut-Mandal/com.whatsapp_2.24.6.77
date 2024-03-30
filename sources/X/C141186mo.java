package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: X.6mo  reason: invalid class name and case insensitive filesystem */
public class C141186mo implements C159937kC {
    public MediaCodec.BufferInfo A00;
    public ByteBuffer A01;

    public C141186mo(C159937kC r8) {
        ByteBuffer B95 = r8.B95();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(B95.limit());
        allocateDirect.put(B95.asReadOnlyBuffer());
        this.A01 = allocateDirect;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        this.A00 = bufferInfo;
        MediaCodec.BufferInfo B91 = r8.B91();
        bufferInfo.set(B91.offset, B91.size, B91.presentationTimeUs, B91.flags);
    }

    public MediaCodec.BufferInfo B91() {
        return this.A00;
    }

    public ByteBuffer B95() {
        return this.A01;
    }

    public void BqJ(int i, int i2, long j, int i3) {
        throw null;
    }
}
