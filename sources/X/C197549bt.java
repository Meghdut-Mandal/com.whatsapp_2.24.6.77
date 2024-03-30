package X;

import java.nio.ByteBuffer;

/* renamed from: X.9bt  reason: invalid class name and case insensitive filesystem */
public final class C197549bt {
    public ByteBuffer A00;
    public final int A01;

    public C197549bt(int i, ByteBuffer byteBuffer) {
        this.A01 = i;
        if (byteBuffer.isDirect()) {
            this.A00 = byteBuffer;
            return;
        }
        throw AnonymousClass001.A09("Bytes buffer must be direct");
    }
}
