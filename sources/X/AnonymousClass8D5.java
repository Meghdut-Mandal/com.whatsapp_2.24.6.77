package X;

import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: X.8D5  reason: invalid class name */
public final class AnonymousClass8D5 extends AnonymousClass8D7 {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final ByteBuffer A04;
    public final byte[] A05;

    public AnonymousClass8D5(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int remaining = byteBuffer.remaining();
        Objects.requireNonNull(array, "buffer");
        int length = array.length;
        int i = arrayOffset + remaining;
        if ((arrayOffset | remaining | (length - i)) >= 0) {
            this.A05 = array;
            this.A03 = arrayOffset;
            this.A00 = arrayOffset;
            this.A02 = i;
            this.A04 = byteBuffer;
            this.A01 = byteBuffer.position();
            return;
        }
        Object[] A1Q = C36441kJ.A1Q();
        C36331k8.A1W(A1Q, length);
        C165567td.A1X(A1Q, arrayOffset, remaining);
        throw C165607th.A0i("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", A1Q);
    }
}
