package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.8D4  reason: invalid class name */
public final class AnonymousClass8D4 extends AnonymousClass8D7 {
    public final ByteBuffer A00;
    public final ByteBuffer A01;

    public AnonymousClass8D4(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
        this.A01 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    }
}
