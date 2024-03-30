package X;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: X.6mq  reason: invalid class name and case insensitive filesystem */
public class C141206mq implements C159937kC {
    public MediaCodec.BufferInfo A00;
    public boolean A01 = false;
    public final int A02;
    public final WeakReference A03;

    public void BqJ(int i, int i2, long j, int i3) {
        MediaCodec.BufferInfo bufferInfo = this.A00;
        if (bufferInfo == null) {
            bufferInfo = new MediaCodec.BufferInfo();
            this.A00 = bufferInfo;
        }
        bufferInfo.set(0, i2, j, i3);
    }

    public ByteBuffer B95() {
        return (ByteBuffer) this.A03.get();
    }

    public C141206mq(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.A03 = AnonymousClass001.A0F(byteBuffer);
        this.A02 = i;
        this.A00 = bufferInfo;
    }

    public MediaCodec.BufferInfo B91() {
        return this.A00;
    }
}
