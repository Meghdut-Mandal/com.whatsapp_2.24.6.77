package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.8xq  reason: invalid class name and case insensitive filesystem */
public final class C187418xq extends InputStream {
    public final ByteBuffer A00;

    public int read(byte[] bArr, int i, int i2) {
        AnonymousClass00C.A0D(bArr, 0);
        ByteBuffer byteBuffer = this.A00;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), i2);
        byteBuffer.get(bArr, i, min);
        return min;
    }

    public int available() {
        return this.A00.remaining();
    }

    public C187418xq(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public int read() {
        return this.A00.get();
    }
}
