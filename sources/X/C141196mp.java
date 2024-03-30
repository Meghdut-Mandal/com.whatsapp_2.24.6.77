package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: X.6mp  reason: invalid class name and case insensitive filesystem */
public class C141196mp implements C159937kC {
    public final ByteBuffer A00 = ByteBuffer.allocateDirect(1048576);
    public final MediaCodec.BufferInfo A01 = new MediaCodec.BufferInfo();

    public void BqJ(int i, int i2, long j, int i3) {
        this.A01.set(0, i2, j, i3);
    }

    public MediaCodec.BufferInfo B91() {
        return this.A01;
    }

    public ByteBuffer B95() {
        return this.A00;
    }
}
