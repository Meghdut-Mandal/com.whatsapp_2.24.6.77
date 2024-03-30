package X;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: X.8xx  reason: invalid class name and case insensitive filesystem */
public final class C187488xx extends OutputStream {
    public final ByteBuffer A00;

    public C187488xx(ByteBuffer byteBuffer) {
        AnonymousClass00C.A0D(byteBuffer, 1);
        this.A00 = byteBuffer;
    }

    public void write(byte[] bArr, int i, int i2) {
        AnonymousClass00C.A0D(bArr, 0);
        this.A00.put(bArr, i, i2);
    }

    public void write(int i) {
        this.A00.put((byte) i);
    }
}
